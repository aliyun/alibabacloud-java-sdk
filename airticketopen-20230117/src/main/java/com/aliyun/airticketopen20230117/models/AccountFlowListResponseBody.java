// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class AccountFlowListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public AccountFlowListResponseBodyData data;

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

    public static AccountFlowListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AccountFlowListResponseBody self = new AccountFlowListResponseBody();
        return TeaModel.build(map, self);
    }

    public AccountFlowListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AccountFlowListResponseBody setData(AccountFlowListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AccountFlowListResponseBodyData getData() {
        return this.data;
    }

    public AccountFlowListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AccountFlowListResponseBody setErrorData(Object errorData) {
        this.errorData = errorData;
        return this;
    }
    public Object getErrorData() {
        return this.errorData;
    }

    public AccountFlowListResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public AccountFlowListResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public AccountFlowListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AccountFlowListResponseBodyDataList extends TeaModel {
        @NameInMap("after_available_amount")
        public Double afterAvailableAmount;

        @NameInMap("before_available_amount")
        public Double beforeAvailableAmount;

        @NameInMap("change_order_num")
        public Long changeOrderNum;

        @NameInMap("flow_id")
        public Long flowId;

        @NameInMap("gmt_create")
        public Long gmtCreate;

        @NameInMap("gmt_modified")
        public Long gmtModified;

        @NameInMap("op_amount")
        public Double opAmount;

        @NameInMap("op_type")
        public Integer opType;

        @NameInMap("order_num")
        public Long orderNum;

        @NameInMap("order_type")
        public Integer orderType;

        @NameInMap("refund_order_num")
        public Long refundOrderNum;

        public static AccountFlowListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            AccountFlowListResponseBodyDataList self = new AccountFlowListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public AccountFlowListResponseBodyDataList setAfterAvailableAmount(Double afterAvailableAmount) {
            this.afterAvailableAmount = afterAvailableAmount;
            return this;
        }
        public Double getAfterAvailableAmount() {
            return this.afterAvailableAmount;
        }

        public AccountFlowListResponseBodyDataList setBeforeAvailableAmount(Double beforeAvailableAmount) {
            this.beforeAvailableAmount = beforeAvailableAmount;
            return this;
        }
        public Double getBeforeAvailableAmount() {
            return this.beforeAvailableAmount;
        }

        public AccountFlowListResponseBodyDataList setChangeOrderNum(Long changeOrderNum) {
            this.changeOrderNum = changeOrderNum;
            return this;
        }
        public Long getChangeOrderNum() {
            return this.changeOrderNum;
        }

        public AccountFlowListResponseBodyDataList setFlowId(Long flowId) {
            this.flowId = flowId;
            return this;
        }
        public Long getFlowId() {
            return this.flowId;
        }

        public AccountFlowListResponseBodyDataList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public AccountFlowListResponseBodyDataList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public AccountFlowListResponseBodyDataList setOpAmount(Double opAmount) {
            this.opAmount = opAmount;
            return this;
        }
        public Double getOpAmount() {
            return this.opAmount;
        }

        public AccountFlowListResponseBodyDataList setOpType(Integer opType) {
            this.opType = opType;
            return this;
        }
        public Integer getOpType() {
            return this.opType;
        }

        public AccountFlowListResponseBodyDataList setOrderNum(Long orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Long getOrderNum() {
            return this.orderNum;
        }

        public AccountFlowListResponseBodyDataList setOrderType(Integer orderType) {
            this.orderType = orderType;
            return this;
        }
        public Integer getOrderType() {
            return this.orderType;
        }

        public AccountFlowListResponseBodyDataList setRefundOrderNum(Long refundOrderNum) {
            this.refundOrderNum = refundOrderNum;
            return this;
        }
        public Long getRefundOrderNum() {
            return this.refundOrderNum;
        }

    }

    public static class AccountFlowListResponseBodyDataPagination extends TeaModel {
        @NameInMap("current_page")
        public Integer currentPage;

        @NameInMap("page_size")
        public Integer pageSize;

        @NameInMap("total_count")
        public Integer totalCount;

        @NameInMap("total_page")
        public Integer totalPage;

        public static AccountFlowListResponseBodyDataPagination build(java.util.Map<String, ?> map) throws Exception {
            AccountFlowListResponseBodyDataPagination self = new AccountFlowListResponseBodyDataPagination();
            return TeaModel.build(map, self);
        }

        public AccountFlowListResponseBodyDataPagination setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public AccountFlowListResponseBodyDataPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public AccountFlowListResponseBodyDataPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public AccountFlowListResponseBodyDataPagination setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

    public static class AccountFlowListResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<AccountFlowListResponseBodyDataList> list;

        @NameInMap("pagination")
        public AccountFlowListResponseBodyDataPagination pagination;

        public static AccountFlowListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AccountFlowListResponseBodyData self = new AccountFlowListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AccountFlowListResponseBodyData setList(java.util.List<AccountFlowListResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<AccountFlowListResponseBodyDataList> getList() {
            return this.list;
        }

        public AccountFlowListResponseBodyData setPagination(AccountFlowListResponseBodyDataPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public AccountFlowListResponseBodyDataPagination getPagination() {
            return this.pagination;
        }

    }

}
