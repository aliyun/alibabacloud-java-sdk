// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TestNetworkConnectionRequest extends TeaModel {
    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("DatasourceName")
    @Validation(required = true)
    public String datasourceName;

    @NameInMap("EnvType")
    @Validation(required = true)
    public String envType;

    @NameInMap("ResourceGroup")
    @Validation(required = true)
    public String resourceGroup;

    public static TestNetworkConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        TestNetworkConnectionRequest self = new TestNetworkConnectionRequest();
        return TeaModel.build(map, self);
    }

    public TestNetworkConnectionRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
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

    public TestNetworkConnectionRequest setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public String getResourceGroup() {
        return this.resourceGroup;
    }

}
