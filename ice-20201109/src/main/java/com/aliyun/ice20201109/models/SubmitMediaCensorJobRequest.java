// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaCensorJobRequest extends TeaModel {
    /**
     * <p>The live comments of the video.</p>
     * <blockquote>
     * <p> If this parameter is specified, the system checks the live comments specified by this parameter instead of the live comments of the input file specified by Media.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hello world</p>
     */
    @NameInMap("Barrages")
    public String barrages;

    /**
     * <p>The Object Storage Service (OSS) objects that are used as the thumbnails. Specify the thumbnails in a JSON array. A maximum of five thumbnails are supported.</p>
     * <blockquote>
     * <p> If this parameter is specified, the system checks the thumbnails specified by this parameter instead of the thumbnails of the input file specified by <strong>Media</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Bucket&quot;:&quot;example-bucket-<strong><strong>&quot;,&quot;Location&quot;:&quot;oss-cn-shanghai&quot;,&quot;Object&quot;:&quot;example-</strong></strong>.jpeg&quot;,&quot;RoleArn&quot;:&quot;acs:ram::1997018457688683:role/AliyunICEDefaultRole&quot;}]</p>
     */
    @NameInMap("CoverImages")
    public String coverImages;

    /**
     * <p>The video description, which can be up to 128 bytes in length.</p>
     * <blockquote>
     * <p> If this parameter is specified, the system checks the description specified by this parameter instead of the description of the input file specified by Media.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>example description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The information about the file to be moderated.</p>
     */
    @NameInMap("Input")
    public SubmitMediaCensorJobRequestInput input;

    /**
     * <p>The callback URL. Simple Message Queue (SMQ, formerly MNS) and HTTP callbacks are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>mns://125340688170****.oss-cn-shanghai.aliyuncs.com/queues/example-pipeline</p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    /**
     * <p>The output snapshots. The moderation job generates output snapshots and the result JSON file in the path corresponding to the input file.</p>
     * <ul>
     * <li>File name format of output snapshots: oss://bucket/snapshot-{Count}.jpg. In the path, bucket indicates an OSS bucket that resides in the same region as the current project, and {Count} is the sequence number of the snapshot.</li>
     * <li>The detailed moderation results are stored in the {jobId}.output file in the same OSS folder as the output snapshots. For more information about the parameters in the output file, see <a href="https://help.aliyun.com/document_detail/609211.html">Output parameters of media moderation jobs</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss://sashimi-cn-shanghai/censor/snapshot-{Count}.jpg</p>
     */
    @NameInMap("Output")
    public String output;

    /**
     * <p>The scheduling configurations.</p>
     */
    @NameInMap("ScheduleConfig")
    public SubmitMediaCensorJobRequestScheduleConfig scheduleConfig;

    /**
     * <p>The template ID. If this parameter is not specified, the default template is used for moderation.</p>
     * 
     * <strong>example:</strong>
     * <p>S00000001-100060</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The video title, which can be up to 64 bytes in length.</p>
     * <blockquote>
     * <p> If this parameter is specified, the system checks the title specified by this parameter instead of the title of the input file specified by Media.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Hello World</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The user-defined data, which can be up to 128 bytes in length.</p>
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
         * <p>The input file. The file can be an OSS object or a media asset. You can specify the path of an OSS object in one of the following formats:</p>
         * <p>1\. oss://bucket/object</p>
         * <p>2\. http(s)://bucket.oss-[regionId].aliyuncs.com/object</p>
         * <p>In the preceding paths, bucket indicates an OSS bucket that resides in the same region as the current project, and object indicates the path of the object in the bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>1b1b9cd148034739af413150fded****</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the input file. Valid values:</p>
         * <p>OSS: OSS object.</p>
         * <p>Media: media asset.</p>
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
         * <p>The ID of the ApsaraVideo Media Processing (MPS) queue to which the job is submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>5246b8d12a62433ab77845074039****</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The job priority. A larger value indicates a higher priority. Valid values: 1 to 10.</p>
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
