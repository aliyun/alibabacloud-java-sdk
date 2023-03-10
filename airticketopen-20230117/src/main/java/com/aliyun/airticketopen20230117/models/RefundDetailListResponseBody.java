// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class RefundDetailListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public RefundDetailListResponseBodyData data;

    @NameInMap("error_code")
    public String errorCode;

    @NameInMap("error_data")
    public Object errorData;

    @NameInMap("error_msg")
    public String errorMsg;

    @NameInMap("status")
    public Integer status;

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
        @NameInMap("is_multi_refund")
        public Boolean isMultiRefund;

        @NameInMap("order_num")
        public Long orderNum;

        @NameInMap("refund_order_num")
        public Long refundOrderNum;

        @NameInMap("refund_order_status")
        public Integer refundOrderStatus;

        @NameInMap("related_refund_order_num")
        public String relatedRefundOrderNum;

        @NameInMap("transaction_no")
        public String transactionNo;

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
        @NameInMap("current_page")
        public Integer currentPage;

        @NameInMap("page_size")
        public Integer pageSize;

        @NameInMap("total_count")
        public Integer totalCount;

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
        @NameInMap("list")
        public java.util.List<RefundDetailListResponseBodyDataList> list;

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
