// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class StartBack2BackCallResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
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
    public StartBack2BackCallResponseBodyData data;

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
     * <p>26A34338-5CD9-4C95-A7A6-5BDCE76C6B94</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartBack2BackCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartBack2BackCallResponseBody self = new StartBack2BackCallResponseBody();
        return TeaModel.build(map, self);
    }

    public StartBack2BackCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartBack2BackCallResponseBody setData(StartBack2BackCallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartBack2BackCallResponseBodyData getData() {
        return this.data;
    }

    public StartBack2BackCallResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public StartBack2BackCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartBack2BackCallResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public StartBack2BackCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StartBack2BackCallResponseBodyDataCallContextChannelContexts extends TeaModel {
        /**
         * <p>The call type of the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>BACK2BACK</p>
         */
        @NameInMap("CallType")
        public String callType;

        /**
         * <p>Flags of the voice channel.</p>
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
         * <p>ch:user:1390501****-&gt;8032****:1609138902226:job-653821410368****</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The status of the voice channel.</p>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        @NameInMap("ChannelState")
        public String channelState;

        /**
         * <p>The called party of the call channel.</p>
         * 
         * <strong>example:</strong>
         * <p>1372168****</p>
         */
        @NameInMap("Destination")
        public String destination;

        /**
         * <p>The call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>job-1034159089076****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The originator of the voice channel</p>
         * 
         * <strong>example:</strong>
         * <p>0102157****</p>
         */
        @NameInMap("Originator")
        public String originator;

        /**
         * <p>The party that initiated the release of the voice channel, indicating who first disconnected the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("ReleaseInitiator")
        public String releaseInitiator;

        /**
         * <p>The reason for releasing the voice channel, indicating why the current voice channel was disconnected. The value is derived from the response codes defined in the SIP protocol. Customers should refer to the SIP protocol to analyze the disconnection reason.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("ReleaseReason")
        public String releaseReason;

        /**
         * <p>The UNIX timestamp indicating the most recent status change of the channel, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1618217874062</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The extension number of the agent associated with the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>8001****</p>
         */
        @NameInMap("UserExtension")
        public String userExtension;

        /**
         * <p>The agent ID associated with the voice channel. This field is empty if the channel belongs to a Customer.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static StartBack2BackCallResponseBodyDataCallContextChannelContexts build(java.util.Map<String, ?> map) throws Exception {
            StartBack2BackCallResponseBodyDataCallContextChannelContexts self = new StartBack2BackCallResponseBodyDataCallContextChannelContexts();
            return TeaModel.build(map, self);
        }

        public StartBack2BackCallResponseBodyDataCallContextChannelContexts setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public StartBack2BackCallResponseBodyDataCallContextChannelContexts setChannelFlags(String channelFlags) {
            this.channelFlags = channelFlags;
            return this;
        }
        public String getChannelFlags() {
            return this.channelFlags;
        }

        public StartBack2BackCallResponseBodyDataCallContextChannelContexts setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public StartBack2BackCallResponseBodyDataCallContextChannelContexts setChannelState(String channelState) {
            this.channelState = channelState;
            return this;
        }
        public String getChannelState() {
            return this.channelState;
        }

        public StartBack2BackCallResponseBodyDataCallContextChannelContexts setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public StartBack2BackCallResponseBodyDataCallContextChannelContexts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public StartBack2BackCallResponseBodyDataCallContextChannelContexts setOriginator(String originator) {
            this.originator = originator;
            return this;
        }
        public String getOriginator() {
            return this.originator;
        }

        public StartBack2BackCallResponseBodyDataCallContextChannelContexts setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public StartBack2BackCallResponseBodyDataCallContextChannelContexts setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public StartBack2BackCallResponseBodyDataCallContextChannelContexts setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public StartBack2BackCallResponseBodyDataCallContextChannelContexts setUserExtension(String userExtension) {
            this.userExtension = userExtension;
            return this;
        }
        public String getUserExtension() {
            return this.userExtension;
        }

        public StartBack2BackCallResponseBodyDataCallContextChannelContexts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class StartBack2BackCallResponseBodyDataCallContext extends TeaModel {
        /**
         * <p>The call type.</p>
         * 
         * <strong>example:</strong>
         * <p>BACK2BACK</p>
         */
        @NameInMap("CallType")
        public String callType;

        /**
         * <p>List of call channels.</p>
         */
        @NameInMap("ChannelContexts")
        public java.util.List<StartBack2BackCallResponseBodyDataCallContextChannelContexts> channelContexts;

        /**
         * <p>The instance ID.</p>
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
         * <p>job-1034159089076****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        public static StartBack2BackCallResponseBodyDataCallContext build(java.util.Map<String, ?> map) throws Exception {
            StartBack2BackCallResponseBodyDataCallContext self = new StartBack2BackCallResponseBodyDataCallContext();
            return TeaModel.build(map, self);
        }

        public StartBack2BackCallResponseBodyDataCallContext setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public StartBack2BackCallResponseBodyDataCallContext setChannelContexts(java.util.List<StartBack2BackCallResponseBodyDataCallContextChannelContexts> channelContexts) {
            this.channelContexts = channelContexts;
            return this;
        }
        public java.util.List<StartBack2BackCallResponseBodyDataCallContextChannelContexts> getChannelContexts() {
            return this.channelContexts;
        }

        public StartBack2BackCallResponseBodyDataCallContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public StartBack2BackCallResponseBodyDataCallContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

    public static class StartBack2BackCallResponseBodyDataUserContext extends TeaModel {
        /**
         * <p>Break status code, which can be either system-defined or customer-defined. System-defined break codes include: Warm-up (temporary break state after the agent is published and before becoming idle), RingingTimeout (break caused by agent ringing timeout), and RejectCall (break caused by agent call rejection). There are no restrictions on customer-defined status codes; customers can define them as needed for their business.</p>
         * 
         * <strong>example:</strong>
         * <p>Warm-up</p>
         */
        @NameInMap("BreakCode")
        public String breakCode;

        /**
         * <p>Device ID, which is the identity of a browser-based Web Real-Time Communication (WebRTC) softphone or a physical phone device. Only one type of device can be registered at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>ACC-YUNBS-1.0.10-****</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <p>Device status.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("DeviceState")
        public String deviceState;

        /**
         * <p>Agent extension number.</p>
         * 
         * <strong>example:</strong>
         * <p>8020****</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The time when the last heartbeat from the agent was received, in Unix timestamp format, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1618217872911</p>
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
         * <p>job-1034159089076****</p>
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
         * <p>The UNIX timestamp (in milliseconds) indicating when the agent was most recently reserved. Being reserved means an incoming call will be assigned to the agent shortly.</p>
         * 
         * <strong>example:</strong>
         * <p>1618217794599</p>
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
         * <p>OFFLINE</p>
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

        public static StartBack2BackCallResponseBodyDataUserContext build(java.util.Map<String, ?> map) throws Exception {
            StartBack2BackCallResponseBodyDataUserContext self = new StartBack2BackCallResponseBodyDataUserContext();
            return TeaModel.build(map, self);
        }

        public StartBack2BackCallResponseBodyDataUserContext setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public StartBack2BackCallResponseBodyDataUserContext setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public StartBack2BackCallResponseBodyDataUserContext setDeviceState(String deviceState) {
            this.deviceState = deviceState;
            return this;
        }
        public String getDeviceState() {
            return this.deviceState;
        }

        public StartBack2BackCallResponseBodyDataUserContext setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public StartBack2BackCallResponseBodyDataUserContext setHeartbeat(Long heartbeat) {
            this.heartbeat = heartbeat;
            return this;
        }
        public Long getHeartbeat() {
            return this.heartbeat;
        }

        public StartBack2BackCallResponseBodyDataUserContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public StartBack2BackCallResponseBodyDataUserContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public StartBack2BackCallResponseBodyDataUserContext setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public StartBack2BackCallResponseBodyDataUserContext setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public StartBack2BackCallResponseBodyDataUserContext setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public StartBack2BackCallResponseBodyDataUserContext setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

        public StartBack2BackCallResponseBodyDataUserContext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public StartBack2BackCallResponseBodyDataUserContext setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public StartBack2BackCallResponseBodyDataUserContext setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

    public static class StartBack2BackCallResponseBodyData extends TeaModel {
        /**
         * <p>The call context environment.</p>
         */
        @NameInMap("CallContext")
        public StartBack2BackCallResponseBodyDataCallContext callContext;

        /**
         * <p>Agent context environment.</p>
         */
        @NameInMap("UserContext")
        public StartBack2BackCallResponseBodyDataUserContext userContext;

        public static StartBack2BackCallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartBack2BackCallResponseBodyData self = new StartBack2BackCallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartBack2BackCallResponseBodyData setCallContext(StartBack2BackCallResponseBodyDataCallContext callContext) {
            this.callContext = callContext;
            return this;
        }
        public StartBack2BackCallResponseBodyDataCallContext getCallContext() {
            return this.callContext;
        }

        public StartBack2BackCallResponseBodyData setUserContext(StartBack2BackCallResponseBodyDataUserContext userContext) {
            this.userContext = userContext;
            return this;
        }
        public StartBack2BackCallResponseBodyDataUserContext getUserContext() {
            return this.userContext;
        }

    }

}
