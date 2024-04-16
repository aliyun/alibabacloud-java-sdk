// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetEnvironmentRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EnvId")
    public String envId;

    @NameInMap("Source")
    public String source;

    public static GetEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentRequest self = new GetEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetEnvironmentRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public GetEnvironmentRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
