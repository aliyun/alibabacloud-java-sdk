// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class MuteCallResponseBody extends TeaModel {
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
    public MuteCallResponseBodyData data;

    public static MuteCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MuteCallResponseBody self = new MuteCallResponseBody();
        return TeaModel.build(map, self);
    }

    public MuteCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MuteCallResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public MuteCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MuteCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MuteCallResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public MuteCallResponseBody setData(MuteCallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MuteCallResponseBodyData getData() {
        return this.data;
    }

    public static class MuteCallResponseBodyDataCallContextChannelContexts extends TeaModel {
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

        public static MuteCallResponseBodyDataCallContextChannelContexts build(java.util.Map<String, ?> map) throws Exception {
            MuteCallResponseBodyDataCallContextChannelContexts self = new MuteCallResponseBodyDataCallContextChannelContexts();
            return TeaModel.build(map, self);
        }

        public MuteCallResponseBodyDataCallContextChannelContexts setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public MuteCallResponseBodyDataCallContextChannelContexts setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public MuteCallResponseBodyDataCallContextChannelContexts setChannelState(String channelState) {
            this.channelState = channelState;
            return this;
        }
        public String getChannelState() {
            return this.channelState;
        }

        public MuteCallResponseBodyDataCallContextChannelContexts setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public MuteCallResponseBodyDataCallContextChannelContexts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public MuteCallResponseBodyDataCallContextChannelContexts setChannelFlags(String channelFlags) {
            this.channelFlags = channelFlags;
            return this;
        }
        public String getChannelFlags() {
            return this.channelFlags;
        }

        public MuteCallResponseBodyDataCallContextChannelContexts setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public MuteCallResponseBodyDataCallContextChannelContexts setAssociatedData(java.util.Map<String, ?> associatedData) {
            this.associatedData = associatedData;
            return this;
        }
        public java.util.Map<String, ?> getAssociatedData() {
            return this.associatedData;
        }

        public MuteCallResponseBodyDataCallContextChannelContexts setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public MuteCallResponseBodyDataCallContextChannelContexts setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public MuteCallResponseBodyDataCallContextChannelContexts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public MuteCallResponseBodyDataCallContextChannelContexts setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public MuteCallResponseBodyDataCallContextChannelContexts setUserExtension(String userExtension) {
            this.userExtension = userExtension;
            return this;
        }
        public String getUserExtension() {
            return this.userExtension;
        }

        public MuteCallResponseBodyDataCallContextChannelContexts setOriginator(String originator) {
            this.originator = originator;
            return this;
        }
        public String getOriginator() {
            return this.originator;
        }

    }

    public static class MuteCallResponseBodyDataCallContext extends TeaModel {
        @NameInMap("CallType")
        public String callType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ChannelContexts")
        public java.util.List<MuteCallResponseBodyDataCallContextChannelContexts> channelContexts;

        public static MuteCallResponseBodyDataCallContext build(java.util.Map<String, ?> map) throws Exception {
            MuteCallResponseBodyDataCallContext self = new MuteCallResponseBodyDataCallContext();
            return TeaModel.build(map, self);
        }

        public MuteCallResponseBodyDataCallContext setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public MuteCallResponseBodyDataCallContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public MuteCallResponseBodyDataCallContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public MuteCallResponseBodyDataCallContext setChannelContexts(java.util.List<MuteCallResponseBodyDataCallContextChannelContexts> channelContexts) {
            this.channelContexts = channelContexts;
            return this;
        }
        public java.util.List<MuteCallResponseBodyDataCallContextChannelContexts> getChannelContexts() {
            return this.channelContexts;
        }

    }

    public static class MuteCallResponseBodyDataUserContext extends TeaModel {
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

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("UserState")
        public String userState;

        @NameInMap("SignedSkillGroupIdList")
        public java.util.List<String> signedSkillGroupIdList;

        public static MuteCallResponseBodyDataUserContext build(java.util.Map<String, ?> map) throws Exception {
            MuteCallResponseBodyDataUserContext self = new MuteCallResponseBodyDataUserContext();
            return TeaModel.build(map, self);
        }

        public MuteCallResponseBodyDataUserContext setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public MuteCallResponseBodyDataUserContext setHeartbeat(Long heartbeat) {
            this.heartbeat = heartbeat;
            return this;
        }
        public Long getHeartbeat() {
            return this.heartbeat;
        }

        public MuteCallResponseBodyDataUserContext setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

        public MuteCallResponseBodyDataUserContext setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public MuteCallResponseBodyDataUserContext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public MuteCallResponseBodyDataUserContext setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public MuteCallResponseBodyDataUserContext setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public MuteCallResponseBodyDataUserContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public MuteCallResponseBodyDataUserContext setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public MuteCallResponseBodyDataUserContext setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public MuteCallResponseBodyDataUserContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public MuteCallResponseBodyDataUserContext setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public MuteCallResponseBodyDataUserContext setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

    }

    public static class MuteCallResponseBodyData extends TeaModel {
        @NameInMap("CallContext")
        public MuteCallResponseBodyDataCallContext callContext;

        @NameInMap("UserContext")
        public MuteCallResponseBodyDataUserContext userContext;

        public static MuteCallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MuteCallResponseBodyData self = new MuteCallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MuteCallResponseBodyData setCallContext(MuteCallResponseBodyDataCallContext callContext) {
            this.callContext = callContext;
            return this;
        }
        public MuteCallResponseBodyDataCallContext getCallContext() {
            return this.callContext;
        }

        public MuteCallResponseBodyData setUserContext(MuteCallResponseBodyDataUserContext userContext) {
            this.userContext = userContext;
            return this;
        }
        public MuteCallResponseBodyDataUserContext getUserContext() {
            return this.userContext;
        }

    }

}
