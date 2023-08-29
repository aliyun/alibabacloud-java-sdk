// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryConferenceMembersRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("TenantContext")
    public QueryConferenceMembersRequestTenantContext tenantContext;

    @NameInMap("conferenceId")
    public String conferenceId;

    public static QueryConferenceMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConferenceMembersRequest self = new QueryConferenceMembersRequest();
        return TeaModel.build(map, self);
    }

    public QueryConferenceMembersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QueryConferenceMembersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryConferenceMembersRequest setTenantContext(QueryConferenceMembersRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public QueryConferenceMembersRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public QueryConferenceMembersRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public static class QueryConferenceMembersRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryConferenceMembersRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            QueryConferenceMembersRequestTenantContext self = new QueryConferenceMembersRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public QueryConferenceMembersRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
