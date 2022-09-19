// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ReleaseClusterPublicConnectionRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static ReleaseClusterPublicConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseClusterPublicConnectionRequest self = new ReleaseClusterPublicConnectionRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseClusterPublicConnectionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
