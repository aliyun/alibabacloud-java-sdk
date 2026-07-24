// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class AccountFlowListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The data returned for a successful request.</p>
     */
    @NameInMap("data")
    public AccountFlowListResponseBodyData data;

    /**
     * <p>The business error code.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    /**
     * <p>The data returned with the error.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_data")
    public Object errorData;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_msg")
    public String errorMsg;

    /**
     * <p>The HTTP status code. The value is always 200 for successful HTTP requests.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The available balance after the operation, in CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("after_available_amount")
        public Double afterAvailableAmount;

        /**
         * <p>The available balance before the operation, in CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>1950.5</p>
         */
        @NameInMap("before_available_amount")
        public Double beforeAvailableAmount;

        /**
         * <p>The change order number. This value is not empty if the flow is related to a ticket change.</p>
         * 
         * <strong>example:</strong>
         * <p>49880***971</p>
         */
        @NameInMap("change_order_num")
        public Long changeOrderNum;

        /**
         * <p>The flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1627239841225842666</p>
         */
        @NameInMap("flow_id")
        public Long flowId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1676799185000</p>
         */
        @NameInMap("gmt_create")
        public Long gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1676966530000</p>
         */
        @NameInMap("gmt_modified")
        public Long gmtModified;

        /**
         * <p>The operation amount, in CNY.</p>
         * 
         * <strong>example:</strong>
         * <p>950.5</p>
         */
        @NameInMap("op_amount")
        public Double opAmount;

        /**
         * <p>The operation type. Valid values:</p>
         * <ul>
         * <li>1: payment</li>
         * <li>2: refund</li>
         * <li>3: top-up.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("op_type")
        public Integer opType;

        /**
         * <p>The original order number.</p>
         * 
         * <strong>example:</strong>
         * <p>4988430***971</p>
         */
        @NameInMap("order_num")
        public Long orderNum;

        /**
         * <p>The order type. Valid values:</p>
         * <ul>
         * <li>0: original transaction</li>
         * <li>1: change order payment</li>
         * <li>2: refund.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order_type")
        public Integer orderType;

        /**
         * <p>The external order number of the original order.</p>
         * 
         * <strong>example:</strong>
         * <p>4988430***971</p>
         */
        @NameInMap("out_order_num")
        public String outOrderNum;

        /**
         * <p>The refund order number. This value is not empty if the flow is related to a refund.</p>
         * 
         * <strong>example:</strong>
         * <p>48430***971</p>
         */
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

        public AccountFlowListResponseBodyDataList setOutOrderNum(String outOrderNum) {
            this.outOrderNum = outOrderNum;
            return this;
        }
        public String getOutOrderNum() {
            return this.outOrderNum;
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
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("current_page")
        public Integer currentPage;

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("page_size")
        public Integer pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("total_count")
        public Integer totalCount;

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>The data list.</p>
         */
        @NameInMap("list")
        public java.util.List<AccountFlowListResponseBodyDataList> list;

        /**
         * <p>The pagination information.</p>
         */
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
