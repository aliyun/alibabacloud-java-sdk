// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ClaimCallResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data.</p>
     */
    @NameInMap("Data")
    public ClaimCallResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The list of error parameters.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>93CDC17E-3E8A-48F2-99E5-FA2E238DE8B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClaimCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClaimCallResponseBody self = new ClaimCallResponseBody();
        return TeaModel.build(map, self);
    }

    public ClaimCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClaimCallResponseBody setData(ClaimCallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClaimCallResponseBodyData getData() {
        return this.data;
    }

    public ClaimCallResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ClaimCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClaimCallResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ClaimCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClaimCallResponseBodyDataCallContextChannelContexts extends TeaModel {
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
         * <p>The state of the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>ANSWERED</p>
         */
        @NameInMap("ChannelState")
        public String channelState;

        /**
         * <p>The channel variables.</p>
         * 
         * <strong>example:</strong>
         * <p>a=b;c=d;</p>
         */
        @NameInMap("ChannelVariables")
        public String channelVariables;

        /**
         * <p>The destination of the channel.</p>
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
         * <p>job-6573574060089****</p>
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
         * <p>The party who initiated the channel release.</p>
         * 
         * <strong>example:</strong>
         * <p>1390501****</p>
         */
        @NameInMap("ReleaseInitiator")
        public String releaseInitiator;

        /**
         * <p>The reason why the channel was released. This is a SIP response code. For more information, see the SIP protocol specification.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("ReleaseReason")
        public String releaseReason;

        /**
         * <p>The Unix timestamp that indicates the last time the channel state changed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1609225718295</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The agent extension number.</p>
         * 
         * <strong>example:</strong>
         * <p>8059****</p>
         */
        @NameInMap("UserExtension")
        public String userExtension;

        /**
         * <p>The agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>invoker@ccc-test</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ClaimCallResponseBodyDataCallContextChannelContexts build(java.util.Map<String, ?> map) throws Exception {
            ClaimCallResponseBodyDataCallContextChannelContexts self = new ClaimCallResponseBodyDataCallContextChannelContexts();
            return TeaModel.build(map, self);
        }

        public ClaimCallResponseBodyDataCallContextChannelContexts setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public ClaimCallResponseBodyDataCallContextChannelContexts setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public ClaimCallResponseBodyDataCallContextChannelContexts setChannelState(String channelState) {
            this.channelState = channelState;
            return this;
        }
        public String getChannelState() {
            return this.channelState;
        }

        public ClaimCallResponseBodyDataCallContextChannelContexts setChannelVariables(String channelVariables) {
            this.channelVariables = channelVariables;
            return this;
        }
        public String getChannelVariables() {
            return this.channelVariables;
        }

        public ClaimCallResponseBodyDataCallContextChannelContexts setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public ClaimCallResponseBodyDataCallContextChannelContexts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ClaimCallResponseBodyDataCallContextChannelContexts setOriginator(String originator) {
            this.originator = originator;
            return this;
        }
        public String getOriginator() {
            return this.originator;
        }

        public ClaimCallResponseBodyDataCallContextChannelContexts setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public ClaimCallResponseBodyDataCallContextChannelContexts setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public ClaimCallResponseBodyDataCallContextChannelContexts setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ClaimCallResponseBodyDataCallContextChannelContexts setUserExtension(String userExtension) {
            this.userExtension = userExtension;
            return this;
        }
        public String getUserExtension() {
            return this.userExtension;
        }

        public ClaimCallResponseBodyDataCallContextChannelContexts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ClaimCallResponseBodyDataCallContext extends TeaModel {
        /**
         * <p>The channel contexts.</p>
         */
        @NameInMap("ChannelContexts")
        public java.util.List<ClaimCallResponseBodyDataCallContextChannelContexts> channelContexts;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>job-6538214103685****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        public static ClaimCallResponseBodyDataCallContext build(java.util.Map<String, ?> map) throws Exception {
            ClaimCallResponseBodyDataCallContext self = new ClaimCallResponseBodyDataCallContext();
            return TeaModel.build(map, self);
        }

        public ClaimCallResponseBodyDataCallContext setChannelContexts(java.util.List<ClaimCallResponseBodyDataCallContextChannelContexts> channelContexts) {
            this.channelContexts = channelContexts;
            return this;
        }
        public java.util.List<ClaimCallResponseBodyDataCallContextChannelContexts> getChannelContexts() {
            return this.channelContexts;
        }

        public ClaimCallResponseBodyDataCallContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ClaimCallResponseBodyDataCallContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

    public static class ClaimCallResponseBodyDataUserContext extends TeaModel {
        /**
         * <p>The break code.</p>
         * 
         * <strong>example:</strong>
         * <p>Customized</p>
         */
        @NameInMap("BreakCode")
        public String breakCode;

        /**
         * <p>The device ID.</p>
         * 
         * <strong>example:</strong>
         * <p>device-xxxx</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <p>The extension number.</p>
         * 
         * <strong>example:</strong>
         * <p>0830019****</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>job-6573574060089****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>Indicates whether this is an outbound scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OutboundScenario")
        public Boolean outboundScenario;

        /**
         * <p>The list of signed-in skill group IDs.</p>
         */
        @NameInMap("SignedSkillGroupIdList")
        public java.util.List<String> signedSkillGroupIdList;

        /**
         * <p>The agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>user@ccc-test</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The agent state.</p>
         * 
         * <strong>example:</strong>
         * <p>Dialing</p>
         */
        @NameInMap("UserState")
        public String userState;

        /**
         * <p>The work mode.</p>
         * 
         * <strong>example:</strong>
         * <p>ON_SITE</p>
         */
        @NameInMap("WorkMode")
        public String workMode;

        public static ClaimCallResponseBodyDataUserContext build(java.util.Map<String, ?> map) throws Exception {
            ClaimCallResponseBodyDataUserContext self = new ClaimCallResponseBodyDataUserContext();
            return TeaModel.build(map, self);
        }

        public ClaimCallResponseBodyDataUserContext setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public ClaimCallResponseBodyDataUserContext setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ClaimCallResponseBodyDataUserContext setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ClaimCallResponseBodyDataUserContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ClaimCallResponseBodyDataUserContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ClaimCallResponseBodyDataUserContext setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public ClaimCallResponseBodyDataUserContext setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

        public ClaimCallResponseBodyDataUserContext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ClaimCallResponseBodyDataUserContext setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public ClaimCallResponseBodyDataUserContext setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

    public static class ClaimCallResponseBodyData extends TeaModel {
        /**
         * <p>The call context.</p>
         */
        @NameInMap("CallContext")
        public ClaimCallResponseBodyDataCallContext callContext;

        /**
         * <p>The context ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ContextId")
        public Long contextId;

        /**
         * <p>The agent context.</p>
         */
        @NameInMap("UserContext")
        public ClaimCallResponseBodyDataUserContext userContext;

        public static ClaimCallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClaimCallResponseBodyData self = new ClaimCallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClaimCallResponseBodyData setCallContext(ClaimCallResponseBodyDataCallContext callContext) {
            this.callContext = callContext;
            return this;
        }
        public ClaimCallResponseBodyDataCallContext getCallContext() {
            return this.callContext;
        }

        public ClaimCallResponseBodyData setContextId(Long contextId) {
            this.contextId = contextId;
            return this;
        }
        public Long getContextId() {
            return this.contextId;
        }

        public ClaimCallResponseBodyData setUserContext(ClaimCallResponseBodyDataUserContext userContext) {
            this.userContext = userContext;
            return this;
        }
        public ClaimCallResponseBodyDataUserContext getUserContext() {
            return this.userContext;
        }

    }

}
