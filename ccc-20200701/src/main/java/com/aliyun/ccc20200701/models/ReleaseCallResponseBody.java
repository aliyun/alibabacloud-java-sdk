// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ReleaseCallResponseBody extends TeaModel {
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
    public ReleaseCallResponseBodyData data;

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

    public static ReleaseCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseCallResponseBody self = new ReleaseCallResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReleaseCallResponseBody setData(ReleaseCallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReleaseCallResponseBodyData getData() {
        return this.data;
    }

    public ReleaseCallResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ReleaseCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReleaseCallResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ReleaseCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ReleaseCallResponseBodyDataCallContextChannelContexts extends TeaModel {
        /**
         * <p>The call type of the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>OUTBOUND</p>
         */
        @NameInMap("CallType")
        public String callType;

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
         * <p>CREATED</p>
         */
        @NameInMap("ChannelState")
        public String channelState;

        /**
         * <p>Channel-associated data</p>
         * 
         * <strong>example:</strong>
         * <p>a=b;c=d;</p>
         */
        @NameInMap("ChannelVariables")
        public String channelVariables;

        /**
         * <p>The callee of the voice channel.</p>
         * 
         * <strong>example:</strong>
         * <p>1390501****</p>
         */
        @NameInMap("Destination")
        public String destination;

        /**
         * <p>The call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>job-6538214103685****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The calling party of the call channel.</p>
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
         * <p>The reason for releasing the voice channel, indicating why the current voice channel was disconnected. The value is derived from the response codes defined in the SIP protocol. Customers can refer to the SIP protocol to analyze the disconnection reason.</p>
         * 
         * <strong>example:</strong>
         * <p>404 - No destination</p>
         */
        @NameInMap("ReleaseReason")
        public String releaseReason;

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
         * <p>The agent ID associated with the call channel. This field is empty if the call channel belongs to a Customer.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ReleaseCallResponseBodyDataCallContextChannelContexts build(java.util.Map<String, ?> map) throws Exception {
            ReleaseCallResponseBodyDataCallContextChannelContexts self = new ReleaseCallResponseBodyDataCallContextChannelContexts();
            return TeaModel.build(map, self);
        }

        public ReleaseCallResponseBodyDataCallContextChannelContexts setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public ReleaseCallResponseBodyDataCallContextChannelContexts setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public ReleaseCallResponseBodyDataCallContextChannelContexts setChannelState(String channelState) {
            this.channelState = channelState;
            return this;
        }
        public String getChannelState() {
            return this.channelState;
        }

        public ReleaseCallResponseBodyDataCallContextChannelContexts setChannelVariables(String channelVariables) {
            this.channelVariables = channelVariables;
            return this;
        }
        public String getChannelVariables() {
            return this.channelVariables;
        }

        public ReleaseCallResponseBodyDataCallContextChannelContexts setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public ReleaseCallResponseBodyDataCallContextChannelContexts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ReleaseCallResponseBodyDataCallContextChannelContexts setOriginator(String originator) {
            this.originator = originator;
            return this;
        }
        public String getOriginator() {
            return this.originator;
        }

        public ReleaseCallResponseBodyDataCallContextChannelContexts setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public ReleaseCallResponseBodyDataCallContextChannelContexts setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public ReleaseCallResponseBodyDataCallContextChannelContexts setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ReleaseCallResponseBodyDataCallContextChannelContexts setUserExtension(String userExtension) {
            this.userExtension = userExtension;
            return this;
        }
        public String getUserExtension() {
            return this.userExtension;
        }

        public ReleaseCallResponseBodyDataCallContextChannelContexts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ReleaseCallResponseBodyDataCallContext extends TeaModel {
        /**
         * <p>List of call channels.</p>
         */
        @NameInMap("ChannelContexts")
        public java.util.List<ReleaseCallResponseBodyDataCallContextChannelContexts> channelContexts;

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

        public static ReleaseCallResponseBodyDataCallContext build(java.util.Map<String, ?> map) throws Exception {
            ReleaseCallResponseBodyDataCallContext self = new ReleaseCallResponseBodyDataCallContext();
            return TeaModel.build(map, self);
        }

        public ReleaseCallResponseBodyDataCallContext setChannelContexts(java.util.List<ReleaseCallResponseBodyDataCallContextChannelContexts> channelContexts) {
            this.channelContexts = channelContexts;
            return this;
        }
        public java.util.List<ReleaseCallResponseBodyDataCallContextChannelContexts> getChannelContexts() {
            return this.channelContexts;
        }

        public ReleaseCallResponseBodyDataCallContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ReleaseCallResponseBodyDataCallContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

    public static class ReleaseCallResponseBodyDataUserContext extends TeaModel {
        /**
         * <p>Break status code, which can be either system-defined or customer-defined. System-defined break codes include: Warm-up (temporary break state after agent is published and before becoming idle), RingingTimeout (break caused by agent ringing timeout), and RejectCall (break caused by agent call rejection). There are no restrictions on customer-defined status codes; customers can define them according to their business needs.</p>
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
         * <p>Agent extension number.</p>
         * 
         * <strong>example:</strong>
         * <p>8032****</p>
         */
        @NameInMap("Extension")
        public String extension;

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
         * <p>Indicates whether the agent is in outbound-only mode.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OutboundScenario")
        public Boolean outboundScenario;

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
         * <p>BREAK</p>
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

        public static ReleaseCallResponseBodyDataUserContext build(java.util.Map<String, ?> map) throws Exception {
            ReleaseCallResponseBodyDataUserContext self = new ReleaseCallResponseBodyDataUserContext();
            return TeaModel.build(map, self);
        }

        public ReleaseCallResponseBodyDataUserContext setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public ReleaseCallResponseBodyDataUserContext setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ReleaseCallResponseBodyDataUserContext setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ReleaseCallResponseBodyDataUserContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ReleaseCallResponseBodyDataUserContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ReleaseCallResponseBodyDataUserContext setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public ReleaseCallResponseBodyDataUserContext setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

        public ReleaseCallResponseBodyDataUserContext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ReleaseCallResponseBodyDataUserContext setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public ReleaseCallResponseBodyDataUserContext setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

    public static class ReleaseCallResponseBodyData extends TeaModel {
        /**
         * <p>Call context environment.</p>
         */
        @NameInMap("CallContext")
        public ReleaseCallResponseBodyDataCallContext callContext;

        /**
         * <p>System auto-increment ID. Customers do not need to concern themselves with this.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ContextId")
        public Long contextId;

        /**
         * <p>Agent context environment.</p>
         */
        @NameInMap("UserContext")
        public ReleaseCallResponseBodyDataUserContext userContext;

        public static ReleaseCallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReleaseCallResponseBodyData self = new ReleaseCallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReleaseCallResponseBodyData setCallContext(ReleaseCallResponseBodyDataCallContext callContext) {
            this.callContext = callContext;
            return this;
        }
        public ReleaseCallResponseBodyDataCallContext getCallContext() {
            return this.callContext;
        }

        public ReleaseCallResponseBodyData setContextId(Long contextId) {
            this.contextId = contextId;
            return this;
        }
        public Long getContextId() {
            return this.contextId;
        }

        public ReleaseCallResponseBodyData setUserContext(ReleaseCallResponseBodyDataUserContext userContext) {
            this.userContext = userContext;
            return this;
        }
        public ReleaseCallResponseBodyDataUserContext getUserContext() {
            return this.userContext;
        }

    }

}
