// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListPermissionsRequest extends TeaModel {
    /**
     * <p>The ID of the data directory.</p>
     * 
     * <strong>example:</strong>
     * <p>1344371</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    /**
     * <p>Specifies whether to obtain the permissions of the role to which the user belongs. This field takes effect only when you specify a specific resource object.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsListUserRolePermissions")
    public Boolean isListUserRolePermissions;

    /**
     * <p>Filters permission information based on resources.</p>
     */
    @NameInMap("MetaResource")
    public MetaResource metaResource;

    /**
     * <p>Specifies the type of resource to filter, such as database or table. If not specified, both are included.</p>
     * 
     * <strong>example:</strong>
     * <p>DATABASE</p>
     */
    @NameInMap("MetaResourceType")
    public String metaResourceType;

    /**
     * <p>The page turning token, which is used to obtain the next page of data. If not provided in the response result, a string (&quot;&quot;) or empty string (&quot;) is empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>token!</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The size of each page. The maximum value is 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Filters permission information based on the principal.</p>
     */
    @NameInMap("Principal")
    public Principal principal;

    /**
     * <p>The type for obtaining permission information. Currently, only Hive is supported.</p>
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
