// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryMigrateEcuListRequest extends TeaModel {
    /**
     * <p>The ID of the namespace.</p>
     * <br>
     * <p>*   The ID of a custom namespace is in the `region ID:namespace identifier` format. Example: `cn-beijing:test`.</p>
     * <p>*   The ID of the default namespace is in the `region ID` format. Example: `cn-beijing`.</p>
     */
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
