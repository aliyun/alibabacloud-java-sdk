// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class LaunchSurveyResponseBody extends TeaModel {
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
    public LaunchSurveyResponseBodyData data;

    public static LaunchSurveyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LaunchSurveyResponseBody self = new LaunchSurveyResponseBody();
        return TeaModel.build(map, self);
    }

    public LaunchSurveyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public LaunchSurveyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public LaunchSurveyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LaunchSurveyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LaunchSurveyResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public LaunchSurveyResponseBody setData(LaunchSurveyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public LaunchSurveyResponseBodyData getData() {
        return this.data;
    }

    public static class LaunchSurveyResponseBodyDataCallContextChannelContexts extends TeaModel {
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

        public static LaunchSurveyResponseBodyDataCallContextChannelContexts build(java.util.Map<String, ?> map) throws Exception {
            LaunchSurveyResponseBodyDataCallContextChannelContexts self = new LaunchSurveyResponseBodyDataCallContextChannelContexts();
            return TeaModel.build(map, self);
        }

        public LaunchSurveyResponseBodyDataCallContextChannelContexts setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public LaunchSurveyResponseBodyDataCallContextChannelContexts setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public LaunchSurveyResponseBodyDataCallContextChannelContexts setChannelState(String channelState) {
            this.channelState = channelState;
            return this;
        }
        public String getChannelState() {
            return this.channelState;
        }

        public LaunchSurveyResponseBodyDataCallContextChannelContexts setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public LaunchSurveyResponseBodyDataCallContextChannelContexts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public LaunchSurveyResponseBodyDataCallContextChannelContexts setChannelFlags(String channelFlags) {
            this.channelFlags = channelFlags;
            return this;
        }
        public String getChannelFlags() {
            return this.channelFlags;
        }

        public LaunchSurveyResponseBodyDataCallContextChannelContexts setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public LaunchSurveyResponseBodyDataCallContextChannelContexts setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public LaunchSurveyResponseBodyDataCallContextChannelContexts setAssociatedData(java.util.Map<String, ?> associatedData) {
            this.associatedData = associatedData;
            return this;
        }
        public java.util.Map<String, ?> getAssociatedData() {
            return this.associatedData;
        }

        public LaunchSurveyResponseBodyDataCallContextChannelContexts setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public LaunchSurveyResponseBodyDataCallContextChannelContexts setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public LaunchSurveyResponseBodyDataCallContextChannelContexts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public LaunchSurveyResponseBodyDataCallContextChannelContexts setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public LaunchSurveyResponseBodyDataCallContextChannelContexts setUserExtension(String userExtension) {
            this.userExtension = userExtension;
            return this;
        }
        public String getUserExtension() {
            return this.userExtension;
        }

        public LaunchSurveyResponseBodyDataCallContextChannelContexts setOriginator(String originator) {
            this.originator = originator;
            return this;
        }
        public String getOriginator() {
            return this.originator;
        }

    }

    public static class LaunchSurveyResponseBodyDataCallContext extends TeaModel {
        @NameInMap("CallType")
        public String callType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ChannelContexts")
        public java.util.List<LaunchSurveyResponseBodyDataCallContextChannelContexts> channelContexts;

        public static LaunchSurveyResponseBodyDataCallContext build(java.util.Map<String, ?> map) throws Exception {
            LaunchSurveyResponseBodyDataCallContext self = new LaunchSurveyResponseBodyDataCallContext();
            return TeaModel.build(map, self);
        }

        public LaunchSurveyResponseBodyDataCallContext setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public LaunchSurveyResponseBodyDataCallContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public LaunchSurveyResponseBodyDataCallContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public LaunchSurveyResponseBodyDataCallContext setChannelContexts(java.util.List<LaunchSurveyResponseBodyDataCallContextChannelContexts> channelContexts) {
            this.channelContexts = channelContexts;
            return this;
        }
        public java.util.List<LaunchSurveyResponseBodyDataCallContextChannelContexts> getChannelContexts() {
            return this.channelContexts;
        }

    }

    public static class LaunchSurveyResponseBodyDataUserContext extends TeaModel {
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

        public static LaunchSurveyResponseBodyDataUserContext build(java.util.Map<String, ?> map) throws Exception {
            LaunchSurveyResponseBodyDataUserContext self = new LaunchSurveyResponseBodyDataUserContext();
            return TeaModel.build(map, self);
        }

        public LaunchSurveyResponseBodyDataUserContext setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public LaunchSurveyResponseBodyDataUserContext setHeartbeat(Long heartbeat) {
            this.heartbeat = heartbeat;
            return this;
        }
        public Long getHeartbeat() {
            return this.heartbeat;
        }

        public LaunchSurveyResponseBodyDataUserContext setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

        public LaunchSurveyResponseBodyDataUserContext setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public LaunchSurveyResponseBodyDataUserContext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public LaunchSurveyResponseBodyDataUserContext setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public LaunchSurveyResponseBodyDataUserContext setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public LaunchSurveyResponseBodyDataUserContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public LaunchSurveyResponseBodyDataUserContext setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public LaunchSurveyResponseBodyDataUserContext setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public LaunchSurveyResponseBodyDataUserContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public LaunchSurveyResponseBodyDataUserContext setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public LaunchSurveyResponseBodyDataUserContext setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

    }

    public static class LaunchSurveyResponseBodyData extends TeaModel {
        @NameInMap("CallContext")
        public LaunchSurveyResponseBodyDataCallContext callContext;

        @NameInMap("UserContext")
        public LaunchSurveyResponseBodyDataUserContext userContext;

        public static LaunchSurveyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            LaunchSurveyResponseBodyData self = new LaunchSurveyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public LaunchSurveyResponseBodyData setCallContext(LaunchSurveyResponseBodyDataCallContext callContext) {
            this.callContext = callContext;
            return this;
        }
        public LaunchSurveyResponseBodyDataCallContext getCallContext() {
            return this.callContext;
        }

        public LaunchSurveyResponseBodyData setUserContext(LaunchSurveyResponseBodyDataUserContext userContext) {
            this.userContext = userContext;
            return this;
        }
        public LaunchSurveyResponseBodyDataUserContext getUserContext() {
            return this.userContext;
        }

    }

}
