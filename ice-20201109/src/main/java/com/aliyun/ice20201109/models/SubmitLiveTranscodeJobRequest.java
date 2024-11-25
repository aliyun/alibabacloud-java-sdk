// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitLiveTranscodeJobRequest extends TeaModel {
    /**
     * <p>The name of the transcoding job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The start mode of the transcoding job.</p>
     * <ul>
     * <li>0: The transcoding job immediately starts.</li>
     * <li>1: The transcoding job starts at the scheduled time.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartMode")
    public Integer startMode;

    /**
     * <p>The information about the input stream.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StreamInput")
    public SubmitLiveTranscodeJobRequestStreamInput streamInput;

    /**
     * <p>The template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The configuration of a timed transcoding job. This parameter is required if you set StartMode to 1.</p>
     */
    @NameInMap("TimedConfig")
    public SubmitLiveTranscodeJobRequestTimedConfig timedConfig;

    /**
     * <p>The information about the transcoding output.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TranscodeOutput")
    public SubmitLiveTranscodeJobRequestTranscodeOutput transcodeOutput;

    public static SubmitLiveTranscodeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitLiveTranscodeJobRequest self = new SubmitLiveTranscodeJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitLiveTranscodeJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitLiveTranscodeJobRequest setStartMode(Integer startMode) {
        this.startMode = startMode;
        return this;
    }
    public Integer getStartMode() {
        return this.startMode;
    }

    public SubmitLiveTranscodeJobRequest setStreamInput(SubmitLiveTranscodeJobRequestStreamInput streamInput) {
        this.streamInput = streamInput;
        return this;
    }
    public SubmitLiveTranscodeJobRequestStreamInput getStreamInput() {
        return this.streamInput;
    }

    public SubmitLiveTranscodeJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SubmitLiveTranscodeJobRequest setTimedConfig(SubmitLiveTranscodeJobRequestTimedConfig timedConfig) {
        this.timedConfig = timedConfig;
        return this;
    }
    public SubmitLiveTranscodeJobRequestTimedConfig getTimedConfig() {
        return this.timedConfig;
    }

    public SubmitLiveTranscodeJobRequest setTranscodeOutput(SubmitLiveTranscodeJobRequestTranscodeOutput transcodeOutput) {
        this.transcodeOutput = transcodeOutput;
        return this;
    }
    public SubmitLiveTranscodeJobRequestTranscodeOutput getTranscodeOutput() {
        return this.transcodeOutput;
    }

    public static class SubmitLiveTranscodeJobRequestStreamInput extends TeaModel {
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

        public static SubmitLiveTranscodeJobRequestStreamInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitLiveTranscodeJobRequestStreamInput self = new SubmitLiveTranscodeJobRequestStreamInput();
            return TeaModel.build(map, self);
        }

        public SubmitLiveTranscodeJobRequestStreamInput setInputUrl(String inputUrl) {
            this.inputUrl = inputUrl;
            return this;
        }
        public String getInputUrl() {
            return this.inputUrl;
        }

        public SubmitLiveTranscodeJobRequestStreamInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitLiveTranscodeJobRequestTimedConfig extends TeaModel {
        /**
         * <p>The stop time of the transcoding job. Note: The time span between the stop time and the current time cannot exceed seven days.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-20T08:20:32Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start time of the transcoding job. Note: The time span between the start time and the current time cannot exceed seven days.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-21T00:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static SubmitLiveTranscodeJobRequestTimedConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitLiveTranscodeJobRequestTimedConfig self = new SubmitLiveTranscodeJobRequestTimedConfig();
            return TeaModel.build(map, self);
        }

        public SubmitLiveTranscodeJobRequestTimedConfig setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public SubmitLiveTranscodeJobRequestTimedConfig setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class SubmitLiveTranscodeJobRequestTranscodeOutput extends TeaModel {
        /**
         * <p>The streaming domain name of ApsaraVideo Live.</p>
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

        public static SubmitLiveTranscodeJobRequestTranscodeOutput build(java.util.Map<String, ?> map) throws Exception {
            SubmitLiveTranscodeJobRequestTranscodeOutput self = new SubmitLiveTranscodeJobRequestTranscodeOutput();
            return TeaModel.build(map, self);
        }

        public SubmitLiveTranscodeJobRequestTranscodeOutput setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public SubmitLiveTranscodeJobRequestTranscodeOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
