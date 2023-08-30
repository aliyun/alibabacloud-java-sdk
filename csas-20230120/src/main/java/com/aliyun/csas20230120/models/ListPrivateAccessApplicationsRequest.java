// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessApplicationsRequest extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

    @NameInMap("ConnectorId")
    public String connectorId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("Status")
    public String status;

    @NameInMap("TagId")
    public String tagId;

    public static ListPrivateAccessApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateAccessApplicationsRequest self = new ListPrivateAccessApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public ListPrivateAccessApplicationsRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ListPrivateAccessApplicationsRequest setApplicationIds(java.util.List<String> applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

    public ListPrivateAccessApplicationsRequest setConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }
    public String getConnectorId() {
        return this.connectorId;
    }

    public ListPrivateAccessApplicationsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListPrivateAccessApplicationsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListPrivateAccessApplicationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPrivateAccessApplicationsRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public ListPrivateAccessApplicationsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListPrivateAccessApplicationsRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

}
