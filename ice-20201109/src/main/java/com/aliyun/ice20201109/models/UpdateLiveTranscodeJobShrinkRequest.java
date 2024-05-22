// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLiveTranscodeJobShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Name")
    public String name;

    @NameInMap("StreamInput")
    public String streamInputShrink;

    @NameInMap("TimedConfig")
    public String timedConfigShrink;

    @NameInMap("TranscodeOutput")
    public String transcodeOutputShrink;

    public static UpdateLiveTranscodeJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveTranscodeJobShrinkRequest self = new UpdateLiveTranscodeJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveTranscodeJobShrinkRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateLiveTranscodeJobShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLiveTranscodeJobShrinkRequest setStreamInputShrink(String streamInputShrink) {
        this.streamInputShrink = streamInputShrink;
        return this;
    }
    public String getStreamInputShrink() {
        return this.streamInputShrink;
    }

    public UpdateLiveTranscodeJobShrinkRequest setTimedConfigShrink(String timedConfigShrink) {
        this.timedConfigShrink = timedConfigShrink;
        return this;
    }
    public String getTimedConfigShrink() {
        return this.timedConfigShrink;
    }

    public UpdateLiveTranscodeJobShrinkRequest setTranscodeOutputShrink(String transcodeOutputShrink) {
        this.transcodeOutputShrink = transcodeOutputShrink;
        return this;
    }
    public String getTranscodeOutputShrink() {
        return this.transcodeOutputShrink;
    }

}
