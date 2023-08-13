// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class UpdateAutoResourceOptimizeRulesAsyncResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public UpdateAutoResourceOptimizeRulesAsyncResponseBodyData data;

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

    public static UpdateAutoResourceOptimizeRulesAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoResourceOptimizeRulesAsyncResponseBody self = new UpdateAutoResourceOptimizeRulesAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAutoResourceOptimizeRulesAsyncResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public UpdateAutoResourceOptimizeRulesAsyncResponseBody setData(UpdateAutoResourceOptimizeRulesAsyncResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateAutoResourceOptimizeRulesAsyncResponseBodyData getData() {
        return this.data;
    }

    public UpdateAutoResourceOptimizeRulesAsyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAutoResourceOptimizeRulesAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAutoResourceOptimizeRulesAsyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponseConfigFailInstanceList extends TeaModel {
        /**
         * <p>Indicates whether the parameters are configured. Valid values:</p>
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

        public static UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponseConfigFailInstanceList build(java.util.Map<String, ?> map) throws Exception {
            UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponseConfigFailInstanceList self = new UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponseConfigFailInstanceList();
            return TeaModel.build(map, self);
        }

        public UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponseConfigFailInstanceList setConfigSuccess(Boolean configSuccess) {
            this.configSuccess = configSuccess;
            return this;
        }
        public Boolean getConfigSuccess() {
            return this.configSuccess;
        }

        public UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponseConfigFailInstanceList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponseConfigFailInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponseConfigSuccessInstanceList extends TeaModel {
        /**
         * <p>Indicates whether the parameters are configured. Valid values:</p>
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

        public static UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponseConfigSuccessInstanceList build(java.util.Map<String, ?> map) throws Exception {
            UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponseConfigSuccessInstanceList self = new UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponseConfigSuccessInstanceList();
            return TeaModel.build(map, self);
        }

        public UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponseConfigSuccessInstanceList setConfigSuccess(Boolean configSuccess) {
            this.configSuccess = configSuccess;
            return this;
        }
        public Boolean getConfigSuccess() {
            return this.configSuccess;
        }

        public UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponseConfigSuccessInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponse extends TeaModel {
        /**
         * <p>The number of database instances for which the parameters failed to be configured.</p>
         */
        @NameInMap("ConfigFailInstanceCount")
        public Long configFailInstanceCount;

        /**
         * <p>The database instances for which the parameters failed to be configured.</p>
         */
        @NameInMap("ConfigFailInstanceList")
        public java.util.List<UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponseConfigFailInstanceList> configFailInstanceList;

        /**
         * <p>The number of database instances for which the parameters are configured.</p>
         */
        @NameInMap("ConfigSuccessInstanceCount")
        public Long configSuccessInstanceCount;

        /**
         * <p>The database instances for which the parameters are configured.</p>
         */
        @NameInMap("ConfigSuccessInstanceList")
        public java.util.List<UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponseConfigSuccessInstanceList> configSuccessInstanceList;

        /**
         * <p>The total number of database instances.</p>
         */
        @NameInMap("TotalInstanceCount")
        public Long totalInstanceCount;

        public static UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponse build(java.util.Map<String, ?> map) throws Exception {
            UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponse self = new UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponse();
            return TeaModel.build(map, self);
        }

        public UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponse setConfigFailInstanceCount(Long configFailInstanceCount) {
            this.configFailInstanceCount = configFailInstanceCount;
            return this;
        }
        public Long getConfigFailInstanceCount() {
            return this.configFailInstanceCount;
        }

        public UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponse setConfigFailInstanceList(java.util.List<UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponseConfigFailInstanceList> configFailInstanceList) {
            this.configFailInstanceList = configFailInstanceList;
            return this;
        }
        public java.util.List<UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponseConfigFailInstanceList> getConfigFailInstanceList() {
            return this.configFailInstanceList;
        }

        public UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponse setConfigSuccessInstanceCount(Long configSuccessInstanceCount) {
            this.configSuccessInstanceCount = configSuccessInstanceCount;
            return this;
        }
        public Long getConfigSuccessInstanceCount() {
            return this.configSuccessInstanceCount;
        }

        public UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponse setConfigSuccessInstanceList(java.util.List<UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponseConfigSuccessInstanceList> configSuccessInstanceList) {
            this.configSuccessInstanceList = configSuccessInstanceList;
            return this;
        }
        public java.util.List<UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponseConfigSuccessInstanceList> getConfigSuccessInstanceList() {
            return this.configSuccessInstanceList;
        }

        public UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponse setTotalInstanceCount(Long totalInstanceCount) {
            this.totalInstanceCount = totalInstanceCount;
            return this;
        }
        public Long getTotalInstanceCount() {
            return this.totalInstanceCount;
        }

    }

    public static class UpdateAutoResourceOptimizeRulesAsyncResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the asynchronous request was complete. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Complete")
        public Boolean complete;

        /**
         * <p>The returned data of the configuration.</p>
         * <br>
         * <p>>  The data is returned only if the value of isFinish is **true**. This value indicates that the asynchronous request is complete.</p>
         */
        @NameInMap("ConfigResponse")
        public UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponse configResponse;

        /**
         * <p>Indicates whether the asynchronous request failed. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Fail")
        public Boolean fail;

        /**
         * <p>Indicates whether the asynchronous request was complete. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("IsFinish")
        public Boolean isFinish;

        /**
         * <p>The ID of the asynchronous request.</p>
         */
        @NameInMap("ResultId")
        public String resultId;

        /**
         * <p>The state of the asynchronous request. Valid values:</p>
         * <br>
         * <p>*   **RUNNING**</p>
         * <p>*   **SUCCESS**</p>
         * <p>*   **FAIL**</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The time when the asynchronous request was made. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static UpdateAutoResourceOptimizeRulesAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateAutoResourceOptimizeRulesAsyncResponseBodyData self = new UpdateAutoResourceOptimizeRulesAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateAutoResourceOptimizeRulesAsyncResponseBodyData setComplete(Boolean complete) {
            this.complete = complete;
            return this;
        }
        public Boolean getComplete() {
            return this.complete;
        }

        public UpdateAutoResourceOptimizeRulesAsyncResponseBodyData setConfigResponse(UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponse configResponse) {
            this.configResponse = configResponse;
            return this;
        }
        public UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponse getConfigResponse() {
            return this.configResponse;
        }

        public UpdateAutoResourceOptimizeRulesAsyncResponseBodyData setFail(Boolean fail) {
            this.fail = fail;
            return this;
        }
        public Boolean getFail() {
            return this.fail;
        }

        public UpdateAutoResourceOptimizeRulesAsyncResponseBodyData setIsFinish(Boolean isFinish) {
            this.isFinish = isFinish;
            return this;
        }
        public Boolean getIsFinish() {
            return this.isFinish;
        }

        public UpdateAutoResourceOptimizeRulesAsyncResponseBodyData setResultId(String resultId) {
            this.resultId = resultId;
            return this;
        }
        public String getResultId() {
            return this.resultId;
        }

        public UpdateAutoResourceOptimizeRulesAsyncResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateAutoResourceOptimizeRulesAsyncResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
