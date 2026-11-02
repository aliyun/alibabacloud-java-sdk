// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSmarttagJobShrinkRequest extends TeaModel {
    /**
     * <p>The description of the video content. It supports Chinese characters, English letters, digits, and hyphens (-). It cannot start with a special character and can be up to 1 KB in length.</p>
     * 
     * <strong>example:</strong>
     * <p>example content ****</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>This parameter is deprecated</p>
     */
    @NameInMap("ContentAddr")
    public String contentAddr;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>This parameter is deprecated</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>input</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>The callback URL. Only HTTP and HTTPS are supported.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/endpoint/aliyun/ai?id=76401125000">https://example.com/endpoint/aliyun/ai?id=76401125000</a>***</p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    /**
     * <p>The additional request parameters, represented as a JSON string. Example: {&quot;needAsrData&quot;:true, &quot;needOcrData&quot;:false}. Field descriptions:</p>
     * <ul>
     * <li><p>needAsrData: a Boolean value that specifies whether to include the original ASR results in the analysis results. Default value: false. Set the value to true to include the original ASR results.</p>
     * </li>
     * <li><p>needOcrData: a Boolean value that specifies whether to include the original OCR results in the analysis results. Default value: false. Set the value to true to include the original OCR results.</p>
     * </li>
     * <li><p>needMetaData: a Boolean value that specifies whether to include metadata in the analysis results. Default value: false. Set the value to true to include metadata.</p>
     * </li>
     * <li><p>nlpParams: a JSON object that specifies the input parameters for the NLP operator. Default value: empty (the NLP operator is not used). For more information, see the supplementary description of request parameters below.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;needAsrData&quot;:true, &quot;needOcrData&quot;:false, &quot;nlpParams&quot;:{&quot;sourceLanguage&quot;:&quot;cn&quot;}}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>scheduleConfig</p>
     */
    @NameInMap("ScheduleConfig")
    public String scheduleConfigShrink;

    /**
     * <p>The template parameters that are dynamically passed when the job is started. These parameters are used to temporarily override or supplement the configured parameters in the template specified by TemplateId. The server merges these parameters with the original template parameters by field to generate the final template configuration for the current job, and validates the configuration before execution.</p>
     * <ul>
     * <li>Merge rules:</li>
     * </ul>
     * <ol>
     * <li>If a field already exists in the template, the value provided by the caller overrides the template value (caller takes precedence).</li>
     * <li>If a field does not exist in the template, it is appended as a new field.</li>
     * </ol>
     * <ul>
     * <li>Supported dynamic fields:</li>
     * </ul>
     * <ol>
     * <li>FaceCategoryIds: the list of face library IDs that participate in recognition (separated by commas, which can include system library IDs and custom library IDs).</li>
     * </ol>
     * <ul>
     * <li>Precautions:
     * This configuration affects only the execution of the current job and does not modify the template itself.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;FaceCategoryIds&quot;:&quot;custom_face_lib1&quot;}</p>
     */
    @NameInMap("TemplateConfig")
    public String templateConfig;

    /**
     * <p>The ID of the template that is used to specify the analysis algorithm.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The video title. It supports Chinese characters, English letters, digits, and hyphens (-). It cannot start with a special character and can be up to 256 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>example-title-****</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The custom data that is returned in an MNS callback. It can be up to 1 KB in length. For more information about how to configure an MNS callback queue, see the relevant documentation.</p>
     * 
     * <strong>example:</strong>
     * <p>{“a”:&quot;test&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitSmarttagJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmarttagJobShrinkRequest self = new SubmitSmarttagJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSmarttagJobShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SubmitSmarttagJobShrinkRequest setContentAddr(String contentAddr) {
        this.contentAddr = contentAddr;
        return this;
    }
    public String getContentAddr() {
        return this.contentAddr;
    }

    public SubmitSmarttagJobShrinkRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public SubmitSmarttagJobShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public SubmitSmarttagJobShrinkRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public SubmitSmarttagJobShrinkRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public SubmitSmarttagJobShrinkRequest setScheduleConfigShrink(String scheduleConfigShrink) {
        this.scheduleConfigShrink = scheduleConfigShrink;
        return this;
    }
    public String getScheduleConfigShrink() {
        return this.scheduleConfigShrink;
    }

    public SubmitSmarttagJobShrinkRequest setTemplateConfig(String templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public String getTemplateConfig() {
        return this.templateConfig;
    }

    public SubmitSmarttagJobShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SubmitSmarttagJobShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitSmarttagJobShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
