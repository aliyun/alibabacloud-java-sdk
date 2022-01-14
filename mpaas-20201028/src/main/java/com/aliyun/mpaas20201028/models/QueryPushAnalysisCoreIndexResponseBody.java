// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryPushAnalysisCoreIndexResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public QueryPushAnalysisCoreIndexResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static QueryPushAnalysisCoreIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPushAnalysisCoreIndexResponseBody self = new QueryPushAnalysisCoreIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPushAnalysisCoreIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPushAnalysisCoreIndexResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPushAnalysisCoreIndexResponseBody setResultContent(QueryPushAnalysisCoreIndexResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryPushAnalysisCoreIndexResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public QueryPushAnalysisCoreIndexResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class QueryPushAnalysisCoreIndexResponseBodyResultContentData extends TeaModel {
        @NameInMap("ArrivalNum")
        public Float arrivalNum;

        @NameInMap("ArrivalRate")
        public Float arrivalRate;

        @NameInMap("IgnoreNum")
        public Float ignoreNum;

        @NameInMap("IgnoreRate")
        public Float ignoreRate;

        @NameInMap("OpenNum")
        public Float openNum;

        @NameInMap("OpenRate")
        public Float openRate;

        @NameInMap("PushNum")
        public Float pushNum;

        @NameInMap("PushTotalNum")
        public Float pushTotalNum;

        public static QueryPushAnalysisCoreIndexResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryPushAnalysisCoreIndexResponseBodyResultContentData self = new QueryPushAnalysisCoreIndexResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryPushAnalysisCoreIndexResponseBodyResultContentData setArrivalNum(Float arrivalNum) {
            this.arrivalNum = arrivalNum;
            return this;
        }
        public Float getArrivalNum() {
            return this.arrivalNum;
        }

        public QueryPushAnalysisCoreIndexResponseBodyResultContentData setArrivalRate(Float arrivalRate) {
            this.arrivalRate = arrivalRate;
            return this;
        }
        public Float getArrivalRate() {
            return this.arrivalRate;
        }

        public QueryPushAnalysisCoreIndexResponseBodyResultContentData setIgnoreNum(Float ignoreNum) {
            this.ignoreNum = ignoreNum;
            return this;
        }
        public Float getIgnoreNum() {
            return this.ignoreNum;
        }

        public QueryPushAnalysisCoreIndexResponseBodyResultContentData setIgnoreRate(Float ignoreRate) {
            this.ignoreRate = ignoreRate;
            return this;
        }
        public Float getIgnoreRate() {
            return this.ignoreRate;
        }

        public QueryPushAnalysisCoreIndexResponseBodyResultContentData setOpenNum(Float openNum) {
            this.openNum = openNum;
            return this;
        }
        public Float getOpenNum() {
            return this.openNum;
        }

        public QueryPushAnalysisCoreIndexResponseBodyResultContentData setOpenRate(Float openRate) {
            this.openRate = openRate;
            return this;
        }
        public Float getOpenRate() {
            return this.openRate;
        }

        public QueryPushAnalysisCoreIndexResponseBodyResultContentData setPushNum(Float pushNum) {
            this.pushNum = pushNum;
            return this;
        }
        public Float getPushNum() {
            return this.pushNum;
        }

        public QueryPushAnalysisCoreIndexResponseBodyResultContentData setPushTotalNum(Float pushTotalNum) {
            this.pushTotalNum = pushTotalNum;
            return this;
        }
        public Float getPushTotalNum() {
            return this.pushTotalNum;
        }

    }

    public static class QueryPushAnalysisCoreIndexResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public QueryPushAnalysisCoreIndexResponseBodyResultContentData data;

        public static QueryPushAnalysisCoreIndexResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryPushAnalysisCoreIndexResponseBodyResultContent self = new QueryPushAnalysisCoreIndexResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryPushAnalysisCoreIndexResponseBodyResultContent setData(QueryPushAnalysisCoreIndexResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public QueryPushAnalysisCoreIndexResponseBodyResultContentData getData() {
            return this.data;
        }

    }

}
