// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateImportMigrationRequest extends TeaModel {
    /**
     * <p>The mapping between the source compute engine instance and the destination compute engine instance. The following types of compute engine instances are supported: MaxCompute, E-MapReduce (EMR), Hadoop CDH, and Hologres.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;ODPS&quot;: {       &quot;zxy_8221431_engine&quot;: &quot;wzp_kaifazheban_engine&quot;     },     &quot;EMR&quot;: {         &quot;aaaa&quot;: &quot;bbb&quot;     }   }</p>
     */
    @NameInMap("CalculateEngineMap")
    public String calculateEngineMap;

    /**
     * <p>The rule configured for automatically committing and deploying the import task. The rule contains the following parameters:</p>
     * <ul>
     * <li>resourceAutoCommit: specifies whether resources are automatically committed. The value true indicates yes and the value false indicates no.</li>
     * <li>resourceAutoDeploy: specifies whether resources are automatically deployed. The value true indicates yes and the value false indicates no.</li>
     * <li>functionAutoCommit: specifies whether the function is automatically committed. The value true indicates yes and the value false indicates no.</li>
     * <li>functionAutoDeploy: specifies whether the function is automatically deployed. The value true indicates yes and the value false indicates no.</li>
     * <li>tableAutoCommitToDev: specifies whether the table is automatically committed to the development environment. The value true indicates yes and the value false indicates no.</li>
     * <li>tableAutoCommitToProd: specifies whether the table is automatically committed to the production environment. The value true indicates yes and the value false indicates no.</li>
     * <li>ignoreLock: specifies whether the lock is automatically ignored when an import task is locked. The value true indicates yes and the value false indicates no. If you set this parameter to true for an import task, you can forcefully update the task even if the task is locked.</li>
     * <li>fileAutoCommit: specifies whether the file is automatically committed. The value true indicates yes and the value false indicates no.</li>
     * <li>fileAutoDeploy: specifies whether the file is automatically deployed. The value true indicates yes and the value false indicates no.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;resourceAutoCommit&quot;: false,     &quot;resourceAutoDeploy&quot;: false,     &quot;functionAutoCommit&quot;: false,     &quot;functionAutoDeploy&quot;: false,     &quot;tableAutoCommitToDev&quot;: false,     &quot;tableAutoCommitToProd&quot;: false,     &quot;ignoreLock&quot;: false,     &quot;fileAutoCommit&quot;: false,     &quot;fileAutoDeploy&quot;: false   }</p>
     */
    @NameInMap("CommitRule")
    public String commitRule;

    /**
     * <p>The description of the import package.</p>
     * 
     * <strong>example:</strong>
     * <p>test description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the import task. The name must be unique within the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_import_001</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The path of the import package. <strong>The import package must be uploaded. Example of the upload method:</strong></p>
     * <pre><code class="language-java">        Config config = new Config();
     *         config.setAccessKeyId(accessId);
     *         config.setAccessKeySecret(accessKey);
     *         config.setEndpoint(popEndpoint);
     *         config.setRegionId(regionId);
     * 
     *         Client client = new Client(config);
     * 
     *         CreateImportMigrationAdvanceRequest request = new CreateImportMigrationAdvanceRequest();
     *         request.setName(&quot;test_migration_api_&quot; + System.currentTimeMillis());
     *         request.setProjectId(123456L); 
     *         request.setPackageType(&quot;DATAWORKS_MODEL&quot;);
     *         request.setPackageFileObject(new FileInputStream(&quot;/home/admin/Downloads/test.zip&quot;));
     * 
     *         RuntimeOptions runtime = new RuntimeOptions();
     *         CreateImportMigrationResponse response = client.createImportMigrationAdvance(request, runtime);
     * </code></pre>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/home/admin/xxx/import.zip</p>
     */
    @NameInMap("PackageFile")
    public String packageFile;

    /**
     * <p>The type of the import package. Valid values:</p>
     * <ul>
     * <li>DATAWORKS_MODEL (standard format)</li>
     * <li>DATAWORKS_V2 (Apsara Stack DataWorks V3.6.1 to V3.11)</li>
     * <li>DATAWORKS_V3 (Apsara Stack DataWorks V3.12 and later)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DATAWORKS_MODEL</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <p>The DataWorks workspace ID. You can log on to the DataWorks console and go to the Workspace page to obtain the workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The mapping between the resource group for scheduling and the resource group for Data Integration. The keys and values in the mapping are the identifiers of the resource groups. Specify the mapping in the following format:</p>
     * <pre><code class="language-json">{
     *     &quot;SCHEDULER_RESOURCE_GROUP&quot;: {
     *         &quot;xxx&quot;: &quot;yyy&quot;
     *     },
     *     &quot;DI_RESOURCE_GROUP&quot;: {
     *         &quot;ccc&quot;: &quot;dfdd&quot;
     *     }
     * }
     * </code></pre>
     * 
     * <strong>example:</strong>
     * <p>{&quot;SCHEDULER_RESOURCE_GROUP&quot;: {&quot;xxx&quot;:&quot;yyy&quot;},&quot;DI_RESOURCE_GROUP&quot;:{&quot;ccc&quot;:&quot;ddd&quot;}}</p>
     */
    @NameInMap("ResourceGroupMap")
    public String resourceGroupMap;

    /**
     * <p>The mapping between the prefixes for the names of the source and destination workspaces. When the system performs the import operation, the prefix for the name of the source workspace in the import package is replaced based on the mapping.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;test_workspace_src&quot;: &quot;test_workspace_target&quot;}</p>
     */
    @NameInMap("WorkspaceMap")
    public String workspaceMap;

    public static CreateImportMigrationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImportMigrationRequest self = new CreateImportMigrationRequest();
        return TeaModel.build(map, self);
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

    public CreateImportMigrationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateImportMigrationRequest setPackageFile(String packageFile) {
        this.packageFile = packageFile;
        return this;
    }
    public String getPackageFile() {
        return this.packageFile;
    }

    public CreateImportMigrationRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public CreateImportMigrationRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
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

}
