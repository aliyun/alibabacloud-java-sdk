// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitLiveTranscodeJobShrinkRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("StartMode")
    public Integer startMode;

    @NameInMap("StreamInput")
    public String streamInputShrink;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TimedConfig")
    public String timedConfigShrink;

    @NameInMap("TranscodeOutput")
    public String transcodeOutputShrink;

    public static SubmitLiveTranscodeJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitLiveTranscodeJobShrinkRequest self = new SubmitLiveTranscodeJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitLiveTranscodeJobShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitLiveTranscodeJobShrinkRequest setStartMode(Integer startMode) {
        this.startMode = startMode;
        return this;
    }
    public Integer getStartMode() {
        return this.startMode;
    }

    public SubmitLiveTranscodeJobShrinkRequest setStreamInputShrink(String streamInputShrink) {
        this.streamInputShrink = streamInputShrink;
        return this;
    }
    public String getStreamInputShrink() {
        return this.streamInputShrink;
    }

    public SubmitLiveTranscodeJobShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SubmitLiveTranscodeJobShrinkRequest setTimedConfigShrink(String timedConfigShrink) {
        this.timedConfigShrink = timedConfigShrink;
        return this;
    }
    public String getTimedConfigShrink() {
        return this.timedConfigShrink;
    }

    public SubmitLiveTranscodeJobShrinkRequest setTranscodeOutputShrink(String transcodeOutputShrink) {
        this.transcodeOutputShrink = transcodeOutputShrink;
        return this;
    }
    public String getTranscodeOutputShrink() {
        return this.transcodeOutputShrink;
    }

}
