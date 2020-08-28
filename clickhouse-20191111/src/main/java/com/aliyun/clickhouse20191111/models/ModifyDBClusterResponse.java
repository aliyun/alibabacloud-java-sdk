// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBClusterResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBCluster")
    @Validation(required = true)
    public String DBCluster;

    public static ModifyDBClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterResponse self = new ModifyDBClusterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDBClusterResponse setDBCluster(String DBCluster) {
        this.DBCluster = DBCluster;
        return this;
    }
    public String getDBCluster() {
        return this.DBCluster;
    }

}
