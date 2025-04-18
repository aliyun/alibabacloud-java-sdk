// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListLeniPrivateIpAddressesRequest extends TeaModel {
    /**
     * <p>Lingjun Elastic Network Interface ID.</p>
     * 
     * <strong>example:</strong>
     * <p>leni-1234****</p>
     */
    @NameInMap("ElasticNetworkInterfaceId")
    public String elasticNetworkInterfaceId;

    /**
     * <p>Lingjun Elastic Network Interface secondary private IP unique identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>sip-8ylg****</p>
     */
    @NameInMap("IpName")
    public String ipName;

    /**
     * <p>The page number returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Lingjun Elastic Network Interface secondary private IP.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.****</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the image build command risk.</p>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListLeniPrivateIpAddressesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLeniPrivateIpAddressesRequest self = new ListLeniPrivateIpAddressesRequest();
        return TeaModel.build(map, self);
    }

    public ListLeniPrivateIpAddressesRequest setElasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
        this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
        return this;
    }
    public String getElasticNetworkInterfaceId() {
        return this.elasticNetworkInterfaceId;
    }

    public ListLeniPrivateIpAddressesRequest setIpName(String ipName) {
        this.ipName = ipName;
        return this;
    }
    public String getIpName() {
        return this.ipName;
    }

    public ListLeniPrivateIpAddressesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListLeniPrivateIpAddressesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLeniPrivateIpAddressesRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public ListLeniPrivateIpAddressesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListLeniPrivateIpAddressesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListLeniPrivateIpAddressesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
