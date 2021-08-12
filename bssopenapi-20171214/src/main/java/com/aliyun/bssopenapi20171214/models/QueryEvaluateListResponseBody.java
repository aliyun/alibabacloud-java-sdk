// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryEvaluateListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public QueryEvaluateListResponseBodyData data;

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

    public QueryEvaluateListResponseBody setData(QueryEvaluateListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEvaluateListResponseBodyData getData() {
        return this.data;
    }

    public static class QueryEvaluateListResponseBodyDataEvaluateListEvaluate extends TeaModel {
        @NameInMap("Type")
        public Integer type;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("BillId")
        public Long billId;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("BillCycle")
        public String billCycle;

        @NameInMap("CanInvoiceAmount")
        public Long canInvoiceAmount;

        @NameInMap("OffsetAcceptAmount")
        public Long offsetAcceptAmount;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("OutBizId")
        public String outBizId;

        @NameInMap("UserNick")
        public String userNick;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("OpId")
        public String opId;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("OriginalAmount")
        public Long originalAmount;

        @NameInMap("InvoicedAmount")
        public Long invoicedAmount;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("PresentAmount")
        public Long presentAmount;

        @NameInMap("BizTime")
        public String bizTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("OffsetCostAmount")
        public Long offsetCostAmount;

        @NameInMap("Id")
        public Long id;

        public static QueryEvaluateListResponseBodyDataEvaluateListEvaluate build(java.util.Map<String, ?> map) throws Exception {
            QueryEvaluateListResponseBodyDataEvaluateListEvaluate self = new QueryEvaluateListResponseBodyDataEvaluateListEvaluate();
            return TeaModel.build(map, self);
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setBillId(Long billId) {
            this.billId = billId;
            return this;
        }
        public Long getBillId() {
            return this.billId;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setBillCycle(String billCycle) {
            this.billCycle = billCycle;
            return this;
        }
        public String getBillCycle() {
            return this.billCycle;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setCanInvoiceAmount(Long canInvoiceAmount) {
            this.canInvoiceAmount = canInvoiceAmount;
            return this;
        }
        public Long getCanInvoiceAmount() {
            return this.canInvoiceAmount;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setOffsetAcceptAmount(Long offsetAcceptAmount) {
            this.offsetAcceptAmount = offsetAcceptAmount;
            return this;
        }
        public Long getOffsetAcceptAmount() {
            return this.offsetAcceptAmount;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setOutBizId(String outBizId) {
            this.outBizId = outBizId;
            return this;
        }
        public String getOutBizId() {
            return this.outBizId;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setOpId(String opId) {
            this.opId = opId;
            return this;
        }
        public String getOpId() {
            return this.opId;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setOriginalAmount(Long originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Long getOriginalAmount() {
            return this.originalAmount;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setInvoicedAmount(Long invoicedAmount) {
            this.invoicedAmount = invoicedAmount;
            return this;
        }
        public Long getInvoicedAmount() {
            return this.invoicedAmount;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setPresentAmount(Long presentAmount) {
            this.presentAmount = presentAmount;
            return this;
        }
        public Long getPresentAmount() {
            return this.presentAmount;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setBizTime(String bizTime) {
            this.bizTime = bizTime;
            return this;
        }
        public String getBizTime() {
            return this.bizTime;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setOffsetCostAmount(Long offsetCostAmount) {
            this.offsetCostAmount = offsetCostAmount;
            return this;
        }
        public Long getOffsetCostAmount() {
            return this.offsetCostAmount;
        }

        public QueryEvaluateListResponseBodyDataEvaluateListEvaluate setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
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
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("TotalUnAppliedInvoiceAmount")
        public Long totalUnAppliedInvoiceAmount;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("TotalInvoiceAmount")
        public Long totalInvoiceAmount;

        @NameInMap("HostId")
        public String hostId;

        @NameInMap("EvaluateList")
        public QueryEvaluateListResponseBodyDataEvaluateList evaluateList;

        public static QueryEvaluateListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEvaluateListResponseBodyData self = new QueryEvaluateListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEvaluateListResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryEvaluateListResponseBodyData setTotalUnAppliedInvoiceAmount(Long totalUnAppliedInvoiceAmount) {
            this.totalUnAppliedInvoiceAmount = totalUnAppliedInvoiceAmount;
            return this;
        }
        public Long getTotalUnAppliedInvoiceAmount() {
            return this.totalUnAppliedInvoiceAmount;
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

        public QueryEvaluateListResponseBodyData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public QueryEvaluateListResponseBodyData setEvaluateList(QueryEvaluateListResponseBodyDataEvaluateList evaluateList) {
            this.evaluateList = evaluateList;
            return this;
        }
        public QueryEvaluateListResponseBodyDataEvaluateList getEvaluateList() {
            return this.evaluateList;
        }

    }

}
