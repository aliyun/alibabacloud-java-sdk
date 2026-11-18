// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListOrganizationalUnitsRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IDs of the organizational units. You can specify up to 100 IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;ou_wovwffm62xifdziem7an7xxxxx&quot;]</p>
     */
    @NameInMap("OrganizationalUnitIds")
    public java.util.List<String> organizationalUnitIds;

    /**
     * <p>The name of the organizational unit. The query uses exact match.</p>
     * 
     * <strong>example:</strong>
     * <p>name_001</p>
     */
    @NameInMap("OrganizationalUnitName")
    public String organizationalUnitName;

    /**
     * <p>The prefix of the organizational unit name. The query uses prefix match.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("OrganizationalUnitNameStartsWith")
    public String organizationalUnitNameStartsWith;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the parent organizational unit.</p>
     * 
     * <strong>example:</strong>
     * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
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
