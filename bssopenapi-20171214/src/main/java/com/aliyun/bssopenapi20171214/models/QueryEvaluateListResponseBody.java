// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryEvaluateListResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QueryEvaluateListResponseBodyData data;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful！</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D35FF10E-1B2E-4ABA-8401-0AE17725F50B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryEvaluateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEvaluateListResponseBody self = new QueryEvaluateListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEvaluateListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEvaluateListResponseBody setData(QueryEvaluateListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEvaluateListResponseBodyData getData() {
        return this.data;
    }

    public QueryEvaluateListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryEvaluateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEvaluateListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEvaluateListResponseBodyDataEvaluateListEvaluate extends TeaModel {
        /**
         * <p>The billing cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>202002</p>
         */
        @NameInMap("BillCycle")
        public String billCycle;

        /**
         * <p>The ID of the bill.</p>
         * 
         * <strong>example:</strong>
         * <p>234543254325</p>
         */
        @NameInMap("BillId")
        public Long billId;

        /**
         * <p>The time.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-10-10 18:05:44</p>
         */
        @NameInMap("BizTime")
        public String bizTime;

        /**
         * <p>The market type in the invoice. Valid values:</p>
         * <ul>
         * <li>ALIYUN: Alibaba Cloud</li>
         * <li>MARKETPLACE: Alibaba Cloud Marketplace</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>The invoiceable amount.</p>
         * 
         * <strong>example:</strong>
         * <p>123213</p>
         */
        @NameInMap("CanInvoiceAmount")
        public Long canInvoiceAmount;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-10-10 18:05:44</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-10-10 18:05:44</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the invoice.</p>
         * 
         * <strong>example:</strong>
         * <p>1325321532</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The invoiced amount.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("InvoicedAmount")
        public Long invoicedAmount;

        /**
         * <p>The ID of the item.</p>
         * 
         * <strong>example:</strong>
         * <p>23453245</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        /**
         * <p>The name of the object to be invoiced.</p>
         * 
         * <strong>example:</strong>
         * <p>Refund of a voucher with denomination marked</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>If a refund is issued due to an order such as an unsubscription order or a configuration downgrade order, the refund amount is used to offset the amount of the invoice. The value is consistent with the value of the <strong>OffsetCostAmount</strong> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("OffsetAcceptAmount")
        public Long offsetAcceptAmount;

        /**
         * <p>The refund amount used to offset the amount of the invoice. If a refund is issued due to an order such as an unsubscription order or a configuration downgrade order, the refund amount is used to offset the amount of the invoice. The value is consistent with the value of the <strong>OffsetAcceptAmount</strong> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("OffsetCostAmount")
        public Long offsetCostAmount;

        /**
         * <p>The ID of the external object.</p>
         * 
         * <strong>example:</strong>
         * <p>12341</p>
         */
        @NameInMap("OpId")
        public String opId;

        /**
         * <p>The original amount.</p>
         * 
         * <strong>example:</strong>
         * <p>-10000</p>
         */
        @NameInMap("OriginalAmount")
        public Long originalAmount;

        /**
         * <p>The ID of the external order.</p>
         * 
         * <strong>example:</strong>
         * <p>124324213421</p>
         */
        @NameInMap("OutBizId")
        public String outBizId;

        /**
         * <p>The balance.</p>
         * 
         * <strong>example:</strong>
         * <p>-10000</p>
         */
        @NameInMap("PresentAmount")
        public Long presentAmount;

        /**
         * <p>The status of the invoiceable amount.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The type of orders that are queried. Valid values:</p>
         * <ul>
         * <li>1: the orders in which the invoiceable amount is negative.</li>
         * <li>2: the orders in which the invoiceable amount is positive.</li>
         * <li>3: the orders in which the invoiceable amount is not 0.</li>
         * <li>4: the orders in which the amount that has been invoiced is greater than 0.</li>
         * </ul>
         * <blockquote>
         * <p> By default, this parameter is left empty. If this parameter is left empty, all orders are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>2738543</p>
         */
        @NameInMap("UserId")
        public Long userId;

        /**
         * <p>The nickname of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("UserNick")
        public String userNick;

        public static QueryEvaluateListResponseBodyDataEvaluateListEvaluate build(java.util.Map<String, ?> map) throws Exception {
            QueryEvaluateListResponseBodyDataEvaluateListEvaluate self = new QueryEvaluateListResponseBodyDataEvaluateListEvaluate();
            return TeaModel.build(map, self);
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setBillCycle(String billCycle) {
            this.billCycle = billCycle;
            return this;
        }
        public String getBillCycle() {
            return this.billCycle;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setBillId(Long billId) {
            this.billId = billId;
            return this;
        }
        public Long getBillId() {
            return this.billId;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setBizTime(String bizTime) {
            this.bizTime = bizTime;
            return this;
        }
        public String getBizTime() {
            return this.bizTime;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setCanInvoiceAmount(Long canInvoiceAmount) {
            this.canInvoiceAmount = canInvoiceAmount;
            return this;
        }
        public Long getCanInvoiceAmount() {
            return this.canInvoiceAmount;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setInvoicedAmount(Long invoicedAmount) {
            this.invoicedAmount = invoicedAmount;
            return this;
        }
        public Long getInvoicedAmount() {
            return this.invoicedAmount;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setOffsetAcceptAmount(Long offsetAcceptAmount) {
            this.offsetAcceptAmount = offsetAcceptAmount;
            return this;
        }
        public Long getOffsetAcceptAmount() {
            return this.offsetAcceptAmount;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setOffsetCostAmount(Long offsetCostAmount) {
            this.offsetCostAmount = offsetCostAmount;
            return this;
        }
        public Long getOffsetCostAmount() {
            return this.offsetCostAmount;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setOpId(String opId) {
            this.opId = opId;
            return this;
        }
        public String getOpId() {
            return this.opId;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setOriginalAmount(Long originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Long getOriginalAmount() {
            return this.originalAmount;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setOutBizId(String outBizId) {
            this.outBizId = outBizId;
            return this;
        }
        public String getOutBizId() {
            return this.outBizId;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setPresentAmount(Long presentAmount) {
            this.presentAmount = presentAmount;
            return this;
        }
        public Long getPresentAmount() {
            return this.presentAmount;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

    }

    public static class QueryEvaluateListResponseBodyDataEvaluateList extends TeaModel {
        @NameInMap("Evaluate")
        public java.util.List<QueryEvaluateListResponseBodyDataEvaluateListEvaluate> evaluate;

        public static QueryEvaluateListResponseBodyDataEvaluateList build(java.util.Map<String, ?> map) throws Exception {
            QueryEvaluateListResponseBodyDataEvaluateList self = new QueryEvaluateListResponseBodyDataEvaluateList();
            return TeaModel.build(map, self);
        }

        public QueryEvaluateListResponseBodyDataEvaluateList setEvaluate(java.util.List<QueryEvaluateListResponseBodyDataEvaluateListEvaluate> evaluate) {
            this.evaluate = evaluate;
            return this;
        }
        public java.util.List<QueryEvaluateListResponseBodyDataEvaluateListEvaluate> getEvaluate() {
            return this.evaluate;
        }

    }

    public static class QueryEvaluateListResponseBodyData extends TeaModel {
        /**
         * <p>The data returned.</p>
         */
        @NameInMap("EvaluateList")
        public QueryEvaluateListResponseBodyDataEvaluateList evaluateList;

        /**
         * <p>The ID of the host.</p>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>The number of the page returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The invoiced amount that meets the query conditions. Unit: Cent.</p>
         * 
         * <strong>example:</strong>
         * <p>12344</p>
         */
        @NameInMap("TotalInvoiceAmount")
        public Long totalInvoiceAmount;

        /**
         * <p>The invoiceable amount that meets the query conditions. Unit: Cent.</p>
         * 
         * <strong>example:</strong>
         * <p>12344</p>
         */
        @NameInMap("TotalUnAppliedInvoiceAmount")
        public Long totalUnAppliedInvoiceAmount;

        public static QueryEvaluateListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEvaluateListResponseBodyData self = new QueryEvaluateListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEvaluateListResponseBodyData setEvaluateList(QueryEvaluateListResponseBodyDataEvaluateList evaluateList) {
            this.evaluateList = evaluateList;
            return this;
        }
        public QueryEvaluateListResponseBodyDataEvaluateList getEvaluateList() {
            return this.evaluateList;
        }

        public QueryEvaluateListResponseBodyData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public QueryEvaluateListResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryEvaluateListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEvaluateListResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryEvaluateListResponseBodyData setTotalInvoiceAmount(Long totalInvoiceAmount) {
            this.totalInvoiceAmount = totalInvoiceAmount;
            return this;
        }
        public Long getTotalInvoiceAmount() {
            return this.totalInvoiceAmount;
        }

        public QueryEvaluateListResponseBodyData setTotalUnAppliedInvoiceAmount(Long totalUnAppliedInvoiceAmount) {
            this.totalUnAppliedInvoiceAmount = totalUnAppliedInvoiceAmount;
            return this;
        }
        public Long getTotalUnAppliedInvoiceAmount() {
            return this.totalUnAppliedInvoiceAmount;
        }

    }

}
