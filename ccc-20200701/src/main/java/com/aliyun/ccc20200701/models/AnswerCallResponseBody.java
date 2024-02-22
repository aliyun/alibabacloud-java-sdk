// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AnswerCallResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AnswerCallResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    @NameInMap("RequestId")
    public String requestId;

    public static AnswerCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AnswerCallResponseBody self = new AnswerCallResponseBody();
        return TeaModel.build(map, self);
    }

    public AnswerCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AnswerCallResponseBody setData(AnswerCallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AnswerCallResponseBodyData getData() {
        return this.data;
    }

    public AnswerCallResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AnswerCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AnswerCallResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public AnswerCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AnswerCallResponseBodyDataCallContextChannelContexts extends TeaModel {
        @NameInMap("CallType")
        public String callType;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ChannelState")
        public String channelState;

        @NameInMap("ChannelVariables")
        public String channelVariables;

        @NameInMap("Destination")
        public String destination;

        @NameInMap("Index")
        public Long index;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Originator")
        public String originator;

        @NameInMap("ReleaseInitiator")
        public String releaseInitiator;

        @NameInMap("ReleaseReason")
        public String releaseReason;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("UserExtension")
        public String userExtension;

        @NameInMap("UserId")
        public String userId;

        public static AnswerCallResponseBodyDataCallContextChannelContexts build(java.util.Map<String, ?> map) throws Exception {
            AnswerCallResponseBodyDataCallContextChannelContexts self = new AnswerCallResponseBodyDataCallContextChannelContexts();
            return TeaModel.build(map, self);
        }

        public AnswerCallResponseBodyDataCallContextChannelContexts setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public AnswerCallResponseBodyDataCallContextChannelContexts setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public AnswerCallResponseBodyDataCallContextChannelContexts setChannelState(String channelState) {
            this.channelState = channelState;
            return this;
        }
        public String getChannelState() {
            return this.channelState;
        }

        public AnswerCallResponseBodyDataCallContextChannelContexts setChannelVariables(String channelVariables) {
            this.channelVariables = channelVariables;
            return this;
        }
        public String getChannelVariables() {
            return this.channelVariables;
        }

        public AnswerCallResponseBodyDataCallContextChannelContexts setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public AnswerCallResponseBodyDataCallContextChannelContexts setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public AnswerCallResponseBodyDataCallContextChannelContexts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public AnswerCallResponseBodyDataCallContextChannelContexts setOriginator(String originator) {
            this.originator = originator;
            return this;
        }
        public String getOriginator() {
            return this.originator;
        }

        public AnswerCallResponseBodyDataCallContextChannelContexts setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public AnswerCallResponseBodyDataCallContextChannelContexts setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public AnswerCallResponseBodyDataCallContextChannelContexts setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public AnswerCallResponseBodyDataCallContextChannelContexts setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public AnswerCallResponseBodyDataCallContextChannelContexts setUserExtension(String userExtension) {
            this.userExtension = userExtension;
            return this;
        }
        public String getUserExtension() {
            return this.userExtension;
        }

        public AnswerCallResponseBodyDataCallContextChannelContexts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class AnswerCallResponseBodyDataCallContext extends TeaModel {
        @NameInMap("CallType")
        public String callType;

        @NameInMap("ChannelContexts")
        public java.util.List<AnswerCallResponseBodyDataCallContextChannelContexts> channelContexts;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobId")
        public String jobId;

        public static AnswerCallResponseBodyDataCallContext build(java.util.Map<String, ?> map) throws Exception {
            AnswerCallResponseBodyDataCallContext self = new AnswerCallResponseBodyDataCallContext();
            return TeaModel.build(map, self);
        }

        public AnswerCallResponseBodyDataCallContext setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public AnswerCallResponseBodyDataCallContext setChannelContexts(java.util.List<AnswerCallResponseBodyDataCallContextChannelContexts> channelContexts) {
            this.channelContexts = channelContexts;
            return this;
        }
        public java.util.List<AnswerCallResponseBodyDataCallContextChannelContexts> getChannelContexts() {
            return this.channelContexts;
        }

        public AnswerCallResponseBodyDataCallContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AnswerCallResponseBodyDataCallContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

    public static class AnswerCallResponseBodyDataUserContext extends TeaModel {
        @NameInMap("BreakCode")
        public String breakCode;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("Extension")
        public String extension;

        @NameInMap("Heartbeat")
        public Long heartbeat;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("OutboundScenario")
        public Boolean outboundScenario;

        @NameInMap("Reserved")
        public Long reserved;

        @NameInMap("SignedSkillGroupIdList")
        public java.util.List<String> signedSkillGroupIdList;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserState")
        public String userState;

        @NameInMap("WorkMode")
        public String workMode;

        public static AnswerCallResponseBodyDataUserContext build(java.util.Map<String, ?> map) throws Exception {
            AnswerCallResponseBodyDataUserContext self = new AnswerCallResponseBodyDataUserContext();
            return TeaModel.build(map, self);
        }

        public AnswerCallResponseBodyDataUserContext setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public AnswerCallResponseBodyDataUserContext setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public AnswerCallResponseBodyDataUserContext setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public AnswerCallResponseBodyDataUserContext setHeartbeat(Long heartbeat) {
            this.heartbeat = heartbeat;
            return this;
        }
        public Long getHeartbeat() {
            return this.heartbeat;
        }

        public AnswerCallResponseBodyDataUserContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AnswerCallResponseBodyDataUserContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public AnswerCallResponseBodyDataUserContext setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public AnswerCallResponseBodyDataUserContext setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public AnswerCallResponseBodyDataUserContext setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public AnswerCallResponseBodyDataUserContext setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

        public AnswerCallResponseBodyDataUserContext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public AnswerCallResponseBodyDataUserContext setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public AnswerCallResponseBodyDataUserContext setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

    public static class AnswerCallResponseBodyData extends TeaModel {
        @NameInMap("CallContext")
        public AnswerCallResponseBodyDataCallContext callContext;

        @NameInMap("ContextId")
        public Long contextId;

        @NameInMap("UserContext")
        public AnswerCallResponseBodyDataUserContext userContext;

        public static AnswerCallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AnswerCallResponseBodyData self = new AnswerCallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AnswerCallResponseBodyData setCallContext(AnswerCallResponseBodyDataCallContext callContext) {
            this.callContext = callContext;
            return this;
        }
        public AnswerCallResponseBodyDataCallContext getCallContext() {
            return this.callContext;
        }

        public AnswerCallResponseBodyData setContextId(Long contextId) {
            this.contextId = contextId;
            return this;
        }
        public Long getContextId() {
            return this.contextId;
        }

        public AnswerCallResponseBodyData setUserContext(AnswerCallResponseBodyDataUserContext userContext) {
            this.userContext = userContext;
            return this;
        }
        public AnswerCallResponseBodyDataUserContext getUserContext() {
            return this.userContext;
        }

    }

}
