// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateSubnetRequest extends TeaModel {
    /**
     * <p>The CIDR block of the Subnet.</p>
     * <ul>
     * <li>The network segment of the subnet must be a proper subset of the network segment of Lingjun to which it belongs, and the mask must be between 16 bits and 29 bits, which can provide 8 to 65536 addresses. For example, the CIDR block of the Lingjun CIDR block is 192.168.0.0/16, and the CIDR blocks of the subnets under the Lingjun CIDR block are 192.168.0.0/17 to 192.168.0.0/29.</li>
     * <li>The first and last three IP addresses of each subnet segment are reserved by the system. For example, the CIDR blocks of the subnet are 192.168.1.0/24,192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/16</p>
     */
    @NameInMap("Cidr")
    public String cidr;

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
     * <p>Lingjun subnet instance name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>subnet-1</p>
     */
    @NameInMap("SubnetName")
    public String subnetName;

    /**
     * <p>The tag information.</p>
     * <p>You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateSubnetRequestTag> tag;

    /**
     * <p>Lingjun Subnet Usage Type; optional; optional. Valid values:</p>
     * <ul>
     * <li><strong>If you do not set this field for a common type</strong></li>
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
     * <p>The ID of the Lingjun CIDR block.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-xcuhjyrj</p>
     */
    @NameInMap("VpdId")
    public String vpdId;

    /**
     * <p>The zone ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateSubnetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSubnetRequest self = new CreateSubnetRequest();
        return TeaModel.build(map, self);
    }

    public CreateSubnetRequest setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }
    public String getCidr() {
        return this.cidr;
    }

    public CreateSubnetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSubnetRequest setSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }
    public String getSubnetName() {
        return this.subnetName;
    }

    public CreateSubnetRequest setTag(java.util.List<CreateSubnetRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateSubnetRequestTag> getTag() {
        return this.tag;
    }

    public CreateSubnetRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateSubnetRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

    public CreateSubnetRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateSubnetRequestTag extends TeaModel {
        /**
         * <p>The tag key of the VPN attachment.</p>
         * <p>You cannot specify an empty string as a tag key. It can be up to 64 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * <p>You can specify at most 20 tag keys in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-subnet</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the VPN connection.</p>
         * <p>The tag value can be empty or a string of up to 128 characters. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * <p>Each key-value pair must be unique. You can specify values for at most 20 tag keys in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>subnet-tag-1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateSubnetRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateSubnetRequestTag self = new CreateSubnetRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateSubnetRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateSubnetRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
