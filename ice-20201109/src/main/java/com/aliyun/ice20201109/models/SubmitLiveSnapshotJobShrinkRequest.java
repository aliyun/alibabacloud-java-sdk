// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitLiveSnapshotJobShrinkRequest extends TeaModel {
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SnapshotOutput")
    public String snapshotOutputShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StreamInput")
    public String streamInputShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static SubmitLiveSnapshotJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitLiveSnapshotJobShrinkRequest self = new SubmitLiveSnapshotJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitLiveSnapshotJobShrinkRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public SubmitLiveSnapshotJobShrinkRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public SubmitLiveSnapshotJobShrinkRequest setSnapshotOutputShrink(String snapshotOutputShrink) {
        this.snapshotOutputShrink = snapshotOutputShrink;
        return this;
    }
    public String getSnapshotOutputShrink() {
        return this.snapshotOutputShrink;
    }

    public SubmitLiveSnapshotJobShrinkRequest setStreamInputShrink(String streamInputShrink) {
        this.streamInputShrink = streamInputShrink;
        return this;
    }
    public String getStreamInputShrink() {
        return this.streamInputShrink;
    }

    public SubmitLiveSnapshotJobShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
