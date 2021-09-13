// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class StartBack2BackCallResponseBody extends TeaModel {
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
    public StartBack2BackCallResponseBodyData data;

    public static StartBack2BackCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartBack2BackCallResponseBody self = new StartBack2BackCallResponseBody();
        return TeaModel.build(map, self);
    }

    public StartBack2BackCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartBack2BackCallResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public StartBack2BackCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartBack2BackCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartBack2BackCallResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public StartBack2BackCallResponseBody setData(StartBack2BackCallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartBack2BackCallResponseBodyData getData() {
        return this.data;
    }

    public static class StartBack2BackCallResponseBodyDataCallContextChannelContexts extends TeaModel {
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

        @NameInMap("Originator")
        public String originator;

        @NameInMap("UserExtension")
        public String userExtension;

        public static StartBack2BackCallResponseBodyDataCallContextChannelContexts build(java.util.Map<String, ?> map) throws Exception {
            StartBack2BackCallResponseBodyDataCallContextChannelContexts self = new StartBack2BackCallResponseBodyDataCallContextChannelContexts();
            return TeaModel.build(map, self);
        }

        public StartBack2BackCallResponseBodyDataCallContextChannelContexts setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public StartBack2BackCallResponseBodyDataCallContextChannelContexts setChannelState(String channelState) {
            this.channelState = channelState;
            return this;
        }
        public String getChannelState() {
            return this.channelState;
        }

        public StartBack2BackCallResponseBodyDataCallContextChannelContexts setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public StartBack2BackCallResponseBodyDataCallContextChannelContexts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public StartBack2BackCallResponseBodyDataCallContextChannelContexts setChannelFlags(String channelFlags) {
            this.channelFlags = channelFlags;
            return this;
        }
        public String getChannelFlags() {
            return this.channelFlags;
        }

        public StartBack2BackCallResponseBodyDataCallContextChannelContexts setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public StartBack2BackCallResponseBodyDataCallContextChannelContexts setAssociatedData(java.util.Map<String, ?> associatedData) {
            this.associatedData = associatedData;
            return this;
        }
        public java.util.Map<String, ?> getAssociatedData() {
            return this.associatedData;
        }

        public StartBack2BackCallResponseBodyDataCallContextChannelContexts setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public StartBack2BackCallResponseBodyDataCallContextChannelContexts setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public StartBack2BackCallResponseBodyDataCallContextChannelContexts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public StartBack2BackCallResponseBodyDataCallContextChannelContexts setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public StartBack2BackCallResponseBodyDataCallContextChannelContexts setOriginator(String originator) {
            this.originator = originator;
            return this;
        }
        public String getOriginator() {
            return this.originator;
        }

        public StartBack2BackCallResponseBodyDataCallContextChannelContexts setUserExtension(String userExtension) {
            this.userExtension = userExtension;
            return this;
        }
        public String getUserExtension() {
            return this.userExtension;
        }

    }

    public static class StartBack2BackCallResponseBodyDataCallContext extends TeaModel {
        @NameInMap("CallType")
        public String callType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ChannelContexts")
        public java.util.List<StartBack2BackCallResponseBodyDataCallContextChannelContexts> channelContexts;

        public static StartBack2BackCallResponseBodyDataCallContext build(java.util.Map<String, ?> map) throws Exception {
            StartBack2BackCallResponseBodyDataCallContext self = new StartBack2BackCallResponseBodyDataCallContext();
            return TeaModel.build(map, self);
        }

        public StartBack2BackCallResponseBodyDataCallContext setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public StartBack2BackCallResponseBodyDataCallContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public StartBack2BackCallResponseBodyDataCallContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public StartBack2BackCallResponseBodyDataCallContext setChannelContexts(java.util.List<StartBack2BackCallResponseBodyDataCallContextChannelContexts> channelContexts) {
            this.channelContexts = channelContexts;
            return this;
        }
        public java.util.List<StartBack2BackCallResponseBodyDataCallContextChannelContexts> getChannelContexts() {
            return this.channelContexts;
        }

    }

    public static class StartBack2BackCallResponseBodyDataUserContext extends TeaModel {
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

        public static StartBack2BackCallResponseBodyDataUserContext build(java.util.Map<String, ?> map) throws Exception {
            StartBack2BackCallResponseBodyDataUserContext self = new StartBack2BackCallResponseBodyDataUserContext();
            return TeaModel.build(map, self);
        }

        public StartBack2BackCallResponseBodyDataUserContext setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public StartBack2BackCallResponseBodyDataUserContext setHeartbeat(Long heartbeat) {
            this.heartbeat = heartbeat;
            return this;
        }
        public Long getHeartbeat() {
            return this.heartbeat;
        }

        public StartBack2BackCallResponseBodyDataUserContext setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

        public StartBack2BackCallResponseBodyDataUserContext setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public StartBack2BackCallResponseBodyDataUserContext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public StartBack2BackCallResponseBodyDataUserContext setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public StartBack2BackCallResponseBodyDataUserContext setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public StartBack2BackCallResponseBodyDataUserContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public StartBack2BackCallResponseBodyDataUserContext setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public StartBack2BackCallResponseBodyDataUserContext setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

        public StartBack2BackCallResponseBodyDataUserContext setDeviceState(String deviceState) {
            this.deviceState = deviceState;
            return this;
        }
        public String getDeviceState() {
            return this.deviceState;
        }

        public StartBack2BackCallResponseBodyDataUserContext setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public StartBack2BackCallResponseBodyDataUserContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public StartBack2BackCallResponseBodyDataUserContext setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public StartBack2BackCallResponseBodyDataUserContext setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

    }

    public static class StartBack2BackCallResponseBodyData extends TeaModel {
        @NameInMap("CallContext")
        public StartBack2BackCallResponseBodyDataCallContext callContext;

        @NameInMap("UserContext")
        public StartBack2BackCallResponseBodyDataUserContext userContext;

        public static StartBack2BackCallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartBack2BackCallResponseBodyData self = new StartBack2BackCallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartBack2BackCallResponseBodyData setCallContext(StartBack2BackCallResponseBodyDataCallContext callContext) {
            this.callContext = callContext;
            return this;
        }
        public StartBack2BackCallResponseBodyDataCallContext getCallContext() {
            return this.callContext;
        }

        public StartBack2BackCallResponseBodyData setUserContext(StartBack2BackCallResponseBodyDataUserContext userContext) {
            this.userContext = userContext;
            return this;
        }
        public StartBack2BackCallResponseBodyDataUserContext getUserContext() {
            return this.userContext;
        }

    }

}
