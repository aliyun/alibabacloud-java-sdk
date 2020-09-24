// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryEvaluateListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryEvaluateListResponseData data;

    public static QueryEvaluateListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEvaluateListResponse self = new QueryEvaluateListResponse();
        return TeaModel.build(map, self);
    }

    public QueryEvaluateListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEvaluateListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEvaluateListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEvaluateListResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryEvaluateListResponse setData(QueryEvaluateListResponseData data) {
        this.data = data;
        return this;
    }
    public QueryEvaluateListResponseData getData() {
        return this.data;
    }

    public static class QueryEvaluateListResponseDataEvaluateListEvaluate extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        @NameInMap("UserId")
        @Validation(required = true)
        public Long userId;

        @NameInMap("UserNick")
        @Validation(required = true)
        public String userNick;

        @NameInMap("OutBizId")
        @Validation(required = true)
        public String outBizId;

        @NameInMap("BillId")
        @Validation(required = true)
        public Long billId;

        @NameInMap("ItemId")
        @Validation(required = true)
        public Long itemId;

        @NameInMap("BillCycle")
        @Validation(required = true)
        public String billCycle;

        @NameInMap("BizType")
        @Validation(required = true)
        public String bizType;

        @NameInMap("OriginalAmount")
        @Validation(required = true)
        public Long originalAmount;

        @NameInMap("PresentAmount")
        @Validation(required = true)
        public Long presentAmount;

        @NameInMap("CanInvoiceAmount")
        @Validation(required = true)
        public Long canInvoiceAmount;

        @NameInMap("InvoicedAmount")
        @Validation(required = true)
        public Long invoicedAmount;

        @NameInMap("OffsetCostAmount")
        @Validation(required = true)
        public Long offsetCostAmount;

        @NameInMap("OffsetAcceptAmount")
        @Validation(required = true)
        public Long offsetAcceptAmount;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("OpId")
        @Validation(required = true)
        public String opId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("BizTime")
        @Validation(required = true)
        public String bizTime;

        @NameInMap("Type")
        @Validation(required = true)
        public Integer type;

        public static QueryEvaluateListResponseDataEvaluateListEvaluate build(java.util.Map<String, ?> map) throws Exception {
            QueryEvaluateListResponseDataEvaluateListEvaluate self = new QueryEvaluateListResponseDataEvaluateListEvaluate();
            return TeaModel.build(map, self);
        }

        public QueryEvaluateListResponseDataEvaluateListEvaluate setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryEvaluateListResponseDataEvaluateListEvaluate setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryEvaluateListResponseDataEvaluateListEvaluate setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryEvaluateListResponseDataEvaluateListEvaluate setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public QueryEvaluateListResponseDataEvaluateListEvaluate setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

        public QueryEvaluateListResponseDataEvaluateListEvaluate setOutBizId(String outBizId) {
            this.outBizId = outBizId;
            return this;
        }
        public String getOutBizId() {
            return this.outBizId;
        }

        public QueryEvaluateListResponseDataEvaluateListEvaluate setBillId(Long billId) {
            this.billId = billId;
            return this;
        }
        public Long getBillId() {
            return this.billId;
        }

        public QueryEvaluateListResponseDataEvaluateListEvaluate setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryEvaluateListResponseDataEvaluateListEvaluate setBillCycle(String billCycle) {
            this.billCycle = billCycle;
            return this;
        }
        public String getBillCycle() {
            return this.billCycle;
        }

        public QueryEvaluateListResponseDataEvaluateListEvaluate setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryEvaluateListResponseDataEvaluateListEvaluate setOriginalAmount(Long originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Long getOriginalAmount() {
            return this.originalAmount;
        }

        public QueryEvaluateListResponseDataEvaluateListEvaluate setPresentAmount(Long presentAmount) {
            this.presentAmount = presentAmount;
            return this;
        }
        public Long getPresentAmount() {
            return this.presentAmount;
        }

        public QueryEvaluateListResponseDataEvaluateListEvaluate setCanInvoiceAmount(Long canInvoiceAmount) {
            this.canInvoiceAmount = canInvoiceAmount;
            return this;
        }
        public Long getCanInvoiceAmount() {
            return this.canInvoiceAmount;
        }

        public QueryEvaluateListResponseDataEvaluateListEvaluate setInvoicedAmount(Long invoicedAmount) {
            this.invoicedAmount = invoicedAmount;
            return this;
        }
        public Long getInvoicedAmount() {
            return this.invoicedAmount;
        }

        public QueryEvaluateListResponseDataEvaluateListEvaluate setOffsetCostAmount(Long offsetCostAmount) {
            this.offsetCostAmount = offsetCostAmount;
            return this;
        }
        public Long getOffsetCostAmount() {
            return this.offsetCostAmount;
        }

        public QueryEvaluateListResponseDataEvaluateListEvaluate setOffsetAcceptAmount(Long offsetAcceptAmount) {
            this.offsetAcceptAmount = offsetAcceptAmount;
            return this;
        }
        public Long getOffsetAcceptAmount() {
            return this.offsetAcceptAmount;
        }

        public QueryEvaluateListResponseDataEvaluateListEvaluate setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryEvaluateListResponseDataEvaluateListEvaluate setOpId(String opId) {
            this.opId = opId;
            return this;
        }
        public String getOpId() {
            return this.opId;
        }

        public QueryEvaluateListResponseDataEvaluateListEvaluate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryEvaluateListResponseDataEvaluateListEvaluate setBizTime(String bizTime) {
            this.bizTime = bizTime;
            return this;
        }
        public String getBizTime() {
            return this.bizTime;
        }

        public QueryEvaluateListResponseDataEvaluateListEvaluate setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class QueryEvaluateListResponseDataEvaluateList extends TeaModel {
        @NameInMap("Evaluate")
        @Validation(required = true)
        public java.util.List<QueryEvaluateListResponseDataEvaluateListEvaluate> evaluate;

        public static QueryEvaluateListResponseDataEvaluateList build(java.util.Map<String, ?> map) throws Exception {
            QueryEvaluateListResponseDataEvaluateList self = new QueryEvaluateListResponseDataEvaluateList();
            return TeaModel.build(map, self);
        }

        public QueryEvaluateListResponseDataEvaluateList setEvaluate(java.util.List<QueryEvaluateListResponseDataEvaluateListEvaluate> evaluate) {
            this.evaluate = evaluate;
            return this;
        }
        public java.util.List<QueryEvaluateListResponseDataEvaluateListEvaluate> getEvaluate() {
            return this.evaluate;
        }

    }

    public static class QueryEvaluateListResponseData extends TeaModel {
        @NameInMap("HostId")
        @Validation(required = true)
        public String hostId;

        @NameInMap("PageNum")
        @Validation(required = true)
        public Integer pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("TotalInvoiceAmount")
        @Validation(required = true)
        public Long totalInvoiceAmount;

        @NameInMap("TotalUnAppliedInvoiceAmount")
        @Validation(required = true)
        public Long totalUnAppliedInvoiceAmount;

        @NameInMap("EvaluateList")
        @Validation(required = true)
        public QueryEvaluateListResponseDataEvaluateList evaluateList;

        public static QueryEvaluateListResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryEvaluateListResponseData self = new QueryEvaluateListResponseData();
            return TeaModel.build(map, self);
        }

        public QueryEvaluateListResponseData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public QueryEvaluateListResponseData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryEvaluateListResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEvaluateListResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryEvaluateListResponseData setTotalInvoiceAmount(Long totalInvoiceAmount) {
            this.totalInvoiceAmount = totalInvoiceAmount;
            return this;
        }
        public Long getTotalInvoiceAmount() {
            return this.totalInvoiceAmount;
        }

        public QueryEvaluateListResponseData setTotalUnAppliedInvoiceAmount(Long totalUnAppliedInvoiceAmount) {
            this.totalUnAppliedInvoiceAmount = totalUnAppliedInvoiceAmount;
            return this;
        }
        public Long getTotalUnAppliedInvoiceAmount() {
            return this.totalUnAppliedInvoiceAmount;
        }

        public QueryEvaluateListResponseData setEvaluateList(QueryEvaluateListResponseDataEvaluateList evaluateList) {
            this.evaluateList = evaluateList;
            return this;
        }
        public QueryEvaluateListResponseDataEvaluateList getEvaluateList() {
            return this.evaluateList;
        }

    }

}
