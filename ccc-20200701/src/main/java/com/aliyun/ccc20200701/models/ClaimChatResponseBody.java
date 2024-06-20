// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ClaimChatResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClaimChatResponseBodyData data;

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
     * <p>BC976D32-AC4C-4E0F-8AA9-F4BC6C4E2B3E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClaimChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClaimChatResponseBody self = new ClaimChatResponseBody();
        return TeaModel.build(map, self);
    }

    public ClaimChatResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClaimChatResponseBody setData(ClaimChatResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClaimChatResponseBodyData getData() {
        return this.data;
    }

    public ClaimChatResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ClaimChatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClaimChatResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ClaimChatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClaimChatResponseBodyDataChatContexts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>226****-cbb6-****-8fea-1e71baf7bfa7</p>
         */
        @NameInMap("AccessChannelId")
        public String accessChannelId;

        @NameInMap("AccessChannelName")
        public String accessChannelName;

        /**
         * <strong>example:</strong>
         * <p>Web</p>
         */
        @NameInMap("AccessChannelType")
        public String accessChannelType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BeingAssigned")
        public Boolean beingAssigned;

        @NameInMap("CallVariables")
        public String callVariables;

        /**
         * <strong>example:</strong>
         * <p>INBOUND</p>
         */
        @NameInMap("ChatType")
        public String chatType;

        /**
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>chat-65382141036853491</p>
         */
        @NameInMap("JobId")
        public String jobId;

        public static ClaimChatResponseBodyDataChatContexts build(java.util.Map<String, ?> map) throws Exception {
            ClaimChatResponseBodyDataChatContexts self = new ClaimChatResponseBodyDataChatContexts();
            return TeaModel.build(map, self);
        }

        public ClaimChatResponseBodyDataChatContexts setAccessChannelId(String accessChannelId) {
            this.accessChannelId = accessChannelId;
            return this;
        }
        public String getAccessChannelId() {
            return this.accessChannelId;
        }

        public ClaimChatResponseBodyDataChatContexts setAccessChannelName(String accessChannelName) {
            this.accessChannelName = accessChannelName;
            return this;
        }
        public String getAccessChannelName() {
            return this.accessChannelName;
        }

        public ClaimChatResponseBodyDataChatContexts setAccessChannelType(String accessChannelType) {
            this.accessChannelType = accessChannelType;
            return this;
        }
        public String getAccessChannelType() {
            return this.accessChannelType;
        }

        public ClaimChatResponseBodyDataChatContexts setBeingAssigned(Boolean beingAssigned) {
            this.beingAssigned = beingAssigned;
            return this;
        }
        public Boolean getBeingAssigned() {
            return this.beingAssigned;
        }

        public ClaimChatResponseBodyDataChatContexts setCallVariables(String callVariables) {
            this.callVariables = callVariables;
            return this;
        }
        public String getCallVariables() {
            return this.callVariables;
        }

        public ClaimChatResponseBodyDataChatContexts setChatType(String chatType) {
            this.chatType = chatType;
            return this;
        }
        public String getChatType() {
            return this.chatType;
        }

        public ClaimChatResponseBodyDataChatContexts setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ClaimChatResponseBodyDataChatContexts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

    public static class ClaimChatResponseBodyDataUserContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Warm-up</p>
         */
        @NameInMap("BreakCode")
        public String breakCode;

        /**
         * <strong>example:</strong>
         * <p>CCC-169.254.165.2-browser125.0.0-bs48b41903450e6c8</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("DeviceState")
        public String deviceState;

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
         * <p>chat-65382141036853491</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>18******102</p>
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
         * <p>false</p>
         */
        @NameInMap("Reserved")
        public Long reserved;

        @NameInMap("SignedSkillGroupIdList")
        public java.util.List<String> signedSkillGroupIdList;

        /**
         * <strong>example:</strong>
         * <p>userId@ccc-test</p>
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

        public static ClaimChatResponseBodyDataUserContext build(java.util.Map<String, ?> map) throws Exception {
            ClaimChatResponseBodyDataUserContext self = new ClaimChatResponseBodyDataUserContext();
            return TeaModel.build(map, self);
        }

        public ClaimChatResponseBodyDataUserContext setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public ClaimChatResponseBodyDataUserContext setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ClaimChatResponseBodyDataUserContext setDeviceState(String deviceState) {
            this.deviceState = deviceState;
            return this;
        }
        public String getDeviceState() {
            return this.deviceState;
        }

        public ClaimChatResponseBodyDataUserContext setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ClaimChatResponseBodyDataUserContext setHeartbeat(Long heartbeat) {
            this.heartbeat = heartbeat;
            return this;
        }
        public Long getHeartbeat() {
            return this.heartbeat;
        }

        public ClaimChatResponseBodyDataUserContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ClaimChatResponseBodyDataUserContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ClaimChatResponseBodyDataUserContext setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ClaimChatResponseBodyDataUserContext setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public ClaimChatResponseBodyDataUserContext setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public ClaimChatResponseBodyDataUserContext setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

        public ClaimChatResponseBodyDataUserContext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ClaimChatResponseBodyDataUserContext setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public ClaimChatResponseBodyDataUserContext setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

    public static class ClaimChatResponseBodyData extends TeaModel {
        @NameInMap("ChatContexts")
        public java.util.List<ClaimChatResponseBodyDataChatContexts> chatContexts;

        /**
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("ContextId")
        public Long contextId;

        @NameInMap("UserContext")
        public ClaimChatResponseBodyDataUserContext userContext;

        public static ClaimChatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClaimChatResponseBodyData self = new ClaimChatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClaimChatResponseBodyData setChatContexts(java.util.List<ClaimChatResponseBodyDataChatContexts> chatContexts) {
            this.chatContexts = chatContexts;
            return this;
        }
        public java.util.List<ClaimChatResponseBodyDataChatContexts> getChatContexts() {
            return this.chatContexts;
        }

        public ClaimChatResponseBodyData setContextId(Long contextId) {
            this.contextId = contextId;
            return this;
        }
        public Long getContextId() {
            return this.contextId;
        }

        public ClaimChatResponseBodyData setUserContext(ClaimChatResponseBodyDataUserContext userContext) {
            this.userContext = userContext;
            return this;
        }
        public ClaimChatResponseBodyDataUserContext getUserContext() {
            return this.userContext;
        }

    }

}
