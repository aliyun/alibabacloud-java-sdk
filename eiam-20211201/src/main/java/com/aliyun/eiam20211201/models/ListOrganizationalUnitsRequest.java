// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListOrganizationalUnitsRequest extends TeaModel {
    // IDaaS EIAM实例的ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 机构名称
    @NameInMap("OrganizationalUnitName")
    public String organizationalUnitName;

    // 当前查询的列表页码，默认为1。
    @NameInMap("PageNumber")
    public Long pageNumber;

    // 当前查询的列表页码，默认为20。
    @NameInMap("PageSize")
    public Long pageSize;

    // 父机构ID
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

    public ListOrganizationalUnitsRequest setOrganizationalUnitName(String organizationalUnitName) {
        this.organizationalUnitName = organizationalUnitName;
        return this;
    }
    public String getOrganizationalUnitName() {
        return this.organizationalUnitName;
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
