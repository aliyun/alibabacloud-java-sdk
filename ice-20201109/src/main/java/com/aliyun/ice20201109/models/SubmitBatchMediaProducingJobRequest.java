// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitBatchMediaProducingJobRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ClipsParam")
    public String clipsParam;

    @NameInMap("EditingProduceConfig")
    public String editingProduceConfig;

    @NameInMap("JobTitle")
    public String jobTitle;

    @NameInMap("OutputMediaConfig")
    public String outputMediaConfig;

    @NameInMap("OutputMediaTarget")
    public String outputMediaTarget;

    @NameInMap("OutputNum")
    public Integer outputNum;

    @NameInMap("ProjectMetadata")
    public String projectMetadata;

    @NameInMap("Source")
    public String source;

    @NameInMap("SubmitBy")
    public String submitBy;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("UserData")
    public String userData;

    public static SubmitBatchMediaProducingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitBatchMediaProducingJobRequest self = new SubmitBatchMediaProducingJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitBatchMediaProducingJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SubmitBatchMediaProducingJobRequest setClipsParam(String clipsParam) {
        this.clipsParam = clipsParam;
        return this;
    }
    public String getClipsParam() {
        return this.clipsParam;
    }

    public SubmitBatchMediaProducingJobRequest setEditingProduceConfig(String editingProduceConfig) {
        this.editingProduceConfig = editingProduceConfig;
        return this;
    }
    public String getEditingProduceConfig() {
        return this.editingProduceConfig;
    }

    public SubmitBatchMediaProducingJobRequest setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }
    public String getJobTitle() {
        return this.jobTitle;
    }

    public SubmitBatchMediaProducingJobRequest setOutputMediaConfig(String outputMediaConfig) {
        this.outputMediaConfig = outputMediaConfig;
        return this;
    }
    public String getOutputMediaConfig() {
        return this.outputMediaConfig;
    }

    public SubmitBatchMediaProducingJobRequest setOutputMediaTarget(String outputMediaTarget) {
        this.outputMediaTarget = outputMediaTarget;
        return this;
    }
    public String getOutputMediaTarget() {
        return this.outputMediaTarget;
    }

    public SubmitBatchMediaProducingJobRequest setOutputNum(Integer outputNum) {
        this.outputNum = outputNum;
        return this;
    }
    public Integer getOutputNum() {
        return this.outputNum;
    }

    public SubmitBatchMediaProducingJobRequest setProjectMetadata(String projectMetadata) {
        this.projectMetadata = projectMetadata;
        return this;
    }
    public String getProjectMetadata() {
        return this.projectMetadata;
    }

    public SubmitBatchMediaProducingJobRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SubmitBatchMediaProducingJobRequest setSubmitBy(String submitBy) {
        this.submitBy = submitBy;
        return this;
    }
    public String getSubmitBy() {
        return this.submitBy;
    }

    public SubmitBatchMediaProducingJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SubmitBatchMediaProducingJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
