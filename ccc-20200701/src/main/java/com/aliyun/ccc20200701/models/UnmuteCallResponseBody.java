// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class UnmuteCallResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>[responses_200_schema_properties_Data_properties_UserContext_properties_Heartbeat_description]The UNIX timestamp in milliseconds indicating when the last heartbeat was received from the agent.</p>
     */
    @NameInMap("Data")
    public UnmuteCallResponseBodyData data;

    /**
     * <p>[responses_200_schema_properties_Data_properties_UserContext_properties_UserId_type]string</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>[responses_200_schema_properties_Data_properties_UserContext_properties_InstanceId_type]string</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>[responses_200_schema_properties_Data_properties_UserContext_properties_BreakCode_enumValueTitles_RejectCall]Break caused by agent rejecting a call</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>[responses_200_schema_properties_Data_properties_UserContext_properties_DeviceId_type]string</p>
     * 
     * <strong>example:</strong>
     * <p>EEEE671A-3E24-4A04-81E6-6C4F5B39DF75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnmuteCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnmuteCallResponseBody self = new UnmuteCallResponseBody();
        return TeaModel.build(map, self);
    }

    public UnmuteCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UnmuteCallResponseBody setData(UnmuteCallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UnmuteCallResponseBodyData getData() {
        return this.data;
    }

    public UnmuteCallResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UnmuteCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnmuteCallResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public UnmuteCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UnmuteCallResponseBodyDataCallContextChannelContexts extends TeaModel {
        /**
         * <p>The call type of the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>OUTBOUND</p>
         */
        @NameInMap("CallType")
        public String callType;

        /**
         * <p>Channel flags.</p>
         * 
         * <strong>example:</strong>
         * <p>MONITORING</p>
         */
        @NameInMap("ChannelFlags")
        public String channelFlags;

        /**
         * <p>The channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ch:user:1390501****-&gt;8032****:1609138902226:job-6538214103685****</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>[parameters_JobId_schema_description]The call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATED</p>
         */
        @NameInMap("ChannelState")
        public String channelState;

        /**
         * <p>Called party of the call channel.</p>
         * 
         * <strong>example:</strong>
         * <p>1390501****</p>
         */
        @NameInMap("Destination")
        public String destination;

        /**
         * <p>An auto-incremented ID assigned by the system. Customers do not need to concern themselves with this value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>job-6538214103685****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The originator of the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>0830019****</p>
         */
        @NameInMap("Originator")
        public String originator;

        /**
         * <p>[parameters_JobId_in]query</p>
         * 
         * <strong>example:</strong>
         * <p>1390501****</p>
         */
        @NameInMap("ReleaseInitiator")
        public String releaseInitiator;

        /**
         * <p>The reason for releasing the channel. This indicates why the current channel was disconnected. The value corresponds to a response code defined in the SIP protocol. Customers should refer to the SIP protocol to analyze the disconnection reason.</p>
         * 
         * <strong>example:</strong>
         * <p>404 - No destination</p>
         */
        @NameInMap("ReleaseReason")
        public String releaseReason;

        /**
         * <p>The skill group associated with this call. In inbound scenarios, the skill group is specified by the queue routed through IVR. In outbound scenarios, the skill group is the first one the agent signs into.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("SkillGroupId")
        public String skillGroupId;

        /**
         * <p>The UNIX timestamp of the most recent status change of the channel, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1609138903315</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The extension number of the agent associated with the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>8032****</p>
         */
        @NameInMap("UserExtension")
        public String userExtension;

        /**
         * <p>The agent ID associated with the channel. This field is empty if the channel belongs to a customer.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static UnmuteCallResponseBodyDataCallContextChannelContexts build(java.util.Map<String, ?> map) throws Exception {
            UnmuteCallResponseBodyDataCallContextChannelContexts self = new UnmuteCallResponseBodyDataCallContextChannelContexts();
            return TeaModel.build(map, self);
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setChannelFlags(String channelFlags) {
            this.channelFlags = channelFlags;
            return this;
        }
        public String getChannelFlags() {
            return this.channelFlags;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setChannelState(String channelState) {
            this.channelState = channelState;
            return this;
        }
        public String getChannelState() {
            return this.channelState;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setOriginator(String originator) {
            this.originator = originator;
            return this;
        }
        public String getOriginator() {
            return this.originator;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setUserExtension(String userExtension) {
            this.userExtension = userExtension;
            return this;
        }
        public String getUserExtension() {
            return this.userExtension;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class UnmuteCallResponseBodyDataCallContext extends TeaModel {
        /**
         * <p>Call type.</p>
         * 
         * <strong>example:</strong>
         * <p>OUTBOUND</p>
         */
        @NameInMap("CallType")
        public String callType;

        /**
         * <p>List of call channels.</p>
         */
        @NameInMap("ChannelContexts")
        public java.util.List<UnmuteCallResponseBodyDataCallContextChannelContexts> channelContexts;

        /**
         * <p>[responses_200_schema_properties_Data_properties_CallContext_properties_ChannelContexts_items_properties_ChannelFlags_enumValueTitles_MONITORING]Monitoring</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>job-6538214103685****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        public static UnmuteCallResponseBodyDataCallContext build(java.util.Map<String, ?> map) throws Exception {
            UnmuteCallResponseBodyDataCallContext self = new UnmuteCallResponseBodyDataCallContext();
            return TeaModel.build(map, self);
        }

        public UnmuteCallResponseBodyDataCallContext setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public UnmuteCallResponseBodyDataCallContext setChannelContexts(java.util.List<UnmuteCallResponseBodyDataCallContextChannelContexts> channelContexts) {
            this.channelContexts = channelContexts;
            return this;
        }
        public java.util.List<UnmuteCallResponseBodyDataCallContextChannelContexts> getChannelContexts() {
            return this.channelContexts;
        }

        public UnmuteCallResponseBodyDataCallContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UnmuteCallResponseBodyDataCallContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

    public static class UnmuteCallResponseBodyDataUserContext extends TeaModel {
        /**
         * <p>Break status code, which can be either system-defined or customer-defined. System-defined break codes include: Warm-up (temporary break state after an agent goes online but before becoming idle), RingingTimeout (break caused by agent ringing timeout), and RejectCall (break caused by agent rejecting a call). Customer-defined status codes have no restrictions, and customers can define them according to their business needs.</p>
         * 
         * <strong>example:</strong>
         * <p>Warm-up</p>
         */
        @NameInMap("BreakCode")
        public String breakCode;

        /**
         * <p>Device ID, which is the identity ID of a browser-based Web Real-Time Communication (WebRTC) softphone or a physical phone device. Only one type of device can be registered at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>ACC-YUNBS-1.0.10-****</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <p>[responses_200_schema_properties_Data_properties_UserContext_properties_Mobile_description]The agent\&quot;s personal phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>8032****</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The UNIX timestamp in milliseconds indicating when the last heartbeat was received from the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>1609136956378</p>
         */
        @NameInMap("Heartbeat")
        public Long heartbeat;

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>[responses_200_schema_properties_Data_properties_CallContext_properties_ChannelContexts_items_properties_SkillGroupId_type]string</p>
         * 
         * <strong>example:</strong>
         * <p>job-6538214103685****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The agent\&quot;s personal phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>1324730****</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>Indicates whether the agent is in outbound-only mode.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OutboundScenario")
        public Boolean outboundScenario;

        /**
         * <p>[responses_200_schema_properties_Data_properties_CallContext_properties_ChannelContexts_items_properties_ChannelId_type]string</p>
         */
        @NameInMap("SignedSkillGroupIdList")
        public java.util.List<String> signedSkillGroupIdList;

        /**
         * <p>Agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>[responses_200_schema_properties_Data_properties_CallContext_properties_CallType_description]Call type.</p>
         * 
         * <strong>example:</strong>
         * <p>TALKING</p>
         */
        @NameInMap("UserState")
        public String userState;

        /**
         * <p>[responses_200_schema_properties_Data_properties_CallContext_properties_ChannelContexts_items_properties_Index_type]integer</p>
         * 
         * <strong>example:</strong>
         * <p>ON_SITE</p>
         */
        @NameInMap("WorkMode")
        public String workMode;

        public static UnmuteCallResponseBodyDataUserContext build(java.util.Map<String, ?> map) throws Exception {
            UnmuteCallResponseBodyDataUserContext self = new UnmuteCallResponseBodyDataUserContext();
            return TeaModel.build(map, self);
        }

        public UnmuteCallResponseBodyDataUserContext setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public UnmuteCallResponseBodyDataUserContext setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public UnmuteCallResponseBodyDataUserContext setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public UnmuteCallResponseBodyDataUserContext setHeartbeat(Long heartbeat) {
            this.heartbeat = heartbeat;
            return this;
        }
        public Long getHeartbeat() {
            return this.heartbeat;
        }

        public UnmuteCallResponseBodyDataUserContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UnmuteCallResponseBodyDataUserContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public UnmuteCallResponseBodyDataUserContext setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public UnmuteCallResponseBodyDataUserContext setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public UnmuteCallResponseBodyDataUserContext setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

        public UnmuteCallResponseBodyDataUserContext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public UnmuteCallResponseBodyDataUserContext setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public UnmuteCallResponseBodyDataUserContext setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

    public static class UnmuteCallResponseBodyData extends TeaModel {
        /**
         * <p>[responses_200_schema_properties_Data_properties_CallContext_properties_ChannelContexts_items_properties_ReleaseReason_type]string</p>
         */
        @NameInMap("CallContext")
        public UnmuteCallResponseBodyDataCallContext callContext;

        /**
         * <p>[responses_200_schema_properties_Data_properties_UserContext_properties_OutboundScenario_description]Indicates whether the agent is in outbound-only mode.</p>
         */
        @NameInMap("UserContext")
        public UnmuteCallResponseBodyDataUserContext userContext;

        public static UnmuteCallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UnmuteCallResponseBodyData self = new UnmuteCallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UnmuteCallResponseBodyData setCallContext(UnmuteCallResponseBodyDataCallContext callContext) {
            this.callContext = callContext;
            return this;
        }
        public UnmuteCallResponseBodyDataCallContext getCallContext() {
            return this.callContext;
        }

        public UnmuteCallResponseBodyData setUserContext(UnmuteCallResponseBodyDataUserContext userContext) {
            this.userContext = userContext;
            return this;
        }
        public UnmuteCallResponseBodyDataUserContext getUserContext() {
            return this.userContext;
        }

    }

}
