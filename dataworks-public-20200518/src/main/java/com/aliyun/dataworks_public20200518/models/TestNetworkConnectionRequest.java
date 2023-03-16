// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TestNetworkConnectionRequest extends TeaModel {
    /**
     * <p>The name of the data source.</p>
     */
    @NameInMap("DatasourceName")
    public String datasourceName;

    /**
     * <p>The environment to which the data source belongs. Valid values:</p>
     * <br>
     * <p>*   0: development environment</p>
     * <p>*   1: production environment</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The ID of the DataWorks workspace to which the data source belongs. You can call the [ListProjects](~~178393~~) operation to query the ID of the workspace.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The identifier of the resource group. You can call the [ListResourceGroups](~~173913~~) operation to query the identifier of the resource group.</p>
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
