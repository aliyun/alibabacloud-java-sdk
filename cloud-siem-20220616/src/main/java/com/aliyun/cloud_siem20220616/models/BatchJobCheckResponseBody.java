// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class BatchJobCheckResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public BatchJobCheckResponseBodyData data;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchJobCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchJobCheckResponseBody self = new BatchJobCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchJobCheckResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public BatchJobCheckResponseBody setData(BatchJobCheckResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchJobCheckResponseBodyData getData() {
        return this.data;
    }

    public BatchJobCheckResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public BatchJobCheckResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchJobCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchJobCheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchJobCheckResponseBodyDataErrTaskListProductListLogList extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("LogCode")
        public String logCode;

        @NameInMap("LogStoreNamePattern")
        public String logStoreNamePattern;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProjectNamePattern")
        public String projectNamePattern;

        @NameInMap("RegionCode")
        public String regionCode;

        public static BatchJobCheckResponseBodyDataErrTaskListProductListLogList build(java.util.Map<String, ?> map) throws Exception {
            BatchJobCheckResponseBodyDataErrTaskListProductListLogList self = new BatchJobCheckResponseBodyDataErrTaskListProductListLogList();
            return TeaModel.build(map, self);
        }

        public BatchJobCheckResponseBodyDataErrTaskListProductListLogList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public BatchJobCheckResponseBodyDataErrTaskListProductListLogList setLogCode(String logCode) {
            this.logCode = logCode;
            return this;
        }
        public String getLogCode() {
            return this.logCode;
        }

        public BatchJobCheckResponseBodyDataErrTaskListProductListLogList setLogStoreNamePattern(String logStoreNamePattern) {
            this.logStoreNamePattern = logStoreNamePattern;
            return this;
        }
        public String getLogStoreNamePattern() {
            return this.logStoreNamePattern;
        }

        public BatchJobCheckResponseBodyDataErrTaskListProductListLogList setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public BatchJobCheckResponseBodyDataErrTaskListProductListLogList setProjectNamePattern(String projectNamePattern) {
            this.projectNamePattern = projectNamePattern;
            return this;
        }
        public String getProjectNamePattern() {
            return this.projectNamePattern;
        }

        public BatchJobCheckResponseBodyDataErrTaskListProductListLogList setRegionCode(String regionCode) {
            this.regionCode = regionCode;
            return this;
        }
        public String getRegionCode() {
            return this.regionCode;
        }

    }

    public static class BatchJobCheckResponseBodyDataErrTaskListProductList extends TeaModel {
        @NameInMap("LogList")
        public java.util.List<BatchJobCheckResponseBodyDataErrTaskListProductListLogList> logList;

        @NameInMap("ProductCode")
        public String productCode;

        public static BatchJobCheckResponseBodyDataErrTaskListProductList build(java.util.Map<String, ?> map) throws Exception {
            BatchJobCheckResponseBodyDataErrTaskListProductList self = new BatchJobCheckResponseBodyDataErrTaskListProductList();
            return TeaModel.build(map, self);
        }

        public BatchJobCheckResponseBodyDataErrTaskListProductList setLogList(java.util.List<BatchJobCheckResponseBodyDataErrTaskListProductListLogList> logList) {
            this.logList = logList;
            return this;
        }
        public java.util.List<BatchJobCheckResponseBodyDataErrTaskListProductListLogList> getLogList() {
            return this.logList;
        }

        public BatchJobCheckResponseBodyDataErrTaskListProductList setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

    public static class BatchJobCheckResponseBodyDataErrTaskList extends TeaModel {
        @NameInMap("ProductList")
        public java.util.List<BatchJobCheckResponseBodyDataErrTaskListProductList> productList;

        @NameInMap("UserId")
        public Long userId;

        public static BatchJobCheckResponseBodyDataErrTaskList build(java.util.Map<String, ?> map) throws Exception {
            BatchJobCheckResponseBodyDataErrTaskList self = new BatchJobCheckResponseBodyDataErrTaskList();
            return TeaModel.build(map, self);
        }

        public BatchJobCheckResponseBodyDataErrTaskList setProductList(java.util.List<BatchJobCheckResponseBodyDataErrTaskListProductList> productList) {
            this.productList = productList;
            return this;
        }
        public java.util.List<BatchJobCheckResponseBodyDataErrTaskListProductList> getProductList() {
            return this.productList;
        }

        public BatchJobCheckResponseBodyDataErrTaskList setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

    public static class BatchJobCheckResponseBodyData extends TeaModel {
        @NameInMap("ConfigId")
        public String configId;

        @NameInMap("ErrTaskList")
        public java.util.List<BatchJobCheckResponseBodyDataErrTaskList> errTaskList;

        @NameInMap("FailedCount")
        public Integer failedCount;

        @NameInMap("FinishCount")
        public Integer finishCount;

        @NameInMap("FolderId")
        public String folderId;

        @NameInMap("TaskCount")
        public Integer taskCount;

        @NameInMap("TaskStatus")
        public String taskStatus;

        public static BatchJobCheckResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchJobCheckResponseBodyData self = new BatchJobCheckResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchJobCheckResponseBodyData setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public BatchJobCheckResponseBodyData setErrTaskList(java.util.List<BatchJobCheckResponseBodyDataErrTaskList> errTaskList) {
            this.errTaskList = errTaskList;
            return this;
        }
        public java.util.List<BatchJobCheckResponseBodyDataErrTaskList> getErrTaskList() {
            return this.errTaskList;
        }

        public BatchJobCheckResponseBodyData setFailedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Integer getFailedCount() {
            return this.failedCount;
        }

        public BatchJobCheckResponseBodyData setFinishCount(Integer finishCount) {
            this.finishCount = finishCount;
            return this;
        }
        public Integer getFinishCount() {
            return this.finishCount;
        }

        public BatchJobCheckResponseBodyData setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public BatchJobCheckResponseBodyData setTaskCount(Integer taskCount) {
            this.taskCount = taskCount;
            return this;
        }
        public Integer getTaskCount() {
            return this.taskCount;
        }

        public BatchJobCheckResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
