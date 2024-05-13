// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class LaunchSurveyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ContactFlowId")
    public String contactFlowId;

    @NameInMap("ContactFlowVariables")
    public String contactFlowVariables;

    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("SmsMetadataId")
    public String smsMetadataId;

    @NameInMap("SurveyChannel")
    public String surveyChannel;

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

    public LaunchSurveyRequest setContactFlowVariables(String contactFlowVariables) {
        this.contactFlowVariables = contactFlowVariables;
        return this;
    }
    public String getContactFlowVariables() {
        return this.contactFlowVariables;
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

    public LaunchSurveyRequest setSmsMetadataId(String smsMetadataId) {
        this.smsMetadataId = smsMetadataId;
        return this;
    }
    public String getSmsMetadataId() {
        return this.smsMetadataId;
    }

    public LaunchSurveyRequest setSurveyChannel(String surveyChannel) {
        this.surveyChannel = surveyChannel;
        return this;
    }
    public String getSurveyChannel() {
        return this.surveyChannel;
    }

    public LaunchSurveyRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
