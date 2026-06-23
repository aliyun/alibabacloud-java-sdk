// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListAnalysisCoreIndexResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public ListAnalysisCoreIndexResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static ListAnalysisCoreIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAnalysisCoreIndexResponseBody self = new ListAnalysisCoreIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAnalysisCoreIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAnalysisCoreIndexResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAnalysisCoreIndexResponseBody setResultContent(ListAnalysisCoreIndexResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ListAnalysisCoreIndexResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public ListAnalysisCoreIndexResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListAnalysisCoreIndexResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAnalysisCoreIndexResponseBodyResultContentData extends TeaModel {
        @NameInMap("ArrivalNum")
        public String arrivalNum;

        @NameInMap("ArrivalRate")
        public String arrivalRate;

        @NameInMap("IgnoreNum")
        public String ignoreNum;

        @NameInMap("IgnoreRate")
        public String ignoreRate;

        @NameInMap("OpenNum")
        public String openNum;

        @NameInMap("OpenRate")
        public String openRate;

        @NameInMap("PushNum")
        public String pushNum;

        @NameInMap("PushTotalNum")
        public String pushTotalNum;

        public static ListAnalysisCoreIndexResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            ListAnalysisCoreIndexResponseBodyResultContentData self = new ListAnalysisCoreIndexResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public ListAnalysisCoreIndexResponseBodyResultContentData setArrivalNum(String arrivalNum) {
            this.arrivalNum = arrivalNum;
            return this;
        }
        public String getArrivalNum() {
            return this.arrivalNum;
        }

        public ListAnalysisCoreIndexResponseBodyResultContentData setArrivalRate(String arrivalRate) {
            this.arrivalRate = arrivalRate;
            return this;
        }
        public String getArrivalRate() {
            return this.arrivalRate;
        }

        public ListAnalysisCoreIndexResponseBodyResultContentData setIgnoreNum(String ignoreNum) {
            this.ignoreNum = ignoreNum;
            return this;
        }
        public String getIgnoreNum() {
            return this.ignoreNum;
        }

        public ListAnalysisCoreIndexResponseBodyResultContentData setIgnoreRate(String ignoreRate) {
            this.ignoreRate = ignoreRate;
            return this;
        }
        public String getIgnoreRate() {
            return this.ignoreRate;
        }

        public ListAnalysisCoreIndexResponseBodyResultContentData setOpenNum(String openNum) {
            this.openNum = openNum;
            return this;
        }
        public String getOpenNum() {
            return this.openNum;
        }

        public ListAnalysisCoreIndexResponseBodyResultContentData setOpenRate(String openRate) {
            this.openRate = openRate;
            return this;
        }
        public String getOpenRate() {
            return this.openRate;
        }

        public ListAnalysisCoreIndexResponseBodyResultContentData setPushNum(String pushNum) {
            this.pushNum = pushNum;
            return this;
        }
        public String getPushNum() {
            return this.pushNum;
        }

        public ListAnalysisCoreIndexResponseBodyResultContentData setPushTotalNum(String pushTotalNum) {
            this.pushTotalNum = pushTotalNum;
            return this;
        }
        public String getPushTotalNum() {
            return this.pushTotalNum;
        }

    }

    public static class ListAnalysisCoreIndexResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public ListAnalysisCoreIndexResponseBodyResultContentData data;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static ListAnalysisCoreIndexResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ListAnalysisCoreIndexResponseBodyResultContent self = new ListAnalysisCoreIndexResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ListAnalysisCoreIndexResponseBodyResultContent setData(ListAnalysisCoreIndexResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public ListAnalysisCoreIndexResponseBodyResultContentData getData() {
            return this.data;
        }

        public ListAnalysisCoreIndexResponseBodyResultContent setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public ListAnalysisCoreIndexResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
