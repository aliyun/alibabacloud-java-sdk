// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryUserHonorsRequest extends TeaModel {
    @NameInMap("TenantContext")
    public QueryUserHonorsRequestTenantContext tenantContext;

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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("userId")
    public String userId;

    public static QueryUserHonorsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserHonorsRequest self = new QueryUserHonorsRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserHonorsRequest setTenantContext(QueryUserHonorsRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public QueryUserHonorsRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public QueryUserHonorsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QueryUserHonorsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryUserHonorsRequest setOrgId(Long orgId) {
        this.orgId = orgId;
        return this;
    }
    public Long getOrgId() {
        return this.orgId;
    }

    public QueryUserHonorsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class QueryUserHonorsRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryUserHonorsRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            QueryUserHonorsRequestTenantContext self = new QueryUserHonorsRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public QueryUserHonorsRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
