// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSmarttagJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>example content ****</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p><a href="http://123.com/testVideo.mp4">http://123.com/testVideo.mp4</a></p>
     */
    @NameInMap("ContentAddr")
    public String contentAddr;

    /**
     * <strong>example:</strong>
     * <p>application/zip</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>input</p>
     */
    @NameInMap("Input")
    public SubmitSmarttagJobRequestInput input;

    /**
     * <strong>example:</strong>
     * <p><a href="https://example.com/endpoint/aliyun/ai?id=76401125000">https://example.com/endpoint/aliyun/ai?id=76401125000</a>***</p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    /**
     * <strong>example:</strong>
     * <p>{&quot;needAsrData&quot;:true, &quot;needOcrData&quot;:false}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>scheduleConfig</p>
     */
    @NameInMap("ScheduleConfig")
    public SubmitSmarttagJobRequestScheduleConfig scheduleConfig;

    /**
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <strong>example:</strong>
     * <p>example-title-****</p>
     */
    @NameInMap("Title")
    public String title;

    /**
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
         * <strong>example:</strong>
         * <p>c5c62d8f0361337cab312dce8e77dc6d</p>
         */
        @NameInMap("Media")
        public String media;

        /**
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
         * <strong>example:</strong>
         * <p>acdbfe4323bcfdae</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
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
