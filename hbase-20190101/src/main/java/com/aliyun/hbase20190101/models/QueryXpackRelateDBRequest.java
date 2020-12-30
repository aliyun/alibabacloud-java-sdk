// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class QueryXpackRelateDBRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("RelateDbType")
    public String relateDbType;

    @NameInMap("HasSingleNode")
    public Boolean hasSingleNode;

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

    public QueryXpackRelateDBRequest setRelateDbType(String relateDbType) {
        this.relateDbType = relateDbType;
        return this;
    }
    public String getRelateDbType() {
        return this.relateDbType;
    }

    public QueryXpackRelateDBRequest setHasSingleNode(Boolean hasSingleNode) {
        this.hasSingleNode = hasSingleNode;
        return this;
    }
    public Boolean getHasSingleNode() {
        return this.hasSingleNode;
    }

}
