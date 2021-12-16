// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ResetAgentStateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ResetAgentStateResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    @NameInMap("RequestId")
    public String requestId;

    public static ResetAgentStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetAgentStateResponseBody self = new ResetAgentStateResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetAgentStateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResetAgentStateResponseBody setData(ResetAgentStateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ResetAgentStateResponseBodyData getData() {
        return this.data;
    }

    public ResetAgentStateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ResetAgentStateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResetAgentStateResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ResetAgentStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ResetAgentStateResponseBodyData extends TeaModel {
        @NameInMap("BreakCode")
        public String breakCode;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("Extension")
        public String extension;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("OutboundScenario")
        public Boolean outboundScenario;

        @NameInMap("SignedSkillGroupIdList")
        public java.util.List<String> signedSkillGroupIdList;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserState")
        public String userState;

        @NameInMap("WorkMode")
        public String workMode;

        public static ResetAgentStateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ResetAgentStateResponseBodyData self = new ResetAgentStateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ResetAgentStateResponseBodyData setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public ResetAgentStateResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ResetAgentStateResponseBodyData setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ResetAgentStateResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ResetAgentStateResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ResetAgentStateResponseBodyData setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public ResetAgentStateResponseBodyData setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

        public ResetAgentStateResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ResetAgentStateResponseBodyData setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public ResetAgentStateResponseBodyData setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

}
