// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateVccRequest extends TeaModel {
    /**
     * <p>Enabled access to cloud services. Optional values:</p>
     * <ul>
     * <li><strong>true</strong>: Enable access to cloud services</li>
     * <li><strong>false</strong>: Do not enable access to cloud services</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AccessCouldService")
    public Boolean accessCouldService;

    /**
     * <p>The bandwidth. Unit: Mbit /s. The minimum value is 1000, representing 1Gbps bandwidth; the maximum value is 400000, representing 400Gbps bandwidth.</p>
     * <blockquote>
     * <p> 1Gbps = 1000Mbps</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>bgp as number</p>
     * 
     * <strong>example:</strong>
     * <p>bgpAsn</p>
     */
    @NameInMap("BgpAsn")
    public Long bgpAsn;

    /**
     * <p>Internet segment, on-premises input, off-premises default</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/24</p>
     */
    @NameInMap("BgpCidr")
    public String bgpCidr;

    /**
     * <p>CEN Instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>cen-bkiw0x1347roekr7f2</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>Account to which cen belongs</p>
     * 
     * <strong>example:</strong>
     * <p>1511928242963727</p>
     */
    @NameInMap("CenOwnerId")
    public String cenOwnerId;

    /**
     * <p>The connection mode. Valid values:</p>
     * <ul>
     * <li><strong>VPC</strong></li>
     * <li><strong>CEN (CENTR)</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CENTR</p>
     */
    @NameInMap("ConnectionType")
    public String connectionType;

    /**
     * <p>The description of the document.</p>
     * 
     * <strong>example:</strong>
     * <p>Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The region ID.</p>
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
     * <p>rg-aeky5f3qx6ceapq</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tag information.</p>
     * <p>You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateVccRequestTag> tag;

    /**
     * <p>The ID of the vSwitch. <a href="https://help.aliyun.com/document_detail/100380.html">Virtual Private Cloud VSwitch</a>.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/35748.html">DescribeVSwitches</a> operation to query created vSwitches.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-t4nahb0pxckgktx1kot8q</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the Lingjun connection instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vcc-cn-zvp2w222001</p>
     */
    @NameInMap("VccId")
    public String vccId;

    /**
     * <p>Lingjun Connection Name</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("VccName")
    public String vccName;

    /**
     * <p>Virtual Private Cloud IDs; <a href="https://help.aliyun.com/document_detail/34217.html">What is Virtual Private Cloud</a></p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/35739.html#demo-0">DescribeVpcs</a> operation to query the specified VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6aa4ddo97frj22tgp52</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>Lingjun CIDR block instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-t2jseldp</p>
     */
    @NameInMap("VpdId")
    public String vpdId;

    /**
     * <p>The zone ID of the disk.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu-a</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateVccRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVccRequest self = new CreateVccRequest();
        return TeaModel.build(map, self);
    }

    public CreateVccRequest setAccessCouldService(Boolean accessCouldService) {
        this.accessCouldService = accessCouldService;
        return this;
    }
    public Boolean getAccessCouldService() {
        return this.accessCouldService;
    }

    public CreateVccRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateVccRequest setBgpAsn(Long bgpAsn) {
        this.bgpAsn = bgpAsn;
        return this;
    }
    public Long getBgpAsn() {
        return this.bgpAsn;
    }

    public CreateVccRequest setBgpCidr(String bgpCidr) {
        this.bgpCidr = bgpCidr;
        return this;
    }
    public String getBgpCidr() {
        return this.bgpCidr;
    }

    public CreateVccRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateVccRequest setCenOwnerId(String cenOwnerId) {
        this.cenOwnerId = cenOwnerId;
        return this;
    }
    public String getCenOwnerId() {
        return this.cenOwnerId;
    }

    public CreateVccRequest setConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }
    public String getConnectionType() {
        return this.connectionType;
    }

    public CreateVccRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVccRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVccRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateVccRequest setTag(java.util.List<CreateVccRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateVccRequestTag> getTag() {
        return this.tag;
    }

    public CreateVccRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateVccRequest setVccId(String vccId) {
        this.vccId = vccId;
        return this;
    }
    public String getVccId() {
        return this.vccId;
    }

    public CreateVccRequest setVccName(String vccName) {
        this.vccName = vccName;
        return this;
    }
    public String getVccName() {
        return this.vccName;
    }

    public CreateVccRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateVccRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

    public CreateVccRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateVccRequestTag extends TeaModel {
        /**
         * <p>The tag key of the VPN attachment.</p>
         * <p>You cannot specify an empty string as a tag key. It can be up to 64 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * <p>You can specify at most 20 tag keys in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-vcc</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the VPN connection.</p>
         * <p>The tag value can be empty or a string of up to 128 characters. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * <p>Each key-value pair must be unique. You can specify values for at most 20 tag keys in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-group-1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateVccRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateVccRequestTag self = new CreateVccRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateVccRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateVccRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
