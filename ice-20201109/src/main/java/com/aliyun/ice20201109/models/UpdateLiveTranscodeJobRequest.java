// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLiveTranscodeJobRequest extends TeaModel {
    /**
     * <p>The job ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The name of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>mytest3</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The information about the input stream.</p>
     */
    @NameInMap("StreamInput")
    public UpdateLiveTranscodeJobRequestStreamInput streamInput;

    /**
     * <p>The configuration of a timed transcoding job.</p>
     */
    @NameInMap("TimedConfig")
    public UpdateLiveTranscodeJobRequestTimedConfig timedConfig;

    /**
     * <p>The information about the transcoding output.</p>
     */
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
         * <p>The URL of the input stream.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://mydomain/app/stream1</p>
         */
        @NameInMap("InputUrl")
        public String inputUrl;

        /**
         * <p>The type of the input stream. The value can only be rtmp.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp</p>
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
        /**
         * <p>The stop time of the transcoding job. Note: The time span between the stop time and the current time cannot exceed seven days.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-05T06:08:31Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start time of the transcoding job. Note: The time span between the start time and the current time cannot exceed seven days.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-06-19T02:16:41Z</p>
         */
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
         * <p>The streaming domain name of ApsaraVideo Live.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mydomain</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The type of the output stream. A value of LiveCenter indicates that the URL of the output stream is generated based on the domain name of ApsaraVideo Live. The value can only be LiveCenter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LiveCenter</p>
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
