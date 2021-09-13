// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SignInGroupResponseBody extends TeaModel {
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
    public SignInGroupResponseBodyData data;

    public static SignInGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SignInGroupResponseBody self = new SignInGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public SignInGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SignInGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SignInGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SignInGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SignInGroupResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public SignInGroupResponseBody setData(SignInGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SignInGroupResponseBodyData getData() {
        return this.data;
    }

    public static class SignInGroupResponseBodyData extends TeaModel {
        @NameInMap("Extension")
        public String extension;

        @NameInMap("WorkMode")
        public String workMode;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("BreakCode")
        public String breakCode;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OutboundScenario")
        public Boolean outboundScenario;

        @NameInMap("UserState")
        public String userState;

        @NameInMap("SignedSkillGroupIdList")
        public java.util.List<String> signedSkillGroupIdList;

        public static SignInGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SignInGroupResponseBodyData self = new SignInGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SignInGroupResponseBodyData setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public SignInGroupResponseBodyData setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

        public SignInGroupResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public SignInGroupResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SignInGroupResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SignInGroupResponseBodyData setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public SignInGroupResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SignInGroupResponseBodyData setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public SignInGroupResponseBodyData setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public SignInGroupResponseBodyData setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

    }

}
