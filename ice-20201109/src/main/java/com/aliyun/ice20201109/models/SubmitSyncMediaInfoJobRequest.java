// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSyncMediaInfoJobRequest extends TeaModel {
    /**
     * <p>The input of the job.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public SubmitSyncMediaInfoJobRequestInput input;

    /**
     * <p>The name of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>job-name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The scheduling parameters. This parameter is optional.</p>
     */
    @NameInMap("ScheduleConfig")
    public SubmitSyncMediaInfoJobRequestScheduleConfig scheduleConfig;

    /**
     * <p>The user data.</p>
     * 
     * <strong>example:</strong>
     * <p>user-data</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitSyncMediaInfoJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSyncMediaInfoJobRequest self = new SubmitSyncMediaInfoJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSyncMediaInfoJobRequest setInput(SubmitSyncMediaInfoJobRequestInput input) {
        this.input = input;
        return this;
    }
    public SubmitSyncMediaInfoJobRequestInput getInput() {
        return this.input;
    }

    public SubmitSyncMediaInfoJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitSyncMediaInfoJobRequest setScheduleConfig(SubmitSyncMediaInfoJobRequestScheduleConfig scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
        return this;
    }
    public SubmitSyncMediaInfoJobRequestScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    public SubmitSyncMediaInfoJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class SubmitSyncMediaInfoJobRequestInput extends TeaModel {
        /**
         * <p>The media value.</p>
         * <ul>
         * <li><p>If Type is set to OSS, the value is a URL. Both OSS and HTTP protocols are supported.</p>
         * <blockquote>
         * <p>The OSS bucket in the URL must be added to <a href="https://help.aliyun.com/document_detail/609918.html">Storage Management</a> in IMS before use.</p>
         * </blockquote>
         * </li>
         * <li><p>If Type is set to Media, the value is a media asset ID.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/video.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The media object type. Valid values:</p>
         * <ul>
         * <li>OSS: OSS file.</li>
         * <li>Media: media asset ID.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitSyncMediaInfoJobRequestInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitSyncMediaInfoJobRequestInput self = new SubmitSyncMediaInfoJobRequestInput();
            return TeaModel.build(map, self);
        }

        public SubmitSyncMediaInfoJobRequestInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitSyncMediaInfoJobRequestInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitSyncMediaInfoJobRequestScheduleConfig extends TeaModel {
        /**
         * <p>The ID of the pipeline.</p>
         * 
         * <strong>example:</strong>
         * <p>e37ebee5d98b4781897f6086e89f9c56</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The priority of the job. A larger value indicates a higher priority. Valid values: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static SubmitSyncMediaInfoJobRequestScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitSyncMediaInfoJobRequestScheduleConfig self = new SubmitSyncMediaInfoJobRequestScheduleConfig();
            return TeaModel.build(map, self);
        }

        public SubmitSyncMediaInfoJobRequestScheduleConfig setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public SubmitSyncMediaInfoJobRequestScheduleConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

}
