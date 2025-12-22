// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class TextModerationPlusResponseBody extends TeaModel {
    /**
     * <p>The returned HTTP status code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The moderation results.</p>
     */
    @NameInMap("Data")
    public TextModerationPlusResponseBodyData data;

    /**
     * <p>The message that is returned in response to the request.</p>
     * 
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
         * <p>The answer.</p>
         * 
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        @NameInMap("Answer")
        public String answer;

        /**
         * <p>Hit Label</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("HitLabel")
        public String hitLabel;

        /**
         * <p>Hit Library Name</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
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

    public static class TextModerationPlusResponseBodyDataAttackResult extends TeaModel {
        /**
         * <p>The level of prompt attack</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("AttackLevel")
        public String attackLevel;

        /**
         * <p>The confidence</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>safe</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The label</p>
         * 
         * <strong>example:</strong>
         * <p>safe</p>
         */
        @NameInMap("Label")
        public String label;

        public static TextModerationPlusResponseBodyDataAttackResult build(java.util.Map<String, ?> map) throws Exception {
            TextModerationPlusResponseBodyDataAttackResult self = new TextModerationPlusResponseBodyDataAttackResult();
            return TeaModel.build(map, self);
        }

        public TextModerationPlusResponseBodyDataAttackResult setAttackLevel(String attackLevel) {
            this.attackLevel = attackLevel;
            return this;
        }
        public String getAttackLevel() {
            return this.attackLevel;
        }

        public TextModerationPlusResponseBodyDataAttackResult setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public TextModerationPlusResponseBodyDataAttackResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TextModerationPlusResponseBodyDataAttackResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class TextModerationPlusResponseBodyDataResultCustomizedHit extends TeaModel {
        /**
         * <p>The terms that are hit. Multiple terms are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("KeyWords")
        public String keyWords;

        /**
         * <p>The library name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
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
         * <p>The score of the confidence level. Valid values: 0 to 100. The value is accurate to two decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>81.22</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>The custom term hit by the moderated content.</p>
         */
        @NameInMap("CustomizedHit")
        public java.util.List<TextModerationPlusResponseBodyDataResultCustomizedHit> customizedHit;

        /**
         * <p>The description of the label.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The label.</p>
         * 
         * <strong>example:</strong>
         * <p>porn</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The term hit by the moderated content.</p>
         * 
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

        public TextModerationPlusResponseBodyDataResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

    public static class TextModerationPlusResponseBodyDataSensitiveResult extends TeaModel {
        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The label</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The sensitive data.</p>
         */
        @NameInMap("SensitiveData")
        public java.util.List<String> sensitiveData;

        /**
         * <p>The level of sensitivity data</p>
         * 
         * <strong>example:</strong>
         * <p>S1</p>
         */
        @NameInMap("SensitiveLevel")
        public String sensitiveLevel;

        public static TextModerationPlusResponseBodyDataSensitiveResult build(java.util.Map<String, ?> map) throws Exception {
            TextModerationPlusResponseBodyDataSensitiveResult self = new TextModerationPlusResponseBodyDataSensitiveResult();
            return TeaModel.build(map, self);
        }

        public TextModerationPlusResponseBodyDataSensitiveResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TextModerationPlusResponseBodyDataSensitiveResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public TextModerationPlusResponseBodyDataSensitiveResult setSensitiveData(java.util.List<String> sensitiveData) {
            this.sensitiveData = sensitiveData;
            return this;
        }
        public java.util.List<String> getSensitiveData() {
            return this.sensitiveData;
        }

        public TextModerationPlusResponseBodyDataSensitiveResult setSensitiveLevel(String sensitiveLevel) {
            this.sensitiveLevel = sensitiveLevel;
            return this;
        }
        public String getSensitiveLevel() {
            return this.sensitiveLevel;
        }

    }

    public static class TextModerationPlusResponseBodyData extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The suggestion.</p>
         */
        @NameInMap("Advice")
        public java.util.List<TextModerationPlusResponseBodyDataAdvice> advice;

        /**
         * <p>The level of prompt attack</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("AttackLevel")
        public String attackLevel;

        /**
         * <p>The result of prompt attack detect</p>
         */
        @NameInMap("AttackResult")
        public java.util.List<TextModerationPlusResponseBodyDataAttackResult> attackResult;

        /**
         * <p>The id of data</p>
         * 
         * <strong>example:</strong>
         * <p>text1234</p>
         */
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("DetectedLanguage")
        public String detectedLanguage;

        @NameInMap("ManualTaskId")
        public String manualTaskId;

        /**
         * <p>The results.</p>
         */
        @NameInMap("Result")
        public java.util.List<TextModerationPlusResponseBodyDataResult> result;

        /**
         * <p>Risk Level</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The score.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Score")
        public Float score;

        /**
         * <p>The level of sensitivity data</p>
         * 
         * <strong>example:</strong>
         * <p>S0</p>
         */
        @NameInMap("SensitiveLevel")
        public String sensitiveLevel;

        /**
         * <p>The result of sensitivity data detect</p>
         */
        @NameInMap("SensitiveResult")
        public java.util.List<TextModerationPlusResponseBodyDataSensitiveResult> sensitiveResult;

        @NameInMap("TranslatedContent")
        public String translatedContent;

        public static TextModerationPlusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TextModerationPlusResponseBodyData self = new TextModerationPlusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TextModerationPlusResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public TextModerationPlusResponseBodyData setAdvice(java.util.List<TextModerationPlusResponseBodyDataAdvice> advice) {
            this.advice = advice;
            return this;
        }
        public java.util.List<TextModerationPlusResponseBodyDataAdvice> getAdvice() {
            return this.advice;
        }

        public TextModerationPlusResponseBodyData setAttackLevel(String attackLevel) {
            this.attackLevel = attackLevel;
            return this;
        }
        public String getAttackLevel() {
            return this.attackLevel;
        }

        public TextModerationPlusResponseBodyData setAttackResult(java.util.List<TextModerationPlusResponseBodyDataAttackResult> attackResult) {
            this.attackResult = attackResult;
            return this;
        }
        public java.util.List<TextModerationPlusResponseBodyDataAttackResult> getAttackResult() {
            return this.attackResult;
        }

        public TextModerationPlusResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public TextModerationPlusResponseBodyData setDetectedLanguage(String detectedLanguage) {
            this.detectedLanguage = detectedLanguage;
            return this;
        }
        public String getDetectedLanguage() {
            return this.detectedLanguage;
        }

        public TextModerationPlusResponseBodyData setManualTaskId(String manualTaskId) {
            this.manualTaskId = manualTaskId;
            return this;
        }
        public String getManualTaskId() {
            return this.manualTaskId;
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

        public TextModerationPlusResponseBodyData setSensitiveLevel(String sensitiveLevel) {
            this.sensitiveLevel = sensitiveLevel;
            return this;
        }
        public String getSensitiveLevel() {
            return this.sensitiveLevel;
        }

        public TextModerationPlusResponseBodyData setSensitiveResult(java.util.List<TextModerationPlusResponseBodyDataSensitiveResult> sensitiveResult) {
            this.sensitiveResult = sensitiveResult;
            return this;
        }
        public java.util.List<TextModerationPlusResponseBodyDataSensitiveResult> getSensitiveResult() {
            return this.sensitiveResult;
        }

        public TextModerationPlusResponseBodyData setTranslatedContent(String translatedContent) {
            this.translatedContent = translatedContent;
            return this;
        }
        public String getTranslatedContent() {
            return this.translatedContent;
        }

    }

}
