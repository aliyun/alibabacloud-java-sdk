// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class ListReceiptResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("List")
    public java.util.List<ListReceiptResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("ReceiptUrl")
    public String receiptUrl;

    @NameInMap("RequestId")
    public String requestId;

    public static ListReceiptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListReceiptResponseBody self = new ListReceiptResponseBody();
        return TeaModel.build(map, self);
    }

    public ListReceiptResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListReceiptResponseBody setList(java.util.List<ListReceiptResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListReceiptResponseBodyList> getList() {
        return this.list;
    }

    public ListReceiptResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListReceiptResponseBody setReceiptUrl(String receiptUrl) {
        this.receiptUrl = receiptUrl;
        return this;
    }
    public String getReceiptUrl() {
        return this.receiptUrl;
    }

    public ListReceiptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListReceiptResponseBodyList extends TeaModel {
        @NameInMap("CallFailedCount")
        public Integer callFailedCount;

        @NameInMap("CallSuccessCount")
        public Integer callSuccessCount;

        @NameInMap("CallTotalCount")
        public Integer callTotalCount;

        @NameInMap("Date")
        public String date;

        public static ListReceiptResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListReceiptResponseBodyList self = new ListReceiptResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListReceiptResponseBodyList setCallFailedCount(Integer callFailedCount) {
            this.callFailedCount = callFailedCount;
            return this;
        }
        public Integer getCallFailedCount() {
            return this.callFailedCount;
        }

        public ListReceiptResponseBodyList setCallSuccessCount(Integer callSuccessCount) {
            this.callSuccessCount = callSuccessCount;
            return this;
        }
        public Integer getCallSuccessCount() {
            return this.callSuccessCount;
        }

        public ListReceiptResponseBodyList setCallTotalCount(Integer callTotalCount) {
            this.callTotalCount = callTotalCount;
            return this;
        }
        public Integer getCallTotalCount() {
            return this.callTotalCount;
        }

        public ListReceiptResponseBodyList setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

    }

}
