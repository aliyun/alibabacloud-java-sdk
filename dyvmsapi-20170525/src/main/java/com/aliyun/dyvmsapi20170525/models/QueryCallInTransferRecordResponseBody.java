// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCallInTransferRecordResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryCallInTransferRecordResponseBodyData data;

    public static QueryCallInTransferRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCallInTransferRecordResponseBody self = new QueryCallInTransferRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCallInTransferRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCallInTransferRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCallInTransferRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCallInTransferRecordResponseBody setData(QueryCallInTransferRecordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCallInTransferRecordResponseBodyData getData() {
        return this.data;
    }

    public static class QueryCallInTransferRecordResponseBodyDataValues extends TeaModel {
        @NameInMap("CallInCalled")
        public String callInCalled;

        @NameInMap("TransferCalled")
        public String transferCalled;

        @NameInMap("RecordUrl")
        public String recordUrl;

        @NameInMap("TransferCaller")
        public String transferCaller;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("CallInCaller")
        public String callInCaller;

        public static QueryCallInTransferRecordResponseBodyDataValues build(java.util.Map<String, ?> map) throws Exception {
            QueryCallInTransferRecordResponseBodyDataValues self = new QueryCallInTransferRecordResponseBodyDataValues();
            return TeaModel.build(map, self);
        }

        public QueryCallInTransferRecordResponseBodyDataValues setCallInCalled(String callInCalled) {
            this.callInCalled = callInCalled;
            return this;
        }
        public String getCallInCalled() {
            return this.callInCalled;
        }

        public QueryCallInTransferRecordResponseBodyDataValues setTransferCalled(String transferCalled) {
            this.transferCalled = transferCalled;
            return this;
        }
        public String getTransferCalled() {
            return this.transferCalled;
        }

        public QueryCallInTransferRecordResponseBodyDataValues setRecordUrl(String recordUrl) {
            this.recordUrl = recordUrl;
            return this;
        }
        public String getRecordUrl() {
            return this.recordUrl;
        }

        public QueryCallInTransferRecordResponseBodyDataValues setTransferCaller(String transferCaller) {
            this.transferCaller = transferCaller;
            return this;
        }
        public String getTransferCaller() {
            return this.transferCaller;
        }

        public QueryCallInTransferRecordResponseBodyDataValues setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryCallInTransferRecordResponseBodyDataValues setCallInCaller(String callInCaller) {
            this.callInCaller = callInCaller;
            return this;
        }
        public String getCallInCaller() {
            return this.callInCaller;
        }

    }

    public static class QueryCallInTransferRecordResponseBodyData extends TeaModel {
        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Values")
        public java.util.List<QueryCallInTransferRecordResponseBodyDataValues> values;

        public static QueryCallInTransferRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCallInTransferRecordResponseBodyData self = new QueryCallInTransferRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCallInTransferRecordResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public QueryCallInTransferRecordResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryCallInTransferRecordResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QueryCallInTransferRecordResponseBodyData setValues(java.util.List<QueryCallInTransferRecordResponseBodyDataValues> values) {
            this.values = values;
            return this;
        }
        public java.util.List<QueryCallInTransferRecordResponseBodyDataValues> getValues() {
            return this.values;
        }

    }

}
