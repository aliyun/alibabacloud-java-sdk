// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListPermissionsRequest extends TeaModel {
    // CatalogId
    @NameInMap("CatalogId")
    public String catalogId;

    // 是否获取用户所属角色的权限
    @NameInMap("IsListUserRolePermissions")
    public Boolean isListUserRolePermissions;

    // 基于资源对权限信息进行过滤
    @NameInMap("MetaResource")
    public MetaResource metaResource;

    // 基于Resource Type进行过滤
    @NameInMap("MetaResourceType")
    public String metaResourceType;

    // 分页Token
    @NameInMap("NextPageToken")
    public String nextPageToken;

    // 分页大小
    @NameInMap("PageSize")
    public Integer pageSize;

    // 基于Principal对权限信息进行过滤
    @NameInMap("Principal")
    public Principal principal;

    // 获取权限信息的类型，目前仅支持hive
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
