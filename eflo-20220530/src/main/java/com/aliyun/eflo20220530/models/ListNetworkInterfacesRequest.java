// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListNetworkInterfacesRequest extends TeaModel {
    /**
     * <p>Specifies whether pagination is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnablePage")
    public Boolean enablePage;

    /**
     * <p>network interface controller the IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>203.107.46.227</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>Lingjun network interface controller ID.</p>
     * 
     * <strong>example:</strong>
     * <p>lni-bp18exxqa2rvfn45e5pz</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    /**
     * <p>The ID of the machine to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>r-2ze121o4uhr4np3r5t-db-5</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The current number of pages.</p>
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
     * <p>Resource group instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzzka6bnjvbi</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the instance to which the Lingjun subnet belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>subnet-anhtskts</p>
     */
    @NameInMap("SubnetId")
    public String subnetId;

    /**
     * <p>The list of tags</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListNetworkInterfacesRequestTag> tag;

    /**
     * <p>The ID of the VPD.</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-iv2zm1qf</p>
     */
    @NameInMap("VpdId")
    public String vpdId;

    public static ListNetworkInterfacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkInterfacesRequest self = new ListNetworkInterfacesRequest();
        return TeaModel.build(map, self);
    }

    public ListNetworkInterfacesRequest setEnablePage(Boolean enablePage) {
        this.enablePage = enablePage;
        return this;
    }
    public Boolean getEnablePage() {
        return this.enablePage;
    }

    public ListNetworkInterfacesRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ListNetworkInterfacesRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public ListNetworkInterfacesRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ListNetworkInterfacesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNetworkInterfacesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNetworkInterfacesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListNetworkInterfacesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListNetworkInterfacesRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }
    public String getSubnetId() {
        return this.subnetId;
    }

    public ListNetworkInterfacesRequest setTag(java.util.List<ListNetworkInterfacesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListNetworkInterfacesRequestTag> getTag() {
        return this.tag;
    }

    public ListNetworkInterfacesRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

    public static class ListNetworkInterfacesRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>key-test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>value-test</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListNetworkInterfacesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListNetworkInterfacesRequestTag self = new ListNetworkInterfacesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListNetworkInterfacesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListNetworkInterfacesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
