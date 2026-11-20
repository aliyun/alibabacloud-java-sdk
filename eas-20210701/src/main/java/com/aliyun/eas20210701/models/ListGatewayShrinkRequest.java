// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListGatewayShrinkRequest extends TeaModel {
    /**
     * <p>The billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The ID of the private gateway. To obtain the private gateway ID, see the private_gateway_id field in the response of the ListResources operation.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-1uhcqmsc7x22******</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    /**
     * <p>The alias of the private gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>mygateway1</p>
     */
    @NameInMap("GatewayName")
    public String gatewayName;

    /**
     * <p>The type of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>Application</p>
     */
    @NameInMap("GatewayType")
    public String gatewayType;

    /**
     * <p>Specifies whether public network access is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("InternetEnabled")
    public Boolean internetEnabled;

    /**
     * <p>Filters the results by label.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;:&quot;value1&quot;,&quot;key2&quot;:null}</p>
     */
    @NameInMap("Label")
    public String labelShrink;

    /**
     * <p>The sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number of the gateway list. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The paging settings for the number of entries to return on each page in a paged query. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group. To obtain the resource group ID, see the ResourceId field in the response of the <a href="https://help.aliyun.com/document_detail/412133.html">ListResources</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-r-4gt8twzwllfo******</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>The field used for sorting.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The status of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListGatewayShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayShrinkRequest self = new ListGatewayShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListGatewayShrinkRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public ListGatewayShrinkRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListGatewayShrinkRequest setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
        return this;
    }
    public String getGatewayName() {
        return this.gatewayName;
    }

    public ListGatewayShrinkRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public ListGatewayShrinkRequest setInternetEnabled(Boolean internetEnabled) {
        this.internetEnabled = internetEnabled;
        return this;
    }
    public Boolean getInternetEnabled() {
        return this.internetEnabled;
    }

    public ListGatewayShrinkRequest setLabelShrink(String labelShrink) {
        this.labelShrink = labelShrink;
        return this;
    }
    public String getLabelShrink() {
        return this.labelShrink;
    }

    public ListGatewayShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListGatewayShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListGatewayShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListGatewayShrinkRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public ListGatewayShrinkRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListGatewayShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListGatewayShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
