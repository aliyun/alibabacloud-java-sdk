// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SendDtmfSignalingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SendDtmfSignalingResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    @NameInMap("RequestId")
    public String requestId;

    public static SendDtmfSignalingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendDtmfSignalingResponseBody self = new SendDtmfSignalingResponseBody();
        return TeaModel.build(map, self);
    }

    public SendDtmfSignalingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendDtmfSignalingResponseBody setData(SendDtmfSignalingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SendDtmfSignalingResponseBodyData getData() {
        return this.data;
    }

    public SendDtmfSignalingResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SendDtmfSignalingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendDtmfSignalingResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public SendDtmfSignalingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SendDtmfSignalingResponseBodyDataCallContextChannelContexts extends TeaModel {
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

        public static SendDtmfSignalingResponseBodyDataCallContextChannelContexts build(java.util.Map<String, ?> map) throws Exception {
            SendDtmfSignalingResponseBodyDataCallContextChannelContexts self = new SendDtmfSignalingResponseBodyDataCallContextChannelContexts();
            return TeaModel.build(map, self);
        }

        public SendDtmfSignalingResponseBodyDataCallContextChannelContexts setAssociatedData(java.util.Map<String, ?> associatedData) {
            this.associatedData = associatedData;
            return this;
        }
        public java.util.Map<String, ?> getAssociatedData() {
            return this.associatedData;
        }

        public SendDtmfSignalingResponseBodyDataCallContextChannelContexts setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public SendDtmfSignalingResponseBodyDataCallContextChannelContexts setChannelFlags(String channelFlags) {
            this.channelFlags = channelFlags;
            return this;
        }
        public String getChannelFlags() {
            return this.channelFlags;
        }

        public SendDtmfSignalingResponseBodyDataCallContextChannelContexts setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public SendDtmfSignalingResponseBodyDataCallContextChannelContexts setChannelState(String channelState) {
            this.channelState = channelState;
            return this;
        }
        public String getChannelState() {
            return this.channelState;
        }

        public SendDtmfSignalingResponseBodyDataCallContextChannelContexts setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public SendDtmfSignalingResponseBodyDataCallContextChannelContexts setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public SendDtmfSignalingResponseBodyDataCallContextChannelContexts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SendDtmfSignalingResponseBodyDataCallContextChannelContexts setOriginator(String originator) {
            this.originator = originator;
            return this;
        }
        public String getOriginator() {
            return this.originator;
        }

        public SendDtmfSignalingResponseBodyDataCallContextChannelContexts setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public SendDtmfSignalingResponseBodyDataCallContextChannelContexts setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public SendDtmfSignalingResponseBodyDataCallContextChannelContexts setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public SendDtmfSignalingResponseBodyDataCallContextChannelContexts setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public SendDtmfSignalingResponseBodyDataCallContextChannelContexts setUserExtension(String userExtension) {
            this.userExtension = userExtension;
            return this;
        }
        public String getUserExtension() {
            return this.userExtension;
        }

        public SendDtmfSignalingResponseBodyDataCallContextChannelContexts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class SendDtmfSignalingResponseBodyDataCallContext extends TeaModel {
        @NameInMap("CallType")
        public String callType;

        @NameInMap("ChannelContexts")
        public java.util.List<SendDtmfSignalingResponseBodyDataCallContextChannelContexts> channelContexts;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobId")
        public String jobId;

        public static SendDtmfSignalingResponseBodyDataCallContext build(java.util.Map<String, ?> map) throws Exception {
            SendDtmfSignalingResponseBodyDataCallContext self = new SendDtmfSignalingResponseBodyDataCallContext();
            return TeaModel.build(map, self);
        }

        public SendDtmfSignalingResponseBodyDataCallContext setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public SendDtmfSignalingResponseBodyDataCallContext setChannelContexts(java.util.List<SendDtmfSignalingResponseBodyDataCallContextChannelContexts> channelContexts) {
            this.channelContexts = channelContexts;
            return this;
        }
        public java.util.List<SendDtmfSignalingResponseBodyDataCallContextChannelContexts> getChannelContexts() {
            return this.channelContexts;
        }

        public SendDtmfSignalingResponseBodyDataCallContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SendDtmfSignalingResponseBodyDataCallContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

    public static class SendDtmfSignalingResponseBodyDataUserContext extends TeaModel {
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

        public static SendDtmfSignalingResponseBodyDataUserContext build(java.util.Map<String, ?> map) throws Exception {
            SendDtmfSignalingResponseBodyDataUserContext self = new SendDtmfSignalingResponseBodyDataUserContext();
            return TeaModel.build(map, self);
        }

        public SendDtmfSignalingResponseBodyDataUserContext setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public SendDtmfSignalingResponseBodyDataUserContext setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public SendDtmfSignalingResponseBodyDataUserContext setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public SendDtmfSignalingResponseBodyDataUserContext setHeartbeat(Long heartbeat) {
            this.heartbeat = heartbeat;
            return this;
        }
        public Long getHeartbeat() {
            return this.heartbeat;
        }

        public SendDtmfSignalingResponseBodyDataUserContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SendDtmfSignalingResponseBodyDataUserContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SendDtmfSignalingResponseBodyDataUserContext setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public SendDtmfSignalingResponseBodyDataUserContext setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public SendDtmfSignalingResponseBodyDataUserContext setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public SendDtmfSignalingResponseBodyDataUserContext setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

        public SendDtmfSignalingResponseBodyDataUserContext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SendDtmfSignalingResponseBodyDataUserContext setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public SendDtmfSignalingResponseBodyDataUserContext setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

    public static class SendDtmfSignalingResponseBodyData extends TeaModel {
        @NameInMap("CallContext")
        public SendDtmfSignalingResponseBodyDataCallContext callContext;

        @NameInMap("UserContext")
        public SendDtmfSignalingResponseBodyDataUserContext userContext;

        public static SendDtmfSignalingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendDtmfSignalingResponseBodyData self = new SendDtmfSignalingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendDtmfSignalingResponseBodyData setCallContext(SendDtmfSignalingResponseBodyDataCallContext callContext) {
            this.callContext = callContext;
            return this;
        }
        public SendDtmfSignalingResponseBodyDataCallContext getCallContext() {
            return this.callContext;
        }

        public SendDtmfSignalingResponseBodyData setUserContext(SendDtmfSignalingResponseBodyDataUserContext userContext) {
            this.userContext = userContext;
            return this;
        }
        public SendDtmfSignalingResponseBodyDataUserContext getUserContext() {
            return this.userContext;
        }

    }

}
