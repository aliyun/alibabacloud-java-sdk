// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitLiveEditingJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;StartTime\&quot;: \&quot; 2021-06-21T08:01:00Z\&quot;,  \&quot;EndTime\&quot;: \&quot; 2021-06-21T08:03:00Z\&quot; ,  &quot;AppName&quot;: &quot;app&quot;, &quot;DomainName&quot;: &quot;domain.com&quot;, &quot;StreamName&quot;: &quot;stream&quot;},  {\&quot;StartTime\&quot;: \&quot; 2021-06-21T08:05:00Z\&quot;,  \&quot;EndTime\&quot;: \&quot; 2021-06-21T08:09:00Z\&quot; }]</p>
     */
    @NameInMap("Clips")
    public String clips;

    /**
     * <strong>example:</strong>
     * <p>{ &quot;AppName&quot;: &quot;app&quot;, &quot;DomainName&quot;: &quot;domain.com&quot;, &quot;StreamName&quot;: &quot;stream&quot;  }</p>
     */
    @NameInMap("LiveStreamConfig")
    public String liveStreamConfig;

    /**
     * <strong>example:</strong>
     * <p>{ &quot;Mode&quot;: &quot;AccurateFast&quot;}</p>
     */
    @NameInMap("MediaProduceConfig")
    public String mediaProduceConfig;

    @NameInMap("OutputMediaConfig")
    public String outputMediaConfig;

    @NameInMap("OutputMediaTarget")
    public String outputMediaTarget;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>fddd7748b58bf1d47e95</strong></strong></p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;key&quot;: &quot;value&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitLiveEditingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitLiveEditingJobRequest self = new SubmitLiveEditingJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitLiveEditingJobRequest setClips(String clips) {
        this.clips = clips;
        return this;
    }
    public String getClips() {
        return this.clips;
    }

    public SubmitLiveEditingJobRequest setLiveStreamConfig(String liveStreamConfig) {
        this.liveStreamConfig = liveStreamConfig;
        return this;
    }
    public String getLiveStreamConfig() {
        return this.liveStreamConfig;
    }

    public SubmitLiveEditingJobRequest setMediaProduceConfig(String mediaProduceConfig) {
        this.mediaProduceConfig = mediaProduceConfig;
        return this;
    }
    public String getMediaProduceConfig() {
        return this.mediaProduceConfig;
    }

    public SubmitLiveEditingJobRequest setOutputMediaConfig(String outputMediaConfig) {
        this.outputMediaConfig = outputMediaConfig;
        return this;
    }
    public String getOutputMediaConfig() {
        return this.outputMediaConfig;
    }

    public SubmitLiveEditingJobRequest setOutputMediaTarget(String outputMediaTarget) {
        this.outputMediaTarget = outputMediaTarget;
        return this;
    }
    public String getOutputMediaTarget() {
        return this.outputMediaTarget;
    }

    public SubmitLiveEditingJobRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SubmitLiveEditingJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
