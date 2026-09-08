// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CoachCallResponseBody extends TeaModel {
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
    public CoachCallResponseBodyData data;

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
     * <p>BA03159C-E808-4FF1-B27E-A61B6E888D7F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CoachCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CoachCallResponseBody self = new CoachCallResponseBody();
        return TeaModel.build(map, self);
    }

    public CoachCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CoachCallResponseBody setData(CoachCallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CoachCallResponseBodyData getData() {
        return this.data;
    }

    public CoachCallResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CoachCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CoachCallResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public CoachCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CoachCallResponseBodyDataCallContextChannelContexts extends TeaModel {
        /**
         * <p>The call type of the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>COACH</p>
         */
        @NameInMap("CallType")
        public String callType;

        /**
         * <p>Channel flags.</p>
         * 
         * <strong>example:</strong>
         * <p>COACHING</p>
         */
        @NameInMap("ChannelFlags")
        public String channelFlags;

        /**
         * <p>The channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ch:user:1390501****-&gt;8032****:1609138902226:job-653821410368****</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The status of the call channel.</p>
         * 
         * <strong>example:</strong>
         * <p>ANSWERED</p>
         */
        @NameInMap("ChannelState")
        public String channelState;

        /**
         * <p>The called party of the call channel.</p>
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
         * <p>The party that initiated the hang-up of the call channel, indicating who first terminated the call.</p>
         * 
         * <strong>example:</strong>
         * <p>1390501****</p>
         */
        @NameInMap("ReleaseInitiator")
        public String releaseInitiator;

        /**
         * <p>The reason for releasing the channel, indicating why the current channel was disconnected. The value corresponds to response codes defined in the SIP protocol. Customers should refer to the SIP protocol to analyze the disconnection reason.</p>
         * 
         * <strong>example:</strong>
         * <p>404 - No destination</p>
         */
        @NameInMap("ReleaseReason")
        public String releaseReason;

        /**
         * <p>The skill group ID associated with the channel. In inbound scenarios, the associated skill group ID is determined by the agent transfer module configured in the IVR. In outbound scenarios, the associated skill group ID is the first skill group ID that the agent signed into.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("SkillGroupId")
        public String skillGroupId;

        /**
         * <p>The UNIX timestamp indicating the most recent status change of the channel, in milliseconds.</p>
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
         * <p>The agent ID associated with the channel. This field is empty for a Customer channel.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static CoachCallResponseBodyDataCallContextChannelContexts build(java.util.Map<String, ?> map) throws Exception {
            CoachCallResponseBodyDataCallContextChannelContexts self = new CoachCallResponseBodyDataCallContextChannelContexts();
            return TeaModel.build(map, self);
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setChannelFlags(String channelFlags) {
            this.channelFlags = channelFlags;
            return this;
        }
        public String getChannelFlags() {
            return this.channelFlags;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setChannelState(String channelState) {
            this.channelState = channelState;
            return this;
        }
        public String getChannelState() {
            return this.channelState;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setOriginator(String originator) {
            this.originator = originator;
            return this;
        }
        public String getOriginator() {
            return this.originator;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setUserExtension(String userExtension) {
            this.userExtension = userExtension;
            return this;
        }
        public String getUserExtension() {
            return this.userExtension;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class CoachCallResponseBodyDataCallContext extends TeaModel {
        /**
         * <p>Call type.</p>
         * 
         * <strong>example:</strong>
         * <p>COACH</p>
         */
        @NameInMap("CallType")
        public String callType;

        /**
         * <p>List of call channels.</p>
         */
        @NameInMap("ChannelContexts")
        public java.util.List<CoachCallResponseBodyDataCallContextChannelContexts> channelContexts;

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

        public static CoachCallResponseBodyDataCallContext build(java.util.Map<String, ?> map) throws Exception {
            CoachCallResponseBodyDataCallContext self = new CoachCallResponseBodyDataCallContext();
            return TeaModel.build(map, self);
        }

        public CoachCallResponseBodyDataCallContext setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public CoachCallResponseBodyDataCallContext setChannelContexts(java.util.List<CoachCallResponseBodyDataCallContextChannelContexts> channelContexts) {
            this.channelContexts = channelContexts;
            return this;
        }
        public java.util.List<CoachCallResponseBodyDataCallContextChannelContexts> getChannelContexts() {
            return this.channelContexts;
        }

        public CoachCallResponseBodyDataCallContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CoachCallResponseBodyDataCallContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

    public static class CoachCallResponseBodyDataUserContext extends TeaModel {
        /**
         * <p>Break status code, which can be either System-defined or Custom-defined. System-defined break codes include: Warm-up (temporary break state after an agent is published and before becoming idle), RingingTimeout (break caused by agent ringing timeout), and RejectCall (break caused by agent call rejection). There are no restrictions on Custom-defined status codes; customers can define them according to their business needs.</p>
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
         * <p>The status of the SIP phone device. If the SIP phone is not registered, the status is UNREGISTERED (unregistered). If the SIP phone was previously registered but is currently offline, the status is OFFLINE (offline). If the SIP phone is registered and online, the status is ONLINE (online).</p>
         * 
         * <strong>example:</strong>
         * <p>UNREGISTERED</p>
         */
        @NameInMap("DeviceState")
        public String deviceState;

        /**
         * <p>The agent\&quot;s extension number.</p>
         * 
         * <strong>example:</strong>
         * <p>8032****</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The UNIX timestamp in milliseconds of the last heartbeat received from the agent.</p>
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
         * <p>Call ID.</p>
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
         * <p>The UNIX timestamp in milliseconds when the agent was most recently reserved. Being reserved means an incoming call will be assigned to the agent shortly.</p>
         * 
         * <strong>example:</strong>
         * <p>1609136956370</p>
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

        public static CoachCallResponseBodyDataUserContext build(java.util.Map<String, ?> map) throws Exception {
            CoachCallResponseBodyDataUserContext self = new CoachCallResponseBodyDataUserContext();
            return TeaModel.build(map, self);
        }

        public CoachCallResponseBodyDataUserContext setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public CoachCallResponseBodyDataUserContext setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public CoachCallResponseBodyDataUserContext setDeviceState(String deviceState) {
            this.deviceState = deviceState;
            return this;
        }
        public String getDeviceState() {
            return this.deviceState;
        }

        public CoachCallResponseBodyDataUserContext setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public CoachCallResponseBodyDataUserContext setHeartbeat(Long heartbeat) {
            this.heartbeat = heartbeat;
            return this;
        }
        public Long getHeartbeat() {
            return this.heartbeat;
        }

        public CoachCallResponseBodyDataUserContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CoachCallResponseBodyDataUserContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CoachCallResponseBodyDataUserContext setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public CoachCallResponseBodyDataUserContext setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public CoachCallResponseBodyDataUserContext setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public CoachCallResponseBodyDataUserContext setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

        public CoachCallResponseBodyDataUserContext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public CoachCallResponseBodyDataUserContext setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public CoachCallResponseBodyDataUserContext setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

    public static class CoachCallResponseBodyData extends TeaModel {
        /**
         * <p>Call context environment.</p>
         */
        @NameInMap("CallContext")
        public CoachCallResponseBodyDataCallContext callContext;

        /**
         * <p>Agent context environment.</p>
         */
        @NameInMap("UserContext")
        public CoachCallResponseBodyDataUserContext userContext;

        public static CoachCallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CoachCallResponseBodyData self = new CoachCallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CoachCallResponseBodyData setCallContext(CoachCallResponseBodyDataCallContext callContext) {
            this.callContext = callContext;
            return this;
        }
        public CoachCallResponseBodyDataCallContext getCallContext() {
            return this.callContext;
        }

        public CoachCallResponseBodyData setUserContext(CoachCallResponseBodyDataUserContext userContext) {
            this.userContext = userContext;
            return this;
        }
        public CoachCallResponseBodyDataUserContext getUserContext() {
            return this.userContext;
        }

    }

}
