// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DisableAutoResourceOptimizeRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public DisableAutoResourceOptimizeRulesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DisableAutoResourceOptimizeRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableAutoResourceOptimizeRulesResponseBody self = new DisableAutoResourceOptimizeRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableAutoResourceOptimizeRulesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DisableAutoResourceOptimizeRulesResponseBody setData(DisableAutoResourceOptimizeRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DisableAutoResourceOptimizeRulesResponseBodyData getData() {
        return this.data;
    }

    public DisableAutoResourceOptimizeRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DisableAutoResourceOptimizeRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableAutoResourceOptimizeRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DisableAutoResourceOptimizeRulesResponseBodyDataConfigFailInstanceList extends TeaModel {
        @NameInMap("ConfigSuccess")
        public Boolean configSuccess;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DisableAutoResourceOptimizeRulesResponseBodyDataConfigFailInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DisableAutoResourceOptimizeRulesResponseBodyDataConfigFailInstanceList self = new DisableAutoResourceOptimizeRulesResponseBodyDataConfigFailInstanceList();
            return TeaModel.build(map, self);
        }

        public DisableAutoResourceOptimizeRulesResponseBodyDataConfigFailInstanceList setConfigSuccess(Boolean configSuccess) {
            this.configSuccess = configSuccess;
            return this;
        }
        public Boolean getConfigSuccess() {
            return this.configSuccess;
        }

        public DisableAutoResourceOptimizeRulesResponseBodyDataConfigFailInstanceList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DisableAutoResourceOptimizeRulesResponseBodyDataConfigFailInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DisableAutoResourceOptimizeRulesResponseBodyDataConfigSuccessInstanceList extends TeaModel {
        @NameInMap("ConfigSuccess")
        public Boolean configSuccess;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DisableAutoResourceOptimizeRulesResponseBodyDataConfigSuccessInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DisableAutoResourceOptimizeRulesResponseBodyDataConfigSuccessInstanceList self = new DisableAutoResourceOptimizeRulesResponseBodyDataConfigSuccessInstanceList();
            return TeaModel.build(map, self);
        }

        public DisableAutoResourceOptimizeRulesResponseBodyDataConfigSuccessInstanceList setConfigSuccess(Boolean configSuccess) {
            this.configSuccess = configSuccess;
            return this;
        }
        public Boolean getConfigSuccess() {
            return this.configSuccess;
        }

        public DisableAutoResourceOptimizeRulesResponseBodyDataConfigSuccessInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DisableAutoResourceOptimizeRulesResponseBodyData extends TeaModel {
        @NameInMap("ConfigFailInstanceCount")
        public Long configFailInstanceCount;

        @NameInMap("ConfigFailInstanceList")
        public java.util.List<DisableAutoResourceOptimizeRulesResponseBodyDataConfigFailInstanceList> configFailInstanceList;

        @NameInMap("ConfigSuccessInstanceCount")
        public Long configSuccessInstanceCount;

        @NameInMap("ConfigSuccessInstanceList")
        public java.util.List<DisableAutoResourceOptimizeRulesResponseBodyDataConfigSuccessInstanceList> configSuccessInstanceList;

        @NameInMap("TotalInstanceCount")
        public Long totalInstanceCount;

        public static DisableAutoResourceOptimizeRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DisableAutoResourceOptimizeRulesResponseBodyData self = new DisableAutoResourceOptimizeRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DisableAutoResourceOptimizeRulesResponseBodyData setConfigFailInstanceCount(Long configFailInstanceCount) {
            this.configFailInstanceCount = configFailInstanceCount;
            return this;
        }
        public Long getConfigFailInstanceCount() {
            return this.configFailInstanceCount;
        }

        public DisableAutoResourceOptimizeRulesResponseBodyData setConfigFailInstanceList(java.util.List<DisableAutoResourceOptimizeRulesResponseBodyDataConfigFailInstanceList> configFailInstanceList) {
            this.configFailInstanceList = configFailInstanceList;
            return this;
        }
        public java.util.List<DisableAutoResourceOptimizeRulesResponseBodyDataConfigFailInstanceList> getConfigFailInstanceList() {
            return this.configFailInstanceList;
        }

        public DisableAutoResourceOptimizeRulesResponseBodyData setConfigSuccessInstanceCount(Long configSuccessInstanceCount) {
            this.configSuccessInstanceCount = configSuccessInstanceCount;
            return this;
        }
        public Long getConfigSuccessInstanceCount() {
            return this.configSuccessInstanceCount;
        }

        public DisableAutoResourceOptimizeRulesResponseBodyData setConfigSuccessInstanceList(java.util.List<DisableAutoResourceOptimizeRulesResponseBodyDataConfigSuccessInstanceList> configSuccessInstanceList) {
            this.configSuccessInstanceList = configSuccessInstanceList;
            return this;
        }
        public java.util.List<DisableAutoResourceOptimizeRulesResponseBodyDataConfigSuccessInstanceList> getConfigSuccessInstanceList() {
            return this.configSuccessInstanceList;
        }

        public DisableAutoResourceOptimizeRulesResponseBodyData setTotalInstanceCount(Long totalInstanceCount) {
            this.totalInstanceCount = totalInstanceCount;
            return this;
        }
        public Long getTotalInstanceCount() {
            return this.totalInstanceCount;
        }

    }

}
