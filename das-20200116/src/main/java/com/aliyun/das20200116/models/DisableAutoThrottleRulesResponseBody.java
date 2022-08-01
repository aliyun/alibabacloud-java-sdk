// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DisableAutoThrottleRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public DisableAutoThrottleRulesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DisableAutoThrottleRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableAutoThrottleRulesResponseBody self = new DisableAutoThrottleRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableAutoThrottleRulesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DisableAutoThrottleRulesResponseBody setData(DisableAutoThrottleRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DisableAutoThrottleRulesResponseBodyData getData() {
        return this.data;
    }

    public DisableAutoThrottleRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DisableAutoThrottleRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableAutoThrottleRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DisableAutoThrottleRulesResponseBodyDataConfigFailInstanceList extends TeaModel {
        @NameInMap("ConfigSuccess")
        public Boolean configSuccess;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DisableAutoThrottleRulesResponseBodyDataConfigFailInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DisableAutoThrottleRulesResponseBodyDataConfigFailInstanceList self = new DisableAutoThrottleRulesResponseBodyDataConfigFailInstanceList();
            return TeaModel.build(map, self);
        }

        public DisableAutoThrottleRulesResponseBodyDataConfigFailInstanceList setConfigSuccess(Boolean configSuccess) {
            this.configSuccess = configSuccess;
            return this;
        }
        public Boolean getConfigSuccess() {
            return this.configSuccess;
        }

        public DisableAutoThrottleRulesResponseBodyDataConfigFailInstanceList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DisableAutoThrottleRulesResponseBodyDataConfigFailInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DisableAutoThrottleRulesResponseBodyDataConfigSuccessInstanceList extends TeaModel {
        @NameInMap("ConfigSuccess")
        public Boolean configSuccess;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DisableAutoThrottleRulesResponseBodyDataConfigSuccessInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DisableAutoThrottleRulesResponseBodyDataConfigSuccessInstanceList self = new DisableAutoThrottleRulesResponseBodyDataConfigSuccessInstanceList();
            return TeaModel.build(map, self);
        }

        public DisableAutoThrottleRulesResponseBodyDataConfigSuccessInstanceList setConfigSuccess(Boolean configSuccess) {
            this.configSuccess = configSuccess;
            return this;
        }
        public Boolean getConfigSuccess() {
            return this.configSuccess;
        }

        public DisableAutoThrottleRulesResponseBodyDataConfigSuccessInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DisableAutoThrottleRulesResponseBodyData extends TeaModel {
        @NameInMap("ConfigFailInstanceCount")
        public Long configFailInstanceCount;

        @NameInMap("ConfigFailInstanceList")
        public java.util.List<DisableAutoThrottleRulesResponseBodyDataConfigFailInstanceList> configFailInstanceList;

        @NameInMap("ConfigSuccessInstanceCount")
        public Long configSuccessInstanceCount;

        @NameInMap("ConfigSuccessInstanceList")
        public java.util.List<DisableAutoThrottleRulesResponseBodyDataConfigSuccessInstanceList> configSuccessInstanceList;

        @NameInMap("TotalInstanceCount")
        public Long totalInstanceCount;

        public static DisableAutoThrottleRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DisableAutoThrottleRulesResponseBodyData self = new DisableAutoThrottleRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DisableAutoThrottleRulesResponseBodyData setConfigFailInstanceCount(Long configFailInstanceCount) {
            this.configFailInstanceCount = configFailInstanceCount;
            return this;
        }
        public Long getConfigFailInstanceCount() {
            return this.configFailInstanceCount;
        }

        public DisableAutoThrottleRulesResponseBodyData setConfigFailInstanceList(java.util.List<DisableAutoThrottleRulesResponseBodyDataConfigFailInstanceList> configFailInstanceList) {
            this.configFailInstanceList = configFailInstanceList;
            return this;
        }
        public java.util.List<DisableAutoThrottleRulesResponseBodyDataConfigFailInstanceList> getConfigFailInstanceList() {
            return this.configFailInstanceList;
        }

        public DisableAutoThrottleRulesResponseBodyData setConfigSuccessInstanceCount(Long configSuccessInstanceCount) {
            this.configSuccessInstanceCount = configSuccessInstanceCount;
            return this;
        }
        public Long getConfigSuccessInstanceCount() {
            return this.configSuccessInstanceCount;
        }

        public DisableAutoThrottleRulesResponseBodyData setConfigSuccessInstanceList(java.util.List<DisableAutoThrottleRulesResponseBodyDataConfigSuccessInstanceList> configSuccessInstanceList) {
            this.configSuccessInstanceList = configSuccessInstanceList;
            return this;
        }
        public java.util.List<DisableAutoThrottleRulesResponseBodyDataConfigSuccessInstanceList> getConfigSuccessInstanceList() {
            return this.configSuccessInstanceList;
        }

        public DisableAutoThrottleRulesResponseBodyData setTotalInstanceCount(Long totalInstanceCount) {
            this.totalInstanceCount = totalInstanceCount;
            return this;
        }
        public Long getTotalInstanceCount() {
            return this.totalInstanceCount;
        }

    }

}
