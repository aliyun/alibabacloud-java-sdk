// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaCensorJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>hello world</p>
     */
    @NameInMap("Barrages")
    public String barrages;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;Bucket&quot;:&quot;example-bucket-<strong><strong>&quot;,&quot;Location&quot;:&quot;oss-cn-shanghai&quot;,&quot;Object&quot;:&quot;example-</strong></strong>.jpeg&quot;,&quot;RoleArn&quot;:&quot;acs:ram::1997018457688683:role/AliyunICEDefaultRole&quot;}]</p>
     */
    @NameInMap("CoverImages")
    public String coverImages;

    /**
     * <strong>example:</strong>
     * <p>example description</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("Input")
    public SubmitMediaCensorJobRequestInput input;

    /**
     * <strong>example:</strong>
     * <p>mns://125340688170****.oss-cn-shanghai.aliyuncs.com/queues/example-pipeline</p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    /**
     * <strong>example:</strong>
     * <p>oss://sashimi-cn-shanghai/censor/snapshot-{Count}.jpg</p>
     */
    @NameInMap("Output")
    public String output;

    @NameInMap("ScheduleConfig")
    public SubmitMediaCensorJobRequestScheduleConfig scheduleConfig;

    /**
     * <strong>example:</strong>
     * <p>S00000001-100060</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <strong>example:</strong>
     * <p>Hello World</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>UserDatatestid-001-****</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitMediaCensorJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaCensorJobRequest self = new SubmitMediaCensorJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitMediaCensorJobRequest setBarrages(String barrages) {
        this.barrages = barrages;
        return this;
    }
    public String getBarrages() {
        return this.barrages;
    }

    public SubmitMediaCensorJobRequest setCoverImages(String coverImages) {
        this.coverImages = coverImages;
        return this;
    }
    public String getCoverImages() {
        return this.coverImages;
    }

    public SubmitMediaCensorJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitMediaCensorJobRequest setInput(SubmitMediaCensorJobRequestInput input) {
        this.input = input;
        return this;
    }
    public SubmitMediaCensorJobRequestInput getInput() {
        return this.input;
    }

    public SubmitMediaCensorJobRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public SubmitMediaCensorJobRequest setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public SubmitMediaCensorJobRequest setScheduleConfig(SubmitMediaCensorJobRequestScheduleConfig scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
        return this;
    }
    public SubmitMediaCensorJobRequestScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    public SubmitMediaCensorJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SubmitMediaCensorJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitMediaCensorJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class SubmitMediaCensorJobRequestInput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1b1b9cd148034739af413150fded****</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <strong>example:</strong>
         * <p>Media</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitMediaCensorJobRequestInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaCensorJobRequestInput self = new SubmitMediaCensorJobRequestInput();
            return TeaModel.build(map, self);
        }

        public SubmitMediaCensorJobRequestInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitMediaCensorJobRequestInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitMediaCensorJobRequestScheduleConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5246b8d12a62433ab77845074039****</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static SubmitMediaCensorJobRequestScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaCensorJobRequestScheduleConfig self = new SubmitMediaCensorJobRequestScheduleConfig();
            return TeaModel.build(map, self);
        }

        public SubmitMediaCensorJobRequestScheduleConfig setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public SubmitMediaCensorJobRequestScheduleConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

}
