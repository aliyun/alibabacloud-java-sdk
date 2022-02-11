// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeEtlJobLogsResponseBody extends TeaModel {
    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("EtlRunningLogs")
    public java.util.List<DescribeEtlJobLogsResponseBodyEtlRunningLogs> etlRunningLogs;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Content")
        public String content;

        @NameInMap("ContentKey")
        public String contentKey;

        @NameInMap("EtlId")
        public String etlId;

        @NameInMap("LogDatetime")
        public String logDatetime;

        @NameInMap("Status")
        public String status;

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
