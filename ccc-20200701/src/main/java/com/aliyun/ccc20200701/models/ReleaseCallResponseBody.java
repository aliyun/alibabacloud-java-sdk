// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ReleaseCallResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Params")
    public java.util.List<String> params;

    @NameInMap("Data")
    public ReleaseCallResponseBodyData data;

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

    public ReleaseCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReleaseCallResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ReleaseCallResponseBody setData(ReleaseCallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReleaseCallResponseBodyData getData() {
        return this.data;
    }

    public static class ReleaseCallResponseBodyDataCallContextChannelContexts extends TeaModel {
        @NameInMap("ReleaseInitiator")
        public String releaseInitiator;

        @NameInMap("ChannelState")
        public String channelState;

        @NameInMap("Destination")
        public String destination;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("AssociatedData")
        public java.util.Map<String, ?> associatedData;

        @NameInMap("ReleaseReason")
        public String releaseReason;

        @NameInMap("CallType")
        public String callType;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("Originator")
        public String originator;

        @NameInMap("UserExtension")
        public String userExtension;

        public static ReleaseCallResponseBodyDataCallContextChannelContexts build(java.util.Map<String, ?> map) throws Exception {
            ReleaseCallResponseBodyDataCallContextChannelContexts self = new ReleaseCallResponseBodyDataCallContextChannelContexts();
            return TeaModel.build(map, self);
        }

        public ReleaseCallResponseBodyDataCallContextChannelContexts setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public ReleaseCallResponseBodyDataCallContextChannelContexts setChannelState(String channelState) {
            this.channelState = channelState;
            return this;
        }
        public String getChannelState() {
            return this.channelState;
        }

        public ReleaseCallResponseBodyDataCallContextChannelContexts setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public ReleaseCallResponseBodyDataCallContextChannelContexts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ReleaseCallResponseBodyDataCallContextChannelContexts setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ReleaseCallResponseBodyDataCallContextChannelContexts setAssociatedData(java.util.Map<String, ?> associatedData) {
            this.associatedData = associatedData;
            return this;
        }
        public java.util.Map<String, ?> getAssociatedData() {
            return this.associatedData;
        }

        public ReleaseCallResponseBodyDataCallContextChannelContexts setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public ReleaseCallResponseBodyDataCallContextChannelContexts setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public ReleaseCallResponseBodyDataCallContextChannelContexts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ReleaseCallResponseBodyDataCallContextChannelContexts setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public ReleaseCallResponseBodyDataCallContextChannelContexts setOriginator(String originator) {
            this.originator = originator;
            return this;
        }
        public String getOriginator() {
            return this.originator;
        }

        public ReleaseCallResponseBodyDataCallContextChannelContexts setUserExtension(String userExtension) {
            this.userExtension = userExtension;
            return this;
        }
        public String getUserExtension() {
            return this.userExtension;
        }

    }

    public static class ReleaseCallResponseBodyDataCallContext extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ChannelContexts")
        public java.util.List<ReleaseCallResponseBodyDataCallContextChannelContexts> channelContexts;

        public static ReleaseCallResponseBodyDataCallContext build(java.util.Map<String, ?> map) throws Exception {
            ReleaseCallResponseBodyDataCallContext self = new ReleaseCallResponseBodyDataCallContext();
            return TeaModel.build(map, self);
        }

        public ReleaseCallResponseBodyDataCallContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ReleaseCallResponseBodyDataCallContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ReleaseCallResponseBodyDataCallContext setChannelContexts(java.util.List<ReleaseCallResponseBodyDataCallContextChannelContexts> channelContexts) {
            this.channelContexts = channelContexts;
            return this;
        }
        public java.util.List<ReleaseCallResponseBodyDataCallContextChannelContexts> getChannelContexts() {
            return this.channelContexts;
        }

    }

    public static class ReleaseCallResponseBodyDataUserContext extends TeaModel {
        @NameInMap("Extension")
        public String extension;

        @NameInMap("WorkMode")
        public String workMode;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("BreakCode")
        public String breakCode;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OutboundScenario")
        public Boolean outboundScenario;

        @NameInMap("UserState")
        public String userState;

        @NameInMap("SignedSkillGroupIdList")
        public java.util.List<String> signedSkillGroupIdList;

        public static ReleaseCallResponseBodyDataUserContext build(java.util.Map<String, ?> map) throws Exception {
            ReleaseCallResponseBodyDataUserContext self = new ReleaseCallResponseBodyDataUserContext();
            return TeaModel.build(map, self);
        }

        public ReleaseCallResponseBodyDataUserContext setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ReleaseCallResponseBodyDataUserContext setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

        public ReleaseCallResponseBodyDataUserContext setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ReleaseCallResponseBodyDataUserContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ReleaseCallResponseBodyDataUserContext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ReleaseCallResponseBodyDataUserContext setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public ReleaseCallResponseBodyDataUserContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ReleaseCallResponseBodyDataUserContext setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public ReleaseCallResponseBodyDataUserContext setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public ReleaseCallResponseBodyDataUserContext setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

    }

    public static class ReleaseCallResponseBodyData extends TeaModel {
        @NameInMap("CallContext")
        public ReleaseCallResponseBodyDataCallContext callContext;

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

        public ReleaseCallResponseBodyData setUserContext(ReleaseCallResponseBodyDataUserContext userContext) {
            this.userContext = userContext;
            return this;
        }
        public ReleaseCallResponseBodyDataUserContext getUserContext() {
            return this.userContext;
        }

    }

}
