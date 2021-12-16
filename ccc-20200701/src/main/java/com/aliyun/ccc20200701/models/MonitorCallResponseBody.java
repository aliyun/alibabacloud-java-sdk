// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class MonitorCallResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public MonitorCallResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    @NameInMap("RequestId")
    public String requestId;

    public static MonitorCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MonitorCallResponseBody self = new MonitorCallResponseBody();
        return TeaModel.build(map, self);
    }

    public MonitorCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MonitorCallResponseBody setData(MonitorCallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MonitorCallResponseBodyData getData() {
        return this.data;
    }

    public MonitorCallResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public MonitorCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MonitorCallResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public MonitorCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class MonitorCallResponseBodyDataCallContextChannelContexts extends TeaModel {
        @NameInMap("AssociatedData")
        public java.util.Map<String, ?> associatedData;

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

        public static MonitorCallResponseBodyDataCallContextChannelContexts build(java.util.Map<String, ?> map) throws Exception {
            MonitorCallResponseBodyDataCallContextChannelContexts self = new MonitorCallResponseBodyDataCallContextChannelContexts();
            return TeaModel.build(map, self);
        }

        public MonitorCallResponseBodyDataCallContextChannelContexts setAssociatedData(java.util.Map<String, ?> associatedData) {
            this.associatedData = associatedData;
            return this;
        }
        public java.util.Map<String, ?> getAssociatedData() {
            return this.associatedData;
        }

        public MonitorCallResponseBodyDataCallContextChannelContexts setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public MonitorCallResponseBodyDataCallContextChannelContexts setChannelFlags(String channelFlags) {
            this.channelFlags = channelFlags;
            return this;
        }
        public String getChannelFlags() {
            return this.channelFlags;
        }

        public MonitorCallResponseBodyDataCallContextChannelContexts setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public MonitorCallResponseBodyDataCallContextChannelContexts setChannelState(String channelState) {
            this.channelState = channelState;
            return this;
        }
        public String getChannelState() {
            return this.channelState;
        }

        public MonitorCallResponseBodyDataCallContextChannelContexts setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public MonitorCallResponseBodyDataCallContextChannelContexts setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public MonitorCallResponseBodyDataCallContextChannelContexts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public MonitorCallResponseBodyDataCallContextChannelContexts setOriginator(String originator) {
            this.originator = originator;
            return this;
        }
        public String getOriginator() {
            return this.originator;
        }

        public MonitorCallResponseBodyDataCallContextChannelContexts setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public MonitorCallResponseBodyDataCallContextChannelContexts setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public MonitorCallResponseBodyDataCallContextChannelContexts setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public MonitorCallResponseBodyDataCallContextChannelContexts setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public MonitorCallResponseBodyDataCallContextChannelContexts setUserExtension(String userExtension) {
            this.userExtension = userExtension;
            return this;
        }
        public String getUserExtension() {
            return this.userExtension;
        }

        public MonitorCallResponseBodyDataCallContextChannelContexts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class MonitorCallResponseBodyDataCallContext extends TeaModel {
        @NameInMap("CallType")
        public String callType;

        @NameInMap("ChannelContexts")
        public java.util.List<MonitorCallResponseBodyDataCallContextChannelContexts> channelContexts;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobId")
        public String jobId;

        public static MonitorCallResponseBodyDataCallContext build(java.util.Map<String, ?> map) throws Exception {
            MonitorCallResponseBodyDataCallContext self = new MonitorCallResponseBodyDataCallContext();
            return TeaModel.build(map, self);
        }

        public MonitorCallResponseBodyDataCallContext setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public MonitorCallResponseBodyDataCallContext setChannelContexts(java.util.List<MonitorCallResponseBodyDataCallContextChannelContexts> channelContexts) {
            this.channelContexts = channelContexts;
            return this;
        }
        public java.util.List<MonitorCallResponseBodyDataCallContextChannelContexts> getChannelContexts() {
            return this.channelContexts;
        }

        public MonitorCallResponseBodyDataCallContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public MonitorCallResponseBodyDataCallContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

    public static class MonitorCallResponseBodyDataUserContext extends TeaModel {
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

        public static MonitorCallResponseBodyDataUserContext build(java.util.Map<String, ?> map) throws Exception {
            MonitorCallResponseBodyDataUserContext self = new MonitorCallResponseBodyDataUserContext();
            return TeaModel.build(map, self);
        }

        public MonitorCallResponseBodyDataUserContext setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public MonitorCallResponseBodyDataUserContext setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public MonitorCallResponseBodyDataUserContext setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public MonitorCallResponseBodyDataUserContext setHeartbeat(Long heartbeat) {
            this.heartbeat = heartbeat;
            return this;
        }
        public Long getHeartbeat() {
            return this.heartbeat;
        }

        public MonitorCallResponseBodyDataUserContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public MonitorCallResponseBodyDataUserContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public MonitorCallResponseBodyDataUserContext setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public MonitorCallResponseBodyDataUserContext setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public MonitorCallResponseBodyDataUserContext setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public MonitorCallResponseBodyDataUserContext setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

        public MonitorCallResponseBodyDataUserContext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public MonitorCallResponseBodyDataUserContext setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public MonitorCallResponseBodyDataUserContext setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

    public static class MonitorCallResponseBodyData extends TeaModel {
        @NameInMap("CallContext")
        public MonitorCallResponseBodyDataCallContext callContext;

        @NameInMap("UserContext")
        public MonitorCallResponseBodyDataUserContext userContext;

        public static MonitorCallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MonitorCallResponseBodyData self = new MonitorCallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MonitorCallResponseBodyData setCallContext(MonitorCallResponseBodyDataCallContext callContext) {
            this.callContext = callContext;
            return this;
        }
        public MonitorCallResponseBodyDataCallContext getCallContext() {
            return this.callContext;
        }

        public MonitorCallResponseBodyData setUserContext(MonitorCallResponseBodyDataUserContext userContext) {
            this.userContext = userContext;
            return this;
        }
        public MonitorCallResponseBodyDataUserContext getUserContext() {
            return this.userContext;
        }

    }

}
