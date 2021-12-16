// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class LaunchSurveyRequest extends TeaModel {
    @NameInMap("ContactFlowId")
    public String contactFlowId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("UserId")
    public String userId;

    public static LaunchSurveyRequest build(java.util.Map<String, ?> map) throws Exception {
        LaunchSurveyRequest self = new LaunchSurveyRequest();
        return TeaModel.build(map, self);
    }

    public LaunchSurveyRequest setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    public LaunchSurveyRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public LaunchSurveyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public LaunchSurveyRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public LaunchSurveyRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
