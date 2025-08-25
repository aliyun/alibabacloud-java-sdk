// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class ListAnalysisCoreIndexResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public ListAnalysisCoreIndexResponseBodyResultContent resultContent;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ResultMessage")
    public String resultMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ArrivalNum")
        public String arrivalNum;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ArrivalRate")
        public String arrivalRate;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IgnoreNum")
        public String ignoreNum;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IgnoreRate")
        public String ignoreRate;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OpenNum")
        public String openNum;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OpenRate")
        public String openRate;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PushNum")
        public String pushNum;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("ResultMsg")
        public String resultMsg;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
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
