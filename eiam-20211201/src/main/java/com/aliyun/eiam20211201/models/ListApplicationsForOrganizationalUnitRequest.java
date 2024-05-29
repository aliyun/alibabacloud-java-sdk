// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsForOrganizationalUnitRequest extends TeaModel {
    /**
     * <p>The IDs of the applications that the EIAM organization can access. You can query a maximum of 100 application IDs at a time.</p>
     */
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the EIAM organization.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationalUnitId")
    public String organizationalUnitId;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     */
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
