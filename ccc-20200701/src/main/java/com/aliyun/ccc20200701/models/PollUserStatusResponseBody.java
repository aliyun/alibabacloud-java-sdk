// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class PollUserStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PollUserStatusResponseBodyData data;

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
     * <p>EEEE671A-3E24-4A04-81E6-6C4F5B39DF75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PollUserStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PollUserStatusResponseBody self = new PollUserStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public PollUserStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PollUserStatusResponseBody setData(PollUserStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PollUserStatusResponseBodyData getData() {
        return this.data;
    }

    public PollUserStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public PollUserStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PollUserStatusResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public PollUserStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PollUserStatusResponseBodyDataCallContextChannelContexts extends TeaModel {
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
         * <p>ch:user:1390501****-&gt;8032****:1609138902226:job-653821410368****</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <strong>example:</strong>
         * <p>CREATED</p>
         */
        @NameInMap("ChannelState")
        public String channelState;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ChannelVariables")
        public String channelVariables;

        /**
         * <strong>example:</strong>
         * <p>1390501****</p>
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
         * <p>job-6538214103685****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>0830019****</p>
         */
        @NameInMap("Originator")
        public String originator;

        /**
         * <strong>example:</strong>
         * <p>1390501****</p>
         */
        @NameInMap("ReleaseInitiator")
        public String releaseInitiator;

        /**
         * <strong>example:</strong>
         * <p>404 - No destination</p>
         */
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
         * <p>1609138903315</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <strong>example:</strong>
         * <p>8032****</p>
         */
        @NameInMap("UserExtension")
        public String userExtension;

        /**
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static PollUserStatusResponseBodyDataCallContextChannelContexts build(java.util.Map<String, ?> map) throws Exception {
            PollUserStatusResponseBodyDataCallContextChannelContexts self = new PollUserStatusResponseBodyDataCallContextChannelContexts();
            return TeaModel.build(map, self);
        }

        public PollUserStatusResponseBodyDataCallContextChannelContexts setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public PollUserStatusResponseBodyDataCallContextChannelContexts setChannelFlags(String channelFlags) {
            this.channelFlags = channelFlags;
            return this;
        }
        public String getChannelFlags() {
            return this.channelFlags;
        }

        public PollUserStatusResponseBodyDataCallContextChannelContexts setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public PollUserStatusResponseBodyDataCallContextChannelContexts setChannelState(String channelState) {
            this.channelState = channelState;
            return this;
        }
        public String getChannelState() {
            return this.channelState;
        }

        public PollUserStatusResponseBodyDataCallContextChannelContexts setChannelVariables(String channelVariables) {
            this.channelVariables = channelVariables;
            return this;
        }
        public String getChannelVariables() {
            return this.channelVariables;
        }

        public PollUserStatusResponseBodyDataCallContextChannelContexts setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public PollUserStatusResponseBodyDataCallContextChannelContexts setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public PollUserStatusResponseBodyDataCallContextChannelContexts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public PollUserStatusResponseBodyDataCallContextChannelContexts setOriginator(String originator) {
            this.originator = originator;
            return this;
        }
        public String getOriginator() {
            return this.originator;
        }

        public PollUserStatusResponseBodyDataCallContextChannelContexts setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public PollUserStatusResponseBodyDataCallContextChannelContexts setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public PollUserStatusResponseBodyDataCallContextChannelContexts setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public PollUserStatusResponseBodyDataCallContextChannelContexts setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public PollUserStatusResponseBodyDataCallContextChannelContexts setUserExtension(String userExtension) {
            this.userExtension = userExtension;
            return this;
        }
        public String getUserExtension() {
            return this.userExtension;
        }

        public PollUserStatusResponseBodyDataCallContextChannelContexts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class PollUserStatusResponseBodyDataCallContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>OUTBOUND</p>
         */
        @NameInMap("CallType")
        public String callType;

        /**
         * <strong>example:</strong>
         * <p>a=b;c=d</p>
         */
        @NameInMap("CallVariables")
        public String callVariables;

        @NameInMap("ChannelContexts")
        public java.util.List<PollUserStatusResponseBodyDataCallContextChannelContexts> channelContexts;

        /**
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>job-6538214103685****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        public static PollUserStatusResponseBodyDataCallContext build(java.util.Map<String, ?> map) throws Exception {
            PollUserStatusResponseBodyDataCallContext self = new PollUserStatusResponseBodyDataCallContext();
            return TeaModel.build(map, self);
        }

        public PollUserStatusResponseBodyDataCallContext setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public PollUserStatusResponseBodyDataCallContext setCallVariables(String callVariables) {
            this.callVariables = callVariables;
            return this;
        }
        public String getCallVariables() {
            return this.callVariables;
        }

        public PollUserStatusResponseBodyDataCallContext setChannelContexts(java.util.List<PollUserStatusResponseBodyDataCallContextChannelContexts> channelContexts) {
            this.channelContexts = channelContexts;
            return this;
        }
        public java.util.List<PollUserStatusResponseBodyDataCallContextChannelContexts> getChannelContexts() {
            return this.channelContexts;
        }

        public PollUserStatusResponseBodyDataCallContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public PollUserStatusResponseBodyDataCallContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

    public static class PollUserStatusResponseBodyDataChatContextsMembers extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("ReleaseInitiator")
        public String releaseInitiator;

        @NameInMap("ReleaseReason")
        public String releaseReason;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("Status")
        public String status;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserType")
        public String userType;

        public static PollUserStatusResponseBodyDataChatContextsMembers build(java.util.Map<String, ?> map) throws Exception {
            PollUserStatusResponseBodyDataChatContextsMembers self = new PollUserStatusResponseBodyDataChatContextsMembers();
            return TeaModel.build(map, self);
        }

        public PollUserStatusResponseBodyDataChatContextsMembers setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public PollUserStatusResponseBodyDataChatContextsMembers setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public PollUserStatusResponseBodyDataChatContextsMembers setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public PollUserStatusResponseBodyDataChatContextsMembers setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public PollUserStatusResponseBodyDataChatContextsMembers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PollUserStatusResponseBodyDataChatContextsMembers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public PollUserStatusResponseBodyDataChatContextsMembers setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

    public static class PollUserStatusResponseBodyDataChatContexts extends TeaModel {
        @NameInMap("CallVariables")
        public String callVariables;

        @NameInMap("ChatType")
        public String chatType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Members")
        public java.util.List<PollUserStatusResponseBodyDataChatContextsMembers> members;

        public static PollUserStatusResponseBodyDataChatContexts build(java.util.Map<String, ?> map) throws Exception {
            PollUserStatusResponseBodyDataChatContexts self = new PollUserStatusResponseBodyDataChatContexts();
            return TeaModel.build(map, self);
        }

        public PollUserStatusResponseBodyDataChatContexts setCallVariables(String callVariables) {
            this.callVariables = callVariables;
            return this;
        }
        public String getCallVariables() {
            return this.callVariables;
        }

        public PollUserStatusResponseBodyDataChatContexts setChatType(String chatType) {
            this.chatType = chatType;
            return this;
        }
        public String getChatType() {
            return this.chatType;
        }

        public PollUserStatusResponseBodyDataChatContexts setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public PollUserStatusResponseBodyDataChatContexts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public PollUserStatusResponseBodyDataChatContexts setMembers(java.util.List<PollUserStatusResponseBodyDataChatContextsMembers> members) {
            this.members = members;
            return this;
        }
        public java.util.List<PollUserStatusResponseBodyDataChatContextsMembers> getMembers() {
            return this.members;
        }

    }

    public static class PollUserStatusResponseBodyDataUserContextParallelJobList extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static PollUserStatusResponseBodyDataUserContextParallelJobList build(java.util.Map<String, ?> map) throws Exception {
            PollUserStatusResponseBodyDataUserContextParallelJobList self = new PollUserStatusResponseBodyDataUserContextParallelJobList();
            return TeaModel.build(map, self);
        }

        public PollUserStatusResponseBodyDataUserContextParallelJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public PollUserStatusResponseBodyDataUserContextParallelJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PollUserStatusResponseBodyDataUserContextParallelJobList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class PollUserStatusResponseBodyDataUserContext extends TeaModel {
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
         * <p>8032****</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <strong>example:</strong>
         * <p>1609136956378</p>
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
         * <p>job-6538214103685****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>1324730****</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OutboundScenario")
        public Boolean outboundScenario;

        @NameInMap("ParallelJobList")
        public java.util.List<PollUserStatusResponseBodyDataUserContextParallelJobList> parallelJobList;

        /**
         * <strong>example:</strong>
         * <p>1609136956378</p>
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
         * <p>BREAK</p>
         */
        @NameInMap("UserState")
        public String userState;

        /**
         * <strong>example:</strong>
         * <p>ON_SITE</p>
         */
        @NameInMap("WorkMode")
        public String workMode;

        public static PollUserStatusResponseBodyDataUserContext build(java.util.Map<String, ?> map) throws Exception {
            PollUserStatusResponseBodyDataUserContext self = new PollUserStatusResponseBodyDataUserContext();
            return TeaModel.build(map, self);
        }

        public PollUserStatusResponseBodyDataUserContext setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public PollUserStatusResponseBodyDataUserContext setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public PollUserStatusResponseBodyDataUserContext setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public PollUserStatusResponseBodyDataUserContext setHeartbeat(Long heartbeat) {
            this.heartbeat = heartbeat;
            return this;
        }
        public Long getHeartbeat() {
            return this.heartbeat;
        }

        public PollUserStatusResponseBodyDataUserContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public PollUserStatusResponseBodyDataUserContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public PollUserStatusResponseBodyDataUserContext setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public PollUserStatusResponseBodyDataUserContext setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public PollUserStatusResponseBodyDataUserContext setParallelJobList(java.util.List<PollUserStatusResponseBodyDataUserContextParallelJobList> parallelJobList) {
            this.parallelJobList = parallelJobList;
            return this;
        }
        public java.util.List<PollUserStatusResponseBodyDataUserContextParallelJobList> getParallelJobList() {
            return this.parallelJobList;
        }

        public PollUserStatusResponseBodyDataUserContext setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public PollUserStatusResponseBodyDataUserContext setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

        public PollUserStatusResponseBodyDataUserContext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public PollUserStatusResponseBodyDataUserContext setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public PollUserStatusResponseBodyDataUserContext setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

    public static class PollUserStatusResponseBodyData extends TeaModel {
        @NameInMap("CallContext")
        public PollUserStatusResponseBodyDataCallContext callContext;

        @NameInMap("ChatContexts")
        public java.util.List<PollUserStatusResponseBodyDataChatContexts> chatContexts;

        /**
         * <strong>example:</strong>
         * <p>103655</p>
         */
        @NameInMap("ContextId")
        public Long contextId;

        @NameInMap("UserContext")
        public PollUserStatusResponseBodyDataUserContext userContext;

        public static PollUserStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PollUserStatusResponseBodyData self = new PollUserStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PollUserStatusResponseBodyData setCallContext(PollUserStatusResponseBodyDataCallContext callContext) {
            this.callContext = callContext;
            return this;
        }
        public PollUserStatusResponseBodyDataCallContext getCallContext() {
            return this.callContext;
        }

        public PollUserStatusResponseBodyData setChatContexts(java.util.List<PollUserStatusResponseBodyDataChatContexts> chatContexts) {
            this.chatContexts = chatContexts;
            return this;
        }
        public java.util.List<PollUserStatusResponseBodyDataChatContexts> getChatContexts() {
            return this.chatContexts;
        }

        public PollUserStatusResponseBodyData setContextId(Long contextId) {
            this.contextId = contextId;
            return this;
        }
        public Long getContextId() {
            return this.contextId;
        }

        public PollUserStatusResponseBodyData setUserContext(PollUserStatusResponseBodyDataUserContext userContext) {
            this.userContext = userContext;
            return this;
        }
        public PollUserStatusResponseBodyDataUserContext getUserContext() {
            return this.userContext;
        }

    }

}
