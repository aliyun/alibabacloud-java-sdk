// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaCensorJobRequest extends TeaModel {
    /**
     * <p>The video barrages (on-screen comments).</p>
     * <blockquote>
     * <p>If specified, it overrides the barrages specified in the Media object.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hello world</p>
     */
    @NameInMap("Barrages")
    public String barrages;

    /**
     * <p>The Object Storage Service (OSS) files for the cover images, specified as a JSON array. You can specify up to five cover images.</p>
     * <blockquote>
     * <p>If specified, this parameter overrides the cover image information in the <strong>Media</strong> object.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Bucket&quot;:&quot;example-bucket-<strong><strong>&quot;,&quot;Location&quot;:&quot;oss-cn-shanghai&quot;,&quot;Object&quot;:&quot;example-</strong></strong>.jpeg&quot;,&quot;RoleArn&quot;:&quot;acs:ram::1997018457688683:role/AliyunICEDefaultRole&quot;}]</p>
     */
    @NameInMap("CoverImages")
    public String coverImages;

    /**
     * <p>The video description. The maximum length is 128 bytes.</p>
     * <blockquote>
     * <p>If specified, this parameter overrides the description specified in the Media object.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>example description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The input file to censor.</p>
     */
    @NameInMap("Input")
    public SubmitMediaCensorJobRequestInput input;

    /**
     * <p>The callback path. Both Message Service (MNS) and HTTP callbacks are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>mns://125340688170****.oss-cn-shanghai.aliyuncs.com/queues/example-pipeline</p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    /**
     * <p>The output location for screenshots. The censor job generates screenshots and a result JSON file in the OSS location specified by this parameter.</p>
     * <ul>
     * <li><p>Example format: <code>oss://bucket/snapshot-{Count}.jpg</code>, where <code>bucket</code> is the name of an OSS bucket in the same region as the project, and <code>{Count}</code> is a placeholder for the screenshot sequence number.</p>
     * </li>
     * <li><p>The detailed censor results are saved to a file named <code>{jobId}.output</code> in the same OSS folder as the value of <code>Output</code>. For information about the fields in the output file, see <a href="https://help.aliyun.com/document_detail/609211.html">Media censor result file fields</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss://sashimi-cn-shanghai/censor/snapshot-{Count}.jpg</p>
     */
    @NameInMap("Output")
    public String output;

    /**
     * <p>The scheduling configuration.</p>
     */
    @NameInMap("ScheduleConfig")
    public SubmitMediaCensorJobRequestScheduleConfig scheduleConfig;

    /**
     * <p>The template ID. If this parameter is left empty, the service uses the default template for the censor job.</p>
     * 
     * <strong>example:</strong>
     * <p>S00000001-100060</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The video title. The maximum length is 64 bytes.</p>
     * <blockquote>
     * <p>If specified, this parameter overrides the title specified in the Media object.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Hello World</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The user-defined data. The maximum length is 128 bytes.</p>
     * 
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
         * <p>The identifier for the input file. You can specify either an OSS URL or a media ID.
         * Valid OSS URL formats:</p>
         * <p>1\. <code>oss://bucket/object</code></p>
         * <p>2\. <code>http(s)://bucket.oss-[regionId].aliyuncs.com/object</code></p>
         * <p>The <code>bucket</code> must be in the same region as the project, and <code>object</code> is the path to the file.</p>
         * 
         * <strong>example:</strong>
         * <p>1b1b9cd148034739af413150fded****</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the input file. Valid values:</p>
         * <p><code>OSS</code>: an OSS URL</p>
         * <p><code>Media</code>: a media ID</p>
         * 
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
         * <p>The pipeline ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5246b8d12a62433ab77845074039****</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The task priority. A higher value indicates a higher priority. Valid values range from 1 to 10.</p>
         * 
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
