// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class InterceptCallResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public InterceptCallResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    @NameInMap("RequestId")
    public String requestId;

    public static InterceptCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InterceptCallResponseBody self = new InterceptCallResponseBody();
        return TeaModel.build(map, self);
    }

    public InterceptCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InterceptCallResponseBody setData(InterceptCallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InterceptCallResponseBodyData getData() {
        return this.data;
    }

    public InterceptCallResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public InterceptCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InterceptCallResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public InterceptCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InterceptCallResponseBodyDataCallContextChannelContexts extends TeaModel {
        @NameInMap("CallType")
        public String callType;

        @NameInMap("ChannelFlags")
        public String channelFlags;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ChannelState")
        public String channelState;

        @NameInMap("Destination")
        public String destination;

        @NameInMap("Index")
        public Integer index;

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

        public static InterceptCallResponseBodyDataCallContextChannelContexts build(java.util.Map<String, ?> map) throws Exception {
            InterceptCallResponseBodyDataCallContextChannelContexts self = new InterceptCallResponseBodyDataCallContextChannelContexts();
            return TeaModel.build(map, self);
        }

        public InterceptCallResponseBodyDataCallContextChannelContexts setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public InterceptCallResponseBodyDataCallContextChannelContexts setChannelFlags(String channelFlags) {
            this.channelFlags = channelFlags;
            return this;
        }
        public String getChannelFlags() {
            return this.channelFlags;
        }

        public InterceptCallResponseBodyDataCallContextChannelContexts setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public InterceptCallResponseBodyDataCallContextChannelContexts setChannelState(String channelState) {
            this.channelState = channelState;
            return this;
        }
        public String getChannelState() {
            return this.channelState;
        }

        public InterceptCallResponseBodyDataCallContextChannelContexts setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public InterceptCallResponseBodyDataCallContextChannelContexts setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public InterceptCallResponseBodyDataCallContextChannelContexts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public InterceptCallResponseBodyDataCallContextChannelContexts setOriginator(String originator) {
            this.originator = originator;
            return this;
        }
        public String getOriginator() {
            return this.originator;
        }

        public InterceptCallResponseBodyDataCallContextChannelContexts setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public InterceptCallResponseBodyDataCallContextChannelContexts setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public InterceptCallResponseBodyDataCallContextChannelContexts setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public InterceptCallResponseBodyDataCallContextChannelContexts setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public InterceptCallResponseBodyDataCallContextChannelContexts setUserExtension(String userExtension) {
            this.userExtension = userExtension;
            return this;
        }
        public String getUserExtension() {
            return this.userExtension;
        }

        public InterceptCallResponseBodyDataCallContextChannelContexts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class InterceptCallResponseBodyDataCallContext extends TeaModel {
        @NameInMap("CallType")
        public String callType;

        @NameInMap("ChannelContexts")
        public java.util.List<InterceptCallResponseBodyDataCallContextChannelContexts> channelContexts;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobId")
        public String jobId;

        public static InterceptCallResponseBodyDataCallContext build(java.util.Map<String, ?> map) throws Exception {
            InterceptCallResponseBodyDataCallContext self = new InterceptCallResponseBodyDataCallContext();
            return TeaModel.build(map, self);
        }

        public InterceptCallResponseBodyDataCallContext setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public InterceptCallResponseBodyDataCallContext setChannelContexts(java.util.List<InterceptCallResponseBodyDataCallContextChannelContexts> channelContexts) {
            this.channelContexts = channelContexts;
            return this;
        }
        public java.util.List<InterceptCallResponseBodyDataCallContextChannelContexts> getChannelContexts() {
            return this.channelContexts;
        }

        public InterceptCallResponseBodyDataCallContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public InterceptCallResponseBodyDataCallContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

    public static class InterceptCallResponseBodyDataUserContext extends TeaModel {
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

        public static InterceptCallResponseBodyDataUserContext build(java.util.Map<String, ?> map) throws Exception {
            InterceptCallResponseBodyDataUserContext self = new InterceptCallResponseBodyDataUserContext();
            return TeaModel.build(map, self);
        }

        public InterceptCallResponseBodyDataUserContext setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public InterceptCallResponseBodyDataUserContext setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public InterceptCallResponseBodyDataUserContext setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public InterceptCallResponseBodyDataUserContext setHeartbeat(Long heartbeat) {
            this.heartbeat = heartbeat;
            return this;
        }
        public Long getHeartbeat() {
            return this.heartbeat;
        }

        public InterceptCallResponseBodyDataUserContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public InterceptCallResponseBodyDataUserContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public InterceptCallResponseBodyDataUserContext setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public InterceptCallResponseBodyDataUserContext setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public InterceptCallResponseBodyDataUserContext setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public InterceptCallResponseBodyDataUserContext setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

        public InterceptCallResponseBodyDataUserContext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public InterceptCallResponseBodyDataUserContext setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public InterceptCallResponseBodyDataUserContext setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

    public static class InterceptCallResponseBodyData extends TeaModel {
        @NameInMap("CallContext")
        public InterceptCallResponseBodyDataCallContext callContext;

        @NameInMap("UserContext")
        public InterceptCallResponseBodyDataUserContext userContext;

        public static InterceptCallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InterceptCallResponseBodyData self = new InterceptCallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InterceptCallResponseBodyData setCallContext(InterceptCallResponseBodyDataCallContext callContext) {
            this.callContext = callContext;
            return this;
        }
        public InterceptCallResponseBodyDataCallContext getCallContext() {
            return this.callContext;
        }

        public InterceptCallResponseBodyData setUserContext(InterceptCallResponseBodyDataUserContext userContext) {
            this.userContext = userContext;
            return this;
        }
        public InterceptCallResponseBodyDataUserContext getUserContext() {
            return this.userContext;
        }

    }

}
