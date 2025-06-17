// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListElasticNetworkInterfacesRequest extends TeaModel {
    /**
     * <p>Lingjun Elastic Network Interface ID</p>
     * 
     * <strong>example:</strong>
     * <p>leni-1234****</p>
     */
    @NameInMap("ElasticNetworkInterfaceId")
    public String elasticNetworkInterfaceId;

    /**
     * <p>The IP address of the BE cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.1</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The network type.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>Tenant: Tenant.</li>
     * <li>VPC</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tenant</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The ID of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>e01-cn-lbj3aej****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The page number of the page to return. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzmcpv7odnta</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the enterprise-level snapshot policy.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>Create Failed: the creation failure.</li>
     * <li>Delete Failed: the that failed to be deleted.</li>
     * <li>Executing</li>
     * <li>Available: The template is available.</li>
     * <li>Deleting</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>List of Tags</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListElasticNetworkInterfacesRequestTag> tag;

    /**
     * <p>The type of the variable.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>CUSTOM: custom type.</li>
     * <li>DEFAULT: system type.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6u8473r84e9****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6aa4ddo97fr****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static ListElasticNetworkInterfacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListElasticNetworkInterfacesRequest self = new ListElasticNetworkInterfacesRequest();
        return TeaModel.build(map, self);
    }

    public ListElasticNetworkInterfacesRequest setElasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
        this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
        return this;
    }
    public String getElasticNetworkInterfaceId() {
        return this.elasticNetworkInterfaceId;
    }

    public ListElasticNetworkInterfacesRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ListElasticNetworkInterfacesRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public ListElasticNetworkInterfacesRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ListElasticNetworkInterfacesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListElasticNetworkInterfacesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListElasticNetworkInterfacesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListElasticNetworkInterfacesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListElasticNetworkInterfacesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListElasticNetworkInterfacesRequest setTag(java.util.List<ListElasticNetworkInterfacesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListElasticNetworkInterfacesRequestTag> getTag() {
        return this.tag;
    }

    public ListElasticNetworkInterfacesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListElasticNetworkInterfacesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public ListElasticNetworkInterfacesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public ListElasticNetworkInterfacesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class ListElasticNetworkInterfacesRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key-test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>key-value</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListElasticNetworkInterfacesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListElasticNetworkInterfacesRequestTag self = new ListElasticNetworkInterfacesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListElasticNetworkInterfacesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListElasticNetworkInterfacesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
