// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetBatchExportTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetBatchExportTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>CE534E1D-FCE4-5930-B784-E055EC1AEE6F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetBatchExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBatchExportTaskResponseBody self = new GetBatchExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBatchExportTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBatchExportTaskResponseBody setData(GetBatchExportTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBatchExportTaskResponseBodyData getData() {
        return this.data;
    }

    public GetBatchExportTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBatchExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetBatchExportTaskResponseBodyDataResultFailureItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>api-xxx</p>
         */
        @NameInMap("apiId")
        public String apiId;

        /**
         * <strong>example:</strong>
         * <p>petstore</p>
         */
        @NameInMap("apiName")
        public String apiName;

        /**
         * <strong>example:</strong>
         * <p>api definition is invalid</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        public static GetBatchExportTaskResponseBodyDataResultFailureItems build(java.util.Map<String, ?> map) throws Exception {
            GetBatchExportTaskResponseBodyDataResultFailureItems self = new GetBatchExportTaskResponseBodyDataResultFailureItems();
            return TeaModel.build(map, self);
        }

        public GetBatchExportTaskResponseBodyDataResultFailureItems setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public GetBatchExportTaskResponseBodyDataResultFailureItems setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public GetBatchExportTaskResponseBodyDataResultFailureItems setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class GetBatchExportTaskResponseBodyDataResultSuccessItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>api-xxx</p>
         */
        @NameInMap("apiId")
        public String apiId;

        /**
         * <strong>example:</strong>
         * <p>petstore</p>
         */
        @NameInMap("apiName")
        public String apiName;

        /**
         * <strong>example:</strong>
         * <p>api definition is invalid</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        public static GetBatchExportTaskResponseBodyDataResultSuccessItems build(java.util.Map<String, ?> map) throws Exception {
            GetBatchExportTaskResponseBodyDataResultSuccessItems self = new GetBatchExportTaskResponseBodyDataResultSuccessItems();
            return TeaModel.build(map, self);
        }

        public GetBatchExportTaskResponseBodyDataResultSuccessItems setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public GetBatchExportTaskResponseBodyDataResultSuccessItems setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public GetBatchExportTaskResponseBodyDataResultSuccessItems setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class GetBatchExportTaskResponseBodyDataResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Http</p>
         */
        @NameInMap("apiType")
        public String apiType;

        @NameInMap("failureItems")
        public java.util.List<GetBatchExportTaskResponseBodyDataResultFailureItems> failureItems;

        /**
         * <strong>example:</strong>
         * <p>gw-xxx</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <strong>example:</strong>
         * <p>UEsDBBQAAAA...</p>
         */
        @NameInMap("specContentBase64")
        public String specContentBase64;

        @NameInMap("successItems")
        public java.util.List<GetBatchExportTaskResponseBodyDataResultSuccessItems> successItems;

        public static GetBatchExportTaskResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetBatchExportTaskResponseBodyDataResult self = new GetBatchExportTaskResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GetBatchExportTaskResponseBodyDataResult setApiType(String apiType) {
            this.apiType = apiType;
            return this;
        }
        public String getApiType() {
            return this.apiType;
        }

        public GetBatchExportTaskResponseBodyDataResult setFailureItems(java.util.List<GetBatchExportTaskResponseBodyDataResultFailureItems> failureItems) {
            this.failureItems = failureItems;
            return this;
        }
        public java.util.List<GetBatchExportTaskResponseBodyDataResultFailureItems> getFailureItems() {
            return this.failureItems;
        }

        public GetBatchExportTaskResponseBodyDataResult setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetBatchExportTaskResponseBodyDataResult setSpecContentBase64(String specContentBase64) {
            this.specContentBase64 = specContentBase64;
            return this;
        }
        public String getSpecContentBase64() {
            return this.specContentBase64;
        }

        public GetBatchExportTaskResponseBodyDataResult setSuccessItems(java.util.List<GetBatchExportTaskResponseBodyDataResultSuccessItems> successItems) {
            this.successItems = successItems;
            return this;
        }
        public java.util.List<GetBatchExportTaskResponseBodyDataResultSuccessItems> getSuccessItems() {
            return this.successItems;
        }

    }

    public static class GetBatchExportTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-05-15T10:00:00Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>some apis export failed</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("processedCount")
        public Integer processedCount;

        @NameInMap("result")
        public GetBatchExportTaskResponseBodyDataResult result;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>async-task-xxx</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>BatchExport</p>
         */
        @NameInMap("taskType")
        public String taskType;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalCount")
        public Integer totalCount;

        public static GetBatchExportTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBatchExportTaskResponseBodyData self = new GetBatchExportTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBatchExportTaskResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetBatchExportTaskResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetBatchExportTaskResponseBodyData setProcessedCount(Integer processedCount) {
            this.processedCount = processedCount;
            return this;
        }
        public Integer getProcessedCount() {
            return this.processedCount;
        }

        public GetBatchExportTaskResponseBodyData setResult(GetBatchExportTaskResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public GetBatchExportTaskResponseBodyDataResult getResult() {
            return this.result;
        }

        public GetBatchExportTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBatchExportTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetBatchExportTaskResponseBodyData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public GetBatchExportTaskResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
