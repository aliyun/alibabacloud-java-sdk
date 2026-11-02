// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSmarttagJobRequest extends TeaModel {
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
    public SubmitSmarttagJobRequestInput input;

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
    public SubmitSmarttagJobRequestScheduleConfig scheduleConfig;

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

    public static SubmitSmarttagJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmarttagJobRequest self = new SubmitSmarttagJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSmarttagJobRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SubmitSmarttagJobRequest setContentAddr(String contentAddr) {
        this.contentAddr = contentAddr;
        return this;
    }
    public String getContentAddr() {
        return this.contentAddr;
    }

    public SubmitSmarttagJobRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public SubmitSmarttagJobRequest setInput(SubmitSmarttagJobRequestInput input) {
        this.input = input;
        return this;
    }
    public SubmitSmarttagJobRequestInput getInput() {
        return this.input;
    }

    public SubmitSmarttagJobRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public SubmitSmarttagJobRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public SubmitSmarttagJobRequest setScheduleConfig(SubmitSmarttagJobRequestScheduleConfig scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
        return this;
    }
    public SubmitSmarttagJobRequestScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    public SubmitSmarttagJobRequest setTemplateConfig(String templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public String getTemplateConfig() {
        return this.templateConfig;
    }

    public SubmitSmarttagJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SubmitSmarttagJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitSmarttagJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class SubmitSmarttagJobRequestInput extends TeaModel {
        /**
         * <ul>
         * <li><p>If the Type parameter is set to OSS, specify the OSS address. Example: OSS://test-bucket/video/202208/test.mp4.</p>
         * </li>
         * <li><p>If the Type parameter is set to Media, specify the media ID. Example: c5c62d8f0361337cab312dce8e77dc6d.</p>
         * </li>
         * <li><p>If the Type parameter is set to URL, specify the HTTP URL. Example: <a href="https://zc-test.oss-cn-shanghai.aliyuncs.com/test/unknowFace.mp4">https://zc-test.oss-cn-shanghai.aliyuncs.com/test/unknowFace.mp4</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>c5c62d8f0361337cab312dce8e77dc6d</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The media type. Valid values:</p>
         * <ul>
         * <li><p>OSS</p>
         * </li>
         * <li><p>Media</p>
         * </li>
         * <li><p>URL</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Media</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitSmarttagJobRequestInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmarttagJobRequestInput self = new SubmitSmarttagJobRequestInput();
            return TeaModel.build(map, self);
        }

        public SubmitSmarttagJobRequestInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitSmarttagJobRequestInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitSmarttagJobRequestScheduleConfig extends TeaModel {
        /**
         * <p>The ID of the pipeline, which is used to distinguish business scenarios and bind message notifications.</p>
         * <p>If this parameter is not configured, the default pipeline is used. The default concurrency of the default pipeline is 2. To increase the concurrency, submit a ticket.</p>
         * 
         * <strong>example:</strong>
         * <p>acdbfe4323bcfdae</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The priority. This parameter is not implemented. You can leave it empty or specify an arbitrary value.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Priority")
        public String priority;

        public static SubmitSmarttagJobRequestScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitSmarttagJobRequestScheduleConfig self = new SubmitSmarttagJobRequestScheduleConfig();
            return TeaModel.build(map, self);
        }

        public SubmitSmarttagJobRequestScheduleConfig setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public SubmitSmarttagJobRequestScheduleConfig setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

    }

}
