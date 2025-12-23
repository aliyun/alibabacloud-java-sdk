// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryDentriesInfoShrinkRequest extends TeaModel {
    @NameInMap("AppIdsForAppProperties")
    public String appIdsForAppPropertiesShrink;

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
    public String tenantContextShrink;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("WithThumbnail")
    public Boolean withThumbnail;

    public static QueryDentriesInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDentriesInfoShrinkRequest self = new QueryDentriesInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryDentriesInfoShrinkRequest setAppIdsForAppPropertiesShrink(String appIdsForAppPropertiesShrink) {
        this.appIdsForAppPropertiesShrink = appIdsForAppPropertiesShrink;
        return this;
    }
    public String getAppIdsForAppPropertiesShrink() {
        return this.appIdsForAppPropertiesShrink;
    }

    public QueryDentriesInfoShrinkRequest setDentryId(String dentryId) {
        this.dentryId = dentryId;
        return this;
    }
    public String getDentryId() {
        return this.dentryId;
    }

    public QueryDentriesInfoShrinkRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public QueryDentriesInfoShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public QueryDentriesInfoShrinkRequest setWithThumbnail(Boolean withThumbnail) {
        this.withThumbnail = withThumbnail;
        return this;
    }
    public Boolean getWithThumbnail() {
        return this.withThumbnail;
    }

}
