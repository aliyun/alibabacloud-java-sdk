// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeJobStatusResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. If the request is successful, 200 is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeJobStatusResponseBodyData data;

    /**
     * <p>The error code. If the request is successful, the parameter is empty. If the request fails, an error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>ServerError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message. If the request is successful, the parameter is empty. If the request fails, the reason for the failure is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5B0DFF6D-XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The reason for the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>ProjectLogStoreNotFound</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The code of the logs.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_siem_aegis_proc</p>
         */
        @NameInMap("LogCode")
        public String logCode;

        /**
         * <p>The pattern for the name of the Simple Log Service Logstore from which logs are collected.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc_project_test</p>
         */
        @NameInMap("LogStoreNamePattern")
        public String logStoreNamePattern;

        /**
         * <p>The code of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The pattern for the name of the Simple Log Service project from which logs are collected.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-project-test</p>
         */
        @NameInMap("ProjectNamePattern")
        public String projectNamePattern;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
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
        /**
         * <p>The list of logs that fail to be collected.</p>
         */
        @NameInMap("LogList")
        public java.util.List<DescribeJobStatusResponseBodyDataErrTaskListProductListLogList> logList;

        /**
         * <p>The code of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
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
        /**
         * <p>The list of services in failed tasks.</p>
         */
        @NameInMap("ProductList")
        public java.util.List<DescribeJobStatusResponseBodyDataErrTaskListProductList> productList;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>123XXXXX</p>
         */
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
        /**
         * <p>The ID of the task configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx_folder_xxxx</p>
         */
        @NameInMap("ConfigId")
        public String configId;

        /**
         * <p>The list of failed tasks. The value contains the Alibaba Cloud account and service code of each failed task.</p>
         */
        @NameInMap("ErrTaskList")
        public java.util.List<DescribeJobStatusResponseBodyDataErrTaskList> errTaskList;

        /**
         * <p>The total number of tasks that fail.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("FailedCount")
        public Integer failedCount;

        /**
         * <p>The total number of tasks that are complete.</p>
         * 
         * <strong>example:</strong>
         * <p>52</p>
         */
        @NameInMap("FinishCount")
        public Integer finishCount;

        /**
         * <p>The ID of the resource directory folder.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-xxxxx</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The total number of collection tasks that are created.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("TaskCount")
        public Integer taskCount;

        /**
         * <p>The status of the submitted task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>submit</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>finish</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>finish</p>
         */
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
