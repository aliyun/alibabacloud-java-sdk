// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ChangeVisibilityResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ChangeVisibilityResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Internal service issue. Detail:.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>24BE19E8-BF7D-4992-A35E-15EBA874F2E5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ChangeVisibilityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeVisibilityResponseBody self = new ChangeVisibilityResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeVisibilityResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ChangeVisibilityResponseBody setData(ChangeVisibilityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ChangeVisibilityResponseBodyData getData() {
        return this.data;
    }

    public ChangeVisibilityResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ChangeVisibilityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChangeVisibilityResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ChangeVisibilityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ChangeVisibilityResponseBodyData extends TeaModel {
        /**
         * <p>The break code.</p>
         * 
         * <strong>example:</strong>
         * <p>会议</p>
         */
        @NameInMap("BreakCode")
        public String breakCode;

        /**
         * <p>The device ID. This can be the ID of a browser-based WebRTC softphone or a physical phone. Only one device can be registered at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>Yealink SIP-T23G 44.84.203.6</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <p>The agent\&quot;s extension number.</p>
         * 
         * <strong>example:</strong>
         * <p>8001****</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>szpczf</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The call ID. If populated, this field indicates that the agent is in a call.</p>
         * 
         * <strong>example:</strong>
         * <p>job-330557290544431104</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>Indicates whether the agent is in outbound-only mode.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("OutboundScenario")
        public Boolean outboundScenario;

        /**
         * <p>The IDs of the skill groups to which the agent is signed in.</p>
         */
        @NameInMap("SignedSkillGroupIdList")
        public java.util.List<String> signedSkillGroupIdList;

        /**
         * <p>The agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sam@szpczf</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The agent state.</p>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("UserState")
        public String userState;

        /**
         * <p>The work mode.</p>
         * 
         * <strong>example:</strong>
         * <p>ON_SITE</p>
         */
        @NameInMap("WorkMode")
        public String workMode;

        public static ChangeVisibilityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChangeVisibilityResponseBodyData self = new ChangeVisibilityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChangeVisibilityResponseBodyData setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public ChangeVisibilityResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ChangeVisibilityResponseBodyData setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ChangeVisibilityResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ChangeVisibilityResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ChangeVisibilityResponseBodyData setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public ChangeVisibilityResponseBodyData setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

        public ChangeVisibilityResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ChangeVisibilityResponseBodyData setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public ChangeVisibilityResponseBodyData setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

}
