// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Dataset extends TeaModel {
    // 媒体集当前绑定数
    @NameInMap("BindCount")
    public Long bindCount;

    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 媒体集最大绑定数
    @NameInMap("DatasetMaxBindCount")
    public Long datasetMaxBindCount;

    // 媒体集最多实体数量
    @NameInMap("DatasetMaxEntityCount")
    public Long datasetMaxEntityCount;

    // 媒体集最多文件数量
    @NameInMap("DatasetMaxFileCount")
    public Long datasetMaxFileCount;

    // 媒体集最多关系数量
    @NameInMap("DatasetMaxRelationCount")
    public Long datasetMaxRelationCount;

    // 媒体集最大文件总大小
    @NameInMap("DatasetMaxTotalFileSize")
    public Long datasetMaxTotalFileSize;

    // 媒体集名称
    @NameInMap("DatasetName")
    public String datasetName;

    // 描述
    @NameInMap("Description")
    public String description;

    // 媒体集当前文件数
    @NameInMap("FileCount")
    public Long fileCount;

    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    // 媒体集当前文件总大小
    @NameInMap("TotalFileSize")
    public Long totalFileSize;

    // 更新时间
    @NameInMap("UpdateTime")
    public String updateTime;

    public static Dataset build(java.util.Map<String, ?> map) throws Exception {
        Dataset self = new Dataset();
        return TeaModel.build(map, self);
    }

    public Dataset setBindCount(Long bindCount) {
        this.bindCount = bindCount;
        return this;
    }
    public Long getBindCount() {
        return this.bindCount;
    }

    public Dataset setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Dataset setDatasetMaxBindCount(Long datasetMaxBindCount) {
        this.datasetMaxBindCount = datasetMaxBindCount;
        return this;
    }
    public Long getDatasetMaxBindCount() {
        return this.datasetMaxBindCount;
    }

    public Dataset setDatasetMaxEntityCount(Long datasetMaxEntityCount) {
        this.datasetMaxEntityCount = datasetMaxEntityCount;
        return this;
    }
    public Long getDatasetMaxEntityCount() {
        return this.datasetMaxEntityCount;
    }

    public Dataset setDatasetMaxFileCount(Long datasetMaxFileCount) {
        this.datasetMaxFileCount = datasetMaxFileCount;
        return this;
    }
    public Long getDatasetMaxFileCount() {
        return this.datasetMaxFileCount;
    }

    public Dataset setDatasetMaxRelationCount(Long datasetMaxRelationCount) {
        this.datasetMaxRelationCount = datasetMaxRelationCount;
        return this;
    }
    public Long getDatasetMaxRelationCount() {
        return this.datasetMaxRelationCount;
    }

    public Dataset setDatasetMaxTotalFileSize(Long datasetMaxTotalFileSize) {
        this.datasetMaxTotalFileSize = datasetMaxTotalFileSize;
        return this;
    }
    public Long getDatasetMaxTotalFileSize() {
        return this.datasetMaxTotalFileSize;
    }

    public Dataset setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public Dataset setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Dataset setFileCount(Long fileCount) {
        this.fileCount = fileCount;
        return this;
    }
    public Long getFileCount() {
        return this.fileCount;
    }

    public Dataset setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public Dataset setTotalFileSize(Long totalFileSize) {
        this.totalFileSize = totalFileSize;
        return this;
    }
    public Long getTotalFileSize() {
        return this.totalFileSize;
    }

    public Dataset setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
