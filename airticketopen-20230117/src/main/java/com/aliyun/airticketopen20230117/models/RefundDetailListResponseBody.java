// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class RefundDetailListResponseBody extends TeaModel {
    /**
     * <p>request ID</p>
     * 
     * <strong>example:</strong>
     * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public RefundDetailListResponseBodyData data;

    /**
     * <p>error code</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    /**
     * <p>error data</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_data")
    public Object errorData;

    /**
     * <p>error message</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_msg")
    public String errorMsg;

    /**
     * <p>http reqeust has been processed successfully，status code is 200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>true represents success, false represents failure</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static RefundDetailListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefundDetailListResponseBody self = new RefundDetailListResponseBody();
        return TeaModel.build(map, self);
    }

    public RefundDetailListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefundDetailListResponseBody setData(RefundDetailListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RefundDetailListResponseBodyData getData() {
        return this.data;
    }

    public RefundDetailListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RefundDetailListResponseBody setErrorData(Object errorData) {
        this.errorData = errorData;
        return this;
    }
    public Object getErrorData() {
        return this.errorData;
    }

    public RefundDetailListResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public RefundDetailListResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public RefundDetailListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RefundDetailListResponseBodyDataList extends TeaModel {
        /**
         * <p>whether it is a supplementary refund order (if the refund amount is not enough, you can use RefundApply to create a supplementary refund order)</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_multi_refund")
        public Boolean isMultiRefund;

        /**
         * <p>order number that returned by Book</p>
         * 
         * <strong>example:</strong>
         * <p>49884*****2345</p>
         */
        @NameInMap("order_num")
        public Long orderNum;

        /**
         * <p>refund order number that returned by RefundApply</p>
         * 
         * <strong>example:</strong>
         * <p>49884*****950</p>
         */
        @NameInMap("refund_order_num")
        public Long refundOrderNum;

        /**
         * <p>refund order status </p>
         * <p>0: refund application</p>
         * <p>1: refund in progress</p>
         * <p>2: refund failed</p>
         * <p>3: refund succeeded</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("refund_order_status")
        public Integer refundOrderStatus;

        /**
         * <p>the original refund order number associated with this supplementary refund order, only avaliable when is_multi_refund=true</p>
         * 
         * <strong>example:</strong>
         * <p>49884*****2387</p>
         */
        @NameInMap("related_refund_order_num")
        public String relatedRefundOrderNum;

        /**
         * <p>transaction number</p>
         * 
         * <strong>example:</strong>
         * <p>49884**tde-95za</p>
         */
        @NameInMap("transaction_no")
        public String transactionNo;

        /**
         * <p>refund time(timestamp)</p>
         * 
         * <strong>example:</strong>
         * <p>1677229002000</p>
         */
        @NameInMap("utc_create_time")
        public Long utcCreateTime;

        public static RefundDetailListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            RefundDetailListResponseBodyDataList self = new RefundDetailListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public RefundDetailListResponseBodyDataList setIsMultiRefund(Boolean isMultiRefund) {
            this.isMultiRefund = isMultiRefund;
            return this;
        }
        public Boolean getIsMultiRefund() {
            return this.isMultiRefund;
        }

        public RefundDetailListResponseBodyDataList setOrderNum(Long orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Long getOrderNum() {
            return this.orderNum;
        }

        public RefundDetailListResponseBodyDataList setRefundOrderNum(Long refundOrderNum) {
            this.refundOrderNum = refundOrderNum;
            return this;
        }
        public Long getRefundOrderNum() {
            return this.refundOrderNum;
        }

        public RefundDetailListResponseBodyDataList setRefundOrderStatus(Integer refundOrderStatus) {
            this.refundOrderStatus = refundOrderStatus;
            return this;
        }
        public Integer getRefundOrderStatus() {
            return this.refundOrderStatus;
        }

        public RefundDetailListResponseBodyDataList setRelatedRefundOrderNum(String relatedRefundOrderNum) {
            this.relatedRefundOrderNum = relatedRefundOrderNum;
            return this;
        }
        public String getRelatedRefundOrderNum() {
            return this.relatedRefundOrderNum;
        }

        public RefundDetailListResponseBodyDataList setTransactionNo(String transactionNo) {
            this.transactionNo = transactionNo;
            return this;
        }
        public String getTransactionNo() {
            return this.transactionNo;
        }

        public RefundDetailListResponseBodyDataList setUtcCreateTime(Long utcCreateTime) {
            this.utcCreateTime = utcCreateTime;
            return this;
        }
        public Long getUtcCreateTime() {
            return this.utcCreateTime;
        }

    }

    public static class RefundDetailListResponseBodyDataPagination extends TeaModel {
        /**
         * <p>current page index</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("current_page")
        public Integer currentPage;

        /**
         * <p>page size</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("page_size")
        public Integer pageSize;

        /**
         * <p>the number of total refund orders</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("total_count")
        public Integer totalCount;

        /**
         * <p>the number of total pages</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("total_page")
        public Integer totalPage;

        public static RefundDetailListResponseBodyDataPagination build(java.util.Map<String, ?> map) throws Exception {
            RefundDetailListResponseBodyDataPagination self = new RefundDetailListResponseBodyDataPagination();
            return TeaModel.build(map, self);
        }

        public RefundDetailListResponseBodyDataPagination setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public RefundDetailListResponseBodyDataPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public RefundDetailListResponseBodyDataPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public RefundDetailListResponseBodyDataPagination setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

    public static class RefundDetailListResponseBodyData extends TeaModel {
        /**
         * <p>refund order list</p>
         */
        @NameInMap("list")
        public java.util.List<RefundDetailListResponseBodyDataList> list;

        /**
         * <p>information of pagination</p>
         */
        @NameInMap("pagination")
        public RefundDetailListResponseBodyDataPagination pagination;

        public static RefundDetailListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RefundDetailListResponseBodyData self = new RefundDetailListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RefundDetailListResponseBodyData setList(java.util.List<RefundDetailListResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<RefundDetailListResponseBodyDataList> getList() {
            return this.list;
        }

        public RefundDetailListResponseBodyData setPagination(RefundDetailListResponseBodyDataPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public RefundDetailListResponseBodyDataPagination getPagination() {
            return this.pagination;
        }

    }

}
