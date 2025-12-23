// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryDentriesInfoRequest extends TeaModel {
    @NameInMap("AppIdsForAppProperties")
    public java.util.List<String> appIdsForAppProperties;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>140901622636</p>
     */
    @NameInMap("DentryId")
    public String dentryId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>22443475065</p>
     */
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("TenantContext")
    public QueryDentriesInfoRequestTenantContext tenantContext;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("WithThumbnail")
    public Boolean withThumbnail;

    public static QueryDentriesInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDentriesInfoRequest self = new QueryDentriesInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryDentriesInfoRequest setAppIdsForAppProperties(java.util.List<String> appIdsForAppProperties) {
        this.appIdsForAppProperties = appIdsForAppProperties;
        return this;
    }
    public java.util.List<String> getAppIdsForAppProperties() {
        return this.appIdsForAppProperties;
    }

    public QueryDentriesInfoRequest setDentryId(String dentryId) {
        this.dentryId = dentryId;
        return this;
    }
    public String getDentryId() {
        return this.dentryId;
    }

    public QueryDentriesInfoRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public QueryDentriesInfoRequest setTenantContext(QueryDentriesInfoRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public QueryDentriesInfoRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public QueryDentriesInfoRequest setWithThumbnail(Boolean withThumbnail) {
        this.withThumbnail = withThumbnail;
        return this;
    }
    public Boolean getWithThumbnail() {
        return this.withThumbnail;
    }

    public static class QueryDentriesInfoRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryDentriesInfoRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            QueryDentriesInfoRequestTenantContext self = new QueryDentriesInfoRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public QueryDentriesInfoRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
