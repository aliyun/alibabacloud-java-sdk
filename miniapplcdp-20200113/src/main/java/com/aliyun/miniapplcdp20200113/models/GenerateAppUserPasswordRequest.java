// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GenerateAppUserPasswordRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EnvId")
    public String envId;

    @NameInMap("UserName")
    public String userName;

    public static GenerateAppUserPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateAppUserPasswordRequest self = new GenerateAppUserPasswordRequest();
        return TeaModel.build(map, self);
    }

    public GenerateAppUserPasswordRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GenerateAppUserPasswordRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public GenerateAppUserPasswordRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
