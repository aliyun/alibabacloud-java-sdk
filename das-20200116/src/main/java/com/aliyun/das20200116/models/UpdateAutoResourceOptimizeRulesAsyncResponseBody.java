// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class UpdateAutoResourceOptimizeRulesAsyncResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public UpdateAutoResourceOptimizeRulesAsyncResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ConfigSuccess")
        public Boolean configSuccess;

        @NameInMap("ErrorMessage")
        public String errorMessage;

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
        @NameInMap("ConfigSuccess")
        public Boolean configSuccess;

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
        @NameInMap("ConfigFailInstanceCount")
        public Long configFailInstanceCount;

        @NameInMap("ConfigFailInstanceList")
        public java.util.List<UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponseConfigFailInstanceList> configFailInstanceList;

        @NameInMap("ConfigSuccessInstanceCount")
        public Long configSuccessInstanceCount;

        @NameInMap("ConfigSuccessInstanceList")
        public java.util.List<UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponseConfigSuccessInstanceList> configSuccessInstanceList;

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
        @NameInMap("Complete")
        public Boolean complete;

        @NameInMap("ConfigResponse")
        public UpdateAutoResourceOptimizeRulesAsyncResponseBodyDataConfigResponse configResponse;

        @NameInMap("Fail")
        public Boolean fail;

        @NameInMap("IsFinish")
        public Boolean isFinish;

        @NameInMap("ResultId")
        public String resultId;

        @NameInMap("State")
        public String state;

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
