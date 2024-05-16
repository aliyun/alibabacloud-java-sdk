// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateImportMigrationAdvanceRequest extends TeaModel {
    /**
     * <p>The mapping between the source compute engine instance and the destination compute engine instance.</p>
     * <br>
     * <p>The following types of compute engine instances are supported: MaxCompute, E-MapReduce (EMR), Hadoop CDH, and Hologres.</p>
     */
    @NameInMap("CalculateEngineMap")
    public String calculateEngineMap;

    /**
     * <p>The rule configured for automatically committing and deploying the import task. The rule contains the following parameters:</p>
     * <br>
     * <p>*   resourceAutoCommit: specifies whether resources are automatically committed. The value true indicates that the resources are automatically committed, and the value false indicates that the resources are not automatically committed.</p>
     * <p>*   resourceAutoDeploy: specifies whether resources are automatically deployed. The value true indicates that the resources are automatically deployed, and the value false indicates that the resources are not automatically deployed.</p>
     * <p>*   functionAutoCommit: specifies whether the function is automatically committed. The value true indicates that the function is automatically committed, and the value false indicates that the function is not automatically committed.</p>
     * <p>*   functionAutoDeploy: specifies whether the function is automatically deployed. The value true indicates that the function is automatically deployed, and the value false indicates that the function is not automatically deployed.</p>
     * <p>*   tableAutoCommitToDev: specifies whether the table is automatically committed to the development environment. The value true indicates that the table is automatically committed to the development environment, and the value false indicates that the table is not automatically committed to the development environment.</p>
     * <p>*   tableAutoCommitToProd: specifies whether the table is automatically committed to the production environment. The value true indicates that the table is automatically committed to the production environment, and the value false indicates that the table is not automatically committed to the production environment.</p>
     * <p>*   ignoreLock: specifies whether the lock is automatically ignored when an import task is locked. The value true indicates that the lock is automatically ignored, and the value false indicates that the lock is not automatically ignored. If you set this parameter to true for an import task, you can forcibly update the task even if the task is locked.</p>
     * <p>*   fileAutoCommit: specifies whether the file is automatically committed. The value true indicates that the file is automatically committed, and the value false indicates that the file is not automatically committed.</p>
     * <p>*   fileAutoDeploy: specifies whether the file is automatically deployed. The value true indicates that the file is automatically deployed, and the value false indicates that the file is not automatically deployed.</p>
     */
    @NameInMap("CommitRule")
    public String commitRule;

    /**
     * <p>The description of the import package.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the import task. The name must be unique within the workspace.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The path of the import package.</p>
     * <br>
     * <p>**The import package must be uploaded. Example of the upload method:**`  Config config = new Config(); config.setAccessKeyId(accessId); config.setAccessKeySecret(accessKey); config.setEndpoint(popEndpoint); config.setRegionId(regionId); Client client = new Client(config); CreateImportMigrationAdvanceRequest request = new CreateImportMigrationAdvanceRequest(); request.setName("test_migration_api_" + System.currentTimeMillis()); request.setProjectId(123456L); request.setPackageType("DATAWORKS_MODEL"); request.setPackageFileObject(new FileInputStream("/home/admin/Downloads/test.zip")); RuntimeOptions runtime = new RuntimeOptions(); CreateImportMigrationResponse response = client.createImportMigrationAdvance(request, runtime); ... `</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PackageFile")
    public java.io.InputStream packageFileObject;

    /**
     * <p>The type of the import package. Valid values:</p>
     * <br>
     * <p>*   DATAWORKS_MODEL (standard format)</p>
     * <p>*   DATAWORKS_V2 (Apsara Stack DataWorks V3.6.1 to V3.11)</p>
     * <p>*   DATAWORKS_V3 (Apsara Stack DataWorks V3.12 and later)</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the DataWorks console and go to the Workspace Management page to obtain the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The mapping between the resource group for scheduling and the resource group for Data Integration. The keys and values in the mapping are the identifiers of the resource groups. Specify the mapping in the following format:</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>{</p>
     * <p>    "SCHEDULER_RESOURCE_GROUP": {</p>
     * <p>        "xxx": "yyy"</p>
     * <p>    },</p>
     * <p>    "DI_RESOURCE_GROUP": {</p>
     * <p>        "ccc": "dfdd"</p>
     * <p>    }</p>
     * <p>}</p>
     * <br>
     * <p>                                </p>
     * <p>```</p>
     */
    @NameInMap("ResourceGroupMap")
    public String resourceGroupMap;

    /**
     * <p>The mapping between the prefixes for the names of the source and destination workspaces. When the system performs the import operation, the prefix for the name of the source workspace in the import package is replaced based on the mapping.</p>
     */
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
