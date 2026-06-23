// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RecognizeIntentionResponseBody extends TeaModel {
    /**
     * <p>Processing time in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    /**
     * <p>Response data.</p>
     */
    @NameInMap("data")
    public RecognizeIntentionResponseBodyData data;

    /**
     * <p>Data type.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <p>Error code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>003D019A-1BB3-53EC-A0D2-CE76DA5D73B1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>Timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-04-24 11:54:34</p>
     */
    @NameInMap("time")
    public String time;

    public static RecognizeIntentionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeIntentionResponseBody self = new RecognizeIntentionResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeIntentionResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public RecognizeIntentionResponseBody setData(RecognizeIntentionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeIntentionResponseBodyData getData() {
        return this.data;
    }

    public RecognizeIntentionResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public RecognizeIntentionResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public RecognizeIntentionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeIntentionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeIntentionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RecognizeIntentionResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class RecognizeIntentionResponseBodyData extends TeaModel {
        /**
         * <p>Analysis process.</p>
         * 
         * <strong>example:</strong>
         * <p>客户回答的内容与提供的意图列表描述均不匹配，没有表达出对账单、还款、天气或其他服务的具体需求或问题。</p>
         */
        @NameInMap("analysisProcess")
        public String analysisProcess;

        /**
         * <p>Intent code.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("intentionCode")
        public String intentionCode;

        /**
         * <p>Intent name.</p>
         * 
         * <strong>example:</strong>
         * <p>其它</p>
         */
        @NameInMap("intentionName")
        public String intentionName;

        /**
         * <p>Intent script.</p>
         * 
         * <strong>example:</strong>
         * <p>朱先生，理解您可能对天气感兴趣，但更重要的是您的账户情况。请让我们专注于您未偿还的款项，这对您的信用健康至关重要。</p>
         */
        @NameInMap("intentionScript")
        public String intentionScript;

        /**
         * <p>Recommended intent.</p>
         * 
         * <strong>example:</strong>
         * <p>客户试图回避谈论逾期还款的话题</p>
         */
        @NameInMap("recommendIntention")
        public String recommendIntention;

        /**
         * <p>Recommended script.</p>
         * 
         * <strong>example:</strong>
         * <p>朱先生，理解您可能对天气感兴趣，但更重要的是您的账户情况。请让我们专注于您未偿还的款项，这对您的信用健康至关重要。</p>
         */
        @NameInMap("recommendScript")
        public String recommendScript;

        public static RecognizeIntentionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeIntentionResponseBodyData self = new RecognizeIntentionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeIntentionResponseBodyData setAnalysisProcess(String analysisProcess) {
            this.analysisProcess = analysisProcess;
            return this;
        }
        public String getAnalysisProcess() {
            return this.analysisProcess;
        }

        public RecognizeIntentionResponseBodyData setIntentionCode(String intentionCode) {
            this.intentionCode = intentionCode;
            return this;
        }
        public String getIntentionCode() {
            return this.intentionCode;
        }

        public RecognizeIntentionResponseBodyData setIntentionName(String intentionName) {
            this.intentionName = intentionName;
            return this;
        }
        public String getIntentionName() {
            return this.intentionName;
        }

        public RecognizeIntentionResponseBodyData setIntentionScript(String intentionScript) {
            this.intentionScript = intentionScript;
            return this;
        }
        public String getIntentionScript() {
            return this.intentionScript;
        }

        public RecognizeIntentionResponseBodyData setRecommendIntention(String recommendIntention) {
            this.recommendIntention = recommendIntention;
            return this;
        }
        public String getRecommendIntention() {
            return this.recommendIntention;
        }

        public RecognizeIntentionResponseBodyData setRecommendScript(String recommendScript) {
            this.recommendScript = recommendScript;
            return this;
        }
        public String getRecommendScript() {
            return this.recommendScript;
        }

    }

}
