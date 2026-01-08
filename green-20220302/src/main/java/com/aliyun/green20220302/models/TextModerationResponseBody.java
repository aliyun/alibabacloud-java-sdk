// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class TextModerationResponseBody extends TeaModel {
    /**
     * <p>The returned HTTP status code.</p>
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
    public TextModerationResponseBodyData data;

    /**
     * <p>The message that is returned in response to the request.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TextModerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TextModerationResponseBody self = new TextModerationResponseBody();
        return TeaModel.build(map, self);
    }

    public TextModerationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public TextModerationResponseBody setData(TextModerationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TextModerationResponseBodyData getData() {
        return this.data;
    }

    public TextModerationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TextModerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TextModerationResponseBodyDataExtLlmContent extends TeaModel {
        @NameInMap("outputText")
        public String outputText;

        public static TextModerationResponseBodyDataExtLlmContent build(java.util.Map<String, ?> map) throws Exception {
            TextModerationResponseBodyDataExtLlmContent self = new TextModerationResponseBodyDataExtLlmContent();
            return TeaModel.build(map, self);
        }

        public TextModerationResponseBodyDataExtLlmContent setOutputText(String outputText) {
            this.outputText = outputText;
            return this;
        }
        public String getOutputText() {
            return this.outputText;
        }

    }

    public static class TextModerationResponseBodyDataExt extends TeaModel {
        @NameInMap("llmContent")
        public TextModerationResponseBodyDataExtLlmContent llmContent;

        public static TextModerationResponseBodyDataExt build(java.util.Map<String, ?> map) throws Exception {
            TextModerationResponseBodyDataExt self = new TextModerationResponseBodyDataExt();
            return TeaModel.build(map, self);
        }

        public TextModerationResponseBodyDataExt setLlmContent(TextModerationResponseBodyDataExtLlmContent llmContent) {
            this.llmContent = llmContent;
            return this;
        }
        public TextModerationResponseBodyDataExtLlmContent getLlmContent() {
            return this.llmContent;
        }

    }

    public static class TextModerationResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("accountId")
        public String accountId;

        /**
         * <p>The ID of the moderated object.</p>
         * 
         * <strong>example:</strong>
         * <p>text1234</p>
         */
        @NameInMap("dataId")
        public String dataId;

        /**
         * <p>The description of the labels.</p>
         * 
         * <strong>example:</strong>
         * <p>no risk</p>
         */
        @NameInMap("descriptions")
        public String descriptions;

        /**
         * <p>The device ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("deviceId")
        public String deviceId;

        @NameInMap("ext")
        public TextModerationResponseBodyDataExt ext;

        /**
         * <p>The labels. Multiple labels are separated by commas (,). Valid values: ad: ad violation profanity: abuse contraband: contraband sexual_content: pornography violence: violence nonsense: irrigation spam: spam negative_content: undesirable content cyberbullying: cyberbullying C_customized: custom library that is hit</p>
         * 
         * <strong>example:</strong>
         * <p>porn</p>
         */
        @NameInMap("labels")
        public String labels;

        @NameInMap("manualTaskId")
        public String manualTaskId;

        /**
         * <p>The JSON string used to locate the cause. Valid values: riskTips: subcategory label riskWords: risk words adNums: hit advertising number customizedWords: customized words customizedLibs: customized libraries</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;detectedLanguage\&quot;:\&quot;ar\&quot;,\&quot;riskTips\&quot;:\&quot;sexuality_Suggestive\&quot;,\&quot;riskWords\&quot;:\&quot;pxxxxy\&quot;,\&quot;translatedContent\&quot;:\&quot;pxxxxy sxxxx\&quot;}</p>
         */
        @NameInMap("reason")
        public String reason;

        public static TextModerationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TextModerationResponseBodyData self = new TextModerationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TextModerationResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public TextModerationResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public TextModerationResponseBodyData setDescriptions(String descriptions) {
            this.descriptions = descriptions;
            return this;
        }
        public String getDescriptions() {
            return this.descriptions;
        }

        public TextModerationResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public TextModerationResponseBodyData setExt(TextModerationResponseBodyDataExt ext) {
            this.ext = ext;
            return this;
        }
        public TextModerationResponseBodyDataExt getExt() {
            return this.ext;
        }

        public TextModerationResponseBodyData setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public TextModerationResponseBodyData setManualTaskId(String manualTaskId) {
            this.manualTaskId = manualTaskId;
            return this;
        }
        public String getManualTaskId() {
            return this.manualTaskId;
        }

        public TextModerationResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

}
