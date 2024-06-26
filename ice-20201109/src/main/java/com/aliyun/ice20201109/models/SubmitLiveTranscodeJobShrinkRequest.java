// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitLiveTranscodeJobShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartMode")
    public Integer startMode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StreamInput")
    public String streamInputShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TimedConfig")
    public String timedConfigShrink;

    /**
     * <p>This parameter is required.</p>
     */
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
