// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeClusterOperateLogsResponseBody extends TeaModel {
    /**
     * <p>The error code returned by the backend service. The number is incremented.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the operation logs.</p>
     */
    @NameInMap("DataPoints")
    public java.util.List<DescribeClusterOperateLogsResponseBodyDataPoints> dataPoints;

    /**
     * <p>The dynamic part in the error message. This parameter is used to replace %s in the ErrMessage parameter.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code returned for an exception.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of records.</p>
     */
    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    public static DescribeClusterOperateLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterOperateLogsResponseBody self = new DescribeClusterOperateLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterOperateLogsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeClusterOperateLogsResponseBody setDataPoints(java.util.List<DescribeClusterOperateLogsResponseBodyDataPoints> dataPoints) {
        this.dataPoints = dataPoints;
        return this;
    }
    public java.util.List<DescribeClusterOperateLogsResponseBodyDataPoints> getDataPoints() {
        return this.dataPoints;
    }

    public DescribeClusterOperateLogsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeClusterOperateLogsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeClusterOperateLogsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeClusterOperateLogsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeClusterOperateLogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeClusterOperateLogsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeClusterOperateLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterOperateLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeClusterOperateLogsResponseBody setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeClusterOperateLogsResponseBodyDataPoints extends TeaModel {
        /**
         * <p>Other description of the operation.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The primary key of the log table.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The time when the operation is recorded. The value is in the UNIX timestamp format. Unit: milliseconds.</p>
         */
        @NameInMap("LogDatetime")
        public Long logDatetime;

        /**
         * <p>The value of the parameter after the operation if the operation is an UPDATE operation.</p>
         */
        @NameInMap("NewValue")
        public String newValue;

        /**
         * <p>The value of the parameter before the operation if the operation is an UPDATE operation.</p>
         */
        @NameInMap("OldValue")
        public String oldValue;

        /**
         * <p>The type of the operation.</p>
         */
        @NameInMap("OperationName")
        public String operationName;

        /**
         * <p>The user who performed the operation.</p>
         */
        @NameInMap("OperationUser")
        public String operationUser;

        /**
         * <p>Indicates whether the request was successful. A value of **1** indicates that the request was successful.</p>
         */
        @NameInMap("Success")
        public Integer success;

        public static DescribeClusterOperateLogsResponseBodyDataPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterOperateLogsResponseBodyDataPoints self = new DescribeClusterOperateLogsResponseBodyDataPoints();
            return TeaModel.build(map, self);
        }

        public DescribeClusterOperateLogsResponseBodyDataPoints setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeClusterOperateLogsResponseBodyDataPoints setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeClusterOperateLogsResponseBodyDataPoints setLogDatetime(Long logDatetime) {
            this.logDatetime = logDatetime;
            return this;
        }
        public Long getLogDatetime() {
            return this.logDatetime;
        }

        public DescribeClusterOperateLogsResponseBodyDataPoints setNewValue(String newValue) {
            this.newValue = newValue;
            return this;
        }
        public String getNewValue() {
            return this.newValue;
        }

        public DescribeClusterOperateLogsResponseBodyDataPoints setOldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }
        public String getOldValue() {
            return this.oldValue;
        }

        public DescribeClusterOperateLogsResponseBodyDataPoints setOperationName(String operationName) {
            this.operationName = operationName;
            return this;
        }
        public String getOperationName() {
            return this.operationName;
        }

        public DescribeClusterOperateLogsResponseBodyDataPoints setOperationUser(String operationUser) {
            this.operationUser = operationUser;
            return this;
        }
        public String getOperationUser() {
            return this.operationUser;
        }

        public DescribeClusterOperateLogsResponseBodyDataPoints setSuccess(Integer success) {
            this.success = success;
            return this;
        }
        public Integer getSuccess() {
            return this.success;
        }

    }

}
