// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaProducingJobRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Timeline")
    public String timeline;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("ClipsParam")
    public String clipsParam;

    @NameInMap("ProjectMetadata")
    public String projectMetadata;

    @NameInMap("OutputMediaTarget")
    public String outputMediaTarget;

    @NameInMap("OutputMediaConfig")
    public String outputMediaConfig;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Source")
    public String source;

    public static SubmitMediaProducingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaProducingJobRequest self = new SubmitMediaProducingJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitMediaProducingJobRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SubmitMediaProducingJobRequest setTimeline(String timeline) {
        this.timeline = timeline;
        return this;
    }
    public String getTimeline() {
        return this.timeline;
    }

    public SubmitMediaProducingJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SubmitMediaProducingJobRequest setClipsParam(String clipsParam) {
        this.clipsParam = clipsParam;
        return this;
    }
    public String getClipsParam() {
        return this.clipsParam;
    }

    public SubmitMediaProducingJobRequest setProjectMetadata(String projectMetadata) {
        this.projectMetadata = projectMetadata;
        return this;
    }
    public String getProjectMetadata() {
        return this.projectMetadata;
    }

    public SubmitMediaProducingJobRequest setOutputMediaTarget(String outputMediaTarget) {
        this.outputMediaTarget = outputMediaTarget;
        return this;
    }
    public String getOutputMediaTarget() {
        return this.outputMediaTarget;
    }

    public SubmitMediaProducingJobRequest setOutputMediaConfig(String outputMediaConfig) {
        this.outputMediaConfig = outputMediaConfig;
        return this;
    }
    public String getOutputMediaConfig() {
        return this.outputMediaConfig;
    }

    public SubmitMediaProducingJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitMediaProducingJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SubmitMediaProducingJobRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
