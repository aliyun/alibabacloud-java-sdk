// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DescribeRdsErrorLogsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeRdsErrorLogsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeRdsErrorLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsErrorLogsResponseBody self = new DescribeRdsErrorLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRdsErrorLogsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeRdsErrorLogsResponseBody setData(DescribeRdsErrorLogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeRdsErrorLogsResponseBodyData getData() {
        return this.data;
    }

    public DescribeRdsErrorLogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRdsErrorLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRdsErrorLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeRdsErrorLogsResponseBodyDataItems extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ErrorInfo")
        public String errorInfo;

        public static DescribeRdsErrorLogsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsErrorLogsResponseBodyDataItems self = new DescribeRdsErrorLogsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public DescribeRdsErrorLogsResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeRdsErrorLogsResponseBodyDataItems setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

    }

    public static class DescribeRdsErrorLogsResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<DescribeRdsErrorLogsResponseBodyDataItems> items;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageRecordCount")
        public Integer pageRecordCount;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("TotalRecordCount")
        public Integer totalRecordCount;

        public static DescribeRdsErrorLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsErrorLogsResponseBodyData self = new DescribeRdsErrorLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeRdsErrorLogsResponseBodyData setItems(java.util.List<DescribeRdsErrorLogsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeRdsErrorLogsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public DescribeRdsErrorLogsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeRdsErrorLogsResponseBodyData setPageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }
        public Integer getPageRecordCount() {
            return this.pageRecordCount;
        }

        public DescribeRdsErrorLogsResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeRdsErrorLogsResponseBodyData setTotalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }
        public Integer getTotalRecordCount() {
            return this.totalRecordCount;
        }

    }

}
