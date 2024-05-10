// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetSpaceDirectoriesRequest extends TeaModel {
    @NameInMap("DentryId")
    public String dentryId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("TenantContext")
    public GetSpaceDirectoriesRequestTenantContext tenantContext;

    public static GetSpaceDirectoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSpaceDirectoriesRequest self = new GetSpaceDirectoriesRequest();
        return TeaModel.build(map, self);
    }

    public GetSpaceDirectoriesRequest setDentryId(String dentryId) {
        this.dentryId = dentryId;
        return this;
    }
    public String getDentryId() {
        return this.dentryId;
    }

    public GetSpaceDirectoriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetSpaceDirectoriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetSpaceDirectoriesRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public GetSpaceDirectoriesRequest setTenantContext(GetSpaceDirectoriesRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetSpaceDirectoriesRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetSpaceDirectoriesRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static GetSpaceDirectoriesRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetSpaceDirectoriesRequestTenantContext self = new GetSpaceDirectoriesRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetSpaceDirectoriesRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
