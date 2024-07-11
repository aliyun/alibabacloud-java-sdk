// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class XpackRelateDBRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-bp1qtz9rcbbt3****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-bp16o0pd52e3****</p>
     */
    @NameInMap("DbClusterIds")
    public String dbClusterIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hbase</p>
     */
    @NameInMap("RelateDbType")
    public String relateDbType;

    public static XpackRelateDBRequest build(java.util.Map<String, ?> map) throws Exception {
        XpackRelateDBRequest self = new XpackRelateDBRequest();
        return TeaModel.build(map, self);
    }

    public XpackRelateDBRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public XpackRelateDBRequest setDbClusterIds(String dbClusterIds) {
        this.dbClusterIds = dbClusterIds;
        return this;
    }
    public String getDbClusterIds() {
        return this.dbClusterIds;
    }

    public XpackRelateDBRequest setRelateDbType(String relateDbType) {
        this.relateDbType = relateDbType;
        return this;
    }
    public String getRelateDbType() {
        return this.relateDbType;
    }

}
