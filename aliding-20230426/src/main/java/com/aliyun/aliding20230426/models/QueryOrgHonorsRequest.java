// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryOrgHonorsRequest extends TeaModel {
    @NameInMap("TenantContext")
    public QueryOrgHonorsRequestTenantContext tenantContext;

    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("orgId")
    public Long orgId;

    public static QueryOrgHonorsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrgHonorsRequest self = new QueryOrgHonorsRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrgHonorsRequest setTenantContext(QueryOrgHonorsRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public QueryOrgHonorsRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public QueryOrgHonorsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QueryOrgHonorsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryOrgHonorsRequest setOrgId(Long orgId) {
        this.orgId = orgId;
        return this;
    }
    public Long getOrgId() {
        return this.orgId;
    }

    public static class QueryOrgHonorsRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryOrgHonorsRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            QueryOrgHonorsRequestTenantContext self = new QueryOrgHonorsRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public QueryOrgHonorsRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
