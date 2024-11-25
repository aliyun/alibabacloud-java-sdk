// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLiveTranscodeJobShrinkRequest extends TeaModel {
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
    public String streamInputShrink;

    /**
     * <p>The configuration of a timed transcoding job.</p>
     */
    @NameInMap("TimedConfig")
    public String timedConfigShrink;

    /**
     * <p>The information about the transcoding output.</p>
     */
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
