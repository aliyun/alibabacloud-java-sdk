// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ChangeWorkModeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ChangeWorkModeResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    @NameInMap("RequestId")
    public String requestId;

    public static ChangeWorkModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeWorkModeResponseBody self = new ChangeWorkModeResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeWorkModeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ChangeWorkModeResponseBody setData(ChangeWorkModeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ChangeWorkModeResponseBodyData getData() {
        return this.data;
    }

    public ChangeWorkModeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ChangeWorkModeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChangeWorkModeResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ChangeWorkModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ChangeWorkModeResponseBodyData extends TeaModel {
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

        public static ChangeWorkModeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChangeWorkModeResponseBodyData self = new ChangeWorkModeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChangeWorkModeResponseBodyData setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public ChangeWorkModeResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ChangeWorkModeResponseBodyData setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ChangeWorkModeResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ChangeWorkModeResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ChangeWorkModeResponseBodyData setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public ChangeWorkModeResponseBodyData setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

        public ChangeWorkModeResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ChangeWorkModeResponseBodyData setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public ChangeWorkModeResponseBodyData setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

}
