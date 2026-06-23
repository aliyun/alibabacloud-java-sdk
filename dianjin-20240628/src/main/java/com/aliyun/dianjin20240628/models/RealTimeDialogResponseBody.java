// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RealTimeDialogResponseBody extends TeaModel {
    /**
     * <p>An array of generated content. It can contain one or more choice objects.</p>
     */
    @NameInMap("choices")
    public java.util.List<RealTimeDialogResponseBodyChoices> choices;

    /**
     * <p>The timestamp when this request was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1735139569523</p>
     */
    @NameInMap("created")
    public String created;

    /**
     * <p>The unique identifier for this call. Each chunk object has the same ID.</p>
     * 
     * <strong>example:</strong>
     * <p>eb2b6139-ddf1-91a0-a47f-df7617ae9032</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5E3FBAF1-17AF-53B7-AF0A-CDCEEB6DE658</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
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
         * <p>The analysis process.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("analysisProcess")
        public String analysisProcess;

        /**
         * <p>The time.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("callTime")
        public String callTime;

        /**
         * <p>Hangs up the dialog.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("hangUpDialog")
        public Boolean hangUpDialog;

        /**
         * <p>The intent code.</p>
         * 
         * <strong>example:</strong>
         * <p>1853360771162058752</p>
         */
        @NameInMap("intentionCode")
        public String intentionCode;

        /**
         * <p>The intent name.</p>
         * 
         * <strong>example:</strong>
         * <p>其他</p>
         */
        @NameInMap("intentionName")
        public String intentionName;

        /**
         * <p>The intent script.</p>
         * 
         * <strong>example:</strong>
         * <p>抱歉，我没有明白您的意思，或者您可以拨打我们的客服热线，请客服人员为您解答。</p>
         */
        @NameInMap("intentionScript")
        public String intentionScript;

        /**
         * <p>Specifies whether the conversation was interrupted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("interrupt")
        public Boolean interrupt;

        /**
         * <p>The recommended intent.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("recommendIntention")
        public String recommendIntention;

        /**
         * <p>The recommended script.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("recommendScript")
        public String recommendScript;

        /**
         * <p>The script for the Q\&amp;A pair. This is incremental data.</p>
         * 
         * <strong>example:</strong>
         * <p>话题</p>
         */
        @NameInMap("selfDirectedScript")
        public String selfDirectedScript;

        /**
         * <p>The script for the Q\&amp;A pair. This is the full data.</p>
         * 
         * <strong>example:</strong>
         * <p>关于宇宙的大小，这是一个非常深奥的科学话题</p>
         */
        @NameInMap("selfDirectedScriptFullContent")
        public String selfDirectedScriptFullContent;

        /**
         * <p>Specifies whether to skip the current recognition.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("skipCurrentRecognize")
        public Boolean skipCurrentRecognize;

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

        public RealTimeDialogResponseBodyChoicesDelta setInterrupt(Boolean interrupt) {
            this.interrupt = interrupt;
            return this;
        }
        public Boolean getInterrupt() {
            return this.interrupt;
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

        public RealTimeDialogResponseBodyChoicesDelta setSkipCurrentRecognize(Boolean skipCurrentRecognize) {
            this.skipCurrentRecognize = skipCurrentRecognize;
            return this;
        }
        public Boolean getSkipCurrentRecognize() {
            return this.skipCurrentRecognize;
        }

    }

    public static class RealTimeDialogResponseBodyChoicesMessage extends TeaModel {
        /**
         * <p>The analysis process.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("analysisProcess")
        public String analysisProcess;

        /**
         * <p>The time.</p>
         * 
         * <strong>example:</strong>
         * <p>1735139569523</p>
         */
        @NameInMap("callTime")
        public String callTime;

        /**
         * <p>Hang up the dialog.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("hangUpDialog")
        public Boolean hangUpDialog;

        /**
         * <p>The intent code.</p>
         * 
         * <strong>example:</strong>
         * <p>1853360771162058752</p>
         */
        @NameInMap("intentionCode")
        public String intentionCode;

        /**
         * <p>The intent name.</p>
         * 
         * <strong>example:</strong>
         * <p>其它</p>
         */
        @NameInMap("intentionName")
        public String intentionName;

        /**
         * <p>The intent script.</p>
         * 
         * <strong>example:</strong>
         * <p>抱歉，我没有明白您的意思，或者您可以拨打我们的客服热线，请客服人员为您解答。</p>
         */
        @NameInMap("intentionScript")
        public String intentionScript;

        /**
         * <p>Specifies whether the conversation was interrupted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("interrupt")
        public Boolean interrupt;

        /**
         * <p>The recommended intent.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("recommendIntention")
        public String recommendIntention;

        /**
         * <p>The recommended script.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("recommendScript")
        public String recommendScript;

        /**
         * <p>The script for the Q\&amp;A pair. This is incremental data. This is empty for streaming responses.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("selfDirectedScript")
        public String selfDirectedScript;

        /**
         * <p>The script for the Q\&amp;A pair. This is the full data.</p>
         * 
         * <strong>example:</strong>
         * <p>关于宇宙的大小，这是一个非常深奥的科学话题</p>
         */
        @NameInMap("selfDirectedScriptFullContent")
        public String selfDirectedScriptFullContent;

        /**
         * <p>Specifies whether to skip the current recognition.</p>
         */
        @NameInMap("skipCurrentRecognize")
        public Boolean skipCurrentRecognize;

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

        public RealTimeDialogResponseBodyChoicesMessage setInterrupt(Boolean interrupt) {
            this.interrupt = interrupt;
            return this;
        }
        public Boolean getInterrupt() {
            return this.interrupt;
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

        public RealTimeDialogResponseBodyChoicesMessage setSkipCurrentRecognize(Boolean skipCurrentRecognize) {
            this.skipCurrentRecognize = skipCurrentRecognize;
            return this;
        }
        public Boolean getSkipCurrentRecognize() {
            return this.skipCurrentRecognize;
        }

    }

    public static class RealTimeDialogResponseBodyChoices extends TeaModel {
        /**
         * <p>The incremental result returned for streaming responses. This is empty for non-streaming responses.</p>
         */
        @NameInMap("delta")
        public RealTimeDialogResponseBodyChoicesDelta delta;

        /**
         * <p>The value is \<code>stop\\</code> if the session ends. The value is \<code>null\\</code> if the session is in progress. If \<code>success\\</code> is \<code>false\\</code>, this parameter returns an error message.</p>
         * 
         * <strong>example:</strong>
         * <p>stop</p>
         */
        @NameInMap("finishReason")
        public String finishReason;

        /**
         * <p>The sequence number in the choices list.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("index")
        public Integer index;

        /**
         * <p>The full result returned for non-streaming responses. This is empty for streaming responses.</p>
         */
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
