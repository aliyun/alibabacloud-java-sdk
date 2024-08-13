// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class LaunchSurveyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4685b65a-eb8f-11ec-8ea0-0242ac120002</p>
     */
    @NameInMap("ContactFlowId")
    public String contactFlowId;

    @NameInMap("ContactFlowVariables")
    public String contactFlowVariables;

    /**
     * <strong>example:</strong>
     * <p>device</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>job-6580466654649****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>4685b65a-eb8f-11ec-8ea0-0242ac120002</p>
     */
    @NameInMap("SmsMetadataId")
    public String smsMetadataId;

    /**
     * <strong>example:</strong>
     * <p>IVR</p>
     */
    @NameInMap("SurveyChannel")
    public String surveyChannel;

    @NameInMap("SurveyTemplateId")
    public String surveyTemplateId;

    @NameInMap("SurveyTemplateVariables")
    public String surveyTemplateVariables;

    /**
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
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

    public LaunchSurveyRequest setSurveyTemplateId(String surveyTemplateId) {
        this.surveyTemplateId = surveyTemplateId;
        return this;
    }
    public String getSurveyTemplateId() {
        return this.surveyTemplateId;
    }

    public LaunchSurveyRequest setSurveyTemplateVariables(String surveyTemplateVariables) {
        this.surveyTemplateVariables = surveyTemplateVariables;
        return this;
    }
    public String getSurveyTemplateVariables() {
        return this.surveyTemplateVariables;
    }

    public LaunchSurveyRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
