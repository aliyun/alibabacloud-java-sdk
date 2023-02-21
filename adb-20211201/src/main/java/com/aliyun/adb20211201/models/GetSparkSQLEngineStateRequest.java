// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkSQLEngineStateRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

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
