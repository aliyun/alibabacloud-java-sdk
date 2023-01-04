// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsForOrganizationalUnitRequest extends TeaModel {
    // 非必填，如果填写则可以基于应用ID进行过滤，列表中最多包含100个元素。
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

    // IDaaS EIAM实例的ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 组织的唯一标识。
    @NameInMap("OrganizationalUnitId")
    public String organizationalUnitId;

    // 当前查询的列表页码，默认为1。
    @NameInMap("PageNumber")
    public Long pageNumber;

    // 当前查询的列表页码，默认为20。
    @NameInMap("PageSize")
    public Long pageSize;

    public static ListApplicationsForOrganizationalUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForOrganizationalUnitRequest self = new ListApplicationsForOrganizationalUnitRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForOrganizationalUnitRequest setApplicationIds(java.util.List<String> applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

    public ListApplicationsForOrganizationalUnitRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListApplicationsForOrganizationalUnitRequest setOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
        return this;
    }
    public String getOrganizationalUnitId() {
        return this.organizationalUnitId;
    }

    public ListApplicationsForOrganizationalUnitRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListApplicationsForOrganizationalUnitRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
