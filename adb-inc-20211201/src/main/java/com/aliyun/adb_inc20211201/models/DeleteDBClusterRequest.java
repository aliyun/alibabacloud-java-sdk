// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DeleteDBClusterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Force")
    public Boolean force;

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

    public DeleteDBClusterRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
