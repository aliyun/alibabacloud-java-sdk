// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class StartPredictiveCallResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public StartPredictiveCallResponseBodyData data;

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

    public static StartPredictiveCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartPredictiveCallResponseBody self = new StartPredictiveCallResponseBody();
        return TeaModel.build(map, self);
    }

    public StartPredictiveCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartPredictiveCallResponseBody setData(StartPredictiveCallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartPredictiveCallResponseBodyData getData() {
        return this.data;
    }

    public StartPredictiveCallResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public StartPredictiveCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartPredictiveCallResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public StartPredictiveCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StartPredictiveCallResponseBodyDataCallContextChannelContexts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>OUTBOUND</p>
         */
        @NameInMap("CallType")
        public String callType;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("ChannelFlags")
        public String channelFlags;

        /**
         * <strong>example:</strong>
         * <p>ch:user:131888****-&gt;8001****:1609225718294:job-6570007401392****</p>
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

        public static StartPredictiveCallResponseBodyDataCallContextChannelContexts build(java.util.Map<String, ?> map) throws Exception {
            StartPredictiveCallResponseBodyDataCallContextChannelContexts self = new StartPredictiveCallResponseBodyDataCallContextChannelContexts();
            return TeaModel.build(map, self);
        }

        public StartPredictiveCallResponseBodyDataCallContextChannelContexts setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public StartPredictiveCallResponseBodyDataCallContextChannelContexts setChannelFlags(String channelFlags) {
            this.channelFlags = channelFlags;
            return this;
        }
        public String getChannelFlags() {
            return this.channelFlags;
        }

        public StartPredictiveCallResponseBodyDataCallContextChannelContexts setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public StartPredictiveCallResponseBodyDataCallContextChannelContexts setChannelState(String channelState) {
            this.channelState = channelState;
            return this;
        }
        public String getChannelState() {
            return this.channelState;
        }

        public StartPredictiveCallResponseBodyDataCallContextChannelContexts setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public StartPredictiveCallResponseBodyDataCallContextChannelContexts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public StartPredictiveCallResponseBodyDataCallContextChannelContexts setOriginator(String originator) {
            this.originator = originator;
            return this;
        }
        public String getOriginator() {
            return this.originator;
        }

        public StartPredictiveCallResponseBodyDataCallContextChannelContexts setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public StartPredictiveCallResponseBodyDataCallContextChannelContexts setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public StartPredictiveCallResponseBodyDataCallContextChannelContexts setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public StartPredictiveCallResponseBodyDataCallContextChannelContexts setUserExtension(String userExtension) {
            this.userExtension = userExtension;
            return this;
        }
        public String getUserExtension() {
            return this.userExtension;
        }

        public StartPredictiveCallResponseBodyDataCallContextChannelContexts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class StartPredictiveCallResponseBodyDataCallContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>OUTBOUND</p>
         */
        @NameInMap("CallType")
        public String callType;

        @NameInMap("ChannelContexts")
        public java.util.List<StartPredictiveCallResponseBodyDataCallContextChannelContexts> channelContexts;

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

        public static StartPredictiveCallResponseBodyDataCallContext build(java.util.Map<String, ?> map) throws Exception {
            StartPredictiveCallResponseBodyDataCallContext self = new StartPredictiveCallResponseBodyDataCallContext();
            return TeaModel.build(map, self);
        }

        public StartPredictiveCallResponseBodyDataCallContext setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public StartPredictiveCallResponseBodyDataCallContext setChannelContexts(java.util.List<StartPredictiveCallResponseBodyDataCallContextChannelContexts> channelContexts) {
            this.channelContexts = channelContexts;
            return this;
        }
        public java.util.List<StartPredictiveCallResponseBodyDataCallContextChannelContexts> getChannelContexts() {
            return this.channelContexts;
        }

        public StartPredictiveCallResponseBodyDataCallContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public StartPredictiveCallResponseBodyDataCallContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

    public static class StartPredictiveCallResponseBodyDataUserContext extends TeaModel {
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
         * <p>ONLINE</p>
         */
        @NameInMap("DeviceState")
        public String deviceState;

        /**
         * <strong>example:</strong>
         * <p>8001****</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <strong>example:</strong>
         * <p>1609136956378</p>
         */
        @NameInMap("Heartbeat")
        public Long heartbeat;

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
         * <p>1324730****</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OutboundScenario")
        public Boolean outboundScenario;

        /**
         * <strong>example:</strong>
         * <p>1609136956378</p>
         */
        @NameInMap("Reserved")
        public Long reserved;

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

        public static StartPredictiveCallResponseBodyDataUserContext build(java.util.Map<String, ?> map) throws Exception {
            StartPredictiveCallResponseBodyDataUserContext self = new StartPredictiveCallResponseBodyDataUserContext();
            return TeaModel.build(map, self);
        }

        public StartPredictiveCallResponseBodyDataUserContext setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public StartPredictiveCallResponseBodyDataUserContext setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public StartPredictiveCallResponseBodyDataUserContext setDeviceState(String deviceState) {
            this.deviceState = deviceState;
            return this;
        }
        public String getDeviceState() {
            return this.deviceState;
        }

        public StartPredictiveCallResponseBodyDataUserContext setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public StartPredictiveCallResponseBodyDataUserContext setHeartbeat(Long heartbeat) {
            this.heartbeat = heartbeat;
            return this;
        }
        public Long getHeartbeat() {
            return this.heartbeat;
        }

        public StartPredictiveCallResponseBodyDataUserContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public StartPredictiveCallResponseBodyDataUserContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public StartPredictiveCallResponseBodyDataUserContext setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public StartPredictiveCallResponseBodyDataUserContext setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public StartPredictiveCallResponseBodyDataUserContext setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public StartPredictiveCallResponseBodyDataUserContext setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

        public StartPredictiveCallResponseBodyDataUserContext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public StartPredictiveCallResponseBodyDataUserContext setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public StartPredictiveCallResponseBodyDataUserContext setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

    public static class StartPredictiveCallResponseBodyData extends TeaModel {
        @NameInMap("CallContext")
        public StartPredictiveCallResponseBodyDataCallContext callContext;

        @NameInMap("UserContext")
        public StartPredictiveCallResponseBodyDataUserContext userContext;

        public static StartPredictiveCallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartPredictiveCallResponseBodyData self = new StartPredictiveCallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartPredictiveCallResponseBodyData setCallContext(StartPredictiveCallResponseBodyDataCallContext callContext) {
            this.callContext = callContext;
            return this;
        }
        public StartPredictiveCallResponseBodyDataCallContext getCallContext() {
            return this.callContext;
        }

        public StartPredictiveCallResponseBodyData setUserContext(StartPredictiveCallResponseBodyDataUserContext userContext) {
            this.userContext = userContext;
            return this;
        }
        public StartPredictiveCallResponseBodyDataUserContext getUserContext() {
            return this.userContext;
        }

    }

}
