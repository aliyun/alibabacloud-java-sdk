// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CompleteAttendedTransferResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data.</p>
     */
    @NameInMap("Data")
    public CompleteAttendedTransferResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>List of response parameters.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EEEE671A-3E24-4A04-81E6-6C4F5B39DF75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CompleteAttendedTransferResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompleteAttendedTransferResponseBody self = new CompleteAttendedTransferResponseBody();
        return TeaModel.build(map, self);
    }

    public CompleteAttendedTransferResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CompleteAttendedTransferResponseBody setData(CompleteAttendedTransferResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CompleteAttendedTransferResponseBodyData getData() {
        return this.data;
    }

    public CompleteAttendedTransferResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CompleteAttendedTransferResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CompleteAttendedTransferResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public CompleteAttendedTransferResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CompleteAttendedTransferResponseBodyDataCallContextChannelContexts extends TeaModel {
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
         * <p>The voice channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ch:user:1390501****-&gt;8032****:1609138902226:job-653821410368****</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The status of the voice channel.</p>
         * 
         * <strong>example:</strong>
         * <p>ANSWERED</p>
         */
        @NameInMap("ChannelState")
        public String channelState;

        /**
         * <p>The callee of the voice channel.</p>
         * 
         * <strong>example:</strong>
         * <p>1390501****</p>
         */
        @NameInMap("Destination")
        public String destination;

        /**
         * <p>An auto increment ID assigned by the system. Customers do not need to follow this.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>The party that initiated the hang-up of the voice channel, indicating who first terminated the call.</p>
         * 
         * <strong>example:</strong>
         * <p>1390501****</p>
         */
        @NameInMap("ReleaseInitiator")
        public String releaseInitiator;

        /**
         * <p>The hang-up reason for the voice channel, indicating why the current voice channel was disconnected. The value corresponds to response codes defined in the SIP protocol. Customers should refer to the SIP protocol to analyze the hang-up reason.</p>
         * 
         * <strong>example:</strong>
         * <p>404 - No destination</p>
         */
        @NameInMap("ReleaseReason")
        public String releaseReason;

        /**
         * <p>The skill group ID associated with the voice channel. In inbound scenarios, the associated skill group ID is determined by the skill group configured in the IVR transfer-to-agent module. In outbound scenarios, the associated skill group ID is the first skill group that the agent signed into.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("SkillGroupId")
        public String skillGroupId;

        /**
         * <p>The UNIX timestamp of the most recent status change of the voice channel, in milliseconds.</p>
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

        public static CompleteAttendedTransferResponseBodyDataCallContextChannelContexts build(java.util.Map<String, ?> map) throws Exception {
            CompleteAttendedTransferResponseBodyDataCallContextChannelContexts self = new CompleteAttendedTransferResponseBodyDataCallContextChannelContexts();
            return TeaModel.build(map, self);
        }

        public CompleteAttendedTransferResponseBodyDataCallContextChannelContexts setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public CompleteAttendedTransferResponseBodyDataCallContextChannelContexts setChannelFlags(String channelFlags) {
            this.channelFlags = channelFlags;
            return this;
        }
        public String getChannelFlags() {
            return this.channelFlags;
        }

        public CompleteAttendedTransferResponseBodyDataCallContextChannelContexts setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public CompleteAttendedTransferResponseBodyDataCallContextChannelContexts setChannelState(String channelState) {
            this.channelState = channelState;
            return this;
        }
        public String getChannelState() {
            return this.channelState;
        }

        public CompleteAttendedTransferResponseBodyDataCallContextChannelContexts setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public CompleteAttendedTransferResponseBodyDataCallContextChannelContexts setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public CompleteAttendedTransferResponseBodyDataCallContextChannelContexts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CompleteAttendedTransferResponseBodyDataCallContextChannelContexts setOriginator(String originator) {
            this.originator = originator;
            return this;
        }
        public String getOriginator() {
            return this.originator;
        }

        public CompleteAttendedTransferResponseBodyDataCallContextChannelContexts setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public CompleteAttendedTransferResponseBodyDataCallContextChannelContexts setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public CompleteAttendedTransferResponseBodyDataCallContextChannelContexts setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public CompleteAttendedTransferResponseBodyDataCallContextChannelContexts setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public CompleteAttendedTransferResponseBodyDataCallContextChannelContexts setUserExtension(String userExtension) {
            this.userExtension = userExtension;
            return this;
        }
        public String getUserExtension() {
            return this.userExtension;
        }

        public CompleteAttendedTransferResponseBodyDataCallContextChannelContexts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class CompleteAttendedTransferResponseBodyDataCallContext extends TeaModel {
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
        public java.util.List<CompleteAttendedTransferResponseBodyDataCallContextChannelContexts> channelContexts;

        /**
         * <p>Instance ID.</p>
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

        public static CompleteAttendedTransferResponseBodyDataCallContext build(java.util.Map<String, ?> map) throws Exception {
            CompleteAttendedTransferResponseBodyDataCallContext self = new CompleteAttendedTransferResponseBodyDataCallContext();
            return TeaModel.build(map, self);
        }

        public CompleteAttendedTransferResponseBodyDataCallContext setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public CompleteAttendedTransferResponseBodyDataCallContext setChannelContexts(java.util.List<CompleteAttendedTransferResponseBodyDataCallContextChannelContexts> channelContexts) {
            this.channelContexts = channelContexts;
            return this;
        }
        public java.util.List<CompleteAttendedTransferResponseBodyDataCallContextChannelContexts> getChannelContexts() {
            return this.channelContexts;
        }

        public CompleteAttendedTransferResponseBodyDataCallContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CompleteAttendedTransferResponseBodyDataCallContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

    public static class CompleteAttendedTransferResponseBodyDataUserContext extends TeaModel {
        /**
         * <p>Break status code, which can be either System-defined or Custom-defined. System-defined break codes include: Warm-up (temporary break state after agent is published and before becoming idle), RingingTimeout (break caused by agent ringing timeout), and RejectCall (break caused by agent rejecting a call). There are no restrictions on Custom-defined status codes; customers can define them according to their business needs.</p>
         * 
         * <strong>example:</strong>
         * <p>Warm-up</p>
         */
        @NameInMap("BreakCode")
        public String breakCode;

        /**
         * <p>Device ID, the identity ID of a browser-based Web Real-Time Communication (WebRTC) softphone or a physical phone device. Only one type of device can be registered at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>ACC-YUNBS-1.0.10-****</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <p>The agent\&quot;s extension number.</p>
         * 
         * <strong>example:</strong>
         * <p>8032****</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The time when the last heartbeat was received from the agent, formatted as a UNIX timestamp in milliseconds.</p>
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
         * <p>Call ID during the call state.</p>
         * 
         * <strong>example:</strong>
         * <p>job-65382141036853491</p>
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
         * <p>The most recent time when the agent was reserved. Being reserved means an incoming call will soon be assigned to this agent. The format is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1609136956378</p>
         */
        @NameInMap("Reserved")
        public Long reserved;

        /**
         * <p>List of skill group IDs that the agent has signed into.</p>
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
         * <p>Agent status.</p>
         * 
         * <strong>example:</strong>
         * <p>TALKING</p>
         */
        @NameInMap("UserState")
        public String userState;

        /**
         * <p>Work mode.</p>
         * 
         * <strong>example:</strong>
         * <p>ON_SITE</p>
         */
        @NameInMap("WorkMode")
        public String workMode;

        public static CompleteAttendedTransferResponseBodyDataUserContext build(java.util.Map<String, ?> map) throws Exception {
            CompleteAttendedTransferResponseBodyDataUserContext self = new CompleteAttendedTransferResponseBodyDataUserContext();
            return TeaModel.build(map, self);
        }

        public CompleteAttendedTransferResponseBodyDataUserContext setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public CompleteAttendedTransferResponseBodyDataUserContext setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public CompleteAttendedTransferResponseBodyDataUserContext setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public CompleteAttendedTransferResponseBodyDataUserContext setHeartbeat(Long heartbeat) {
            this.heartbeat = heartbeat;
            return this;
        }
        public Long getHeartbeat() {
            return this.heartbeat;
        }

        public CompleteAttendedTransferResponseBodyDataUserContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CompleteAttendedTransferResponseBodyDataUserContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CompleteAttendedTransferResponseBodyDataUserContext setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public CompleteAttendedTransferResponseBodyDataUserContext setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public CompleteAttendedTransferResponseBodyDataUserContext setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public CompleteAttendedTransferResponseBodyDataUserContext setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

        public CompleteAttendedTransferResponseBodyDataUserContext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public CompleteAttendedTransferResponseBodyDataUserContext setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public CompleteAttendedTransferResponseBodyDataUserContext setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

    public static class CompleteAttendedTransferResponseBodyData extends TeaModel {
        /**
         * <p>Call context environment.</p>
         */
        @NameInMap("CallContext")
        public CompleteAttendedTransferResponseBodyDataCallContext callContext;

        /**
         * <p>System auto increment ID. Customers do not need to concern themselves with this.</p>
         * 
         * <strong>example:</strong>
         * <p>103652</p>
         */
        @NameInMap("ContextId")
        public Long contextId;

        /**
         * <p>Agent context environment.</p>
         */
        @NameInMap("UserContext")
        public CompleteAttendedTransferResponseBodyDataUserContext userContext;

        public static CompleteAttendedTransferResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CompleteAttendedTransferResponseBodyData self = new CompleteAttendedTransferResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CompleteAttendedTransferResponseBodyData setCallContext(CompleteAttendedTransferResponseBodyDataCallContext callContext) {
            this.callContext = callContext;
            return this;
        }
        public CompleteAttendedTransferResponseBodyDataCallContext getCallContext() {
            return this.callContext;
        }

        public CompleteAttendedTransferResponseBodyData setContextId(Long contextId) {
            this.contextId = contextId;
            return this;
        }
        public Long getContextId() {
            return this.contextId;
        }

        public CompleteAttendedTransferResponseBodyData setUserContext(CompleteAttendedTransferResponseBodyDataUserContext userContext) {
            this.userContext = userContext;
            return this;
        }
        public CompleteAttendedTransferResponseBodyDataUserContext getUserContext() {
            return this.userContext;
        }

    }

}
