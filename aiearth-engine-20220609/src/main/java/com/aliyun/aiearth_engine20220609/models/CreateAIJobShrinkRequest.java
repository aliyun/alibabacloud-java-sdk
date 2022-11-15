// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class CreateAIJobShrinkRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("AreaThreshold")
    public Double areaThreshold;

    @NameInMap("Confidence")
    public Double confidence;

    @NameInMap("Inputs")
    public String inputsShrink;

    @NameInMap("JobName")
    public String jobName;

    @NameInMap("ModelProjectId")
    public Long modelProjectId;

    @NameInMap("ModelVersion")
    public String modelVersion;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ShapeDataId")
    public String shapeDataId;

    @NameInMap("ShapeWkt")
    public String shapeWkt;

    public static CreateAIJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAIJobShrinkRequest self = new CreateAIJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAIJobShrinkRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public CreateAIJobShrinkRequest setAreaThreshold(Double areaThreshold) {
        this.areaThreshold = areaThreshold;
        return this;
    }
    public Double getAreaThreshold() {
        return this.areaThreshold;
    }

    public CreateAIJobShrinkRequest setConfidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }
    public Double getConfidence() {
        return this.confidence;
    }

    public CreateAIJobShrinkRequest setInputsShrink(String inputsShrink) {
        this.inputsShrink = inputsShrink;
        return this;
    }
    public String getInputsShrink() {
        return this.inputsShrink;
    }

    public CreateAIJobShrinkRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateAIJobShrinkRequest setModelProjectId(Long modelProjectId) {
        this.modelProjectId = modelProjectId;
        return this;
    }
    public Long getModelProjectId() {
        return this.modelProjectId;
    }

    public CreateAIJobShrinkRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public CreateAIJobShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateAIJobShrinkRequest setShapeDataId(String shapeDataId) {
        this.shapeDataId = shapeDataId;
        return this;
    }
    public String getShapeDataId() {
        return this.shapeDataId;
    }

    public CreateAIJobShrinkRequest setShapeWkt(String shapeWkt) {
        this.shapeWkt = shapeWkt;
        return this;
    }
    public String getShapeWkt() {
        return this.shapeWkt;
    }

}
