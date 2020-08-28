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

    }

    public static class QueryEvaluateListResponseDataEvaluateList extends TeaModel {
        @NameInMap("Evaluate")
        @Validation(required = true)
        public java.util.List<QueryEvaluateListResponseDataEvaluateListEvaluate> evaluate;

        public static QueryEvaluateListResponseDataEvaluateList build(java.util.Map<String, ?> map) throws Exception {
            QueryEvaluateListResponseDataEvaluateList self = new QueryEvaluateListResponseDataEvaluateList();
            return TeaModel.build(map, self);
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

    }

}
