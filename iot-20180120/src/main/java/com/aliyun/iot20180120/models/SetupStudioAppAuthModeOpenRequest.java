// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetupStudioAppAuthModeOpenRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("AuthMode")
    public Integer authMode;

    @NameInMap("ProjectId")
    public String projectId;

    public static SetupStudioAppAuthModeOpenRequest build(java.util.Map<String, ?> map) throws Exception {
        SetupStudioAppAuthModeOpenRequest self = new SetupStudioAppAuthModeOpenRequest();
        return TeaModel.build(map, self);
    }

    public SetupStudioAppAuthModeOpenRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public SetupStudioAppAuthModeOpenRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetupStudioAppAuthModeOpenRequest setAuthMode(Integer authMode) {
        this.authMode = authMode;
        return this;
    }
    public Integer getAuthMode() {
        return this.authMode;
    }

    public SetupStudioAppAuthModeOpenRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
