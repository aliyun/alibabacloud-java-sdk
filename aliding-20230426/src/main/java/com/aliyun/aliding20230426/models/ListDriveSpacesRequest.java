// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListDriveSpacesRequest extends TeaModel {
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
    @NameInMap("SpaceType")
    public String spaceType;

    @NameInMap("TenantContext")
    public ListDriveSpacesRequestTenantContext tenantContext;

    public static ListDriveSpacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDriveSpacesRequest self = new ListDriveSpacesRequest();
        return TeaModel.build(map, self);
    }

    public ListDriveSpacesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDriveSpacesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDriveSpacesRequest setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

    public ListDriveSpacesRequest setTenantContext(ListDriveSpacesRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public ListDriveSpacesRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class ListDriveSpacesRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static ListDriveSpacesRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            ListDriveSpacesRequestTenantContext self = new ListDriveSpacesRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public ListDriveSpacesRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
