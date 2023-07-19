// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeEtlJobLogsResponseBody extends TeaModel {
    /**
     * <p>The dynamic error code.</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic part in the error message.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code. This example indicates that the specified ETL task ID is invalid.</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message. This example indicates that the specified ETL task ID does not exist. In this case, the ETL task may be deleted.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The logs of ETL tasks.</p>
     */
    @NameInMap("EtlRunningLogs")
    public java.util.List<DescribeEtlJobLogsResponseBodyEtlRunningLogs> etlRunningLogs;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. If the call failed, false is returned.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeEtlJobLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEtlJobLogsResponseBody self = new DescribeEtlJobLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEtlJobLogsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeEtlJobLogsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeEtlJobLogsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeEtlJobLogsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeEtlJobLogsResponseBody setEtlRunningLogs(java.util.List<DescribeEtlJobLogsResponseBodyEtlRunningLogs> etlRunningLogs) {
        this.etlRunningLogs = etlRunningLogs;
        return this;
    }
    public java.util.List<DescribeEtlJobLogsResponseBodyEtlRunningLogs> getEtlRunningLogs() {
        return this.etlRunningLogs;
    }

    public DescribeEtlJobLogsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeEtlJobLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEtlJobLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEtlJobLogsResponseBodyEtlRunningLogs extends TeaModel {
        /**
         * <p>The state of the ETL task.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The module for which the logs are generated, such as the conversion module of ETL tasks.</p>
         */
        @NameInMap("ContentKey")
        public String contentKey;

        /**
         * <p>The ID of the ETL task.</p>
         */
        @NameInMap("EtlId")
        public String etlId;

        /**
         * <p>The time when the log was generated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("LogDatetime")
        public String logDatetime;

        /**
         * <p>The log level. Valid values: ERROR, WARN, INFO, and DEBUG.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the user.</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static DescribeEtlJobLogsResponseBodyEtlRunningLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeEtlJobLogsResponseBodyEtlRunningLogs self = new DescribeEtlJobLogsResponseBodyEtlRunningLogs();
            return TeaModel.build(map, self);
        }

        public DescribeEtlJobLogsResponseBodyEtlRunningLogs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeEtlJobLogsResponseBodyEtlRunningLogs setContentKey(String contentKey) {
            this.contentKey = contentKey;
            return this;
        }
        public String getContentKey() {
            return this.contentKey;
        }

        public DescribeEtlJobLogsResponseBodyEtlRunningLogs setEtlId(String etlId) {
            this.etlId = etlId;
            return this;
        }
        public String getEtlId() {
            return this.etlId;
        }

        public DescribeEtlJobLogsResponseBodyEtlRunningLogs setLogDatetime(String logDatetime) {
            this.logDatetime = logDatetime;
            return this;
        }
        public String getLogDatetime() {
            return this.logDatetime;
        }

        public DescribeEtlJobLogsResponseBodyEtlRunningLogs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeEtlJobLogsResponseBodyEtlRunningLogs setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
