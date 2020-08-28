// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DeleteDBClusterRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    public static DeleteDBClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBClusterRequest self = new DeleteDBClusterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDBClusterRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
