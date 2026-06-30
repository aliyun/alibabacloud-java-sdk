// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryDentryShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DentryId")
    public String dentryId;

    @NameInMap("IncludeSpace")
    public Boolean includeSpace;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static QueryDentryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDentryShrinkRequest self = new QueryDentryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryDentryShrinkRequest setDentryId(String dentryId) {
        this.dentryId = dentryId;
        return this;
    }
    public String getDentryId() {
        return this.dentryId;
    }

    public QueryDentryShrinkRequest setIncludeSpace(Boolean includeSpace) {
        this.includeSpace = includeSpace;
        return this;
    }
    public Boolean getIncludeSpace() {
        return this.includeSpace;
    }

    public QueryDentryShrinkRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public QueryDentryShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
