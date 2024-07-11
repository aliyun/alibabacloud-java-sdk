// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class QueryXpackRelateDBRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-bp1qtz9rcbbt3p6ng</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HasSingleNode")
    public Boolean hasSingleNode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hbase</p>
     */
    @NameInMap("RelateDbType")
    public String relateDbType;

    public static QueryXpackRelateDBRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryXpackRelateDBRequest self = new QueryXpackRelateDBRequest();
        return TeaModel.build(map, self);
    }

    public QueryXpackRelateDBRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public QueryXpackRelateDBRequest setHasSingleNode(Boolean hasSingleNode) {
        this.hasSingleNode = hasSingleNode;
        return this;
    }
    public Boolean getHasSingleNode() {
        return this.hasSingleNode;
    }

    public QueryXpackRelateDBRequest setRelateDbType(String relateDbType) {
        this.relateDbType = relateDbType;
        return this;
    }
    public String getRelateDbType() {
        return this.relateDbType;
    }

}
