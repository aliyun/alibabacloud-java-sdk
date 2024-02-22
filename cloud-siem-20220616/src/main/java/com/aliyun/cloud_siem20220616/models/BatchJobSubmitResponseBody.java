// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class BatchJobSubmitResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public BatchJobSubmitResponseBodyData data;

    /**
     * <p>The error code.</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The returned message.</p>
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
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BatchJobSubmitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchJobSubmitResponseBody self = new BatchJobSubmitResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchJobSubmitResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public BatchJobSubmitResponseBody setData(BatchJobSubmitResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchJobSubmitResponseBodyData getData() {
        return this.data;
    }

    public BatchJobSubmitResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public BatchJobSubmitResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchJobSubmitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchJobSubmitResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchJobSubmitResponseBodyDataConfigListProductListLogList extends TeaModel {
        /**
         * <p>The error code returned.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The log code.</p>
         */
        @NameInMap("LogCode")
        public String logCode;

        /**
         * <p>The pattern of SLS log store name.</p>
         */
        @NameInMap("LogStoreNamePattern")
        public String logStoreNamePattern;

        /**
         * <p>The code of product.</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The pattern of SLS project name.</p>
         */
        @NameInMap("ProjectNamePattern")
        public String projectNamePattern;

        /**
         * <p>The ID of the region in which the instance resides.</p>
         */
        @NameInMap("RegionCode")
        public String regionCode;

        public static BatchJobSubmitResponseBodyDataConfigListProductListLogList build(java.util.Map<String, ?> map) throws Exception {
            BatchJobSubmitResponseBodyDataConfigListProductListLogList self = new BatchJobSubmitResponseBodyDataConfigListProductListLogList();
            return TeaModel.build(map, self);
        }

        public BatchJobSubmitResponseBodyDataConfigListProductListLogList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public BatchJobSubmitResponseBodyDataConfigListProductListLogList setLogCode(String logCode) {
            this.logCode = logCode;
            return this;
        }
        public String getLogCode() {
            return this.logCode;
        }

        public BatchJobSubmitResponseBodyDataConfigListProductListLogList setLogStoreNamePattern(String logStoreNamePattern) {
            this.logStoreNamePattern = logStoreNamePattern;
            return this;
        }
        public String getLogStoreNamePattern() {
            return this.logStoreNamePattern;
        }

        public BatchJobSubmitResponseBodyDataConfigListProductListLogList setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public BatchJobSubmitResponseBodyDataConfigListProductListLogList setProjectNamePattern(String projectNamePattern) {
            this.projectNamePattern = projectNamePattern;
            return this;
        }
        public String getProjectNamePattern() {
            return this.projectNamePattern;
        }

        public BatchJobSubmitResponseBodyDataConfigListProductListLogList setRegionCode(String regionCode) {
            this.regionCode = regionCode;
            return this;
        }
        public String getRegionCode() {
            return this.regionCode;
        }

    }

    public static class BatchJobSubmitResponseBodyDataConfigListProductList extends TeaModel {
        /**
         * <p>The list of log.</p>
         */
        @NameInMap("LogList")
        public java.util.List<BatchJobSubmitResponseBodyDataConfigListProductListLogList> logList;

        /**
         * <p>The code of the product.</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        public static BatchJobSubmitResponseBodyDataConfigListProductList build(java.util.Map<String, ?> map) throws Exception {
            BatchJobSubmitResponseBodyDataConfigListProductList self = new BatchJobSubmitResponseBodyDataConfigListProductList();
            return TeaModel.build(map, self);
        }

        public BatchJobSubmitResponseBodyDataConfigListProductList setLogList(java.util.List<BatchJobSubmitResponseBodyDataConfigListProductListLogList> logList) {
            this.logList = logList;
            return this;
        }
        public java.util.List<BatchJobSubmitResponseBodyDataConfigListProductListLogList> getLogList() {
            return this.logList;
        }

        public BatchJobSubmitResponseBodyDataConfigListProductList setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

    public static class BatchJobSubmitResponseBodyDataConfigList extends TeaModel {
        /**
         * <p>The list of product.</p>
         */
        @NameInMap("ProductList")
        public java.util.List<BatchJobSubmitResponseBodyDataConfigListProductList> productList;

        /**
         * <p>The account id of aliyun.</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static BatchJobSubmitResponseBodyDataConfigList build(java.util.Map<String, ?> map) throws Exception {
            BatchJobSubmitResponseBodyDataConfigList self = new BatchJobSubmitResponseBodyDataConfigList();
            return TeaModel.build(map, self);
        }

        public BatchJobSubmitResponseBodyDataConfigList setProductList(java.util.List<BatchJobSubmitResponseBodyDataConfigListProductList> productList) {
            this.productList = productList;
            return this;
        }
        public java.util.List<BatchJobSubmitResponseBodyDataConfigListProductList> getProductList() {
            return this.productList;
        }

        public BatchJobSubmitResponseBodyDataConfigList setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

    public static class BatchJobSubmitResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the task configuration.</p>
         */
        @NameInMap("ConfigId")
        public String configId;

        /**
         * <p>The list of task configure.</p>
         */
        @NameInMap("ConfigList")
        public java.util.List<BatchJobSubmitResponseBodyDataConfigList> configList;

        /**
         * <p>The id of task.</p>
         */
        @NameInMap("SubmitId")
        public String submitId;

        /**
         * <p>The number of existing tasks that are created to add logs within the data source.</p>
         */
        @NameInMap("TaskCount")
        public Integer taskCount;

        public static BatchJobSubmitResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchJobSubmitResponseBodyData self = new BatchJobSubmitResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchJobSubmitResponseBodyData setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public BatchJobSubmitResponseBodyData setConfigList(java.util.List<BatchJobSubmitResponseBodyDataConfigList> configList) {
            this.configList = configList;
            return this;
        }
        public java.util.List<BatchJobSubmitResponseBodyDataConfigList> getConfigList() {
            return this.configList;
        }

        public BatchJobSubmitResponseBodyData setSubmitId(String submitId) {
            this.submitId = submitId;
            return this;
        }
        public String getSubmitId() {
            return this.submitId;
        }

        public BatchJobSubmitResponseBodyData setTaskCount(Integer taskCount) {
            this.taskCount = taskCount;
            return this;
        }
        public Integer getTaskCount() {
            return this.taskCount;
        }

    }

}
