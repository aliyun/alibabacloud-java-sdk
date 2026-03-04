// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class UpdateSubscriptionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rmq-cn-****.cn-shanghai.rmq.aliyuncs.com:8080</p>
     */
    @NameInMap("AccessPoint")
    public String accessPoint;

    @NameInMap("AliyunUid")
    public Long aliyunUid;

    /**
     * <strong>example:</strong>
     * <p>ccc-event</p>
     */
    @NameInMap("DefaultTopic")
    public String defaultTopic;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Name &quot;:&quot;StopConsultant &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;QueueingRerouted &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;IvrTracking &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;DualTrackRecordingReady &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;SatisfactionSurveyResponse &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;Dialing &quot;,&quot;Disabled &quot;:false},{&quot;Name &quot;:&quot;Abandoned &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;QueueingCancelled &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;RecordingReady &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;StopCoach &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;Established &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;InitiateConsultant &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;Route2IVR &quot;,&quot;Disabled &quot;:false},{&quot;Name &quot;:&quot;Retrieved &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;CampaignPaused &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;TextStream &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;AgentRelease &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;VoicemailReady &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;Released &quot;,&quot;Disabled &quot;:false},{&quot;Name &quot;:&quot;CDRReady &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;CaseAttempted &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;AgentBreak &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;AgentRingingTimeout &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;AgentReady &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;CampaignResumed &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;AgentDialing &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;Ringing &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;StartConsultant &quot;,&quot;Disabled &quot;:false},{&quot;Name &quot;:&quot;QueueingTimeout &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;AgentTalk &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;AgentRinging &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;StartMonitor &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;BlindTransfer &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;Intercept &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;RingingTimeout &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;StartConference &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;QueueingOverflow &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;BargeIn &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;StopConference &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;AgentCheckOut &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;CampaignSubmitted &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;AgentCheckIn &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;Enqueue &quot;,&quot;Disabled &quot;:false},{&quot;Name &quot;:&quot;AttendedTransfer &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;StopMonitor &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;DispatchingFailure &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;SatisfactionSurveyOffer &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;CampaignCompleted &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;CampaignAborted &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;AssignAgent &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;Held &quot;,&quot;Disabled &quot;:true},{&quot;Name &quot;:&quot;StartCoach &quot;,&quot;Disabled &quot;:true}]</p>
     */
    @NameInMap("EventSubscriptionsJson")
    public String eventSubscriptionsJson;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>rmq-cn-****</p>
     */
    @NameInMap("MqInstanceId")
    public String mqInstanceId;

    /**
     * <strong>example:</strong>
     * <p>rocketmq5</p>
     */
    @NameInMap("MqType")
    public String mqType;

    /**
     * <strong>example:</strong>
     * <p>password</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <strong>example:</strong>
     * <p>GID_xxx</p>
     */
    @NameInMap("ProducerId")
    public String producerId;

    /**
     * <strong>example:</strong>
     * <p>username</p>
     */
    @NameInMap("Username")
    public String username;

    public static UpdateSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubscriptionRequest self = new UpdateSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSubscriptionRequest setAccessPoint(String accessPoint) {
        this.accessPoint = accessPoint;
        return this;
    }
    public String getAccessPoint() {
        return this.accessPoint;
    }

    public UpdateSubscriptionRequest setAliyunUid(Long aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public Long getAliyunUid() {
        return this.aliyunUid;
    }

    public UpdateSubscriptionRequest setDefaultTopic(String defaultTopic) {
        this.defaultTopic = defaultTopic;
        return this;
    }
    public String getDefaultTopic() {
        return this.defaultTopic;
    }

    public UpdateSubscriptionRequest setEventSubscriptionsJson(String eventSubscriptionsJson) {
        this.eventSubscriptionsJson = eventSubscriptionsJson;
        return this;
    }
    public String getEventSubscriptionsJson() {
        return this.eventSubscriptionsJson;
    }

    public UpdateSubscriptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSubscriptionRequest setMqInstanceId(String mqInstanceId) {
        this.mqInstanceId = mqInstanceId;
        return this;
    }
    public String getMqInstanceId() {
        return this.mqInstanceId;
    }

    public UpdateSubscriptionRequest setMqType(String mqType) {
        this.mqType = mqType;
        return this;
    }
    public String getMqType() {
        return this.mqType;
    }

    public UpdateSubscriptionRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public UpdateSubscriptionRequest setProducerId(String producerId) {
        this.producerId = producerId;
        return this;
    }
    public String getProducerId() {
        return this.producerId;
    }

    public UpdateSubscriptionRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
