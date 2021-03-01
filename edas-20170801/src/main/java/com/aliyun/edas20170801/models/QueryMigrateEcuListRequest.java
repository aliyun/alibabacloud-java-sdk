// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryMigrateEcuListRequest extends TeaModel {
    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    public static QueryMigrateEcuListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMigrateEcuListRequest self = new QueryMigrateEcuListRequest();
        return TeaModel.build(map, self);
    }

    public QueryMigrateEcuListRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

}
