// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RefreshStudioAppTokenOpenRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("ProjectId")
    public String projectId;

    public static RefreshStudioAppTokenOpenRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshStudioAppTokenOpenRequest self = new RefreshStudioAppTokenOpenRequest();
        return TeaModel.build(map, self);
    }

    public RefreshStudioAppTokenOpenRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public RefreshStudioAppTokenOpenRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RefreshStudioAppTokenOpenRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
