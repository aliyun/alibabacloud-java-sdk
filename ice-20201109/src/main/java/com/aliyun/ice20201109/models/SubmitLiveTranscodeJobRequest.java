// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitLiveTranscodeJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartMode")
    public Integer startMode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StreamInput")
    public SubmitLiveTranscodeJobRequestStreamInput streamInput;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TimedConfig")
    public SubmitLiveTranscodeJobRequestTimedConfig timedConfig;

    /**
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
         * <p>This parameter is required.</p>
         */
        @NameInMap("InputUrl")
        public String inputUrl;

        /**
         * <p>This parameter is required.</p>
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
        @NameInMap("EndTime")
        public String endTime;

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
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>This parameter is required.</p>
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
