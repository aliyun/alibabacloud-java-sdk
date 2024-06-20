// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SendDtmfSignalingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SendDtmfSignalingResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>842399EC-7D32-4472-AD08-9504C3F141FF</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>OUTBOUND</p>
         */
        @NameInMap("CallType")
        public String callType;

        /**
         * <strong>example:</strong>
         * <p>MONITORING</p>
         */
        @NameInMap("ChannelFlags")
        public String channelFlags;

        /**
         * <strong>example:</strong>
         * <p>ch:user:131888****-&gt;8001****:1609234221870:job-6573574060089****</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <strong>example:</strong>
         * <p>ANSWERED</p>
         */
        @NameInMap("ChannelState")
        public String channelState;

        /**
         * <strong>example:</strong>
         * <p>8001****</p>
         */
        @NameInMap("Destination")
        public String destination;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <strong>example:</strong>
         * <p>job-6573574060089****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>0101234****</p>
         */
        @NameInMap("Originator")
        public String originator;

        @NameInMap("ReleaseInitiator")
        public String releaseInitiator;

        @NameInMap("ReleaseReason")
        public String releaseReason;

        /**
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("SkillGroupId")
        public String skillGroupId;

        /**
         * <strong>example:</strong>
         * <p>1609234222367</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <strong>example:</strong>
         * <p>8001****</p>
         */
        @NameInMap("UserExtension")
        public String userExtension;

        /**
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static SendDtmfSignalingResponseBodyDataCallContextChannelContexts build(java.util.Map<String, ?> map) throws Exception {
            SendDtmfSignalingResponseBodyDataCallContextChannelContexts self = new SendDtmfSignalingResponseBodyDataCallContextChannelContexts();
            return TeaModel.build(map, self);
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
        /**
         * <strong>example:</strong>
         * <p>OUTBOUND</p>
         */
        @NameInMap("CallType")
        public String callType;

        @NameInMap("ChannelContexts")
        public java.util.List<SendDtmfSignalingResponseBodyDataCallContextChannelContexts> channelContexts;

        /**
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>job-6573574060089****</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>Warm-up</p>
         */
        @NameInMap("BreakCode")
        public String breakCode;

        /**
         * <strong>example:</strong>
         * <p>ACC-YUNBS-1.0.10-****</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <strong>example:</strong>
         * <p>8001****</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <strong>example:</strong>
         * <p>1609234222375</p>
         */
        @NameInMap("Heartbeat")
        public Long heartbeat;

        /**
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>job-6573574060089****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>1390000****</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OutboundScenario")
        public Boolean outboundScenario;

        /**
         * <strong>example:</strong>
         * <p>1609234221864</p>
         */
        @NameInMap("Reserved")
        public Long reserved;

        @NameInMap("SignedSkillGroupIdList")
        public java.util.List<String> signedSkillGroupIdList;

        /**
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>TALKING</p>
         */
        @NameInMap("UserState")
        public String userState;

        /**
         * <strong>example:</strong>
         * <p>ON_SITE</p>
         */
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
