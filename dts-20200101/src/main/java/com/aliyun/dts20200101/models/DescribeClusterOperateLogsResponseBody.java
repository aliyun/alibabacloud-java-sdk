// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeClusterOperateLogsResponseBody extends TeaModel {
    // 后端错误码 数字递增
    @NameInMap("Code")
    public String code;

    @NameInMap("DataPoints")
    public java.util.List<DescribeClusterOperateLogsResponseBodyDataPoints> dataPoints;

    // 动态错误信息，会替换错误码里的"%s"
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    // 错误短码 ps：InternalError
    @NameInMap("ErrCode")
    public String errCode;

    // 错误信息（返回给用户）
    @NameInMap("ErrMessage")
    public String errMessage;

    // 异常对应的http code
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // 当前页码
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 当前每页显示数量
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    // 调用结果
    @NameInMap("Success")
    public Boolean success;

    // 总数
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
        @NameInMap("Content")
        public String content;

        @NameInMap("Id")
        public String id;

        @NameInMap("LogDatetime")
        public Long logDatetime;

        @NameInMap("NewValue")
        public String newValue;

        @NameInMap("OldValue")
        public String oldValue;

        @NameInMap("OperationName")
        public String operationName;

        @NameInMap("OperationUser")
        public String operationUser;

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
