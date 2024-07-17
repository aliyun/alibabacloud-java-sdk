// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListPermissionsRequest extends TeaModel {
    /**
     * <p>CatalogId</p>
     * 
     * <strong>example:</strong>
     * <p>1344371</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsListUserRolePermissions")
    public Boolean isListUserRolePermissions;

    @NameInMap("MetaResource")
    public MetaResource metaResource;

    /**
     * <strong>example:</strong>
     * <p>DATABASE</p>
     */
    @NameInMap("MetaResourceType")
    public String metaResourceType;

    /**
     * <strong>example:</strong>
     * <p>token!</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Principal")
    public Principal principal;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hive</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionsRequest self = new ListPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public ListPermissionsRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public ListPermissionsRequest setIsListUserRolePermissions(Boolean isListUserRolePermissions) {
        this.isListUserRolePermissions = isListUserRolePermissions;
        return this;
    }
    public Boolean getIsListUserRolePermissions() {
        return this.isListUserRolePermissions;
    }

    public ListPermissionsRequest setMetaResource(MetaResource metaResource) {
        this.metaResource = metaResource;
        return this;
    }
    public MetaResource getMetaResource() {
        return this.metaResource;
    }

    public ListPermissionsRequest setMetaResourceType(String metaResourceType) {
        this.metaResourceType = metaResourceType;
        return this;
    }
    public String getMetaResourceType() {
        return this.metaResourceType;
    }

    public ListPermissionsRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListPermissionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPermissionsRequest setPrincipal(Principal principal) {
        this.principal = principal;
        return this;
    }
    public Principal getPrincipal() {
        return this.principal;
    }

    public ListPermissionsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
