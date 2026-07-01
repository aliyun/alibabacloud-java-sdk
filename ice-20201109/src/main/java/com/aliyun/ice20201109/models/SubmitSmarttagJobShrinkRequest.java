// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSmarttagJobShrinkRequest extends TeaModel {
    /**
     * <p>The description of the video content can contain Chinese characters, English letters, digits, and hyphens (-). It cannot start with a special character and must not exceed 1 KB.</p>
     * 
     * <strong>example:</strong>
     * <p>example content ****</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>Deprecated.</p>
     */
    @NameInMap("ContentAddr")
    public String contentAddr;

    /**
     * <p>Deprecated.</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>The input file for the job.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>The callback URL. Only HTTP and HTTPS URLs are supported.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/endpoint/aliyun/ai?id=76401125000">https://example.com/endpoint/aliyun/ai?id=76401125000</a>***</p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    /**
     * <p>Additional request parameters, specified as a JSON string. For example: <code>{&quot;needAsrData&quot;:true, &quot;needOcrData&quot;:false}</code>.</p>
     * <ul>
     * <li><p><code>needAsrData</code>: Specifies whether to include the raw Automatic Speech Recognition (ASR) results in the analysis output. The default is <code>false</code>.</p>
     * </li>
     * <li><p><code>needOcrData</code>: Specifies whether to include the raw Optical Character Recognition (OCR) results in the analysis output. The default is <code>false</code>.</p>
     * </li>
     * <li><p><code>needMetaData</code>: Specifies whether to include metadata in the analysis output. The default is <code>false</code>.</p>
     * </li>
     * <li><p><code>nlpParams</code>: A JSON object that specifies the input parameters for the Natural Language Processing (NLP) operator. If left empty, the operator is not used. For details, see the <code>nlpParams</code> table below.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;needAsrData&quot;:true, &quot;needOcrData&quot;:false, &quot;nlpParams&quot;:{&quot;sourceLanguage&quot;:&quot;cn&quot;}}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The scheduling configurations.</p>
     */
    @NameInMap("ScheduleConfig")
    public String scheduleConfigShrink;

    /**
     * <p>Dynamic parameters for the job, which temporarily override or supplement the base template specified by <code>TemplateId</code>. The service merges the dynamic and template parameters to generate the final configuration for the current job and validates it before execution.</p>
     * <ul>
     * <li>Merge rules:</li>
     * </ul>
     * <ol>
     * <li><p>Values in the request override corresponding values in the template.</p>
     * </li>
     * <li><p>Fields in the request that do not exist in the template are added to the configuration.</p>
     * </li>
     * </ol>
     * <ul>
     * <li>Currently supported dynamic fields:</li>
     * </ul>
     * <ol>
     * <li><code>FaceCategoryIds</code>: A list of face library IDs for recognition, separated by commas (,). You can include both system and custom library IDs.</li>
     * </ol>
     * <ul>
     * <li>Note: These dynamic parameters affect only the current job and do not modify the template itself.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;FaceCategoryIds&quot;:&quot;custom_face_lib1&quot;}</p>
     */
    @NameInMap("TemplateConfig")
    public String templateConfig;

    /**
     * <p>The ID of the template that specifies the analysis algorithms to use.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The video title can contain Chinese characters, English letters, digits, and hyphens (-). It cannot start with a special character and must not exceed 256 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>example-title-****</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>Custom data to include in the callback. If you use Message Service (MNS) for callbacks, this data is included in the message. The maximum length is 1 KB.</p>
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
