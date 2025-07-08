// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryCardSmsStatisticsSendResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Model")
    public QueryCardSmsStatisticsSendResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryCardSmsStatisticsSendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCardSmsStatisticsSendResponseBody self = new QueryCardSmsStatisticsSendResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCardSmsStatisticsSendResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCardSmsStatisticsSendResponseBody setModel(QueryCardSmsStatisticsSendResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryCardSmsStatisticsSendResponseBodyModel getModel() {
        return this.model;
    }

    public QueryCardSmsStatisticsSendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCardSmsStatisticsSendResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCardSmsStatisticsSendResponseBodyModelRecords extends TeaModel {
        @NameInMap("CustomTmpCode")
        public String customTmpCode;

        @NameInMap("RenderSuccessRate")
        public Double renderSuccessRate;

        @NameInMap("RenderSuccessTotal")
        public Long renderSuccessTotal;

        @NameInMap("SendDate")
        public String sendDate;

        @NameInMap("SendFailTotal")
        public Long sendFailTotal;

        @NameInMap("SendProcessTotal")
        public Long sendProcessTotal;

        @NameInMap("SendSuccessRate")
        public Double sendSuccessRate;

        @NameInMap("SendSuccessTotal")
        public Long sendSuccessTotal;

        @NameInMap("SendTotal")
        public Long sendTotal;

        @NameInMap("SignName")
        public String signName;

        @NameInMap("SupportRate")
        public Double supportRate;

        @NameInMap("SupportTotal")
        public Long supportTotal;

        @NameInMap("TmpCode")
        public String tmpCode;

        public static QueryCardSmsStatisticsSendResponseBodyModelRecords build(java.util.Map<String, ?> map) throws Exception {
            QueryCardSmsStatisticsSendResponseBodyModelRecords self = new QueryCardSmsStatisticsSendResponseBodyModelRecords();
            return TeaModel.build(map, self);
        }

        public QueryCardSmsStatisticsSendResponseBodyModelRecords setCustomTmpCode(String customTmpCode) {
            this.customTmpCode = customTmpCode;
            return this;
        }
        public String getCustomTmpCode() {
            return this.customTmpCode;
        }

        public QueryCardSmsStatisticsSendResponseBodyModelRecords setRenderSuccessRate(Double renderSuccessRate) {
            this.renderSuccessRate = renderSuccessRate;
            return this;
        }
        public Double getRenderSuccessRate() {
            return this.renderSuccessRate;
        }

        public QueryCardSmsStatisticsSendResponseBodyModelRecords setRenderSuccessTotal(Long renderSuccessTotal) {
            this.renderSuccessTotal = renderSuccessTotal;
            return this;
        }
        public Long getRenderSuccessTotal() {
            return this.renderSuccessTotal;
        }

        public QueryCardSmsStatisticsSendResponseBodyModelRecords setSendDate(String sendDate) {
            this.sendDate = sendDate;
            return this;
        }
        public String getSendDate() {
            return this.sendDate;
        }

        public QueryCardSmsStatisticsSendResponseBodyModelRecords setSendFailTotal(Long sendFailTotal) {
            this.sendFailTotal = sendFailTotal;
            return this;
        }
        public Long getSendFailTotal() {
            return this.sendFailTotal;
        }

        public QueryCardSmsStatisticsSendResponseBodyModelRecords setSendProcessTotal(Long sendProcessTotal) {
            this.sendProcessTotal = sendProcessTotal;
            return this;
        }
        public Long getSendProcessTotal() {
            return this.sendProcessTotal;
        }

        public QueryCardSmsStatisticsSendResponseBodyModelRecords setSendSuccessRate(Double sendSuccessRate) {
            this.sendSuccessRate = sendSuccessRate;
            return this;
        }
        public Double getSendSuccessRate() {
            return this.sendSuccessRate;
        }

        public QueryCardSmsStatisticsSendResponseBodyModelRecords setSendSuccessTotal(Long sendSuccessTotal) {
            this.sendSuccessTotal = sendSuccessTotal;
            return this;
        }
        public Long getSendSuccessTotal() {
            return this.sendSuccessTotal;
        }

        public QueryCardSmsStatisticsSendResponseBodyModelRecords setSendTotal(Long sendTotal) {
            this.sendTotal = sendTotal;
            return this;
        }
        public Long getSendTotal() {
            return this.sendTotal;
        }

        public QueryCardSmsStatisticsSendResponseBodyModelRecords setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

        public QueryCardSmsStatisticsSendResponseBodyModelRecords setSupportRate(Double supportRate) {
            this.supportRate = supportRate;
            return this;
        }
        public Double getSupportRate() {
            return this.supportRate;
        }

        public QueryCardSmsStatisticsSendResponseBodyModelRecords setSupportTotal(Long supportTotal) {
            this.supportTotal = supportTotal;
            return this;
        }
        public Long getSupportTotal() {
            return this.supportTotal;
        }

        public QueryCardSmsStatisticsSendResponseBodyModelRecords setTmpCode(String tmpCode) {
            this.tmpCode = tmpCode;
            return this;
        }
        public String getTmpCode() {
            return this.tmpCode;
        }

    }

    public static class QueryCardSmsStatisticsSendResponseBodyModel extends TeaModel {
        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Records")
        public java.util.List<QueryCardSmsStatisticsSendResponseBodyModelRecords> records;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static QueryCardSmsStatisticsSendResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryCardSmsStatisticsSendResponseBodyModel self = new QueryCardSmsStatisticsSendResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryCardSmsStatisticsSendResponseBodyModel setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public QueryCardSmsStatisticsSendResponseBodyModel setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryCardSmsStatisticsSendResponseBodyModel setRecords(java.util.List<QueryCardSmsStatisticsSendResponseBodyModelRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<QueryCardSmsStatisticsSendResponseBodyModelRecords> getRecords() {
            return this.records;
        }

        public QueryCardSmsStatisticsSendResponseBodyModel setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
