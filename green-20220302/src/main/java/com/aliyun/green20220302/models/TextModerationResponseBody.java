// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class TextModerationResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The moderation result data.</p>
     */
    @NameInMap("Data")
    public TextModerationResponseBodyData data;

    /**
     * <p>The response message for the request.</p>
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
        /**
         * <p>The output content.</p>
         * 
         * <strong>example:</strong>
         * <p>正常。文本中无风险内容。</p>
         */
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
        /**
         * <p>The output from the Large Language Model (LLM).</p>
         */
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
         * <p>The \<code>accountId\\</code> specified in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("accountId")
        public String accountId;

        /**
         * <p>The data ID of the moderated object.</p>
         * <blockquote>
         * <p>If you specify the dataId parameter in the request, its value is returned in this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>text1234</p>
         */
        @NameInMap("dataId")
        public String dataId;

        /**
         * <p>The description of the label.</p>
         * 
         * <strong>example:</strong>
         * <p>疑似广告内容</p>
         */
        @NameInMap("descriptions")
        public String descriptions;

        /**
         * <p>The \<code>deviceId\\</code> specified in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("deviceId")
        public String deviceId;

        /**
         * <p>Auxiliary reference information for the text.</p>
         */
        @NameInMap("ext")
        public TextModerationResponseBodyDataExt ext;

        /**
         * <p>The moderation labels. If multiple labels are returned, they are separated by commas (,). Valid values: ad: advertisement profanity: profanity contraband: contraband sexual_content: sexual content violence: violent and terrorist content nonsense: meaningless content spam: spam negative_content: undesirable content cyberbullying: cyberbullying C_customized: A match in a custom library</p>
         * 
         * <strong>example:</strong>
         * <p>porn</p>
         */
        @NameInMap("labels")
        public String labels;

        /**
         * <p>The ID of the manual review task.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx-xxxxx</p>
         */
        @NameInMap("manualTaskId")
        public String manualTaskId;

        /**
         * <p>A JSON string that contains the reason for the moderation result. The string includes the following fields:</p>
         * <ol>
         * <li><p>riskTips: The sub-labels.</p>
         * </li>
         * <li><p>riskWords: The detected risk words.</p>
         * </li>
         * <li><p>adNums: The detected ad-related numbers.</p>
         * </li>
         * <li><p>customizedWords: The detected custom words.</p>
         * </li>
         * <li><p>customizedLibs: The names of the custom libraries that contain a match.</p>
         * </li>
         * <li><p>riskLevel: The risk level, which is recommended by the system. Valid values:</p>
         * </li>
         * </ol>
         * <ul>
         * <li><p>high: high risk</p>
         * </li>
         * <li><p>medium: medium risk</p>
         * </li>
         * <li><p>low: low risk</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;riskLevel\&quot;:\&quot;high\&quot;,\&quot;riskTips\&quot;:\&quot;色情_低俗词\&quot;,\&quot;riskWords\&quot;:\&quot;色情服务\&quot;}</p>
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
