// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListDomainsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EnvId")
    public String envId;

    @NameInMap("Source")
    public String source;

    public static ListDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDomainsRequest self = new ListDomainsRequest();
        return TeaModel.build(map, self);
    }

    public ListDomainsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListDomainsRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public ListDomainsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
