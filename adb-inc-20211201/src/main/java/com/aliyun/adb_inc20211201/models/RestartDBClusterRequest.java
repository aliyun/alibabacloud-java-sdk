// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class RestartDBClusterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static RestartDBClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartDBClusterRequest self = new RestartDBClusterRequest();
        return TeaModel.build(map, self);
    }

    public RestartDBClusterRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
