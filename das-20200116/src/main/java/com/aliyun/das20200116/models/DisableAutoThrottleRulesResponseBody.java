// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DisableAutoThrottleRulesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DisableAutoThrottleRulesResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
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
        /**
         * <p>Indicates whether the automatic SQL throttling feature is disabled. Valid values:</p>
         * <br>
         * <p>* **true**</p>
         * <br>
         * <p>* **false**</p>
         */
        @NameInMap("ConfigSuccess")
        public Boolean configSuccess;

        /**
         * <p>The error message returned.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The database instance ID.</p>
         */
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
        /**
         * <p>Indicates whether the automatic SQL throttling feature is disabled. Valid values:</p>
         * <br>
         * <p>* **true**</p>
         * <br>
         * <p>* **false**</p>
         */
        @NameInMap("ConfigSuccess")
        public Boolean configSuccess;

        /**
         * <p>The database instance ID.</p>
         */
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
        /**
         * <p>The number of database instances for which the automatic SQL throttling feature failed to be disabled.</p>
         */
        @NameInMap("ConfigFailInstanceCount")
        public Long configFailInstanceCount;

        /**
         * <p>The database instances for which the automatic SQL throttling feature failed to be disabled.</p>
         */
        @NameInMap("ConfigFailInstanceList")
        public java.util.List<DisableAutoThrottleRulesResponseBodyDataConfigFailInstanceList> configFailInstanceList;

        /**
         * <p>The number of database instances for which the automatic SQL throttling feature is disabled.</p>
         */
        @NameInMap("ConfigSuccessInstanceCount")
        public Long configSuccessInstanceCount;

        /**
         * <p>The database instances for which the automatic SQL throttling feature is disabled.</p>
         */
        @NameInMap("ConfigSuccessInstanceList")
        public java.util.List<DisableAutoThrottleRulesResponseBodyDataConfigSuccessInstanceList> configSuccessInstanceList;

        /**
         * <p>The total number of database instances.</p>
         */
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
