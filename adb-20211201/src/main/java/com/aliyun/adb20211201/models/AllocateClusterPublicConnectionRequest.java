// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class AllocateClusterPublicConnectionRequest extends TeaModel {
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static AllocateClusterPublicConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateClusterPublicConnectionRequest self = new AllocateClusterPublicConnectionRequest();
        return TeaModel.build(map, self);
    }

    public AllocateClusterPublicConnectionRequest setConnectionStringPrefix(String connectionStringPrefix) {
        this.connectionStringPrefix = connectionStringPrefix;
        return this;
    }
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    public AllocateClusterPublicConnectionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
