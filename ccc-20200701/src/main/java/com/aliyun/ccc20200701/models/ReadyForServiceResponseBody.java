// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ReadyForServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ReadyForServiceResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    @NameInMap("RequestId")
    public String requestId;

    public static ReadyForServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReadyForServiceResponseBody self = new ReadyForServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public ReadyForServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReadyForServiceResponseBody setData(ReadyForServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReadyForServiceResponseBodyData getData() {
        return this.data;
    }

    public ReadyForServiceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ReadyForServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReadyForServiceResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ReadyForServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ReadyForServiceResponseBodyData extends TeaModel {
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

        public static ReadyForServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReadyForServiceResponseBodyData self = new ReadyForServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReadyForServiceResponseBodyData setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public ReadyForServiceResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ReadyForServiceResponseBodyData setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ReadyForServiceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ReadyForServiceResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ReadyForServiceResponseBodyData setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public ReadyForServiceResponseBodyData setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

        public ReadyForServiceResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ReadyForServiceResponseBodyData setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public ReadyForServiceResponseBodyData setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

}
