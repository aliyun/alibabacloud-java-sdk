// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class EndConferenceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public EndConferenceResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    @NameInMap("RequestId")
    public String requestId;

    public static EndConferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EndConferenceResponseBody self = new EndConferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public EndConferenceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EndConferenceResponseBody setData(EndConferenceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EndConferenceResponseBodyData getData() {
        return this.data;
    }

    public EndConferenceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public EndConferenceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EndConferenceResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public EndConferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class EndConferenceResponseBodyDataCallContextChannelContexts extends TeaModel {
        @NameInMap("AssociatedData")
        public java.util.Map<String, ?> associatedData;

        @NameInMap("CallType")
        public String callType;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ChannelState")
        public String channelState;

        @NameInMap("Destination")
        public String destination;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Originator")
        public String originator;

        @NameInMap("ReleaseInitiator")
        public String releaseInitiator;

        @NameInMap("ReleaseReason")
        public String releaseReason;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("UserExtension")
        public String userExtension;

        @NameInMap("UserId")
        public String userId;

        public static EndConferenceResponseBodyDataCallContextChannelContexts build(java.util.Map<String, ?> map) throws Exception {
            EndConferenceResponseBodyDataCallContextChannelContexts self = new EndConferenceResponseBodyDataCallContextChannelContexts();
            return TeaModel.build(map, self);
        }

        public EndConferenceResponseBodyDataCallContextChannelContexts setAssociatedData(java.util.Map<String, ?> associatedData) {
            this.associatedData = associatedData;
            return this;
        }
        public java.util.Map<String, ?> getAssociatedData() {
            return this.associatedData;
        }

        public EndConferenceResponseBodyDataCallContextChannelContexts setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public EndConferenceResponseBodyDataCallContextChannelContexts setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public EndConferenceResponseBodyDataCallContextChannelContexts setChannelState(String channelState) {
            this.channelState = channelState;
            return this;
        }
        public String getChannelState() {
            return this.channelState;
        }

        public EndConferenceResponseBodyDataCallContextChannelContexts setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public EndConferenceResponseBodyDataCallContextChannelContexts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public EndConferenceResponseBodyDataCallContextChannelContexts setOriginator(String originator) {
            this.originator = originator;
            return this;
        }
        public String getOriginator() {
            return this.originator;
        }

        public EndConferenceResponseBodyDataCallContextChannelContexts setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public EndConferenceResponseBodyDataCallContextChannelContexts setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public EndConferenceResponseBodyDataCallContextChannelContexts setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public EndConferenceResponseBodyDataCallContextChannelContexts setUserExtension(String userExtension) {
            this.userExtension = userExtension;
            return this;
        }
        public String getUserExtension() {
            return this.userExtension;
        }

        public EndConferenceResponseBodyDataCallContextChannelContexts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class EndConferenceResponseBodyDataCallContext extends TeaModel {
        @NameInMap("ChannelContexts")
        public java.util.List<EndConferenceResponseBodyDataCallContextChannelContexts> channelContexts;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobId")
        public String jobId;

        public static EndConferenceResponseBodyDataCallContext build(java.util.Map<String, ?> map) throws Exception {
            EndConferenceResponseBodyDataCallContext self = new EndConferenceResponseBodyDataCallContext();
            return TeaModel.build(map, self);
        }

        public EndConferenceResponseBodyDataCallContext setChannelContexts(java.util.List<EndConferenceResponseBodyDataCallContextChannelContexts> channelContexts) {
            this.channelContexts = channelContexts;
            return this;
        }
        public java.util.List<EndConferenceResponseBodyDataCallContextChannelContexts> getChannelContexts() {
            return this.channelContexts;
        }

        public EndConferenceResponseBodyDataCallContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public EndConferenceResponseBodyDataCallContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

    public static class EndConferenceResponseBodyDataUserContext extends TeaModel {
        @NameInMap("BreakCode")
        public String breakCode;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceState")
        public String deviceState;

        @NameInMap("Extension")
        public String extension;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("OutboundScenario")
        public Boolean outboundScenario;

        @NameInMap("SignedSkillGroupIdList")
        public java.util.List<String> signedSkillGroupIdList;

        @NameInMap("Uri")
        public String uri;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserState")
        public String userState;

        @NameInMap("WorkMode")
        public String workMode;

        public static EndConferenceResponseBodyDataUserContext build(java.util.Map<String, ?> map) throws Exception {
            EndConferenceResponseBodyDataUserContext self = new EndConferenceResponseBodyDataUserContext();
            return TeaModel.build(map, self);
        }

        public EndConferenceResponseBodyDataUserContext setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public EndConferenceResponseBodyDataUserContext setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public EndConferenceResponseBodyDataUserContext setDeviceState(String deviceState) {
            this.deviceState = deviceState;
            return this;
        }
        public String getDeviceState() {
            return this.deviceState;
        }

        public EndConferenceResponseBodyDataUserContext setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public EndConferenceResponseBodyDataUserContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public EndConferenceResponseBodyDataUserContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public EndConferenceResponseBodyDataUserContext setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public EndConferenceResponseBodyDataUserContext setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

        public EndConferenceResponseBodyDataUserContext setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

        public EndConferenceResponseBodyDataUserContext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public EndConferenceResponseBodyDataUserContext setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public EndConferenceResponseBodyDataUserContext setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

    public static class EndConferenceResponseBodyData extends TeaModel {
        @NameInMap("CallContext")
        public EndConferenceResponseBodyDataCallContext callContext;

        @NameInMap("ContextId")
        public Long contextId;

        @NameInMap("UserContext")
        public EndConferenceResponseBodyDataUserContext userContext;

        public static EndConferenceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EndConferenceResponseBodyData self = new EndConferenceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EndConferenceResponseBodyData setCallContext(EndConferenceResponseBodyDataCallContext callContext) {
            this.callContext = callContext;
            return this;
        }
        public EndConferenceResponseBodyDataCallContext getCallContext() {
            return this.callContext;
        }

        public EndConferenceResponseBodyData setContextId(Long contextId) {
            this.contextId = contextId;
            return this;
        }
        public Long getContextId() {
            return this.contextId;
        }

        public EndConferenceResponseBodyData setUserContext(EndConferenceResponseBodyDataUserContext userContext) {
            this.userContext = userContext;
            return this;
        }
        public EndConferenceResponseBodyDataUserContext getUserContext() {
            return this.userContext;
        }

    }

}
