// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeClusterOperateLogsResponseBody extends TeaModel {
    /**
     * <p>The backend error code, which is incrementally numeric.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The monitoring statistics information.</p>
     */
    @NameInMap("DataPoints")
    public java.util.List<DescribeClusterOperateLogsResponseBodyDataPoints> dataPoints;

    /**
     * <p>The dynamic error message, which is used to replace the %s placeholder in the ErrMessage response parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Type</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The Value of Input Parameter %s is not valid.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code corresponding to the exception.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries displayed on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>621BB4F8-3016-4FAA-8D5A-5D3163CC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The call result.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
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
         * <p>The additional remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The primary key of the log record table.</p>
         * 
         * <strong>example:</strong>
         * <p>237827</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1642077211574</p>
         */
        @NameInMap("LogDatetime")
        public Long logDatetime;

        /**
         * <p>The new parameter value when the operation type is update.</p>
         * 
         * <strong>example:</strong>
         * <p>105</p>
         */
        @NameInMap("NewValue")
        public String newValue;

        /**
         * <p>The old parameter value when the operation type is update.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("OldValue")
        public String oldValue;

        /**
         * <p>The operation type.</p>
         * 
         * <strong>example:</strong>
         * <p>modify-oversold-ratio</p>
         */
        @NameInMap("OperationName")
        public String operationName;

        /**
         * <p>The operator.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("OperationUser")
        public String operationUser;

        /**
         * <p>The call result. Indicates whether the call was successful. A value of <strong>1</strong> indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
