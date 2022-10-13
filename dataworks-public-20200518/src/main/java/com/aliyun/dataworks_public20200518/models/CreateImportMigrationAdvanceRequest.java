// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateImportMigrationAdvanceRequest extends TeaModel {
    @NameInMap("CalculateEngineMap")
    public String calculateEngineMap;

    @NameInMap("CommitRule")
    public String commitRule;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("PackageFile")
    public java.io.InputStream packageFileObject;

    @NameInMap("PackageType")
    public String packageType;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ResourceGroupMap")
    public String resourceGroupMap;

    @NameInMap("WorkspaceMap")
    public String workspaceMap;

    public static CreateImportMigrationAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImportMigrationAdvanceRequest self = new CreateImportMigrationAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateImportMigrationAdvanceRequest setCalculateEngineMap(String calculateEngineMap) {
        this.calculateEngineMap = calculateEngineMap;
        return this;
    }
    public String getCalculateEngineMap() {
        return this.calculateEngineMap;
    }

    public CreateImportMigrationAdvanceRequest setCommitRule(String commitRule) {
        this.commitRule = commitRule;
        return this;
    }
    public String getCommitRule() {
        return this.commitRule;
    }

    public CreateImportMigrationAdvanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateImportMigrationAdvanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateImportMigrationAdvanceRequest setPackageFileObject(java.io.InputStream packageFileObject) {
        this.packageFileObject = packageFileObject;
        return this;
    }
    public java.io.InputStream getPackageFileObject() {
        return this.packageFileObject;
    }

    public CreateImportMigrationAdvanceRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public CreateImportMigrationAdvanceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateImportMigrationAdvanceRequest setResourceGroupMap(String resourceGroupMap) {
        this.resourceGroupMap = resourceGroupMap;
        return this;
    }
    public String getResourceGroupMap() {
        return this.resourceGroupMap;
    }

    public CreateImportMigrationAdvanceRequest setWorkspaceMap(String workspaceMap) {
        this.workspaceMap = workspaceMap;
        return this;
    }
    public String getWorkspaceMap() {
        return this.workspaceMap;
    }

}
