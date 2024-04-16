// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetDefaultAppUserRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EnvId")
    public String envId;

    @NameInMap("Source")
    public String source;

    public static GetDefaultAppUserRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultAppUserRequest self = new GetDefaultAppUserRequest();
        return TeaModel.build(map, self);
    }

    public GetDefaultAppUserRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetDefaultAppUserRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public GetDefaultAppUserRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
