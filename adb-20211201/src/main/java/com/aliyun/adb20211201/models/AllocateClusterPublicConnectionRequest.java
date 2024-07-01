// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class AllocateClusterPublicConnectionRequest extends TeaModel {
    /**
     * <p>The prefix of the public endpoint.</p>
     * <ul>
     * <li>The prefix can contain lowercase letters, digits, and hyphens (-). It must start with a lowercase letter.</li>
     * <li>The prefix can be up to 30 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test12</p>
     */
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1z5d2q71is2****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Engine")
    public String engine;

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

    public AllocateClusterPublicConnectionRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

}
