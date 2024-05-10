// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryDentryRequest extends TeaModel {
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
    public QueryDentryRequestTenantContext tenantContext;

    public static QueryDentryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDentryRequest self = new QueryDentryRequest();
        return TeaModel.build(map, self);
    }

    public QueryDentryRequest setDentryId(String dentryId) {
        this.dentryId = dentryId;
        return this;
    }
    public String getDentryId() {
        return this.dentryId;
    }

    public QueryDentryRequest setIncludeSpace(Boolean includeSpace) {
        this.includeSpace = includeSpace;
        return this;
    }
    public Boolean getIncludeSpace() {
        return this.includeSpace;
    }

    public QueryDentryRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public QueryDentryRequest setTenantContext(QueryDentryRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public QueryDentryRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class QueryDentryRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryDentryRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            QueryDentryRequestTenantContext self = new QueryDentryRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public QueryDentryRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
