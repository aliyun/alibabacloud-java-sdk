// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeJobStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeJobStatusResponseBodyData data;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeJobStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobStatusResponseBody self = new DescribeJobStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeJobStatusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeJobStatusResponseBody setData(DescribeJobStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeJobStatusResponseBodyData getData() {
        return this.data;
    }

    public DescribeJobStatusResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeJobStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeJobStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeJobStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeJobStatusResponseBodyDataErrTaskListProductListLogList extends TeaModel {
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

        public static DescribeJobStatusResponseBodyDataErrTaskListProductListLogList build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobStatusResponseBodyDataErrTaskListProductListLogList self = new DescribeJobStatusResponseBodyDataErrTaskListProductListLogList();
            return TeaModel.build(map, self);
        }

        public DescribeJobStatusResponseBodyDataErrTaskListProductListLogList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeJobStatusResponseBodyDataErrTaskListProductListLogList setLogCode(String logCode) {
            this.logCode = logCode;
            return this;
        }
        public String getLogCode() {
            return this.logCode;
        }

        public DescribeJobStatusResponseBodyDataErrTaskListProductListLogList setLogStoreNamePattern(String logStoreNamePattern) {
            this.logStoreNamePattern = logStoreNamePattern;
            return this;
        }
        public String getLogStoreNamePattern() {
            return this.logStoreNamePattern;
        }

        public DescribeJobStatusResponseBodyDataErrTaskListProductListLogList setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeJobStatusResponseBodyDataErrTaskListProductListLogList setProjectNamePattern(String projectNamePattern) {
            this.projectNamePattern = projectNamePattern;
            return this;
        }
        public String getProjectNamePattern() {
            return this.projectNamePattern;
        }

        public DescribeJobStatusResponseBodyDataErrTaskListProductListLogList setRegionCode(String regionCode) {
            this.regionCode = regionCode;
            return this;
        }
        public String getRegionCode() {
            return this.regionCode;
        }

    }

    public static class DescribeJobStatusResponseBodyDataErrTaskListProductList extends TeaModel {
        @NameInMap("LogList")
        public java.util.List<DescribeJobStatusResponseBodyDataErrTaskListProductListLogList> logList;

        @NameInMap("ProductCode")
        public String productCode;

        public static DescribeJobStatusResponseBodyDataErrTaskListProductList build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobStatusResponseBodyDataErrTaskListProductList self = new DescribeJobStatusResponseBodyDataErrTaskListProductList();
            return TeaModel.build(map, self);
        }

        public DescribeJobStatusResponseBodyDataErrTaskListProductList setLogList(java.util.List<DescribeJobStatusResponseBodyDataErrTaskListProductListLogList> logList) {
            this.logList = logList;
            return this;
        }
        public java.util.List<DescribeJobStatusResponseBodyDataErrTaskListProductListLogList> getLogList() {
            return this.logList;
        }

        public DescribeJobStatusResponseBodyDataErrTaskListProductList setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

    public static class DescribeJobStatusResponseBodyDataErrTaskList extends TeaModel {
        @NameInMap("ProductList")
        public java.util.List<DescribeJobStatusResponseBodyDataErrTaskListProductList> productList;

        @NameInMap("UserId")
        public Long userId;

        public static DescribeJobStatusResponseBodyDataErrTaskList build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobStatusResponseBodyDataErrTaskList self = new DescribeJobStatusResponseBodyDataErrTaskList();
            return TeaModel.build(map, self);
        }

        public DescribeJobStatusResponseBodyDataErrTaskList setProductList(java.util.List<DescribeJobStatusResponseBodyDataErrTaskListProductList> productList) {
            this.productList = productList;
            return this;
        }
        public java.util.List<DescribeJobStatusResponseBodyDataErrTaskListProductList> getProductList() {
            return this.productList;
        }

        public DescribeJobStatusResponseBodyDataErrTaskList setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

    public static class DescribeJobStatusResponseBodyData extends TeaModel {
        @NameInMap("ConfigId")
        public String configId;

        @NameInMap("ErrTaskList")
        public java.util.List<DescribeJobStatusResponseBodyDataErrTaskList> errTaskList;

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

        public static DescribeJobStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobStatusResponseBodyData self = new DescribeJobStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeJobStatusResponseBodyData setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public DescribeJobStatusResponseBodyData setErrTaskList(java.util.List<DescribeJobStatusResponseBodyDataErrTaskList> errTaskList) {
            this.errTaskList = errTaskList;
            return this;
        }
        public java.util.List<DescribeJobStatusResponseBodyDataErrTaskList> getErrTaskList() {
            return this.errTaskList;
        }

        public DescribeJobStatusResponseBodyData setFailedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Integer getFailedCount() {
            return this.failedCount;
        }

        public DescribeJobStatusResponseBodyData setFinishCount(Integer finishCount) {
            this.finishCount = finishCount;
            return this;
        }
        public Integer getFinishCount() {
            return this.finishCount;
        }

        public DescribeJobStatusResponseBodyData setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public DescribeJobStatusResponseBodyData setTaskCount(Integer taskCount) {
            this.taskCount = taskCount;
            return this;
        }
        public Integer getTaskCount() {
            return this.taskCount;
        }

        public DescribeJobStatusResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
