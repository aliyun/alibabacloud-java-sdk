// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TestNetworkConnectionRequest extends TeaModel {
    /**
     * <p>The name of the data source.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasourceName")
    public String datasourceName;

    /**
     * <p>The environment to which the data source belongs. Valid values:</p>
     * <br>
     * <p>*   0: development environment</p>
     * <p>*   1: production environment</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The ID of the DataWorks workspace to which the data source belongs. You can call the [ListProjects](https://help.aliyun.com/document_detail/178393.html) operation to query the ID of the workspace.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The identifier of the resource group. You can call the [ListResourceGroups](https://help.aliyun.com/document_detail/173913.html) operation to query the identifier of the resource group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceGroup")
    public String resourceGroup;

    public static TestNetworkConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        TestNetworkConnectionRequest self = new TestNetworkConnectionRequest();
        return TeaModel.build(map, self);
    }

    public TestNetworkConnectionRequest setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
        return this;
    }
    public String getDatasourceName() {
        return this.datasourceName;
    }

    public TestNetworkConnectionRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public TestNetworkConnectionRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public TestNetworkConnectionRequest setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public String getResourceGroup() {
        return this.resourceGroup;
    }

}
