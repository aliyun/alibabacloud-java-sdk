// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class TakeBreakResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public TakeBreakResponseBodyData data;

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
     * <p>B59382D2-5755-4C6D-861F-FA2AAD8F89F7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TakeBreakResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TakeBreakResponseBody self = new TakeBreakResponseBody();
        return TeaModel.build(map, self);
    }

    public TakeBreakResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TakeBreakResponseBody setData(TakeBreakResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TakeBreakResponseBodyData getData() {
        return this.data;
    }

    public TakeBreakResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public TakeBreakResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TakeBreakResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public TakeBreakResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TakeBreakResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>lunchtime</p>
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
         * <p>1609249563836</p>
         */
        @NameInMap("Heartbeat")
        public Long heartbeat;

        /**
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

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

        public static TakeBreakResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TakeBreakResponseBodyData self = new TakeBreakResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TakeBreakResponseBodyData setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public TakeBreakResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public TakeBreakResponseBodyData setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public TakeBreakResponseBodyData setHeartbeat(Long heartbeat) {
            this.heartbeat = heartbeat;
            return this;
        }
        public Long getHeartbeat() {
            return this.heartbeat;
        }

        public TakeBreakResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public TakeBreakResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public TakeBreakResponseBodyData setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public TakeBreakResponseBodyData setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public TakeBreakResponseBodyData setReserved(Long reserved) {
            this.reserved = reserved;
            return this;
        }
        public Long getReserved() {
            return this.reserved;
        }

        public TakeBreakResponseBodyData setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

        public TakeBreakResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public TakeBreakResponseBodyData setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public TakeBreakResponseBodyData setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

}
