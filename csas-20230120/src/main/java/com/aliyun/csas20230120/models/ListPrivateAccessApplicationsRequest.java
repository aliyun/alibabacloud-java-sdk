// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessApplicationsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>192.168.0.0/16</p>
     */
    @NameInMap("Address")
    public String address;

    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

    @NameInMap("ConnectorId")
    public String connectorId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>private_access_application_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>pa-policy-54a7838a48bf****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>tag-d3f64e8bdd4a****</p>
     */
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
