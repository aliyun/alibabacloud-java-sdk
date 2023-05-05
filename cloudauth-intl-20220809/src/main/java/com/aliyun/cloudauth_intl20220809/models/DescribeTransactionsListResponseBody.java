// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DescribeTransactionsListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeTransactionsListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeTransactionsListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransactionsListResponseBody self = new DescribeTransactionsListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTransactionsListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeTransactionsListResponseBody setData(DescribeTransactionsListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeTransactionsListResponseBodyData getData() {
        return this.data;
    }

    public DescribeTransactionsListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeTransactionsListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTransactionsListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeTransactionsListResponseBodyDataIn extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Amount")
        public Float amount;

        @NameInMap("Label")
        public String label;

        @NameInMap("TxHashList")
        public java.util.List<String> txHashList;

        @NameInMap("Type")
        public Integer type;

        public static DescribeTransactionsListResponseBodyDataIn build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransactionsListResponseBodyDataIn self = new DescribeTransactionsListResponseBodyDataIn();
            return TeaModel.build(map, self);
        }

        public DescribeTransactionsListResponseBodyDataIn setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeTransactionsListResponseBodyDataIn setAmount(Float amount) {
            this.amount = amount;
            return this;
        }
        public Float getAmount() {
            return this.amount;
        }

        public DescribeTransactionsListResponseBodyDataIn setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeTransactionsListResponseBodyDataIn setTxHashList(java.util.List<String> txHashList) {
            this.txHashList = txHashList;
            return this;
        }
        public java.util.List<String> getTxHashList() {
            return this.txHashList;
        }

        public DescribeTransactionsListResponseBodyDataIn setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class DescribeTransactionsListResponseBodyDataOut extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Amount")
        public Float amount;

        @NameInMap("Label")
        public String label;

        @NameInMap("TxHashList")
        public java.util.List<String> txHashList;

        @NameInMap("Type")
        public Integer type;

        public static DescribeTransactionsListResponseBodyDataOut build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransactionsListResponseBodyDataOut self = new DescribeTransactionsListResponseBodyDataOut();
            return TeaModel.build(map, self);
        }

        public DescribeTransactionsListResponseBodyDataOut setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeTransactionsListResponseBodyDataOut setAmount(Float amount) {
            this.amount = amount;
            return this;
        }
        public Float getAmount() {
            return this.amount;
        }

        public DescribeTransactionsListResponseBodyDataOut setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeTransactionsListResponseBodyDataOut setTxHashList(java.util.List<String> txHashList) {
            this.txHashList = txHashList;
            return this;
        }
        public java.util.List<String> getTxHashList() {
            return this.txHashList;
        }

        public DescribeTransactionsListResponseBodyDataOut setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class DescribeTransactionsListResponseBodyData extends TeaModel {
        @NameInMap("In")
        public java.util.List<DescribeTransactionsListResponseBodyDataIn> in;

        @NameInMap("Out")
        public java.util.List<DescribeTransactionsListResponseBodyDataOut> out;

        @NameInMap("Page")
        public Long page;

        @NameInMap("TotalPages")
        public Long totalPages;

        @NameInMap("TransactionsOnPage")
        public Long transactionsOnPage;

        public static DescribeTransactionsListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransactionsListResponseBodyData self = new DescribeTransactionsListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeTransactionsListResponseBodyData setIn(java.util.List<DescribeTransactionsListResponseBodyDataIn> in) {
            this.in = in;
            return this;
        }
        public java.util.List<DescribeTransactionsListResponseBodyDataIn> getIn() {
            return this.in;
        }

        public DescribeTransactionsListResponseBodyData setOut(java.util.List<DescribeTransactionsListResponseBodyDataOut> out) {
            this.out = out;
            return this;
        }
        public java.util.List<DescribeTransactionsListResponseBodyDataOut> getOut() {
            return this.out;
        }

        public DescribeTransactionsListResponseBodyData setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public DescribeTransactionsListResponseBodyData setTotalPages(Long totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Long getTotalPages() {
            return this.totalPages;
        }

        public DescribeTransactionsListResponseBodyData setTransactionsOnPage(Long transactionsOnPage) {
            this.transactionsOnPage = transactionsOnPage;
            return this;
        }
        public Long getTransactionsOnPage() {
            return this.transactionsOnPage;
        }

    }

}
