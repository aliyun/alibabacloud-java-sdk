// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryMigrateEcuListRequest extends TeaModel {
    /**
     * <p>The ID of the namespace.</p>
     * <ul>
     * <li>The ID of a custom namespace is in the <code>region ID:namespace identifier</code> format. Example: <code>cn-beijing:test</code>.</li>
     * <li>The ID of the default namespace is in the <code>region ID</code> format. Example: <code>cn-beijing</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou or cn-hangzhou:test</p>
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
