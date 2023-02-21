// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class KillSparkSQLEngineRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    public static KillSparkSQLEngineRequest build(java.util.Map<String, ?> map) throws Exception {
        KillSparkSQLEngineRequest self = new KillSparkSQLEngineRequest();
        return TeaModel.build(map, self);
    }

    public KillSparkSQLEngineRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public KillSparkSQLEngineRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

}
