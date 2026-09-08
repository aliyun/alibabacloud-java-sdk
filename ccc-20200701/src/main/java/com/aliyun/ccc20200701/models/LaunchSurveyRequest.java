// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class LaunchSurveyRequest extends TeaModel {
    /**
     * <p>The contact flow ID of the IVR satisfaction survey flow. Ensure that the specified contact flow ID corresponds to an active satisfaction survey flow.</p>
     * 
     * <strong>example:</strong>
     * <p>4685b65a-eb8f-11ec-8ea0-0242ac120002</p>
     */
    @NameInMap("ContactFlowId")
    public String contactFlowId;

    /**
     * <p>Variables passed to the contact flow. The variables configured here can be retrieved and used in the IVR flow. The format is a JSON string containing a collection of key-value pairs. This parameter is optional and defaults to empty.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;customerID&quot;: &quot;208880281831****&quot;,
     *       &quot;operateType&quot;: &quot;cipherCode&quot;,
     *       &quot;taskId&quot;: &quot;1234567890&quot;,
     *       &quot;crmOther&quot;: &quot;123&quot;
     * }</p>
     */
    @NameInMap("ContactFlowVariables")
    public String contactFlowVariables;

    /**
     * <p>Device ID. This parameter has no effect and can be filled with any value.</p>
     * 
     * <strong>example:</strong>
     * <p>device</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The call ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>job-6580466654649****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The configuration ID for text message satisfaction. This parameter is required only when the collection channel is SMS. It is optional and defaults to empty.</p>
     * 
     * <strong>example:</strong>
     * <p>4685b65a-eb8f-11ec-8ea0-0242ac120002</p>
     */
    @NameInMap("SmsMetadataId")
    public String smsMetadataId;

    /**
     * <p>The channel for collecting satisfaction feedback. This parameter is optional and defaults to Voice Satisfaction.</p>
     * 
     * <strong>example:</strong>
     * <p>IVR</p>
     */
    @NameInMap("SurveyChannel")
    public String surveyChannel;

    /**
     * <p>The ID of the satisfaction survey template.</p>
     * 
     * <strong>example:</strong>
     * <p>19dc793c-9a01-4cb0-b7d5-fcb5431bab6b</p>
     */
    @NameInMap("SurveyTemplateId")
    public String surveyTemplateId;

    /**
     * <p>Satisfaction survey configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("SurveyTemplateVariables")
    public String surveyTemplateVariables;

    /**
     * <p>The agent ID that initiates the satisfaction survey.</p>
     * 
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
