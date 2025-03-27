// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class TestDataSourceConnectivityRequest extends TeaModel {
    /**
     * <p>The ID of the data source for which you want to test the network connectivity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>144544</p>
     */
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    /**
     * <p>The DataWorks workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The resource group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Serverless_res_group_524257424564736_6831777003XXXXX</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static TestDataSourceConnectivityRequest build(java.util.Map<String, ?> map) throws Exception {
        TestDataSourceConnectivityRequest self = new TestDataSourceConnectivityRequest();
        return TeaModel.build(map, self);
    }

    public TestDataSourceConnectivityRequest setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public TestDataSourceConnectivityRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public TestDataSourceConnectivityRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
