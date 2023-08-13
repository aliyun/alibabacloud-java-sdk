// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DisableAutoResourceOptimizeRulesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DisableAutoResourceOptimizeRulesResponseBodyData data;

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
        /**
         * <p>Indicates whether the automatic tablespace fragment recycling feature is disabled. Valid values:</p>
         * <br>
         * <p>* **true**</p>
         * <br>
         * <p>* **false**</p>
         */
        @NameInMap("ConfigSuccess")
        public Boolean configSuccess;

        /**
         * <p>The error message returned if the request failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The database instance ID.</p>
         */
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
        /**
         * <p>Indicates whether the automatic tablespace fragment recycling feature is disabled. Valid values:</p>
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
        /**
         * <p>The number of database instances for which the automatic tablespace fragment recycling feature failed to be disabled.</p>
         */
        @NameInMap("ConfigFailInstanceCount")
        public Long configFailInstanceCount;

        /**
         * <p>The list of database instances for which the automatic tablespace fragment recycling feature failed to be disabled.</p>
         */
        @NameInMap("ConfigFailInstanceList")
        public java.util.List<DisableAutoResourceOptimizeRulesResponseBodyDataConfigFailInstanceList> configFailInstanceList;

        /**
         * <p>The number of database instances for which the automatic tablespace fragment recycling feature is disabled.</p>
         */
        @NameInMap("ConfigSuccessInstanceCount")
        public Long configSuccessInstanceCount;

        /**
         * <p>The list of database instances for which the automatic tablespace fragment recycling feature is disabled.</p>
         */
        @NameInMap("ConfigSuccessInstanceList")
        public java.util.List<DisableAutoResourceOptimizeRulesResponseBodyDataConfigSuccessInstanceList> configSuccessInstanceList;

        /**
         * <p>The total number of database instances.</p>
         */
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
