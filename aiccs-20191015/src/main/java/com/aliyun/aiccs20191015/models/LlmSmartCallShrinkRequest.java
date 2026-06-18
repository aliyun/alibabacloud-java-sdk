// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class LlmSmartCallShrinkRequest extends TeaModel {
    /**
     * <p>LLM application code. View it in the <a href="https://aiccs.console.aliyun.com/engine/llmApp">Application Management</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>F32******</p>
     */
    @NameInMap("ApplicationCode")
    public String applicationCode;

    /**
     * <p>Business parameters. These parameters are passed to the customer model when invoking the customer model.</p>
     * 
     * <strong>example:</strong>
     * <p>biz_params = {
     *   &quot;user_prompt_params&quot;: &quot;{\&quot;city\&quot;:\&quot;北京\&quot;}&quot;
     * }</p>
     */
    @NameInMap("BizParam")
    public String bizParamShrink;

    /**
     * <p>Called number that receives the intelligent outbound call.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>137****0000</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>Caller number. This parameter is required and supports only numbers from the Chinese mainland. View available numbers in the Voice Service <a href="https://dyvmsnext.console.aliyun.com/number/list/normal">Number Management</a> interface.</p>
     * 
     * <strong>example:</strong>
     * <p>132****2054</p>
     */
    @NameInMap("CallerNumber")
    public String callerNumber;

    /**
     * <p>Customer-provided ingest endpoint encoding.</p>
     * <blockquote>
     * <ul>
     * <li>If you use your own line, contact Alibaba Cloud support to enable this feature.</li>
     * <li>The line encoding is provided by Alibaba Cloud support. Do not set this parameter if you do not have one.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SELF_xxxxx_A_NET</p>
     */
    @NameInMap("CustomerLineCode")
    public String customerLineCode;

    /**
     * <p>The extension number of the X number, up to 5 digits.</p>
     * <blockquote>
     * <p>Notice: Fill this field only in AXN extension mode. If no extension number exists, do not fill it.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Extension")
    public String extension;

    /**
     * <p>An ID reserved for the caller. This ID will be returned to the caller through a receipt message. Length: 1–15 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>222356****</p>
     */
    @NameInMap("OutId")
    public String outId;

    /**
     * <p>Prompt variable. Go to the <a href="https://aiccs.console.aliyun.com/engine/llmApp">Application Management</a> interface and click Details to view the prompt variables you created.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;style&quot;: &quot;温柔&quot;
     * }</p>
     */
    @NameInMap("PromptParam")
    public String promptParamShrink;

    /**
     * <p>Maximum call duration. The call is automatically disconnected after timeout. Unit: seconds.</p>
     * <blockquote>
     * <ul>
     * <li>Maximum value: 3600 s.</li>
     * <li>Minimum value: 600 s.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1200</p>
     */
    @NameInMap("SessionTimeout")
    public Integer sessionTimeout;

    /**
     * <p>Start-word variables. Go to the <a href="https://aiccs.console.aliyun.com/engine/llmApp">LLM Application Management</a> interface and click Details to view the start-word variables of your created LLM application.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;name&quot;: &quot;小明&quot;,
     *   &quot;address&quot;: &quot;浙江省杭州市&quot;
     * }</p>
     */
    @NameInMap("StartWordParam")
    public String startWordParamShrink;

    /**
     * <p>Voice speed during TTS playback.</p>
     * <blockquote>
     * <ul>
     * <li>Value range: -200 to 200. Default value is 0.</li>
     * <li>If this parameter is not set, the voice speed configured in the LLM application is used by default.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TtsSpeed")
    public Integer ttsSpeed;

    /**
     * <p>The voice code used for TTS playback.</p>
     * <blockquote>
     * <ul>
     * <li>If no value is set, the voice code configured in the LLM application is used by default.</li>
     * <li>You can use the <a href="https://help.aliyun.com/document_detail/2926668.html">ListAvailableTts</a> API to view all available voice codes.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>V65******</p>
     */
    @NameInMap("TtsVoiceCode")
    public String ttsVoiceCode;

    /**
     * <p>The volume for TTS playback.</p>
     * <blockquote>
     * <ul>
     * <li>Value range: 0–100. Default value is 0.</li>
     * <li>If no value is set, the volume configured in the LLM application is used by default.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TtsVolume")
    public Integer ttsVolume;

    public static LlmSmartCallShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        LlmSmartCallShrinkRequest self = new LlmSmartCallShrinkRequest();
        return TeaModel.build(map, self);
    }

    public LlmSmartCallShrinkRequest setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
        return this;
    }
    public String getApplicationCode() {
        return this.applicationCode;
    }

    public LlmSmartCallShrinkRequest setBizParamShrink(String bizParamShrink) {
        this.bizParamShrink = bizParamShrink;
        return this;
    }
    public String getBizParamShrink() {
        return this.bizParamShrink;
    }

    public LlmSmartCallShrinkRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public LlmSmartCallShrinkRequest setCallerNumber(String callerNumber) {
        this.callerNumber = callerNumber;
        return this;
    }
    public String getCallerNumber() {
        return this.callerNumber;
    }

    public LlmSmartCallShrinkRequest setCustomerLineCode(String customerLineCode) {
        this.customerLineCode = customerLineCode;
        return this;
    }
    public String getCustomerLineCode() {
        return this.customerLineCode;
    }

    public LlmSmartCallShrinkRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public LlmSmartCallShrinkRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public LlmSmartCallShrinkRequest setPromptParamShrink(String promptParamShrink) {
        this.promptParamShrink = promptParamShrink;
        return this;
    }
    public String getPromptParamShrink() {
        return this.promptParamShrink;
    }

    public LlmSmartCallShrinkRequest setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
        return this;
    }
    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    public LlmSmartCallShrinkRequest setStartWordParamShrink(String startWordParamShrink) {
        this.startWordParamShrink = startWordParamShrink;
        return this;
    }
    public String getStartWordParamShrink() {
        return this.startWordParamShrink;
    }

    public LlmSmartCallShrinkRequest setTtsSpeed(Integer ttsSpeed) {
        this.ttsSpeed = ttsSpeed;
        return this;
    }
    public Integer getTtsSpeed() {
        return this.ttsSpeed;
    }

    public LlmSmartCallShrinkRequest setTtsVoiceCode(String ttsVoiceCode) {
        this.ttsVoiceCode = ttsVoiceCode;
        return this;
    }
    public String getTtsVoiceCode() {
        return this.ttsVoiceCode;
    }

    public LlmSmartCallShrinkRequest setTtsVolume(Integer ttsVolume) {
        this.ttsVolume = ttsVolume;
        return this;
    }
    public Integer getTtsVolume() {
        return this.ttsVolume;
    }

}
