// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLiveTranscodeJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Name")
    public String name;

    @NameInMap("StreamInput")
    public UpdateLiveTranscodeJobRequestStreamInput streamInput;

    @NameInMap("TimedConfig")
    public UpdateLiveTranscodeJobRequestTimedConfig timedConfig;

    @NameInMap("TranscodeOutput")
    public UpdateLiveTranscodeJobRequestTranscodeOutput transcodeOutput;

    public static UpdateLiveTranscodeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveTranscodeJobRequest self = new UpdateLiveTranscodeJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveTranscodeJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateLiveTranscodeJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLiveTranscodeJobRequest setStreamInput(UpdateLiveTranscodeJobRequestStreamInput streamInput) {
        this.streamInput = streamInput;
        return this;
    }
    public UpdateLiveTranscodeJobRequestStreamInput getStreamInput() {
        return this.streamInput;
    }

    public UpdateLiveTranscodeJobRequest setTimedConfig(UpdateLiveTranscodeJobRequestTimedConfig timedConfig) {
        this.timedConfig = timedConfig;
        return this;
    }
    public UpdateLiveTranscodeJobRequestTimedConfig getTimedConfig() {
        return this.timedConfig;
    }

    public UpdateLiveTranscodeJobRequest setTranscodeOutput(UpdateLiveTranscodeJobRequestTranscodeOutput transcodeOutput) {
        this.transcodeOutput = transcodeOutput;
        return this;
    }
    public UpdateLiveTranscodeJobRequestTranscodeOutput getTranscodeOutput() {
        return this.transcodeOutput;
    }

    public static class UpdateLiveTranscodeJobRequestStreamInput extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("InputUrl")
        public String inputUrl;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateLiveTranscodeJobRequestStreamInput build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveTranscodeJobRequestStreamInput self = new UpdateLiveTranscodeJobRequestStreamInput();
            return TeaModel.build(map, self);
        }

        public UpdateLiveTranscodeJobRequestStreamInput setInputUrl(String inputUrl) {
            this.inputUrl = inputUrl;
            return this;
        }
        public String getInputUrl() {
            return this.inputUrl;
        }

        public UpdateLiveTranscodeJobRequestStreamInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateLiveTranscodeJobRequestTimedConfig extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        public static UpdateLiveTranscodeJobRequestTimedConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveTranscodeJobRequestTimedConfig self = new UpdateLiveTranscodeJobRequestTimedConfig();
            return TeaModel.build(map, self);
        }

        public UpdateLiveTranscodeJobRequestTimedConfig setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public UpdateLiveTranscodeJobRequestTimedConfig setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class UpdateLiveTranscodeJobRequestTranscodeOutput extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateLiveTranscodeJobRequestTranscodeOutput build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveTranscodeJobRequestTranscodeOutput self = new UpdateLiveTranscodeJobRequestTranscodeOutput();
            return TeaModel.build(map, self);
        }

        public UpdateLiveTranscodeJobRequestTranscodeOutput setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public UpdateLiveTranscodeJobRequestTranscodeOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
