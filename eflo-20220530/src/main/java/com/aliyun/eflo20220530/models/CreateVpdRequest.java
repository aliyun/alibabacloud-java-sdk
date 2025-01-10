// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateVpdRequest extends TeaModel {
    /**
     * <p>The CIDR block of the VPD.</p>
     * <ul>
     * <li>We recommend that you use an RFC private endpoint as the Lingjun CIDR block, such as 10.0.0.0/8,172.16.0.0/12,192.168.0.0/16. In scenarios where the Doringjun CIDR block is connected to each other or where the Lingjun CIDR block is connected to a VPC, make sure that the addresses do not conflict with each other.</li>
     * <li>You can also use a custom CIDR block other than 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, or 169.254.0.0/16 and their subnets as the primary IPv4 CIDR block of the VPD.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/8</p>
     */
    @NameInMap("Cidr")
    public String cidr;

    /**
     * <p>The region ID of the disk.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94475.htm?spm=a2c4g.11186623.0.0.29e15d7akXhpuu">Resource groups</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2l4sq6l7unhi</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Lingjun subnet information list</p>
     */
    @NameInMap("Subnets")
    public java.util.List<CreateVpdRequestSubnets> subnets;

    /**
     * <p>A tag.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateVpdRequestTag> tag;

    /**
     * <p>Lingjun CIDR block instance name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-1</p>
     */
    @NameInMap("VpdName")
    public String vpdName;

    public static CreateVpdRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpdRequest self = new CreateVpdRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpdRequest setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }
    public String getCidr() {
        return this.cidr;
    }

    public CreateVpdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVpdRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateVpdRequest setSubnets(java.util.List<CreateVpdRequestSubnets> subnets) {
        this.subnets = subnets;
        return this;
    }
    public java.util.List<CreateVpdRequestSubnets> getSubnets() {
        return this.subnets;
    }

    public CreateVpdRequest setTag(java.util.List<CreateVpdRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateVpdRequestTag> getTag() {
        return this.tag;
    }

    public CreateVpdRequest setVpdName(String vpdName) {
        this.vpdName = vpdName;
        return this;
    }
    public String getVpdName() {
        return this.vpdName;
    }

    public static class CreateVpdRequestSubnets extends TeaModel {
        /**
         * <p>The CIDR block of the Subnet.</p>
         * <ul>
         * <li>The network segment of the subnet must be a proper subset of the network segment of Lingjun to which it belongs, and the mask must be between 16 bits and 29 bits, which can provide 8 to 65536 addresses. For example, the CIDR block of the Lingjun CIDR block is 192.168.0.0/16, and the CIDR blocks of the subnets under the Lingjun CIDR block are 192.168.0.0/17 to 192.168.0.0/29.</li>
         * <li>The first and last three IP addresses of each subnet segment are reserved by the system. For example, the CIDR blocks of the subnet are 192.168.1.0/24,192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10.1.0.0/16</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The region in which the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Lingjun subnet instance name</p>
         * 
         * <strong>example:</strong>
         * <p>subnet-1</p>
         */
        @NameInMap("SubnetName")
        public String subnetName;

        /**
         * <p>Lingjun Subnet Usage Type; optional; optional. Valid values:</p>
         * <ul>
         * <li><strong>Generic type is not specified</strong>.</li>
         * <li><strong>OOB</strong> :OOB type</li>
         * <li><strong>LB</strong>: LB type</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OOB</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The zone ID of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateVpdRequestSubnets build(java.util.Map<String, ?> map) throws Exception {
            CreateVpdRequestSubnets self = new CreateVpdRequestSubnets();
            return TeaModel.build(map, self);
        }

        public CreateVpdRequestSubnets setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public CreateVpdRequestSubnets setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateVpdRequestSubnets setSubnetName(String subnetName) {
            this.subnetName = subnetName;
            return this;
        }
        public String getSubnetName() {
            return this.subnetName;
        }

        public CreateVpdRequestSubnets setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateVpdRequestSubnets setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class CreateVpdRequestTag extends TeaModel {
        /**
         * <p>The tag key of the VPN attachment.</p>
         * <p>You cannot specify an empty string as a tag key. It can be up to 64 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * <p>You can specify at most 20 tag keys in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-wulanchabu</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the VPN connection.</p>
         * <p>The tag value can be empty or a string of up to 128 characters. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * <p>Each tag key corresponds to a tag value. You can enter a maximum of 20 tag values at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>wulanchabu-a</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateVpdRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateVpdRequestTag self = new CreateVpdRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateVpdRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateVpdRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
