// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryMigrateRegionListRequest extends TeaModel {
    /**
     * <p>The ID of the namespace.</p>
     */
    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    public static QueryMigrateRegionListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMigrateRegionListRequest self = new QueryMigrateRegionListRequest();
        return TeaModel.build(map, self);
    }

    public QueryMigrateRegionListRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

}
