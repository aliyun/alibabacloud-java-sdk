// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class TextModerationPlusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public TextModerationPlusResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TextModerationPlusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TextModerationPlusResponseBody self = new TextModerationPlusResponseBody();
        return TeaModel.build(map, self);
    }

    public TextModerationPlusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public TextModerationPlusResponseBody setData(TextModerationPlusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TextModerationPlusResponseBodyData getData() {
        return this.data;
    }

    public TextModerationPlusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TextModerationPlusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TextModerationPlusResponseBodyDataAdvice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        @NameInMap("Answer")
        public String answer;

        @NameInMap("HitLabel")
        public String hitLabel;

        @NameInMap("HitLibName")
        public String hitLibName;

        public static TextModerationPlusResponseBodyDataAdvice build(java.util.Map<String, ?> map) throws Exception {
            TextModerationPlusResponseBodyDataAdvice self = new TextModerationPlusResponseBodyDataAdvice();
            return TeaModel.build(map, self);
        }

        public TextModerationPlusResponseBodyDataAdvice setAnswer(String answer) {
            this.answer = answer;
            return this;
        }
        public String getAnswer() {
            return this.answer;
        }

        public TextModerationPlusResponseBodyDataAdvice setHitLabel(String hitLabel) {
            this.hitLabel = hitLabel;
            return this;
        }
        public String getHitLabel() {
            return this.hitLabel;
        }

        public TextModerationPlusResponseBodyDataAdvice setHitLibName(String hitLibName) {
            this.hitLibName = hitLibName;
            return this;
        }
        public String getHitLibName() {
            return this.hitLibName;
        }

    }

    public static class TextModerationPlusResponseBodyDataResultCustomizedHit extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("KeyWords")
        public String keyWords;

        @NameInMap("LibName")
        public String libName;

        public static TextModerationPlusResponseBodyDataResultCustomizedHit build(java.util.Map<String, ?> map) throws Exception {
            TextModerationPlusResponseBodyDataResultCustomizedHit self = new TextModerationPlusResponseBodyDataResultCustomizedHit();
            return TeaModel.build(map, self);
        }

        public TextModerationPlusResponseBodyDataResultCustomizedHit setKeyWords(String keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public String getKeyWords() {
            return this.keyWords;
        }

        public TextModerationPlusResponseBodyDataResultCustomizedHit setLibName(String libName) {
            this.libName = libName;
            return this;
        }
        public String getLibName() {
            return this.libName;
        }

    }

    public static class TextModerationPlusResponseBodyDataResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>81.22</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("CustomizedHit")
        public java.util.List<TextModerationPlusResponseBodyDataResultCustomizedHit> customizedHit;

        /**
         * <strong>example:</strong>
         * <p>porn</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        @NameInMap("RiskWords")
        public String riskWords;

        public static TextModerationPlusResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            TextModerationPlusResponseBodyDataResult self = new TextModerationPlusResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public TextModerationPlusResponseBodyDataResult setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public TextModerationPlusResponseBodyDataResult setCustomizedHit(java.util.List<TextModerationPlusResponseBodyDataResultCustomizedHit> customizedHit) {
            this.customizedHit = customizedHit;
            return this;
        }
        public java.util.List<TextModerationPlusResponseBodyDataResultCustomizedHit> getCustomizedHit() {
            return this.customizedHit;
        }

        public TextModerationPlusResponseBodyDataResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public TextModerationPlusResponseBodyDataResult setRiskWords(String riskWords) {
            this.riskWords = riskWords;
            return this;
        }
        public String getRiskWords() {
            return this.riskWords;
        }

    }

    public static class TextModerationPlusResponseBodyData extends TeaModel {
        @NameInMap("Advice")
        public java.util.List<TextModerationPlusResponseBodyDataAdvice> advice;

        @NameInMap("Result")
        public java.util.List<TextModerationPlusResponseBodyDataResult> result;

        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Score")
        public Float score;

        public static TextModerationPlusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TextModerationPlusResponseBodyData self = new TextModerationPlusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TextModerationPlusResponseBodyData setAdvice(java.util.List<TextModerationPlusResponseBodyDataAdvice> advice) {
            this.advice = advice;
            return this;
        }
        public java.util.List<TextModerationPlusResponseBodyDataAdvice> getAdvice() {
            return this.advice;
        }

        public TextModerationPlusResponseBodyData setResult(java.util.List<TextModerationPlusResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<TextModerationPlusResponseBodyDataResult> getResult() {
            return this.result;
        }

        public TextModerationPlusResponseBodyData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public TextModerationPlusResponseBodyData setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

}
