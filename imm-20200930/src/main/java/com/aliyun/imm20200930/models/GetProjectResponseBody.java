// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetProjectResponseBody extends TeaModel {
    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    // 项目描述
    @NameInMap("Description")
    public String description;

    // 服务角色
    @NameInMap("ServiceRole")
    public String serviceRole;

    // 工作流
    @NameInMap("TemplateId")
    public String templateId;

    // 项目创建时间
    @NameInMap("CreateTime")
    public Long createTime;

    // 项目修改时间
    @NameInMap("UpdateTime")
    public Long updateTime;

    // 项目QPS
    @NameInMap("ProjectQPS")
    public Long projectQPS;

    // 项目TPS
    @NameInMap("ProjectTPS")
    public Long projectTPS;

    // 最大媒体集数量
    @NameInMap("ProjectMaxDatasetCount")
    public Long projectMaxDatasetCount;

    // 当前项目每个媒体集最大绑定数
    @NameInMap("DatasetMaxOSSBindCount")
    public Long datasetMaxOSSBindCount;

    // 当前项目每个媒体集最大文件数
    @NameInMap("DatasetMaxFileCount")
    public Long datasetMaxFileCount;

    // 当前项目每个媒体集最大实体数
    @NameInMap("DatasetMaxEntityCount")
    public Long datasetMaxEntityCount;

    // 当前项目每个媒体集最大关系数
    @NameInMap("DatasetMaxRelationCount")
    public Long datasetMaxRelationCount;

    // 当前项目每个媒体集最大文件总大小
    @NameInMap("DatasetMaxTotalFileSize")
    public Long datasetMaxTotalFileSize;

    // 媒体集数量
    @NameInMap("DatasetCount")
    public Long datasetCount;

    // 项目当前文件数量
    @NameInMap("FileCount")
    public Long fileCount;

    // 项目当前文件总大小
    @NameInMap("TotalFileSize")
    public Long totalFileSize;

    // 本次请求的唯一 ID
    @NameInMap("RequestId")
    public String requestId;

    public static GetProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectResponseBody self = new GetProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetProjectResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetProjectResponseBody setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }
    public String getServiceRole() {
        return this.serviceRole;
    }

    public GetProjectResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetProjectResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetProjectResponseBody setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public GetProjectResponseBody setProjectQPS(Long projectQPS) {
        this.projectQPS = projectQPS;
        return this;
    }
    public Long getProjectQPS() {
        return this.projectQPS;
    }

    public GetProjectResponseBody setProjectTPS(Long projectTPS) {
        this.projectTPS = projectTPS;
        return this;
    }
    public Long getProjectTPS() {
        return this.projectTPS;
    }

    public GetProjectResponseBody setProjectMaxDatasetCount(Long projectMaxDatasetCount) {
        this.projectMaxDatasetCount = projectMaxDatasetCount;
        return this;
    }
    public Long getProjectMaxDatasetCount() {
        return this.projectMaxDatasetCount;
    }

    public GetProjectResponseBody setDatasetMaxOSSBindCount(Long datasetMaxOSSBindCount) {
        this.datasetMaxOSSBindCount = datasetMaxOSSBindCount;
        return this;
    }
    public Long getDatasetMaxOSSBindCount() {
        return this.datasetMaxOSSBindCount;
    }

    public GetProjectResponseBody setDatasetMaxFileCount(Long datasetMaxFileCount) {
        this.datasetMaxFileCount = datasetMaxFileCount;
        return this;
    }
    public Long getDatasetMaxFileCount() {
        return this.datasetMaxFileCount;
    }

    public GetProjectResponseBody setDatasetMaxEntityCount(Long datasetMaxEntityCount) {
        this.datasetMaxEntityCount = datasetMaxEntityCount;
        return this;
    }
    public Long getDatasetMaxEntityCount() {
        return this.datasetMaxEntityCount;
    }

    public GetProjectResponseBody setDatasetMaxRelationCount(Long datasetMaxRelationCount) {
        this.datasetMaxRelationCount = datasetMaxRelationCount;
        return this;
    }
    public Long getDatasetMaxRelationCount() {
        return this.datasetMaxRelationCount;
    }

    public GetProjectResponseBody setDatasetMaxTotalFileSize(Long datasetMaxTotalFileSize) {
        this.datasetMaxTotalFileSize = datasetMaxTotalFileSize;
        return this;
    }
    public Long getDatasetMaxTotalFileSize() {
        return this.datasetMaxTotalFileSize;
    }

    public GetProjectResponseBody setDatasetCount(Long datasetCount) {
        this.datasetCount = datasetCount;
        return this;
    }
    public Long getDatasetCount() {
        return this.datasetCount;
    }

    public GetProjectResponseBody setFileCount(Long fileCount) {
        this.fileCount = fileCount;
        return this;
    }
    public Long getFileCount() {
        return this.fileCount;
    }

    public GetProjectResponseBody setTotalFileSize(Long totalFileSize) {
        this.totalFileSize = totalFileSize;
        return this;
    }
    public Long getTotalFileSize() {
        return this.totalFileSize;
    }

    public GetProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
