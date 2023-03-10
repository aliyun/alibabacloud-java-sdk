// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeDetailListOfBuyerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public ChangeDetailListOfBuyerResponseBodyData data;

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

    public static ChangeDetailListOfBuyerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeDetailListOfBuyerResponseBody self = new ChangeDetailListOfBuyerResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeDetailListOfBuyerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeDetailListOfBuyerResponseBody setData(ChangeDetailListOfBuyerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ChangeDetailListOfBuyerResponseBodyData getData() {
        return this.data;
    }

    public ChangeDetailListOfBuyerResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ChangeDetailListOfBuyerResponseBody setErrorData(Object errorData) {
        this.errorData = errorData;
        return this;
    }
    public Object getErrorData() {
        return this.errorData;
    }

    public ChangeDetailListOfBuyerResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ChangeDetailListOfBuyerResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ChangeDetailListOfBuyerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ChangeDetailListOfBuyerResponseBodyDataList extends TeaModel {
        @NameInMap("change_order_num")
        public Long changeOrderNum;

        @NameInMap("order_num")
        public Long orderNum;

        @NameInMap("order_status")
        public Integer orderStatus;

        @NameInMap("pay_status")
        public Integer payStatus;

        @NameInMap("transaction_no")
        public String transactionNo;

        @NameInMap("utc_create_time")
        public Long utcCreateTime;

        public static ChangeDetailListOfBuyerResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailListOfBuyerResponseBodyDataList self = new ChangeDetailListOfBuyerResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ChangeDetailListOfBuyerResponseBodyDataList setChangeOrderNum(Long changeOrderNum) {
            this.changeOrderNum = changeOrderNum;
            return this;
        }
        public Long getChangeOrderNum() {
            return this.changeOrderNum;
        }

        public ChangeDetailListOfBuyerResponseBodyDataList setOrderNum(Long orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Long getOrderNum() {
            return this.orderNum;
        }

        public ChangeDetailListOfBuyerResponseBodyDataList setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public ChangeDetailListOfBuyerResponseBodyDataList setPayStatus(Integer payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public Integer getPayStatus() {
            return this.payStatus;
        }

        public ChangeDetailListOfBuyerResponseBodyDataList setTransactionNo(String transactionNo) {
            this.transactionNo = transactionNo;
            return this;
        }
        public String getTransactionNo() {
            return this.transactionNo;
        }

        public ChangeDetailListOfBuyerResponseBodyDataList setUtcCreateTime(Long utcCreateTime) {
            this.utcCreateTime = utcCreateTime;
            return this;
        }
        public Long getUtcCreateTime() {
            return this.utcCreateTime;
        }

    }

    public static class ChangeDetailListOfBuyerResponseBodyDataPagination extends TeaModel {
        @NameInMap("current_page")
        public Integer currentPage;

        @NameInMap("page_size")
        public Integer pageSize;

        @NameInMap("total_count")
        public Integer totalCount;

        @NameInMap("total_page")
        public Integer totalPage;

        public static ChangeDetailListOfBuyerResponseBodyDataPagination build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailListOfBuyerResponseBodyDataPagination self = new ChangeDetailListOfBuyerResponseBodyDataPagination();
            return TeaModel.build(map, self);
        }

        public ChangeDetailListOfBuyerResponseBodyDataPagination setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ChangeDetailListOfBuyerResponseBodyDataPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ChangeDetailListOfBuyerResponseBodyDataPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ChangeDetailListOfBuyerResponseBodyDataPagination setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

    public static class ChangeDetailListOfBuyerResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ChangeDetailListOfBuyerResponseBodyDataList> list;

        @NameInMap("pagination")
        public ChangeDetailListOfBuyerResponseBodyDataPagination pagination;

        public static ChangeDetailListOfBuyerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailListOfBuyerResponseBodyData self = new ChangeDetailListOfBuyerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChangeDetailListOfBuyerResponseBodyData setList(java.util.List<ChangeDetailListOfBuyerResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ChangeDetailListOfBuyerResponseBodyDataList> getList() {
            return this.list;
        }

        public ChangeDetailListOfBuyerResponseBodyData setPagination(ChangeDetailListOfBuyerResponseBodyDataPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public ChangeDetailListOfBuyerResponseBodyDataPagination getPagination() {
            return this.pagination;
        }

    }

}
