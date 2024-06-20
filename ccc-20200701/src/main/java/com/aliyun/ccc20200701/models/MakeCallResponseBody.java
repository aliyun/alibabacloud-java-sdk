// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class MakeCallResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public MakeCallResponseBodyData data;

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
     * <p>26A34338-5CD9-4C95-A7A6-5BDCE76C6B94</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MakeCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MakeCallResponseBody self = new MakeCallResponseBody();
        return TeaModel.build(map, self);
    }

    public MakeCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MakeCallResponseBody setData(MakeCallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MakeCallResponseBodyData getData() {
        return this.data;
    }

    public MakeCallResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public MakeCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MakeCallResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public MakeCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class MakeCallResponseBodyDataCallContextChannelContexts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>OUTBOUND</p>
         */
        @NameInMap("CallType")
        public String callType;

        /**
         * <strong>example:</strong>
         * <p>MONITORING</p>
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
         * <p>NONE</p>
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
         * <p>job-6570007401392****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <strong>example:</strong>
         * <p>1318888****</p>
         */
        @NameInMap("Originator")
        public String originator;

        @NameInMap("ReleaseInitiator")
        public String releaseInitiator;

        @NameInMap("ReleaseReason")
        public String releaseReason;

        /**
         * <strong>example:</strong>
         * <p>1609225718295</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <strong>example:</strong>
         * <p>8001****</p>
         */
        @NameInMap("UserExtension")
        public String userExtension;

        /**
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static MakeCallResponseBodyDataCallContextChannelContexts build(java.util.Map<String, ?> map) throws Exception {
            MakeCallResponseBodyDataCallContextChannelContexts self = new MakeCallResponseBodyDataCallContextChannelContexts();
            return TeaModel.build(map, self);
        }

        public MakeCallResponseBodyDataCallContextChannelContexts setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public MakeCallResponseBodyDataCallContextChannelContexts setChannelFlags(String channelFlags) {
            this.channelFlags = channelFlags;
            return this;
        }
        public String getChannelFlags() {
            return this.channelFlags;
        }

        public MakeCallResponseBodyDataCallContextChannelContexts setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public MakeCallResponseBodyDataCallContextChannelContexts setChannelState(String channelState) {
            this.channelState = channelState;
            return this;
        }
        public String getChannelState() {
            return this.channelState;
        }

        public MakeCallResponseBodyDataCallContextChannelContexts setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public MakeCallResponseBodyDataCallContextChannelContexts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public MakeCallResponseBodyDataCallContextChannelContexts setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public MakeCallResponseBodyDataCallContextChannelContexts setOriginator(String originator) {
            this.originator = originator;
            return this;
        }
        public String getOriginator() {
            return this.originator;
        }

        public MakeCallResponseBodyDataCallContextChannelContexts setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public MakeCallResponseBodyDataCallContextChannelContexts setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public MakeCallResponseBodyDataCallContextChannelContexts setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public MakeCallResponseBodyDataCallContextChannelContexts setUserExtension(String userExtension) {
            this.userExtension = userExtension;
            return this;
        }
        public String getUserExtension() {
            return this.userExtension;
        }

        public MakeCallResponseBodyDataCallContextChannelContexts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class MakeCallResponseBodyDataCallContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>OUTBOUND</p>
         */
        @NameInMap("CallType")
        public String callType;

        @NameInMap("ChannelContexts")
        public java.util.List<MakeCallResponseBodyDataCallContextChannelContexts> channelContexts;

        /**
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>job-6570007401392****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        public static MakeCallResponseBodyDataCallContext build(java.util.Map<String, ?> map) throws Exception {
            MakeCallResponseBodyDataCallContext self = new MakeCallResponseBodyDataCallContext();
            return TeaModel.build(map, self);
        }

        public MakeCallResponseBodyDataCallContext setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public MakeCallResponseBodyDataCallContext setChannelContexts(java.util.List<MakeCallResponseBodyDataCallContextChannelContexts> channelContexts) {
            this.channelContexts = channelContexts;
            return this;
        }
        public java.util.List<MakeCallResponseBodyDataCallContextChannelContexts> getChannelContexts() {
            return this.channelContexts;
        }

        public MakeCallResponseBodyDataCallContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public MakeCallResponseBodyDataCallContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

    public static class MakeCallResponseBodyDataUserContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Warm-up</p>
         */
        @NameInMap("BreakCode")
        public String breakCode;

        /**
         * <strong>example:</strong>
         * <p>ACC-YUNBS-1.0.10-****</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <strong>example:</strong>
         * <p>8001****</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>job-6570007401392****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OutboundScenario")
        public Boolean outboundScenario;

        @NameInMap("SignedSkillGroupIdList")
        public java.util.List<String> signedSkillGroupIdList;

        /**
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("UserState")
        public String userState;

        /**
         * <strong>example:</strong>
         * <p>ON_SITE</p>
         */
        @NameInMap("WorkMode")
        public String workMode;

        public static MakeCallResponseBodyDataUserContext build(java.util.Map<String, ?> map) throws Exception {
            MakeCallResponseBodyDataUserContext self = new MakeCallResponseBodyDataUserContext();
            return TeaModel.build(map, self);
        }

        public MakeCallResponseBodyDataUserContext setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public MakeCallResponseBodyDataUserContext setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public MakeCallResponseBodyDataUserContext setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public MakeCallResponseBodyDataUserContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public MakeCallResponseBodyDataUserContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public MakeCallResponseBodyDataUserContext setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public MakeCallResponseBodyDataUserContext setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

        public MakeCallResponseBodyDataUserContext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public MakeCallResponseBodyDataUserContext setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public MakeCallResponseBodyDataUserContext setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

    public static class MakeCallResponseBodyData extends TeaModel {
        @NameInMap("CallContext")
        public MakeCallResponseBodyDataCallContext callContext;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ContextId")
        public Long contextId;

        @NameInMap("UserContext")
        public MakeCallResponseBodyDataUserContext userContext;

        public static MakeCallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MakeCallResponseBodyData self = new MakeCallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MakeCallResponseBodyData setCallContext(MakeCallResponseBodyDataCallContext callContext) {
            this.callContext = callContext;
            return this;
        }
        public MakeCallResponseBodyDataCallContext getCallContext() {
            return this.callContext;
        }

        public MakeCallResponseBodyData setContextId(Long contextId) {
            this.contextId = contextId;
            return this;
        }
        public Long getContextId() {
            return this.contextId;
        }

        public MakeCallResponseBodyData setUserContext(MakeCallResponseBodyDataUserContext userContext) {
            this.userContext = userContext;
            return this;
        }
        public MakeCallResponseBodyDataUserContext getUserContext() {
            return this.userContext;
        }

    }

}
