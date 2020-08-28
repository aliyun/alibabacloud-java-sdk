// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class AllocateClusterPublicConnectionRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    public static AllocateClusterPublicConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateClusterPublicConnectionRequest self = new AllocateClusterPublicConnectionRequest();
        return TeaModel.build(map, self);
    }

    public AllocateClusterPublicConnectionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public AllocateClusterPublicConnectionRequest setConnectionStringPrefix(String connectionStringPrefix) {
        this.connectionStringPrefix = connectionStringPrefix;
        return this;
    }
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

}
