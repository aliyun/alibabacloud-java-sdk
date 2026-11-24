// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkSQLEngineStateRequest extends TeaModel {
    /**
     * <p>&lt;props=&quot;china&quot;&gt;The ID of the Enterprise Edition, Basic Edition, or Data Lakehouse Edition cluster.
     * &lt;props=&quot;intl&quot;&gt;The ID of the Data Lakehouse Edition cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the job resource group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_instance</p>
     */
    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    public static GetSparkSQLEngineStateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSparkSQLEngineStateRequest self = new GetSparkSQLEngineStateRequest();
        return TeaModel.build(map, self);
    }

    public GetSparkSQLEngineStateRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public GetSparkSQLEngineStateRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

}
