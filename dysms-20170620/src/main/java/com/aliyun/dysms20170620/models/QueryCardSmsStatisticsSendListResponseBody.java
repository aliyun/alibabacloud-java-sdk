// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryCardSmsStatisticsSendListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Model")
    public java.util.List<QueryCardSmsStatisticsSendListResponseBodyModel> model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryCardSmsStatisticsSendListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCardSmsStatisticsSendListResponseBody self = new QueryCardSmsStatisticsSendListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCardSmsStatisticsSendListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCardSmsStatisticsSendListResponseBody setModel(java.util.List<QueryCardSmsStatisticsSendListResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<QueryCardSmsStatisticsSendListResponseBodyModel> getModel() {
        return this.model;
    }

    public QueryCardSmsStatisticsSendListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCardSmsStatisticsSendListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCardSmsStatisticsSendListResponseBodyModel extends TeaModel {
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

        @NameInMap("SupportRate")
        public Double supportRate;

        @NameInMap("SupportTotal")
        public Long supportTotal;

        public static QueryCardSmsStatisticsSendListResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryCardSmsStatisticsSendListResponseBodyModel self = new QueryCardSmsStatisticsSendListResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryCardSmsStatisticsSendListResponseBodyModel setRenderSuccessRate(Double renderSuccessRate) {
            this.renderSuccessRate = renderSuccessRate;
            return this;
        }
        public Double getRenderSuccessRate() {
            return this.renderSuccessRate;
        }

        public QueryCardSmsStatisticsSendListResponseBodyModel setRenderSuccessTotal(Long renderSuccessTotal) {
            this.renderSuccessTotal = renderSuccessTotal;
            return this;
        }
        public Long getRenderSuccessTotal() {
            return this.renderSuccessTotal;
        }

        public QueryCardSmsStatisticsSendListResponseBodyModel setSendDate(String sendDate) {
            this.sendDate = sendDate;
            return this;
        }
        public String getSendDate() {
            return this.sendDate;
        }

        public QueryCardSmsStatisticsSendListResponseBodyModel setSendFailTotal(Long sendFailTotal) {
            this.sendFailTotal = sendFailTotal;
            return this;
        }
        public Long getSendFailTotal() {
            return this.sendFailTotal;
        }

        public QueryCardSmsStatisticsSendListResponseBodyModel setSendProcessTotal(Long sendProcessTotal) {
            this.sendProcessTotal = sendProcessTotal;
            return this;
        }
        public Long getSendProcessTotal() {
            return this.sendProcessTotal;
        }

        public QueryCardSmsStatisticsSendListResponseBodyModel setSendSuccessRate(Double sendSuccessRate) {
            this.sendSuccessRate = sendSuccessRate;
            return this;
        }
        public Double getSendSuccessRate() {
            return this.sendSuccessRate;
        }

        public QueryCardSmsStatisticsSendListResponseBodyModel setSendSuccessTotal(Long sendSuccessTotal) {
            this.sendSuccessTotal = sendSuccessTotal;
            return this;
        }
        public Long getSendSuccessTotal() {
            return this.sendSuccessTotal;
        }

        public QueryCardSmsStatisticsSendListResponseBodyModel setSendTotal(Long sendTotal) {
            this.sendTotal = sendTotal;
            return this;
        }
        public Long getSendTotal() {
            return this.sendTotal;
        }

        public QueryCardSmsStatisticsSendListResponseBodyModel setSupportRate(Double supportRate) {
            this.supportRate = supportRate;
            return this;
        }
        public Double getSupportRate() {
            return this.supportRate;
        }

        public QueryCardSmsStatisticsSendListResponseBodyModel setSupportTotal(Long supportTotal) {
            this.supportTotal = supportTotal;
            return this;
        }
        public Long getSupportTotal() {
            return this.supportTotal;
        }

    }

}
