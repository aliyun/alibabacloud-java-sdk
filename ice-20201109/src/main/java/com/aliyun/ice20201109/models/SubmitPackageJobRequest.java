// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitPackageJobRequest extends TeaModel {
    /**
     * <p>The input of the job.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Inputs")
    public java.util.List<SubmitPackageJobRequestInputs> inputs;

    /**
     * <p>The name of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>job-name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The output of the job.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public SubmitPackageJobRequestOutput output;

    /**
     * <p>The scheduling settings.</p>
     */
    @NameInMap("ScheduleConfig")
    public SubmitPackageJobRequestScheduleConfig scheduleConfig;

    /**
     * <p>The user-defined data.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;param&quot;: &quot;value&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitPackageJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitPackageJobRequest self = new SubmitPackageJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitPackageJobRequest setInputs(java.util.List<SubmitPackageJobRequestInputs> inputs) {
        this.inputs = inputs;
        return this;
    }
    public java.util.List<SubmitPackageJobRequestInputs> getInputs() {
        return this.inputs;
    }

    public SubmitPackageJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitPackageJobRequest setOutput(SubmitPackageJobRequestOutput output) {
        this.output = output;
        return this;
    }
    public SubmitPackageJobRequestOutput getOutput() {
        return this.output;
    }

    public SubmitPackageJobRequest setScheduleConfig(SubmitPackageJobRequestScheduleConfig scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
        return this;
    }
    public SubmitPackageJobRequestScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    public SubmitPackageJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class SubmitPackageJobRequestInputsInput extends TeaModel {
        /**
         * <p>The media object.</p>
         * <ul>
         * <li>If Type is set to OSS, set this parameter to the URL of an OSS object. Both the OSS and HTTP protocols are supported.</li>
         * <li>If Type is set to Media, set this parameter to the ID of a media asset.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/video.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the media object. Valid values:</p>
         * <ul>
         * <li>OSS: an Object Storage Service (OSS) object.</li>
         * <li>Media: a media asset.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitPackageJobRequestInputsInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitPackageJobRequestInputsInput self = new SubmitPackageJobRequestInputsInput();
            return TeaModel.build(map, self);
        }

        public SubmitPackageJobRequestInputsInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitPackageJobRequestInputsInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitPackageJobRequestInputs extends TeaModel {
        /**
         * <p>The information about the input stream file.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Input")
        public SubmitPackageJobRequestInputsInput input;

        public static SubmitPackageJobRequestInputs build(java.util.Map<String, ?> map) throws Exception {
            SubmitPackageJobRequestInputs self = new SubmitPackageJobRequestInputs();
            return TeaModel.build(map, self);
        }

        public SubmitPackageJobRequestInputs setInput(SubmitPackageJobRequestInputsInput input) {
            this.input = input;
            return this;
        }
        public SubmitPackageJobRequestInputsInput getInput() {
            return this.input;
        }

    }

    public static class SubmitPackageJobRequestOutput extends TeaModel {
        /**
         * <p>The media object. If Type is set to OSS, set this parameter to the URL of an OSS object. Both the OSS and HTTP protocols are supported. If Type is set to Media, set this parameter to the ID of a media asset.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/video.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the media object. Valid values:</p>
         * <ul>
         * <li>OSS: an OSS object.</li>
         * <li>Media: a media asset.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitPackageJobRequestOutput build(java.util.Map<String, ?> map) throws Exception {
            SubmitPackageJobRequestOutput self = new SubmitPackageJobRequestOutput();
            return TeaModel.build(map, self);
        }

        public SubmitPackageJobRequestOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitPackageJobRequestOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitPackageJobRequestScheduleConfig extends TeaModel {
        /**
         * <p>The ID of the MPS queue to which the job was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>e37ebee5d98b4781897f6086e89f9c56</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The priority of the job. Valid values: 1 to 10. The greater the value, the higher the priority.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static SubmitPackageJobRequestScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitPackageJobRequestScheduleConfig self = new SubmitPackageJobRequestScheduleConfig();
            return TeaModel.build(map, self);
        }

        public SubmitPackageJobRequestScheduleConfig setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public SubmitPackageJobRequestScheduleConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

}
