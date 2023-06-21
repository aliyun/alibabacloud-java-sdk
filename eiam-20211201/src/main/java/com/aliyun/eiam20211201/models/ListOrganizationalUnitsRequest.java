// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListOrganizationalUnitsRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>组织ID列表。size限制最大100。</p>
     */
    @NameInMap("OrganizationalUnitIds")
    public java.util.List<String> organizationalUnitIds;

    /**
     * <p>The name of the organizational unit.</p>
     */
    @NameInMap("OrganizationalUnitName")
    public String organizationalUnitName;

    /**
     * <p>组织名称，左匹配</p>
     */
    @NameInMap("OrganizationalUnitNameStartsWith")
    public String organizationalUnitNameStartsWith;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 20.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the parent organizational unit.</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    public static ListOrganizationalUnitsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationalUnitsRequest self = new ListOrganizationalUnitsRequest();
        return TeaModel.build(map, self);
    }

    public ListOrganizationalUnitsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListOrganizationalUnitsRequest setOrganizationalUnitIds(java.util.List<String> organizationalUnitIds) {
        this.organizationalUnitIds = organizationalUnitIds;
        return this;
    }
    public java.util.List<String> getOrganizationalUnitIds() {
        return this.organizationalUnitIds;
    }

    public ListOrganizationalUnitsRequest setOrganizationalUnitName(String organizationalUnitName) {
        this.organizationalUnitName = organizationalUnitName;
        return this;
    }
    public String getOrganizationalUnitName() {
        return this.organizationalUnitName;
    }

    public ListOrganizationalUnitsRequest setOrganizationalUnitNameStartsWith(String organizationalUnitNameStartsWith) {
        this.organizationalUnitNameStartsWith = organizationalUnitNameStartsWith;
        return this;
    }
    public String getOrganizationalUnitNameStartsWith() {
        return this.organizationalUnitNameStartsWith;
    }

    public ListOrganizationalUnitsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListOrganizationalUnitsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListOrganizationalUnitsRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

}
