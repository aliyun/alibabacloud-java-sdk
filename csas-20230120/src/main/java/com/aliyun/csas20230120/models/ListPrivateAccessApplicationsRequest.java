// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessApplicationsRequest extends TeaModel {
    /**
     * <p>The access mode. Valid values:</p>
     * <ul>
     * <li><strong>app</strong>: application access. Filters applications that support application access.</li>
     * <li><strong>browser</strong>: browser access. Filters applications that support browser access.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>app</p>
     */
    @NameInMap("AccessModes")
    public String accessModes;

    /**
     * <p>The address of the private access application. The address must be 1 to 128 characters in length, and can be an IPv4 address, a CIDR block, a domain name, or a wildcard domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.0/16</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The IDs of the private access applications. You can specify up to 100 IDs.</p>
     */
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

    /**
     * <p>The ID of the connector. You can obtain the ID from the following operation: <a href="~~ListConnectors~~">ListConnectors</a>: List connectors.</p>
     * 
     * <strong>example:</strong>
     * <p>connector-94db94e06b98****</p>
     */
    @NameInMap("ConnectorId")
    public String connectorId;

    /**
     * <p>The page number of the current page in a paging query. Valid values: 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Filters applications by health check status. Valid values:</p>
     * <ul>
     * <li>normal: The success rate of the last check is greater than or equal to 95%.</li>
     * <li>partialError: The success rate of the last check is greater than 0 and less than 95%.</li>
     * <li>error: The success rate of the last check is 0.</li>
     * <li>uncompleted: No check results are available.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("HealthCheckStatus")
    public String healthCheckStatus;

    /**
     * <p>The name of the private access application. The name must be 1 to 128 characters in length, and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>private_access_application_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The Settings for the number of entries per page in a paging query. Valid values: 1 to 1000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the private access policy. You can obtain the ID from the following operations:</p>
     * <ul>
     * <li><a href="~~ListPrivateAccessPolices~~">ListPrivateAccessPolices</a>: List private access policies.</li>
     * <li><a href="~~CreatePrivateAccessPolicy~~">CreatePrivateAccessPolicy</a>: Create a private access policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pa-policy-54a7838a48bf****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The status of the private access application. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: enabled.</li>
     * <li><strong>Disabled</strong>: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the private access tag. You can obtain the ID from the following operations:</p>
     * <ul>
     * <li><a href="~~ListPrivateAccessTags~~">ListPrivateAccessTags</a>: List private access tags.</li>
     * <li><a href="~~CreatePrivateAccessTag~~">CreatePrivateAccessTag</a>: Create a private access tag.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tag-d3f64e8bdd4a****</p>
     */
    @NameInMap("TagId")
    public String tagId;

    public static ListPrivateAccessApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateAccessApplicationsRequest self = new ListPrivateAccessApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public ListPrivateAccessApplicationsRequest setAccessModes(String accessModes) {
        this.accessModes = accessModes;
        return this;
    }
    public String getAccessModes() {
        return this.accessModes;
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

    public ListPrivateAccessApplicationsRequest setHealthCheckStatus(String healthCheckStatus) {
        this.healthCheckStatus = healthCheckStatus;
        return this;
    }
    public String getHealthCheckStatus() {
        return this.healthCheckStatus;
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
