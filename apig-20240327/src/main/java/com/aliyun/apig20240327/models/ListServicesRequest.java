// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListServicesRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud-native API Gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cpv4sqdl*****</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The service name.</p>
     * 
     * <strong>example:</strong>
     * <p>user-service</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The page number to return. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxxe5rc6cvla</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The service source. Valid values:</p>
     * <ul>
     * <li>MSE_NACOS: a service in an MSE Nacos instance</li>
     * <li>K8S: a service in a Kubernetes (K8s) cluster in Container Service for Kubernetes (ACK)</li>
     * <li>FC3: a service in Function Compute</li>
     * <li>VIP: a fixed address</li>
     * <li>DNS: a domain name</li>
     * </ul>
     * <p>Enumerated values:</p>
     * <ul>
     * <li>K8S</li>
     * <li>FC3</li>
     * <li>DNS</li>
     * <li>VIP</li>
     * <li>MSE_NACOS</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MSE_NACOS</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>List of service source types</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;K8S&quot;, &quot;FC3&quot;]</p>
     */
    @NameInMap("sourceTypes")
    public String sourceTypes;

    public static ListServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServicesRequest self = new ListServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListServicesRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListServicesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListServicesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListServicesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListServicesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListServicesRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ListServicesRequest setSourceTypes(String sourceTypes) {
        this.sourceTypes = sourceTypes;
        return this;
    }
    public String getSourceTypes() {
        return this.sourceTypes;
    }

}
