// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListTeamsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>2023-05-15T11:29Z</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("TenantContext")
    public ListTeamsRequestTenantContext tenantContext;

    public static ListTeamsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTeamsRequest self = new ListTeamsRequest();
        return TeaModel.build(map, self);
    }

    public ListTeamsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTeamsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTeamsRequest setTenantContext(ListTeamsRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public ListTeamsRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class ListTeamsRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static ListTeamsRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            ListTeamsRequestTenantContext self = new ListTeamsRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public ListTeamsRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
