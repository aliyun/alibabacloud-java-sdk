// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RealTimeDialogResponseBody extends TeaModel {
    @NameInMap("choices")
    public java.util.List<RealTimeDialogResponseBodyChoices> choices;

    /**
     * <strong>example:</strong>
     * <p>1735139569523</p>
     */
    @NameInMap("created")
    public String created;

    /**
     * <strong>example:</strong>
     * <p>eb2b6139-ddf1-91a0-a47f-df7617ae9032</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>5E3FBAF1-17AF-53B7-AF0A-CDCEEB6DE658</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static RealTimeDialogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RealTimeDialogResponseBody self = new RealTimeDialogResponseBody();
        return TeaModel.build(map, self);
    }

    public RealTimeDialogResponseBody setChoices(java.util.List<RealTimeDialogResponseBodyChoices> choices) {
        this.choices = choices;
        return this;
    }
    public java.util.List<RealTimeDialogResponseBodyChoices> getChoices() {
        return this.choices;
    }

    public RealTimeDialogResponseBody setCreated(String created) {
        this.created = created;
        return this;
    }
    public String getCreated() {
        return this.created;
    }

    public RealTimeDialogResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RealTimeDialogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RealTimeDialogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RealTimeDialogResponseBodyChoicesDelta extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("analysisProcess")
        public String analysisProcess;

        /**
         * <p>time</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("callTime")
        public String callTime;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("hangUpDialog")
        public Boolean hangUpDialog;

        /**
         * <strong>example:</strong>
         * <p>1853360771162058752</p>
         */
        @NameInMap("intentionCode")
        public String intentionCode;

        @NameInMap("intentionName")
        public String intentionName;

        @NameInMap("intentionScript")
        public String intentionScript;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("recommendIntention")
        public String recommendIntention;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("recommendScript")
        public String recommendScript;

        @NameInMap("selfDirectedScript")
        public String selfDirectedScript;

        @NameInMap("selfDirectedScriptFullContent")
        public String selfDirectedScriptFullContent;

        public static RealTimeDialogResponseBodyChoicesDelta build(java.util.Map<String, ?> map) throws Exception {
            RealTimeDialogResponseBodyChoicesDelta self = new RealTimeDialogResponseBodyChoicesDelta();
            return TeaModel.build(map, self);
        }

        public RealTimeDialogResponseBodyChoicesDelta setAnalysisProcess(String analysisProcess) {
            this.analysisProcess = analysisProcess;
            return this;
        }
        public String getAnalysisProcess() {
            return this.analysisProcess;
        }

        public RealTimeDialogResponseBodyChoicesDelta setCallTime(String callTime) {
            this.callTime = callTime;
            return this;
        }
        public String getCallTime() {
            return this.callTime;
        }

        public RealTimeDialogResponseBodyChoicesDelta setHangUpDialog(Boolean hangUpDialog) {
            this.hangUpDialog = hangUpDialog;
            return this;
        }
        public Boolean getHangUpDialog() {
            return this.hangUpDialog;
        }

        public RealTimeDialogResponseBodyChoicesDelta setIntentionCode(String intentionCode) {
            this.intentionCode = intentionCode;
            return this;
        }
        public String getIntentionCode() {
            return this.intentionCode;
        }

        public RealTimeDialogResponseBodyChoicesDelta setIntentionName(String intentionName) {
            this.intentionName = intentionName;
            return this;
        }
        public String getIntentionName() {
            return this.intentionName;
        }

        public RealTimeDialogResponseBodyChoicesDelta setIntentionScript(String intentionScript) {
            this.intentionScript = intentionScript;
            return this;
        }
        public String getIntentionScript() {
            return this.intentionScript;
        }

        public RealTimeDialogResponseBodyChoicesDelta setRecommendIntention(String recommendIntention) {
            this.recommendIntention = recommendIntention;
            return this;
        }
        public String getRecommendIntention() {
            return this.recommendIntention;
        }

        public RealTimeDialogResponseBodyChoicesDelta setRecommendScript(String recommendScript) {
            this.recommendScript = recommendScript;
            return this;
        }
        public String getRecommendScript() {
            return this.recommendScript;
        }

        public RealTimeDialogResponseBodyChoicesDelta setSelfDirectedScript(String selfDirectedScript) {
            this.selfDirectedScript = selfDirectedScript;
            return this;
        }
        public String getSelfDirectedScript() {
            return this.selfDirectedScript;
        }

        public RealTimeDialogResponseBodyChoicesDelta setSelfDirectedScriptFullContent(String selfDirectedScriptFullContent) {
            this.selfDirectedScriptFullContent = selfDirectedScriptFullContent;
            return this;
        }
        public String getSelfDirectedScriptFullContent() {
            return this.selfDirectedScriptFullContent;
        }

    }

    public static class RealTimeDialogResponseBodyChoicesMessage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("analysisProcess")
        public String analysisProcess;

        /**
         * <p>time</p>
         * 
         * <strong>example:</strong>
         * <p>1735139569523</p>
         */
        @NameInMap("callTime")
        public String callTime;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("hangUpDialog")
        public Boolean hangUpDialog;

        /**
         * <strong>example:</strong>
         * <p>1853360771162058752</p>
         */
        @NameInMap("intentionCode")
        public String intentionCode;

        @NameInMap("intentionName")
        public String intentionName;

        @NameInMap("intentionScript")
        public String intentionScript;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("recommendIntention")
        public String recommendIntention;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("recommendScript")
        public String recommendScript;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("selfDirectedScript")
        public String selfDirectedScript;

        @NameInMap("selfDirectedScriptFullContent")
        public String selfDirectedScriptFullContent;

        public static RealTimeDialogResponseBodyChoicesMessage build(java.util.Map<String, ?> map) throws Exception {
            RealTimeDialogResponseBodyChoicesMessage self = new RealTimeDialogResponseBodyChoicesMessage();
            return TeaModel.build(map, self);
        }

        public RealTimeDialogResponseBodyChoicesMessage setAnalysisProcess(String analysisProcess) {
            this.analysisProcess = analysisProcess;
            return this;
        }
        public String getAnalysisProcess() {
            return this.analysisProcess;
        }

        public RealTimeDialogResponseBodyChoicesMessage setCallTime(String callTime) {
            this.callTime = callTime;
            return this;
        }
        public String getCallTime() {
            return this.callTime;
        }

        public RealTimeDialogResponseBodyChoicesMessage setHangUpDialog(Boolean hangUpDialog) {
            this.hangUpDialog = hangUpDialog;
            return this;
        }
        public Boolean getHangUpDialog() {
            return this.hangUpDialog;
        }

        public RealTimeDialogResponseBodyChoicesMessage setIntentionCode(String intentionCode) {
            this.intentionCode = intentionCode;
            return this;
        }
        public String getIntentionCode() {
            return this.intentionCode;
        }

        public RealTimeDialogResponseBodyChoicesMessage setIntentionName(String intentionName) {
            this.intentionName = intentionName;
            return this;
        }
        public String getIntentionName() {
            return this.intentionName;
        }

        public RealTimeDialogResponseBodyChoicesMessage setIntentionScript(String intentionScript) {
            this.intentionScript = intentionScript;
            return this;
        }
        public String getIntentionScript() {
            return this.intentionScript;
        }

        public RealTimeDialogResponseBodyChoicesMessage setRecommendIntention(String recommendIntention) {
            this.recommendIntention = recommendIntention;
            return this;
        }
        public String getRecommendIntention() {
            return this.recommendIntention;
        }

        public RealTimeDialogResponseBodyChoicesMessage setRecommendScript(String recommendScript) {
            this.recommendScript = recommendScript;
            return this;
        }
        public String getRecommendScript() {
            return this.recommendScript;
        }

        public RealTimeDialogResponseBodyChoicesMessage setSelfDirectedScript(String selfDirectedScript) {
            this.selfDirectedScript = selfDirectedScript;
            return this;
        }
        public String getSelfDirectedScript() {
            return this.selfDirectedScript;
        }

        public RealTimeDialogResponseBodyChoicesMessage setSelfDirectedScriptFullContent(String selfDirectedScriptFullContent) {
            this.selfDirectedScriptFullContent = selfDirectedScriptFullContent;
            return this;
        }
        public String getSelfDirectedScriptFullContent() {
            return this.selfDirectedScriptFullContent;
        }

    }

    public static class RealTimeDialogResponseBodyChoices extends TeaModel {
        @NameInMap("delta")
        public RealTimeDialogResponseBodyChoicesDelta delta;

        /**
         * <strong>example:</strong>
         * <p>stop</p>
         */
        @NameInMap("finishReason")
        public String finishReason;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("index")
        public Integer index;

        @NameInMap("message")
        public RealTimeDialogResponseBodyChoicesMessage message;

        public static RealTimeDialogResponseBodyChoices build(java.util.Map<String, ?> map) throws Exception {
            RealTimeDialogResponseBodyChoices self = new RealTimeDialogResponseBodyChoices();
            return TeaModel.build(map, self);
        }

        public RealTimeDialogResponseBodyChoices setDelta(RealTimeDialogResponseBodyChoicesDelta delta) {
            this.delta = delta;
            return this;
        }
        public RealTimeDialogResponseBodyChoicesDelta getDelta() {
            return this.delta;
        }

        public RealTimeDialogResponseBodyChoices setFinishReason(String finishReason) {
            this.finishReason = finishReason;
            return this;
        }
        public String getFinishReason() {
            return this.finishReason;
        }

        public RealTimeDialogResponseBodyChoices setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public RealTimeDialogResponseBodyChoices setMessage(RealTimeDialogResponseBodyChoicesMessage message) {
            this.message = message;
            return this;
        }
        public RealTimeDialogResponseBodyChoicesMessage getMessage() {
            return this.message;
        }

    }

}
