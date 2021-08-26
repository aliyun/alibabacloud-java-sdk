// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateDatasetRequest extends TeaModel {
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("Description")
    public String description;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("DatasetMaxOSSBindCount")
    public Long datasetMaxOSSBindCount;

    @NameInMap("DatasetMaxFileCount")
    public Long datasetMaxFileCount;

    @NameInMap("DatasetMaxEntityCount")
    public Long datasetMaxEntityCount;

    @NameInMap("DatasetMaxRelationCount")
    public Long datasetMaxRelationCount;

    @NameInMap("DatasetMaxTotalFileSize")
    public Long datasetMaxTotalFileSize;

    @NameInMap("ResetItems")
    public java.util.List<String> resetItems;

    public static UpdateDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasetRequest self = new UpdateDatasetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDatasetRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public UpdateDatasetRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public UpdateDatasetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDatasetRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateDatasetRequest setDatasetMaxOSSBindCount(Long datasetMaxOSSBindCount) {
        this.datasetMaxOSSBindCount = datasetMaxOSSBindCount;
        return this;
    }
    public Long getDatasetMaxOSSBindCount() {
        return this.datasetMaxOSSBindCount;
    }

    public UpdateDatasetRequest setDatasetMaxFileCount(Long datasetMaxFileCount) {
        this.datasetMaxFileCount = datasetMaxFileCount;
        return this;
    }
    public Long getDatasetMaxFileCount() {
        return this.datasetMaxFileCount;
    }

    public UpdateDatasetRequest setDatasetMaxEntityCount(Long datasetMaxEntityCount) {
        this.datasetMaxEntityCount = datasetMaxEntityCount;
        return this;
    }
    public Long getDatasetMaxEntityCount() {
        return this.datasetMaxEntityCount;
    }

    public UpdateDatasetRequest setDatasetMaxRelationCount(Long datasetMaxRelationCount) {
        this.datasetMaxRelationCount = datasetMaxRelationCount;
        return this;
    }
    public Long getDatasetMaxRelationCount() {
        return this.datasetMaxRelationCount;
    }

    public UpdateDatasetRequest setDatasetMaxTotalFileSize(Long datasetMaxTotalFileSize) {
        this.datasetMaxTotalFileSize = datasetMaxTotalFileSize;
        return this;
    }
    public Long getDatasetMaxTotalFileSize() {
        return this.datasetMaxTotalFileSize;
    }

    public UpdateDatasetRequest setResetItems(java.util.List<String> resetItems) {
        this.resetItems = resetItems;
        return this;
    }
    public java.util.List<String> getResetItems() {
        return this.resetItems;
    }

}
