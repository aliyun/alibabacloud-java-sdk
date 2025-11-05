// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class QueryReversedDeductionHistoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryReversedDeductionHistoryResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>asda1231as</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static QueryReversedDeductionHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryReversedDeductionHistoryResponseBody self = new QueryReversedDeductionHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryReversedDeductionHistoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryReversedDeductionHistoryResponseBody setData(java.util.List<QueryReversedDeductionHistoryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryReversedDeductionHistoryResponseBodyData> getData() {
        return this.data;
    }

    public QueryReversedDeductionHistoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryReversedDeductionHistoryResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryReversedDeductionHistoryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryReversedDeductionHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryReversedDeductionHistoryResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class QueryReversedDeductionHistoryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1.00</p>
         */
        @NameInMap("OffsetAmount")
        public String offsetAmount;

        /**
         * <strong>example:</strong>
         * <p>ACPN</p>
         */
        @NameInMap("OperationSubmitType")
        public String operationSubmitType;

        /**
         * <strong>example:</strong>
         * <p>2024-11-01 10:22:11 UTC+8</p>
         */
        @NameInMap("OperationTime")
        public String operationTime;

        /**
         * <strong>example:</strong>
         * <p>132</p>
         */
        @NameInMap("OperationUid")
        public String operationUid;

        public static QueryReversedDeductionHistoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryReversedDeductionHistoryResponseBodyData self = new QueryReversedDeductionHistoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryReversedDeductionHistoryResponseBodyData setOffsetAmount(String offsetAmount) {
            this.offsetAmount = offsetAmount;
            return this;
        }
        public String getOffsetAmount() {
            return this.offsetAmount;
        }

        public QueryReversedDeductionHistoryResponseBodyData setOperationSubmitType(String operationSubmitType) {
            this.operationSubmitType = operationSubmitType;
            return this;
        }
        public String getOperationSubmitType() {
            return this.operationSubmitType;
        }

        public QueryReversedDeductionHistoryResponseBodyData setOperationTime(String operationTime) {
            this.operationTime = operationTime;
            return this;
        }
        public String getOperationTime() {
            return this.operationTime;
        }

        public QueryReversedDeductionHistoryResponseBodyData setOperationUid(String operationUid) {
            this.operationUid = operationUid;
            return this;
        }
        public String getOperationUid() {
            return this.operationUid;
        }

    }

}
