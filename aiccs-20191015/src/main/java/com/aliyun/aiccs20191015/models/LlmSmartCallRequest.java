// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class LlmSmartCallRequest extends TeaModel {
    /**
     * <p>The code of the large language model application. You can view the code on the <a href="https://aiccs.console.aliyun.com/engine/llmApp">Large Language Model Application Management</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>F32******</p>
     */
    @NameInMap("ApplicationCode")
    public String applicationCode;

    /**
     * <p>The custom business parameters. When you call this API operation, you can pass custom parameters to the large language model gateway. When the large language model gateway requests the customer model, this parameter is passed to the customer model.</p>
     * <ul>
     * <li><p><a href="https://www.alibabacloud.com/help/en/model-studio/invoke-workflow-application/#6e644d5a7b3ia">Model Studio workflow application: Parameter passing</a>. Example: <code>biz_params = {&quot;city&quot;: &quot;Hangzhou&quot;}</code></p>
     * </li>
     * <li><p><a href="https://www.alibabacloud.com/help/en/model-studio/call-single-agent-application/#b774db7cdc0aa">Model Studio agent application: Pass custom parameters</a>. Example:
     * <code>biz_params = { &quot;user_prompt_params&quot;: &quot;{\&quot;city\&quot;:\&quot;Beijing\&quot;}&quot; }</code></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>biz_params = {
     *   &quot;user_prompt_params&quot;: &quot;{&quot;city&quot;:&quot;Beijing&quot;}&quot;
     * }</p>
     */
    @NameInMap("BizParam")
    public java.util.Map<String, ?> bizParam;

    /**
     * <p>The called number that receives the intelligent outbound call.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>137****0000</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>The caller number. This parameter is required and supports only numbers in the Chinese mainland. Go to the <a href="https://dyvmsnext.console.aliyun.com/number/list/normal">Real Number Management</a> page of Voice Service to view the number.</p>
     * <blockquote>
     * <ul>
     * <li>If you use a self-managed line, you must pass the number of the self-managed line.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>132****2054</p>
     */
    @NameInMap("CallerNumber")
    public String callerNumber;

    /**
     * <p>The code of the self-managed line.</p>
     * <blockquote>
     * <ul>
     * <li>If you need to use a self-managed line, contact operations to enable this feature. After the self-managed line is approved, the line code is returned. If no line code is returned, do not specify this parameter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SELF_xxxxx_A_NET</p>
     */
    @NameInMap("CustomerLineCode")
    public String customerLineCode;

    /**
     * <p>The extension number of the X number. The extension number cannot exceed 5 digits.</p>
     * <blockquote>
     * <p>Notice: This parameter is required only in AXN extension number mode. If no extension number exists, do not specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Extension")
    public String extension;

    /**
     * <p>The ID reserved for the caller. This ID is returned to the caller in the receipt message. When the large language model gateway requests the customer model, this parameter is passed to the customer model. The length is 1 to 15 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>222356****</p>
     */
    @NameInMap("OutId")
    public String outId;

    /**
     * <p>The prompt variables. Go to the <a href="https://aiccs.console.aliyun.com/engine/llmApp">Large Language Model Application Management</a> page and click Details to view the prompt variables of the large language model application that you created.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;style&quot;: &quot;gentle&quot;
     * }</p>
     */
    @NameInMap("PromptParam")
    public java.util.Map<String, ?> promptParam;

    /**
     * <p>The maximum call duration. The call is automatically disconnected after the timeout period. Unit: seconds.</p>
     * <blockquote>
     * <ul>
     * <li>Maximum value: 3600.</li>
     * <li>Minimum value: 600.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1200</p>
     */
    @NameInMap("SessionTimeout")
    public Integer sessionTimeout;

    /**
     * <p>The opening remark variables. Go to the <a href="https://aiccs.console.aliyun.com/engine/llmApp">Large Language Model Application Management</a> page and click Details to view the opening remark variables of the large language model application that you created.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;name&quot;: &quot;Xiaoming&quot;,
     *   &quot;address&quot;: &quot;Hangzhou, Zhejiang&quot;
     * }</p>
     */
    @NameInMap("StartWordParam")
    public java.util.Map<String, ?> startWordParam;

    /**
     * <p>The speech rate for TTS playback.</p>
     * <blockquote>
     * <ul>
     * <li>Valid values: -200 to 200. Default value: 0.</li>
     * <li>If you do not specify this parameter, the speech rate configured for the large language model application is used by default.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TtsSpeed")
    public Integer ttsSpeed;

    /**
     * <p>The voice code for text-to-speech (TTS) playback.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not specify this parameter, the voice code configured for the large language model application is used by default.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/2926668.html">ListAvailableTts</a> API operation to query all voice codes.</li>
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
     * <li>Valid values: 0 to 100. Default value: 0.</li>
     * <li>If you do not specify this parameter, the volume configured for the large language model application is used by default.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TtsVolume")
    public Integer ttsVolume;

    public static LlmSmartCallRequest build(java.util.Map<String, ?> map) throws Exception {
        LlmSmartCallRequest self = new LlmSmartCallRequest();
        return TeaModel.build(map, self);
    }

    public LlmSmartCallRequest setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
        return this;
    }
    public String getApplicationCode() {
        return this.applicationCode;
    }

    public LlmSmartCallRequest setBizParam(java.util.Map<String, ?> bizParam) {
        this.bizParam = bizParam;
        return this;
    }
    public java.util.Map<String, ?> getBizParam() {
        return this.bizParam;
    }

    public LlmSmartCallRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public LlmSmartCallRequest setCallerNumber(String callerNumber) {
        this.callerNumber = callerNumber;
        return this;
    }
    public String getCallerNumber() {
        return this.callerNumber;
    }

    public LlmSmartCallRequest setCustomerLineCode(String customerLineCode) {
        this.customerLineCode = customerLineCode;
        return this;
    }
    public String getCustomerLineCode() {
        return this.customerLineCode;
    }

    public LlmSmartCallRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public LlmSmartCallRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public LlmSmartCallRequest setPromptParam(java.util.Map<String, ?> promptParam) {
        this.promptParam = promptParam;
        return this;
    }
    public java.util.Map<String, ?> getPromptParam() {
        return this.promptParam;
    }

    public LlmSmartCallRequest setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
        return this;
    }
    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    public LlmSmartCallRequest setStartWordParam(java.util.Map<String, ?> startWordParam) {
        this.startWordParam = startWordParam;
        return this;
    }
    public java.util.Map<String, ?> getStartWordParam() {
        return this.startWordParam;
    }

    public LlmSmartCallRequest setTtsSpeed(Integer ttsSpeed) {
        this.ttsSpeed = ttsSpeed;
        return this;
    }
    public Integer getTtsSpeed() {
        return this.ttsSpeed;
    }

    public LlmSmartCallRequest setTtsVoiceCode(String ttsVoiceCode) {
        this.ttsVoiceCode = ttsVoiceCode;
        return this;
    }
    public String getTtsVoiceCode() {
        return this.ttsVoiceCode;
    }

    public LlmSmartCallRequest setTtsVolume(Integer ttsVolume) {
        this.ttsVolume = ttsVolume;
        return this;
    }
    public Integer getTtsVolume() {
        return this.ttsVolume;
    }

}
