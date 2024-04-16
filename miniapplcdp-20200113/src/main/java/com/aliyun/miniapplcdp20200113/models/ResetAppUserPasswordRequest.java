// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ResetAppUserPasswordRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EnvId")
    public String envId;

    @NameInMap("Source")
    public String source;

    @NameInMap("UserName")
    public String userName;

    public static ResetAppUserPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAppUserPasswordRequest self = new ResetAppUserPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ResetAppUserPasswordRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ResetAppUserPasswordRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public ResetAppUserPasswordRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ResetAppUserPasswordRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
