// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RedialCallResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RedialCallResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>BF268B34-09C2-43FD-BAC4-5D31EA63****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RedialCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RedialCallResponseBody self = new RedialCallResponseBody();
        return TeaModel.build(map, self);
    }

    public RedialCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RedialCallResponseBody setData(RedialCallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RedialCallResponseBodyData getData() {
        return this.data;
    }

    public RedialCallResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RedialCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RedialCallResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public RedialCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RedialCallResponseBodyDataCallContextChannelContexts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>OUTBOUND</p>
         */
        @NameInMap("CallType")
        public String callType;

        /**
         * <strong>example:</strong>
         * <p>COACHING</p>
         */
        @NameInMap("ChannelFlags")
        public String channelFlags;

        /**
         * <strong>example:</strong>
         * <p>ch:user:1390501****-&gt;8032****:1609138902226:job-653821410368****</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <strong>example:</strong>
         * <p>CREATED</p>
         */
        @NameInMap("ChannelState")
        public String channelState;

        /**
         * <strong>example:</strong>
         * <p>8001****</p>
         */
        @NameInMap("Destination")
        public String destination;

        /**
         * <strong>example:</strong>
         * <p>job-6573574060089****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>1318888****</p>
         */
        @NameInMap("Originator")
        public String originator;

        /**
         * <strong>example:</strong>
         * <p>139xxxx0501</p>
         */
        @NameInMap("ReleaseInitiator")
        public String releaseInitiator;

        /**
         * <strong>example:</strong>
         * <p>486:USER_BUSY</p>
         */
        @NameInMap("ReleaseReason")
        public String releaseReason;

        /**
         * <strong>example:</strong>
         * <p>1609138903315</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <strong>example:</strong>
         * <p>8000****</p>
         */
        @NameInMap("UserExtension")
        public String userExtension;

        /**
         * <strong>example:</strong>
         * <p>samzhang@abc</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static RedialCallResponseBodyDataCallContextChannelContexts build(java.util.Map<String, ?> map) throws Exception {
            RedialCallResponseBodyDataCallContextChannelContexts self = new RedialCallResponseBodyDataCallContextChannelContexts();
            return TeaModel.build(map, self);
        }

        public RedialCallResponseBodyDataCallContextChannelContexts setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public RedialCallResponseBodyDataCallContextChannelContexts setChannelFlags(String channelFlags) {
            this.channelFlags = channelFlags;
            return this;
        }
        public String getChannelFlags() {
            return this.channelFlags;
        }

        public RedialCallResponseBodyDataCallContextChannelContexts setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public RedialCallResponseBodyDataCallContextChannelContexts setChannelState(String channelState) {
            this.channelState = channelState;
            return this;
        }
        public String getChannelState() {
            return this.channelState;
        }

        public RedialCallResponseBodyDataCallContextChannelContexts setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public RedialCallResponseBodyDataCallContextChannelContexts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public RedialCallResponseBodyDataCallContextChannelContexts setOriginator(String originator) {
            this.originator = originator;
            return this;
        }
        public String getOriginator() {
            return this.originator;
        }

        public RedialCallResponseBodyDataCallContextChannelContexts setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public RedialCallResponseBodyDataCallContextChannelContexts setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public RedialCallResponseBodyDataCallContextChannelContexts setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public RedialCallResponseBodyDataCallContextChannelContexts setUserExtension(String userExtension) {
            this.userExtension = userExtension;
            return this;
        }
        public String getUserExtension() {
            return this.userExtension;
        }

        public RedialCallResponseBodyDataCallContextChannelContexts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class RedialCallResponseBodyDataCallContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>OUTBOUND</p>
         */
        @NameInMap("CallType")
        public String callType;

        @NameInMap("ChannelContexts")
        public java.util.List<RedialCallResponseBodyDataCallContextChannelContexts> channelContexts;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>job-6538214103685****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        public static RedialCallResponseBodyDataCallContext build(java.util.Map<String, ?> map) throws Exception {
            RedialCallResponseBodyDataCallContext self = new RedialCallResponseBodyDataCallContext();
            return TeaModel.build(map, self);
        }

        public RedialCallResponseBodyDataCallContext setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public RedialCallResponseBodyDataCallContext setChannelContexts(java.util.List<RedialCallResponseBodyDataCallContextChannelContexts> channelContexts) {
            this.channelContexts = channelContexts;
            return this;
        }
        public java.util.List<RedialCallResponseBodyDataCallContextChannelContexts> getChannelContexts() {
            return this.channelContexts;
        }

        public RedialCallResponseBodyDataCallContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RedialCallResponseBodyDataCallContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

    public static class RedialCallResponseBodyDataUserContext extends TeaModel {
        @NameInMap("BreakCode")
        public String breakCode;

        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <strong>example:</strong>
         * <p>8000****</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>job-6573574060089****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("OutboundScenario")
        public Boolean outboundScenario;

        @NameInMap("SignedSkillGroupIdList")
        public java.util.List<String> signedSkillGroupIdList;

        /**
         * <strong>example:</strong>
         * <p>samzhang@abc</p>
         */
        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserState")
        public String userState;

        @NameInMap("WorkMode")
        public String workMode;

        public static RedialCallResponseBodyDataUserContext build(java.util.Map<String, ?> map) throws Exception {
            RedialCallResponseBodyDataUserContext self = new RedialCallResponseBodyDataUserContext();
            return TeaModel.build(map, self);
        }

        public RedialCallResponseBodyDataUserContext setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public RedialCallResponseBodyDataUserContext setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public RedialCallResponseBodyDataUserContext setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public RedialCallResponseBodyDataUserContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RedialCallResponseBodyDataUserContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public RedialCallResponseBodyDataUserContext setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public RedialCallResponseBodyDataUserContext setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

        public RedialCallResponseBodyDataUserContext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public RedialCallResponseBodyDataUserContext setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public RedialCallResponseBodyDataUserContext setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

    public static class RedialCallResponseBodyData extends TeaModel {
        @NameInMap("CallContext")
        public RedialCallResponseBodyDataCallContext callContext;

        /**
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("ContextId")
        public Long contextId;

        @NameInMap("UserContext")
        public RedialCallResponseBodyDataUserContext userContext;

        public static RedialCallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RedialCallResponseBodyData self = new RedialCallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RedialCallResponseBodyData setCallContext(RedialCallResponseBodyDataCallContext callContext) {
            this.callContext = callContext;
            return this;
        }
        public RedialCallResponseBodyDataCallContext getCallContext() {
            return this.callContext;
        }

        public RedialCallResponseBodyData setContextId(Long contextId) {
            this.contextId = contextId;
            return this;
        }
        public Long getContextId() {
            return this.contextId;
        }

        public RedialCallResponseBodyData setUserContext(RedialCallResponseBodyDataUserContext userContext) {
            this.userContext = userContext;
            return this;
        }
        public RedialCallResponseBodyDataUserContext getUserContext() {
            return this.userContext;
        }

    }

}
