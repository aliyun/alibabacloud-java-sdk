// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSmarttagJobRequest extends TeaModel {
    /**
     * <p>The video description. The description can contain letters, digits, and hyphens (-) and cannot start with a special character. The description can be up to 1 KB in length.</p>
     * 
     * <strong>example:</strong>
     * <p>example content ****</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>This parameter is discontinued.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://123.com/testVideo.mp4">http://123.com/testVideo.mp4</a></p>
     */
    @NameInMap("ContentAddr")
    public String contentAddr;

    /**
     * <p>This parameter is discontinued.</p>
     * 
     * <strong>example:</strong>
     * <p>application/zip</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>The job input.</p>
     */
    @NameInMap("Input")
    public SubmitSmarttagJobRequestInput input;

    /**
     * <p>The URL for receiving callbacks. Set the value to an HTTP URL or an HTTPS URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/endpoint/aliyun/ai?id=76401125000">https://example.com/endpoint/aliyun/ai?id=76401125000</a>***</p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    /**
     * <p>The additional request parameters. The value is a JSON string. Example: {&quot;needAsrData&quot;:true, &quot;needOcrData&quot;:false}. The following parameters are supported:</p>
     * <ul>
     * <li>needAsrData: specifies whether to query the automatic speech recognition (ASR) data. The value is of the BOOLEAN type. Default value: false. Valid values: true and false.</li>
     * <li>needOcrData: specifies whether to query the optical character recognition (OCR) data. The value is of the BOOLEAN type. Default value: false. Valid values: true and false.</li>
     * <li>needMetaData: specifies whether to query the metadata. The value is of the BOOLEAN type. Default value: false. Valid values: true and false.</li>
     * <li>nlpParams: the input parameters of the natural language processing (NLP) operator. The value is a JSON object. This parameter is empty by default, which indicates that the NLP operator is not used. For more information, see the &quot;nlpParams&quot; section of this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;needAsrData&quot;:true, &quot;needOcrData&quot;:false}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The scheduling configurations.</p>
     */
    @NameInMap("ScheduleConfig")
    public SubmitSmarttagJobRequestScheduleConfig scheduleConfig;

    /**
     * <p>The ID of the template that specifies the analysis algorithms. For more information about template operations, see <a href="https://help.aliyun.com/document_detail/445702.html">Configure templates</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The video title. The title can contain letters, digits, and hyphens (-) and cannot start with a special character. The title can be up to 256 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>example-title-****</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The data to be passed through Simple Message Queue (SMQ, formerly MNS) during callbacks. The data can be up to 1 KB in length. For more information about how to specify an SMQ queue for receiving callbacks, see UpdatePipeline.</p>
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
         * <p>If Type is set to OSS, specify an OSS path. Example: OSS://test-bucket/video/202208/test.mp4.</p>
         * <p>If Type is set to Media, specify a media asset ID. Example: c5c62d8f0361337cab312dce8e77dc6d.</p>
         * <p>If Type is set to URL, specify an HTTP URL. Example: <a href="https://zc-test.oss-cn-shanghai.aliyuncs.com/test/unknowFace.mp4">https://zc-test.oss-cn-shanghai.aliyuncs.com/test/unknowFace.mp4</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>c5c62d8f0361337cab312dce8e77dc6d</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The media type. Valid values:</p>
         * <ul>
         * <li>OSS</li>
         * <li>Media</li>
         * <li>URL</li>
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
         * <p>The ID of the ApsaraVideo Media Processing (MPS) queue to which you want to submit the smart tagging job. The MPS queue is bound to an SMQ queue. This parameter specifies the default MPS queue. By default, an MPS queue can process a maximum of two concurrent smart tagging jobs. To increase the limit, submit a ticket.</p>
         * 
         * <strong>example:</strong>
         * <p>acdbfe4323bcfdae</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The job priority. This parameter is not implemented. You can leave this parameter empty or enter a random value.</p>
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
