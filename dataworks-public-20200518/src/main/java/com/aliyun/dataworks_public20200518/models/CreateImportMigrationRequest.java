// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateImportMigrationRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("Name")
    public String name;

    @NameInMap("PackageType")
    public String packageType;

    @NameInMap("PackageFile")
    public String packageFile;

    @NameInMap("ResourceGroupMap")
    public String resourceGroupMap;

    @NameInMap("WorkspaceMap")
    public String workspaceMap;

    @NameInMap("CalculateEngineMap")
    public String calculateEngineMap;

    @NameInMap("CommitRule")
    public String commitRule;

    @NameInMap("Description")
    public String description;

    public static CreateImportMigrationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImportMigrationRequest self = new CreateImportMigrationRequest();
        return TeaModel.build(map, self);
    }

    public CreateImportMigrationRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateImportMigrationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateImportMigrationRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public CreateImportMigrationRequest setPackageFile(String packageFile) {
        this.packageFile = packageFile;
        return this;
    }
    public String getPackageFile() {
        return this.packageFile;
    }

    public CreateImportMigrationRequest setResourceGroupMap(String resourceGroupMap) {
        this.resourceGroupMap = resourceGroupMap;
        return this;
    }
    public String getResourceGroupMap() {
        return this.resourceGroupMap;
    }

    public CreateImportMigrationRequest setWorkspaceMap(String workspaceMap) {
        this.workspaceMap = workspaceMap;
        return this;
    }
    public String getWorkspaceMap() {
        return this.workspaceMap;
    }

    public CreateImportMigrationRequest setCalculateEngineMap(String calculateEngineMap) {
        this.calculateEngineMap = calculateEngineMap;
        return this;
    }
    public String getCalculateEngineMap() {
        return this.calculateEngineMap;
    }

    public CreateImportMigrationRequest setCommitRule(String commitRule) {
        this.commitRule = commitRule;
        return this;
    }
    public String getCommitRule() {
        return this.commitRule;
    }

    public CreateImportMigrationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
