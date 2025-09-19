// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListGatewayRequest extends TeaModel {
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The private gateway ID. To obtain the private gateway ID, see the private_gateway_id parameter in the response parameters of the ListResources operation.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-1uhcqmsc7x22******</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    /**
     * <p>The private gateway alias.</p>
     * 
     * <strong>example:</strong>
     * <p>mygateway1</p>
     */
    @NameInMap("GatewayName")
    public String gatewayName;

    @NameInMap("GatewayType")
    public String gatewayType;

    @NameInMap("InternetEnabled")
    public Boolean internetEnabled;

    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group. To obtain a resource group ID, see the ResourceId field in the response of the <a href="https://help.aliyun.com/document_detail/412133.html">ListResources</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-r-4gt8twzwllfo******</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    @NameInMap("Sort")
    public String sort;

    @NameInMap("Status")
    public String status;

    public static ListGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayRequest self = new ListGatewayRequest();
        return TeaModel.build(map, self);
    }

    public ListGatewayRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public ListGatewayRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListGatewayRequest setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
        return this;
    }
    public String getGatewayName() {
        return this.gatewayName;
    }

    public ListGatewayRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public ListGatewayRequest setInternetEnabled(Boolean internetEnabled) {
        this.internetEnabled = internetEnabled;
        return this;
    }
    public Boolean getInternetEnabled() {
        return this.internetEnabled;
    }

    public ListGatewayRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListGatewayRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListGatewayRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListGatewayRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public ListGatewayRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListGatewayRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
