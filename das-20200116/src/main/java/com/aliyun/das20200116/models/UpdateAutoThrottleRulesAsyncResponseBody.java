// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class UpdateAutoThrottleRulesAsyncResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public UpdateAutoThrottleRulesAsyncResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateAutoThrottleRulesAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoThrottleRulesAsyncResponseBody self = new UpdateAutoThrottleRulesAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAutoThrottleRulesAsyncResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public UpdateAutoThrottleRulesAsyncResponseBody setData(UpdateAutoThrottleRulesAsyncResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateAutoThrottleRulesAsyncResponseBodyData getData() {
        return this.data;
    }

    public UpdateAutoThrottleRulesAsyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAutoThrottleRulesAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAutoThrottleRulesAsyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponseConfigFailInstanceList extends TeaModel {
        @NameInMap("ConfigSuccess")
        public Boolean configSuccess;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("InstanceId")
        public String instanceId;

        public static UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponseConfigFailInstanceList build(java.util.Map<String, ?> map) throws Exception {
            UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponseConfigFailInstanceList self = new UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponseConfigFailInstanceList();
            return TeaModel.build(map, self);
        }

        public UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponseConfigFailInstanceList setConfigSuccess(Boolean configSuccess) {
            this.configSuccess = configSuccess;
            return this;
        }
        public Boolean getConfigSuccess() {
            return this.configSuccess;
        }

        public UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponseConfigFailInstanceList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponseConfigFailInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponseConfigSuccessInstanceList extends TeaModel {
        @NameInMap("ConfigSuccess")
        public Boolean configSuccess;

        @NameInMap("InstanceId")
        public String instanceId;

        public static UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponseConfigSuccessInstanceList build(java.util.Map<String, ?> map) throws Exception {
            UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponseConfigSuccessInstanceList self = new UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponseConfigSuccessInstanceList();
            return TeaModel.build(map, self);
        }

        public UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponseConfigSuccessInstanceList setConfigSuccess(Boolean configSuccess) {
            this.configSuccess = configSuccess;
            return this;
        }
        public Boolean getConfigSuccess() {
            return this.configSuccess;
        }

        public UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponseConfigSuccessInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponse extends TeaModel {
        @NameInMap("ConfigFailInstanceCount")
        public Long configFailInstanceCount;

        @NameInMap("ConfigFailInstanceList")
        public java.util.List<UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponseConfigFailInstanceList> configFailInstanceList;

        @NameInMap("ConfigSuccessInstanceCount")
        public Long configSuccessInstanceCount;

        @NameInMap("ConfigSuccessInstanceList")
        public java.util.List<UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponseConfigSuccessInstanceList> configSuccessInstanceList;

        @NameInMap("TotalInstanceCount")
        public Long totalInstanceCount;

        public static UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponse build(java.util.Map<String, ?> map) throws Exception {
            UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponse self = new UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponse();
            return TeaModel.build(map, self);
        }

        public UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponse setConfigFailInstanceCount(Long configFailInstanceCount) {
            this.configFailInstanceCount = configFailInstanceCount;
            return this;
        }
        public Long getConfigFailInstanceCount() {
            return this.configFailInstanceCount;
        }

        public UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponse setConfigFailInstanceList(java.util.List<UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponseConfigFailInstanceList> configFailInstanceList) {
            this.configFailInstanceList = configFailInstanceList;
            return this;
        }
        public java.util.List<UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponseConfigFailInstanceList> getConfigFailInstanceList() {
            return this.configFailInstanceList;
        }

        public UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponse setConfigSuccessInstanceCount(Long configSuccessInstanceCount) {
            this.configSuccessInstanceCount = configSuccessInstanceCount;
            return this;
        }
        public Long getConfigSuccessInstanceCount() {
            return this.configSuccessInstanceCount;
        }

        public UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponse setConfigSuccessInstanceList(java.util.List<UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponseConfigSuccessInstanceList> configSuccessInstanceList) {
            this.configSuccessInstanceList = configSuccessInstanceList;
            return this;
        }
        public java.util.List<UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponseConfigSuccessInstanceList> getConfigSuccessInstanceList() {
            return this.configSuccessInstanceList;
        }

        public UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponse setTotalInstanceCount(Long totalInstanceCount) {
            this.totalInstanceCount = totalInstanceCount;
            return this;
        }
        public Long getTotalInstanceCount() {
            return this.totalInstanceCount;
        }

    }

    public static class UpdateAutoThrottleRulesAsyncResponseBodyData extends TeaModel {
        @NameInMap("Complete")
        public Boolean complete;

        @NameInMap("ConfigResponse")
        public UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponse configResponse;

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

        public static UpdateAutoThrottleRulesAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateAutoThrottleRulesAsyncResponseBodyData self = new UpdateAutoThrottleRulesAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateAutoThrottleRulesAsyncResponseBodyData setComplete(Boolean complete) {
            this.complete = complete;
            return this;
        }
        public Boolean getComplete() {
            return this.complete;
        }

        public UpdateAutoThrottleRulesAsyncResponseBodyData setConfigResponse(UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponse configResponse) {
            this.configResponse = configResponse;
            return this;
        }
        public UpdateAutoThrottleRulesAsyncResponseBodyDataConfigResponse getConfigResponse() {
            return this.configResponse;
        }

        public UpdateAutoThrottleRulesAsyncResponseBodyData setFail(Boolean fail) {
            this.fail = fail;
            return this;
        }
        public Boolean getFail() {
            return this.fail;
        }

        public UpdateAutoThrottleRulesAsyncResponseBodyData setIsFinish(Boolean isFinish) {
            this.isFinish = isFinish;
            return this;
        }
        public Boolean getIsFinish() {
            return this.isFinish;
        }

        public UpdateAutoThrottleRulesAsyncResponseBodyData setResultId(String resultId) {
            this.resultId = resultId;
            return this;
        }
        public String getResultId() {
            return this.resultId;
        }

        public UpdateAutoThrottleRulesAsyncResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateAutoThrottleRulesAsyncResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
