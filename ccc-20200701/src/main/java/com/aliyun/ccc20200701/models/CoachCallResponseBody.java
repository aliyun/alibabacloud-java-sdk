// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CoachCallResponseBody extends TeaModel {
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
    public CoachCallResponseBodyData data;

    public static CoachCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CoachCallResponseBody self = new CoachCallResponseBody();
        return TeaModel.build(map, self);
    }

    public CoachCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CoachCallResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CoachCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CoachCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CoachCallResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public CoachCallResponseBody setData(CoachCallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CoachCallResponseBodyData getData() {
        return this.data;
    }

    public static class CoachCallResponseBodyDataCallContextChannelContexts extends TeaModel {
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

        public static CoachCallResponseBodyDataCallContextChannelContexts build(java.util.Map<String, ?> map) throws Exception {
            CoachCallResponseBodyDataCallContextChannelContexts self = new CoachCallResponseBodyDataCallContextChannelContexts();
            return TeaModel.build(map, self);
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setChannelState(String channelState) {
            this.channelState = channelState;
            return this;
        }
        public String getChannelState() {
            return this.channelState;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setChannelFlags(String channelFlags) {
            this.channelFlags = channelFlags;
            return this;
        }
        public String getChannelFlags() {
            return this.channelFlags;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setAssociatedData(java.util.Map<String, ?> associatedData) {
            this.associatedData = associatedData;
            return this;
        }
        public java.util.Map<String, ?> getAssociatedData() {
            return this.associatedData;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setUserExtension(String userExtension) {
            this.userExtension = userExtension;
            return this;
        }
        public String getUserExtension() {
            return this.userExtension;
        }

        public CoachCallResponseBodyDataCallContextChannelContexts setOriginator(String originator) {
            this.originator = originator;
            return this;
        }
        public String getOriginator() {
            return this.originator;
        }

    }

    public static class CoachCallResponseBodyDataCallContext extends TeaModel {
        @NameInMap("CallType")
        public String callType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ChannelContexts")
        public java.util.List<CoachCallResponseBodyDataCallContextChannelContexts> channelContexts;

        public static CoachCallResponseBodyDataCallContext build(java.util.Map<String, ?> map) throws Exception {
            CoachCallResponseBodyDataCallContext self = new CoachCallResponseBodyDataCallContext();
            return TeaModel.build(map, self);
        }

        public CoachCallResponseBodyDataCallContext setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public CoachCallResponseBodyDataCallContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CoachCallResponseBodyDataCallContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CoachCallResponseBodyDataCallContext setChannelContexts(java.util.List<CoachCallResponseBodyDataCallContextChannelContexts> channelContexts) {
            this.channelContexts = channelContexts;
            return this;
        }
        public java.util.List<CoachCallResponseBodyDataCallContextChannelContexts> getChannelContexts() {
            return this.channelContexts;
        }

    }

    public static class CoachCallResponseBodyDataUserContext extends TeaModel {
        @NameInMap("Extension")
        public String extension;

        @NameInMap("Heartbeat")
        public Long heartbeat;

        @NameInMap("WorkMode")
        public String workMode;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Reserved")
        public Long reserved;

        @NameInMap("BreakCode")
        public String breakCode;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OutboundScenario")
        public Boolean outboundScenario;

        @NameInMap("Uri")
        public String uri;

        @NameInMap("DeviceState")
        public String deviceState;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("UserState")
        public String userState;

        @NameInMap("SignedSkillGroupIdList")
        public java.util.List<String> signedSkillGroupIdList;

        public static CoachCallResponseBodyDataUserContext build(java.util.Map<String, ?> map) throws Exception {
            CoachCallResponseBodyDataUserContext self = new CoachCallResponseBodyDataUserContext();
            return TeaModel.build(map, self);
        }

        public CoachCallResponseBodyDataUserContext setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public CoachCallResponseBodyDataUserContext setHeartbeat(Long heartbeat) {
            this.heartbeat = heartbeat;
            return this;
        }
        public Long getHeartbeat() {
            return this.heartbeat;
        }

        public CoachCallResponseBodyDataUserContext setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

        public CoachCallResponseBodyDataUserContext setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public CoachCallResponseBodyDataUserContext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public CoachCallResponseBodyDataUserContext setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public CoachCallResponseBodyDataUserContext setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public CoachCallResponseBodyDataUserContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CoachCallResponseBodyDataUserContext setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public CoachCallResponseBodyDataUserContext setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

        public CoachCallResponseBodyDataUserContext setDeviceState(String deviceState) {
            this.deviceState = deviceState;
            return this;
        }
        public String getDeviceState() {
            return this.deviceState;
        }

        public CoachCallResponseBodyDataUserContext setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public CoachCallResponseBodyDataUserContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CoachCallResponseBodyDataUserContext setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public CoachCallResponseBodyDataUserContext setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

    }

    public static class CoachCallResponseBodyData extends TeaModel {
        @NameInMap("CallContext")
        public CoachCallResponseBodyDataCallContext callContext;

        @NameInMap("UserContext")
        public CoachCallResponseBodyDataUserContext userContext;

        public static CoachCallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CoachCallResponseBodyData self = new CoachCallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CoachCallResponseBodyData setCallContext(CoachCallResponseBodyDataCallContext callContext) {
            this.callContext = callContext;
            return this;
        }
        public CoachCallResponseBodyDataCallContext getCallContext() {
            return this.callContext;
        }

        public CoachCallResponseBodyData setUserContext(CoachCallResponseBodyDataUserContext userContext) {
            this.userContext = userContext;
            return this;
        }
        public CoachCallResponseBodyDataUserContext getUserContext() {
            return this.userContext;
        }

    }

}
