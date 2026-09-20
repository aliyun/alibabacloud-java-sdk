// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class QueryXpackRelateDBRequest extends TeaModel {
    /**
     * <p>The instance ID of the current Spark instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-bp1qtz9rcbbt3p6ng</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is valid only when bds queries associated HBase instances.</p>
     * <ul>
     * <li><p>true: Single-node HBase instances are included.</p>
     * </li>
     * <li><p>false: Single-node HBase instances are not included. This parameter is optional. For backward compatibility, single-node HBase instances are included when this parameter is left empty.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HasSingleNode")
    public Boolean hasSingleNode;

    /**
     * <p>The type of database to query for association.</p>
     * <ul>
     * <li>spark can be associated with hdfs, hbase, mongodb, mysql, polardb_mysql, redis, and geomesa.</li>
     * <li>bds can be associated with hbase, spark, and hbaseue.</li>
     * </ul>
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
