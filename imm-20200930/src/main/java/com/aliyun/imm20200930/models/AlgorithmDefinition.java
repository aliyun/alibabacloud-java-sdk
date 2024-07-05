// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class AlgorithmDefinition extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8fc6e718-8d19-495f-a510-bcee3c598588</p>
     */
    @NameInMap("AlgorithmDefinitionId")
    public String algorithmDefinitionId;

    /**
     * <strong>example:</strong>
     * <p>2023-05-31T10:19:40.572325888+08:00</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CustomLabels")
    public java.util.List<java.util.Map<String, String>> customLabels;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>algoName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>user1</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <strong>example:</strong>
     * <p>traningtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("TrainingSpecification")
    public TrainingSpecification trainingSpecification;

    /**
     * <strong>example:</strong>
     * <p>2023-05-31T10:19:40.572325888+08:00</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static AlgorithmDefinition build(java.util.Map<String, ?> map) throws Exception {
        AlgorithmDefinition self = new AlgorithmDefinition();
        return TeaModel.build(map, self);
    }

    public AlgorithmDefinition setAlgorithmDefinitionId(String algorithmDefinitionId) {
        this.algorithmDefinitionId = algorithmDefinitionId;
        return this;
    }
    public String getAlgorithmDefinitionId() {
        return this.algorithmDefinitionId;
    }

    public AlgorithmDefinition setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public AlgorithmDefinition setCustomLabels(java.util.List<java.util.Map<String, String>> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getCustomLabels() {
        return this.customLabels;
    }

    public AlgorithmDefinition setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AlgorithmDefinition setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AlgorithmDefinition setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public AlgorithmDefinition setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public AlgorithmDefinition setTrainingSpecification(TrainingSpecification trainingSpecification) {
        this.trainingSpecification = trainingSpecification;
        return this;
    }
    public TrainingSpecification getTrainingSpecification() {
        return this.trainingSpecification;
    }

    public AlgorithmDefinition setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
