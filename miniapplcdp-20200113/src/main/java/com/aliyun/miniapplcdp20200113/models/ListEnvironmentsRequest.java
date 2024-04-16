// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListEnvironmentsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EnvType")
    public String envType;

    @NameInMap("Source")
    public String source;

    public static ListEnvironmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentsRequest self = new ListEnvironmentsRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListEnvironmentsRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public ListEnvironmentsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
