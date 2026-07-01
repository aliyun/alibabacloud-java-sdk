// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSmarttagJobRequest extends TeaModel {
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
    public SubmitSmarttagJobRequestInput input;

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
    public SubmitSmarttagJobRequestScheduleConfig scheduleConfig;

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
         * <li><p>If you set the <code>Type</code> parameter to <code>OSS</code>, specify the OSS URL of the media file. Example: <code>OSS://test-bucket/video/202208/test.mp4</code>.</p>
         * </li>
         * <li><p>If you set the <code>Type</code> parameter to <code>Media</code>, specify the media ID. Example: <code>c5c62d8f0361337cab312dce8e77dc6d</code>.</p>
         * </li>
         * <li><p>If you set the <code>Type</code> parameter to <code>URL</code>, specify the HTTP or HTTPS URL of the media file. Example: <code>https://zc-test.oss-cn-shanghai.aliyuncs.com/test/unknowFace.mp4</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>c5c62d8f0361337cab312dce8e77dc6d</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the input media file. Valid values:</p>
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
         * <p>The ID of the pipeline. Pipelines separate business workloads and bind message notifications.</p>
         * <p>If you do not specify this parameter, the default pipeline is used. The default pipeline has a concurrency of 2. To increase the concurrency, submit a ticket.</p>
         * 
         * <strong>example:</strong>
         * <p>acdbfe4323bcfdae</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The priority of the job. This feature is not yet implemented. You can leave this parameter empty or specify any value.</p>
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
