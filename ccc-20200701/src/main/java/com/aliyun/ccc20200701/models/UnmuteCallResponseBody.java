// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class UnmuteCallResponseBody extends TeaModel {
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
    public UnmuteCallResponseBodyData data;

    public static UnmuteCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnmuteCallResponseBody self = new UnmuteCallResponseBody();
        return TeaModel.build(map, self);
    }

    public UnmuteCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UnmuteCallResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UnmuteCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnmuteCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnmuteCallResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public UnmuteCallResponseBody setData(UnmuteCallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UnmuteCallResponseBodyData getData() {
        return this.data;
    }

    public static class UnmuteCallResponseBodyDataCallContextChannelContexts extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("ReleaseInitiator")
        public String releaseInitiator;

        @NameInMap("ChannelState")
        public String channelState;

        @NameInMap("Destination")
        public String destination;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("ChannelFlags")
        public String channelFlags;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

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

        @NameInMap("UserExtension")
        public String userExtension;

        @NameInMap("Originator")
        public String originator;

        public static UnmuteCallResponseBodyDataCallContextChannelContexts build(java.util.Map<String, ?> map) throws Exception {
            UnmuteCallResponseBodyDataCallContextChannelContexts self = new UnmuteCallResponseBodyDataCallContextChannelContexts();
            return TeaModel.build(map, self);
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setChannelState(String channelState) {
            this.channelState = channelState;
            return this;
        }
        public String getChannelState() {
            return this.channelState;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setChannelFlags(String channelFlags) {
            this.channelFlags = channelFlags;
            return this;
        }
        public String getChannelFlags() {
            return this.channelFlags;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setAssociatedData(java.util.Map<String, ?> associatedData) {
            this.associatedData = associatedData;
            return this;
        }
        public java.util.Map<String, ?> getAssociatedData() {
            return this.associatedData;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setUserExtension(String userExtension) {
            this.userExtension = userExtension;
            return this;
        }
        public String getUserExtension() {
            return this.userExtension;
        }

        public UnmuteCallResponseBodyDataCallContextChannelContexts setOriginator(String originator) {
            this.originator = originator;
            return this;
        }
        public String getOriginator() {
            return this.originator;
        }

    }

    public static class UnmuteCallResponseBodyDataCallContext extends TeaModel {
        @NameInMap("CallType")
        public String callType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ChannelContexts")
        public java.util.List<UnmuteCallResponseBodyDataCallContextChannelContexts> channelContexts;

        public static UnmuteCallResponseBodyDataCallContext build(java.util.Map<String, ?> map) throws Exception {
            UnmuteCallResponseBodyDataCallContext self = new UnmuteCallResponseBodyDataCallContext();
            return TeaModel.build(map, self);
        }

        public UnmuteCallResponseBodyDataCallContext setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public UnmuteCallResponseBodyDataCallContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UnmuteCallResponseBodyDataCallContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public UnmuteCallResponseBodyDataCallContext setChannelContexts(java.util.List<UnmuteCallResponseBodyDataCallContextChannelContexts> channelContexts) {
            this.channelContexts = channelContexts;
            return this;
        }
        public java.util.List<UnmuteCallResponseBodyDataCallContextChannelContexts> getChannelContexts() {
            return this.channelContexts;
        }

    }

    public static class UnmuteCallResponseBodyDataUserContext extends TeaModel {
        @NameInMap("Heartbeat")
        public Long heartbeat;

        @NameInMap("Extension")
        public String extension;

        @NameInMap("WorkMode")
        public String workMode;

        @NameInMap("Mobile")
        public String mobile;

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

        public static UnmuteCallResponseBodyDataUserContext build(java.util.Map<String, ?> map) throws Exception {
            UnmuteCallResponseBodyDataUserContext self = new UnmuteCallResponseBodyDataUserContext();
            return TeaModel.build(map, self);
        }

        public UnmuteCallResponseBodyDataUserContext setHeartbeat(Long heartbeat) {
            this.heartbeat = heartbeat;
            return this;
        }
        public Long getHeartbeat() {
            return this.heartbeat;
        }

        public UnmuteCallResponseBodyDataUserContext setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public UnmuteCallResponseBodyDataUserContext setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

        public UnmuteCallResponseBodyDataUserContext setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public UnmuteCallResponseBodyDataUserContext setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public UnmuteCallResponseBodyDataUserContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public UnmuteCallResponseBodyDataUserContext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public UnmuteCallResponseBodyDataUserContext setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public UnmuteCallResponseBodyDataUserContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UnmuteCallResponseBodyDataUserContext setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public UnmuteCallResponseBodyDataUserContext setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public UnmuteCallResponseBodyDataUserContext setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

    }

    public static class UnmuteCallResponseBodyData extends TeaModel {
        @NameInMap("CallContext")
        public UnmuteCallResponseBodyDataCallContext callContext;

        @NameInMap("UserContext")
        public UnmuteCallResponseBodyDataUserContext userContext;

        public static UnmuteCallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UnmuteCallResponseBodyData self = new UnmuteCallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UnmuteCallResponseBodyData setCallContext(UnmuteCallResponseBodyDataCallContext callContext) {
            this.callContext = callContext;
            return this;
        }
        public UnmuteCallResponseBodyDataCallContext getCallContext() {
            return this.callContext;
        }

        public UnmuteCallResponseBodyData setUserContext(UnmuteCallResponseBodyDataUserContext userContext) {
            this.userContext = userContext;
            return this;
        }
        public UnmuteCallResponseBodyDataUserContext getUserContext() {
            return this.userContext;
        }

    }

}
