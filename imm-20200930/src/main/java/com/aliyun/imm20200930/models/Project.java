// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Project extends TeaModel {
    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 项目当前媒体集数
    @NameInMap("DatasetCount")
    public Long datasetCount;

    // 项目最多绑定数
    @NameInMap("DatasetMaxBindCount")
    public Long datasetMaxBindCount;

    // 项目最多实体数
    @NameInMap("DatasetMaxEntityCount")
    public Long datasetMaxEntityCount;

    // 项目最多文件数
    @NameInMap("DatasetMaxFileCount")
    public Long datasetMaxFileCount;

    // 项目最多关系数
    @NameInMap("DatasetMaxRelationCount")
    public Long datasetMaxRelationCount;

    // 项目最大文件总大小
    @NameInMap("DatasetMaxTotalFileSize")
    public Long datasetMaxTotalFileSize;

    // 描述
    @NameInMap("Description")
    public String description;

    // 项目最大并发数
    @NameInMap("EngineConcurrency")
    public Long engineConcurrency;

    // 项目当前文件数
    @NameInMap("FileCount")
    public Long fileCount;

    // 项目最多媒体集数量
    @NameInMap("ProjectMaxDatasetCount")
    public Long projectMaxDatasetCount;

    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    // 项目QPS
    @NameInMap("ProjectQueriesPerSecond")
    public Long projectQueriesPerSecond;

    // 服务角色
    @NameInMap("ServiceRole")
    public String serviceRole;

    // 项目当前文件总大小
    @NameInMap("TotalFileSize")
    public Long totalFileSize;

    // 更新时间
    @NameInMap("UpdateTime")
    public String updateTime;

    public static Project build(java.util.Map<String, ?> map) throws Exception {
        Project self = new Project();
        return TeaModel.build(map, self);
    }

    public Project setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Project setDatasetCount(Long datasetCount) {
        this.datasetCount = datasetCount;
        return this;
    }
    public Long getDatasetCount() {
        return this.datasetCount;
    }

    public Project setDatasetMaxBindCount(Long datasetMaxBindCount) {
        this.datasetMaxBindCount = datasetMaxBindCount;
        return this;
    }
    public Long getDatasetMaxBindCount() {
        return this.datasetMaxBindCount;
    }

    public Project setDatasetMaxEntityCount(Long datasetMaxEntityCount) {
        this.datasetMaxEntityCount = datasetMaxEntityCount;
        return this;
    }
    public Long getDatasetMaxEntityCount() {
        return this.datasetMaxEntityCount;
    }

    public Project setDatasetMaxFileCount(Long datasetMaxFileCount) {
        this.datasetMaxFileCount = datasetMaxFileCount;
        return this;
    }
    public Long getDatasetMaxFileCount() {
        return this.datasetMaxFileCount;
    }

    public Project setDatasetMaxRelationCount(Long datasetMaxRelationCount) {
        this.datasetMaxRelationCount = datasetMaxRelationCount;
        return this;
    }
    public Long getDatasetMaxRelationCount() {
        return this.datasetMaxRelationCount;
    }

    public Project setDatasetMaxTotalFileSize(Long datasetMaxTotalFileSize) {
        this.datasetMaxTotalFileSize = datasetMaxTotalFileSize;
        return this;
    }
    public Long getDatasetMaxTotalFileSize() {
        return this.datasetMaxTotalFileSize;
    }

    public Project setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Project setEngineConcurrency(Long engineConcurrency) {
        this.engineConcurrency = engineConcurrency;
        return this;
    }
    public Long getEngineConcurrency() {
        return this.engineConcurrency;
    }

    public Project setFileCount(Long fileCount) {
        this.fileCount = fileCount;
        return this;
    }
    public Long getFileCount() {
        return this.fileCount;
    }

    public Project setProjectMaxDatasetCount(Long projectMaxDatasetCount) {
        this.projectMaxDatasetCount = projectMaxDatasetCount;
        return this;
    }
    public Long getProjectMaxDatasetCount() {
        return this.projectMaxDatasetCount;
    }

    public Project setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public Project setProjectQueriesPerSecond(Long projectQueriesPerSecond) {
        this.projectQueriesPerSecond = projectQueriesPerSecond;
        return this;
    }
    public Long getProjectQueriesPerSecond() {
        return this.projectQueriesPerSecond;
    }

    public Project setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }
    public String getServiceRole() {
        return this.serviceRole;
    }

    public Project setTotalFileSize(Long totalFileSize) {
        this.totalFileSize = totalFileSize;
        return this;
    }
    public Long getTotalFileSize() {
        return this.totalFileSize;
    }

    public Project setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
