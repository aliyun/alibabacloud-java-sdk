// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListOrganizationalUnitsForApplicationRequest extends TeaModel {
    // 应用的唯一标识。
    @NameInMap("ApplicationId")
    public String applicationId;

    // IDaaS EIAM实例的ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 非必填，如果填写则可以基于组织ID进行过滤，列表中最多包含100个元素。
    @NameInMap("OrganizationalUnitIds")
    public java.util.List<String> organizationalUnitIds;

    // 当前查询的列表页码，默认为1。
    @NameInMap("PageNumber")
    public Long pageNumber;

    // 当前查询的列表页码，默认为20。
    @NameInMap("PageSize")
    public Long pageSize;

    public static ListOrganizationalUnitsForApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationalUnitsForApplicationRequest self = new ListOrganizationalUnitsForApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ListOrganizationalUnitsForApplicationRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ListOrganizationalUnitsForApplicationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListOrganizationalUnitsForApplicationRequest setOrganizationalUnitIds(java.util.List<String> organizationalUnitIds) {
        this.organizationalUnitIds = organizationalUnitIds;
        return this;
    }
    public java.util.List<String> getOrganizationalUnitIds() {
        return this.organizationalUnitIds;
    }

    public ListOrganizationalUnitsForApplicationRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListOrganizationalUnitsForApplicationRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
