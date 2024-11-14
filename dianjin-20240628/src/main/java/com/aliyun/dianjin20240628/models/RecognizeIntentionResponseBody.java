// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RecognizeIntentionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    @NameInMap("data")
    public RecognizeIntentionResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>003D019A-1BB3-53EC-A0D2-CE76DA5D73B1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
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
        @NameInMap("analysisProcess")
        public String analysisProcess;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("intentionCode")
        public String intentionCode;

        @NameInMap("intentionName")
        public String intentionName;

        @NameInMap("intentionScript")
        public String intentionScript;

        @NameInMap("recommendIntention")
        public String recommendIntention;

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
