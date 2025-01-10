// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListSubnetsRequest extends TeaModel {
    /**
     * <p>Specifies whether to query by page. Optional values:</p>
     * <ul>
     * <li><strong>true</strong>: Enable pagination query</li>
     * <li><strong>false</strong>: Pagination query is disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnablePage")
    public Boolean enablePage;

    /**
     * <p>The number of the page to return. The value must be greater than 0. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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
     * <p>rg-aeky5f3qx6ceapq</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the CLB instance. Valid values:</p>
     * <ul>
     * <li><strong>Available</strong>: Normal</li>
     * <li><strong>Not Available</strong>: Unavailable</li>
     * <li><strong>Executing</strong>: Executing</li>
     * <li><strong>Deleting</strong>: The node is being deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Lingjun subnet instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>subnet-anhtskts</p>
     */
    @NameInMap("SubnetId")
    public String subnetId;

    /**
     * <p>Lingjun subnet instance name</p>
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
    public java.util.List<ListSubnetsRequestTag> tag;

    /**
     * <p>Lingjun Subnet Usage Type; optional; optional. Valid values:</p>
     * <ul>
     * <li><strong>If you do not set this field for a common type</strong></li>
     * <li><strong>OOB</strong> :OOB type</li>
     * <li><strong>LB</strong>: LB type</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Null</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The ID of the Lingjun CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-fuliephf</p>
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

    public static ListSubnetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubnetsRequest self = new ListSubnetsRequest();
        return TeaModel.build(map, self);
    }

    public ListSubnetsRequest setEnablePage(Boolean enablePage) {
        this.enablePage = enablePage;
        return this;
    }
    public Boolean getEnablePage() {
        return this.enablePage;
    }

    public ListSubnetsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSubnetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSubnetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListSubnetsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListSubnetsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListSubnetsRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }
    public String getSubnetId() {
        return this.subnetId;
    }

    public ListSubnetsRequest setSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }
    public String getSubnetName() {
        return this.subnetName;
    }

    public ListSubnetsRequest setTag(java.util.List<ListSubnetsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListSubnetsRequestTag> getTag() {
        return this.tag;
    }

    public ListSubnetsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListSubnetsRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

    public ListSubnetsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class ListSubnetsRequestTag extends TeaModel {
        /**
         * <p>The tag key of the VPN attachment.</p>
         * <p>You cannot specify an empty string as a tag key. It can be up to 64 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * <p>You can specify at most 20 tag keys in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-subnet</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the VPN connection.</p>
         * <p>The tag value can be empty or a string of up to 128 characters. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * <p>Each key-value pair must be unique. You can specify values for at most 20 tag keys in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>subnet-group-1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListSubnetsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListSubnetsRequestTag self = new ListSubnetsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListSubnetsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListSubnetsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
