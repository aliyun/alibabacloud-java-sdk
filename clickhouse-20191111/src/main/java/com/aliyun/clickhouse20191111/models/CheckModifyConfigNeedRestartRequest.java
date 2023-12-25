// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckModifyConfigNeedRestartRequest extends TeaModel {
    /**
     * <p>The configuration parameters whose settings are modified.</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The cluster ID. You can call the [DescribeDBClusters](~~170879~~) operation to query information about all the clusters that are deployed in a specific region. The information includes the cluster IDs.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static CheckModifyConfigNeedRestartRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckModifyConfigNeedRestartRequest self = new CheckModifyConfigNeedRestartRequest();
        return TeaModel.build(map, self);
    }

    public CheckModifyConfigNeedRestartRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CheckModifyConfigNeedRestartRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
