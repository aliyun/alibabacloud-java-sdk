// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaProducingJobRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ClipsParam")
    public String clipsParam;

    @NameInMap("EditingProduceConfig")
    public String editingProduceConfig;

    @NameInMap("MediaMetadata")
    public String mediaMetadata;

    @NameInMap("OutputMediaConfig")
    public String outputMediaConfig;

    @NameInMap("OutputMediaTarget")
    public String outputMediaTarget;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ProjectMetadata")
    public String projectMetadata;

    @NameInMap("Source")
    public String source;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("Timeline")
    public String timeline;

    @NameInMap("UserData")
    public String userData;

    public static SubmitMediaProducingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaProducingJobRequest self = new SubmitMediaProducingJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitMediaProducingJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SubmitMediaProducingJobRequest setClipsParam(String clipsParam) {
        this.clipsParam = clipsParam;
        return this;
    }
    public String getClipsParam() {
        return this.clipsParam;
    }

    public SubmitMediaProducingJobRequest setEditingProduceConfig(String editingProduceConfig) {
        this.editingProduceConfig = editingProduceConfig;
        return this;
    }
    public String getEditingProduceConfig() {
        return this.editingProduceConfig;
    }

    public SubmitMediaProducingJobRequest setMediaMetadata(String mediaMetadata) {
        this.mediaMetadata = mediaMetadata;
        return this;
    }
    public String getMediaMetadata() {
        return this.mediaMetadata;
    }

    public SubmitMediaProducingJobRequest setOutputMediaConfig(String outputMediaConfig) {
        this.outputMediaConfig = outputMediaConfig;
        return this;
    }
    public String getOutputMediaConfig() {
        return this.outputMediaConfig;
    }

    public SubmitMediaProducingJobRequest setOutputMediaTarget(String outputMediaTarget) {
        this.outputMediaTarget = outputMediaTarget;
        return this;
    }
    public String getOutputMediaTarget() {
        return this.outputMediaTarget;
    }

    public SubmitMediaProducingJobRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SubmitMediaProducingJobRequest setProjectMetadata(String projectMetadata) {
        this.projectMetadata = projectMetadata;
        return this;
    }
    public String getProjectMetadata() {
        return this.projectMetadata;
    }

    public SubmitMediaProducingJobRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SubmitMediaProducingJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SubmitMediaProducingJobRequest setTimeline(String timeline) {
        this.timeline = timeline;
        return this;
    }
    public String getTimeline() {
        return this.timeline;
    }

    public SubmitMediaProducingJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
