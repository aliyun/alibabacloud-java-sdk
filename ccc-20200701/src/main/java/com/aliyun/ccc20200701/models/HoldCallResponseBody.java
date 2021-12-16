// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class HoldCallResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public HoldCallResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    @NameInMap("RequestId")
    public String requestId;

    public static HoldCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HoldCallResponseBody self = new HoldCallResponseBody();
        return TeaModel.build(map, self);
    }

    public HoldCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HoldCallResponseBody setData(HoldCallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public HoldCallResponseBodyData getData() {
        return this.data;
    }

    public HoldCallResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public HoldCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HoldCallResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public HoldCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class HoldCallResponseBodyDataCallContextChannelContexts extends TeaModel {
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

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("UserExtension")
        public String userExtension;

        @NameInMap("UserId")
        public String userId;

        public static HoldCallResponseBodyDataCallContextChannelContexts build(java.util.Map<String, ?> map) throws Exception {
            HoldCallResponseBodyDataCallContextChannelContexts self = new HoldCallResponseBodyDataCallContextChannelContexts();
            return TeaModel.build(map, self);
        }

        public HoldCallResponseBodyDataCallContextChannelContexts setAssociatedData(java.util.Map<String, ?> associatedData) {
            this.associatedData = associatedData;
            return this;
        }
        public java.util.Map<String, ?> getAssociatedData() {
            return this.associatedData;
        }

        public HoldCallResponseBodyDataCallContextChannelContexts setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public HoldCallResponseBodyDataCallContextChannelContexts setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public HoldCallResponseBodyDataCallContextChannelContexts setChannelState(String channelState) {
            this.channelState = channelState;
            return this;
        }
        public String getChannelState() {
            return this.channelState;
        }

        public HoldCallResponseBodyDataCallContextChannelContexts setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public HoldCallResponseBodyDataCallContextChannelContexts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public HoldCallResponseBodyDataCallContextChannelContexts setOriginator(String originator) {
            this.originator = originator;
            return this;
        }
        public String getOriginator() {
            return this.originator;
        }

        public HoldCallResponseBodyDataCallContextChannelContexts setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public HoldCallResponseBodyDataCallContextChannelContexts setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public HoldCallResponseBodyDataCallContextChannelContexts setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public HoldCallResponseBodyDataCallContextChannelContexts setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public HoldCallResponseBodyDataCallContextChannelContexts setUserExtension(String userExtension) {
            this.userExtension = userExtension;
            return this;
        }
        public String getUserExtension() {
            return this.userExtension;
        }

        public HoldCallResponseBodyDataCallContextChannelContexts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class HoldCallResponseBodyDataCallContext extends TeaModel {
        @NameInMap("CallType")
        public String callType;

        @NameInMap("ChannelContexts")
        public java.util.List<HoldCallResponseBodyDataCallContextChannelContexts> channelContexts;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobId")
        public String jobId;

        public static HoldCallResponseBodyDataCallContext build(java.util.Map<String, ?> map) throws Exception {
            HoldCallResponseBodyDataCallContext self = new HoldCallResponseBodyDataCallContext();
            return TeaModel.build(map, self);
        }

        public HoldCallResponseBodyDataCallContext setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public HoldCallResponseBodyDataCallContext setChannelContexts(java.util.List<HoldCallResponseBodyDataCallContextChannelContexts> channelContexts) {
            this.channelContexts = channelContexts;
            return this;
        }
        public java.util.List<HoldCallResponseBodyDataCallContextChannelContexts> getChannelContexts() {
            return this.channelContexts;
        }

        public HoldCallResponseBodyDataCallContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public HoldCallResponseBodyDataCallContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

    public static class HoldCallResponseBodyDataUserContext extends TeaModel {
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

        public static HoldCallResponseBodyDataUserContext build(java.util.Map<String, ?> map) throws Exception {
            HoldCallResponseBodyDataUserContext self = new HoldCallResponseBodyDataUserContext();
            return TeaModel.build(map, self);
        }

        public HoldCallResponseBodyDataUserContext setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public HoldCallResponseBodyDataUserContext setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public HoldCallResponseBodyDataUserContext setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public HoldCallResponseBodyDataUserContext setHeartbeat(Long heartbeat) {
            this.heartbeat = heartbeat;
            return this;
        }
        public Long getHeartbeat() {
            return this.heartbeat;
        }

        public HoldCallResponseBodyDataUserContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public HoldCallResponseBodyDataUserContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public HoldCallResponseBodyDataUserContext setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public HoldCallResponseBodyDataUserContext setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public HoldCallResponseBodyDataUserContext setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public HoldCallResponseBodyDataUserContext setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

        public HoldCallResponseBodyDataUserContext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public HoldCallResponseBodyDataUserContext setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public HoldCallResponseBodyDataUserContext setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

    public static class HoldCallResponseBodyData extends TeaModel {
        @NameInMap("CallContext")
        public HoldCallResponseBodyDataCallContext callContext;

        @NameInMap("UserContext")
        public HoldCallResponseBodyDataUserContext userContext;

        public static HoldCallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            HoldCallResponseBodyData self = new HoldCallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public HoldCallResponseBodyData setCallContext(HoldCallResponseBodyDataCallContext callContext) {
            this.callContext = callContext;
            return this;
        }
        public HoldCallResponseBodyDataCallContext getCallContext() {
            return this.callContext;
        }

        public HoldCallResponseBodyData setUserContext(HoldCallResponseBodyDataUserContext userContext) {
            this.userContext = userContext;
            return this;
        }
        public HoldCallResponseBodyDataUserContext getUserContext() {
            return this.userContext;
        }

    }

}
