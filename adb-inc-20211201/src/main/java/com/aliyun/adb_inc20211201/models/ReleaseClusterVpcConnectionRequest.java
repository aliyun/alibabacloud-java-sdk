// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class ReleaseClusterVpcConnectionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("InsType")
    public String insType;

    public static ReleaseClusterVpcConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseClusterVpcConnectionRequest self = new ReleaseClusterVpcConnectionRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseClusterVpcConnectionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ReleaseClusterVpcConnectionRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public ReleaseClusterVpcConnectionRequest setInsType(String insType) {
        this.insType = insType;
        return this;
    }
    public String getInsType() {
        return this.insType;
    }

}
