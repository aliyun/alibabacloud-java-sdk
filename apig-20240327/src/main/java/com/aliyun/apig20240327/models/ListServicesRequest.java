// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListServicesRequest extends TeaModel {
    /**
     * <p>The ID of the cloud-native API gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cpv4sqdl*****</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The service name for exact match.</p>
     * 
     * <strong>example:</strong>
     * <p>user-service</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
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
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxxe5rc6cvla</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The source type of the service. Valid values:</p>
     * <ul>
     * <li>MSE_NACOS: Services from MSE Nacos.</li>
     * <li>K8S: Services from Kubernetes clusters in Container Service.</li>
     * <li>FC3: Services from Function Compute.</li>
     * <li>VIP: Services from fixed addresses.</li>
     * <li>DNS: Services from domain names.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MSE_NACOS</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>The list of service source types.</p>
     * 
     * <strong>example:</strong>
     * <p>K8S, FC3</p>
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
