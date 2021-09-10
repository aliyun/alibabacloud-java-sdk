// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitLiveEditingJobRequest extends TeaModel {
    @NameInMap("Clips")
    public String clips;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("LiveStreamConfig")
    public String liveStreamConfig;

    @NameInMap("OutputMediaConfig")
    public String outputMediaConfig;

    @NameInMap("MediaProduceConfig")
    public String mediaProduceConfig;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("OutputMediaTarget")
    public String outputMediaTarget;

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

    public SubmitLiveEditingJobRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SubmitLiveEditingJobRequest setLiveStreamConfig(String liveStreamConfig) {
        this.liveStreamConfig = liveStreamConfig;
        return this;
    }
    public String getLiveStreamConfig() {
        return this.liveStreamConfig;
    }

    public SubmitLiveEditingJobRequest setOutputMediaConfig(String outputMediaConfig) {
        this.outputMediaConfig = outputMediaConfig;
        return this;
    }
    public String getOutputMediaConfig() {
        return this.outputMediaConfig;
    }

    public SubmitLiveEditingJobRequest setMediaProduceConfig(String mediaProduceConfig) {
        this.mediaProduceConfig = mediaProduceConfig;
        return this;
    }
    public String getMediaProduceConfig() {
        return this.mediaProduceConfig;
    }

    public SubmitLiveEditingJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitLiveEditingJobRequest setOutputMediaTarget(String outputMediaTarget) {
        this.outputMediaTarget = outputMediaTarget;
        return this;
    }
    public String getOutputMediaTarget() {
        return this.outputMediaTarget;
    }

}
