// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVpdsRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnablePage")
    public Boolean enablePage;

    /**
     * <p>Queries the network segments of Lingjun that are not bound to a specified Lingjun HUB.</p>
     * 
     * <strong>example:</strong>
     * <p>er-kkopgtne</p>
     */
    @NameInMap("FilterErId")
    public String filterErId;

    /**
     * <p>If you select a drop-down list, only the basic information (including the instance ID and instance name) is returned. Possible values:</p>
     * <ul>
     * <li><strong>true</strong>: Select Query Use from the drop-down list.</li>
     * <li><strong>false</strong>: Normal queries are used.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ForSelect")
    public Boolean forSelect;

    /**
     * <p>The page number of the page to return. Start value: 1 Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
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
     * <li><strong>Available</strong>: Normal.</li>
     * <li><strong>Not Available</strong>: Not available.</li>
     * <li><strong>Executing</strong>: The task is being executed.</li>
     * <li><strong>Deleting</strong>: The account is being deleted</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tag information.</p>
     * <p>You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListVpdsRequestTag> tag;

    /**
     * <p>The ID of the VPD instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-fuliephf</p>
     */
    @NameInMap("VpdId")
    public String vpdId;

    /**
     * <p>The name of the VPD instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-1</p>
     */
    @NameInMap("VpdName")
    public String vpdName;

    /**
     * <p>Specifies whether to include the dependent resource information. We recommend that you do not query the dependent resource information when you query by page. You can query the dependent resource information separately when you delete it. Possible values:</p>
     * <ul>
     * <li><strong>true</strong>: with dependency information.</li>
     * <li><strong>false</strong>: does not include dependency information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("WithDependence")
    public Boolean withDependence;

    /**
     * <p>Queries the information about a Lingjun CIDR block that is not bound to a Lingjun connection. Possible values:</p>
     * <ul>
     * <li><strong>true</strong>: filters out VPDs that have been bound to VCC</li>
     * <li><strong>false</strong>: does not filter VPD that has been bound to VCC</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("WithoutVcc")
    public Boolean withoutVcc;

    public static ListVpdsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpdsRequest self = new ListVpdsRequest();
        return TeaModel.build(map, self);
    }

    public ListVpdsRequest setEnablePage(Boolean enablePage) {
        this.enablePage = enablePage;
        return this;
    }
    public Boolean getEnablePage() {
        return this.enablePage;
    }

    public ListVpdsRequest setFilterErId(String filterErId) {
        this.filterErId = filterErId;
        return this;
    }
    public String getFilterErId() {
        return this.filterErId;
    }

    public ListVpdsRequest setForSelect(Boolean forSelect) {
        this.forSelect = forSelect;
        return this;
    }
    public Boolean getForSelect() {
        return this.forSelect;
    }

    public ListVpdsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListVpdsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVpdsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVpdsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListVpdsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListVpdsRequest setTag(java.util.List<ListVpdsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListVpdsRequestTag> getTag() {
        return this.tag;
    }

    public ListVpdsRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

    public ListVpdsRequest setVpdName(String vpdName) {
        this.vpdName = vpdName;
        return this;
    }
    public String getVpdName() {
        return this.vpdName;
    }

    public ListVpdsRequest setWithDependence(Boolean withDependence) {
        this.withDependence = withDependence;
        return this;
    }
    public Boolean getWithDependence() {
        return this.withDependence;
    }

    public ListVpdsRequest setWithoutVcc(Boolean withoutVcc) {
        this.withoutVcc = withoutVcc;
        return this;
    }
    public Boolean getWithoutVcc() {
        return this.withoutVcc;
    }

    public static class ListVpdsRequestTag extends TeaModel {
        /**
         * <p>The tag key of the VPN attachment.</p>
         * <p>You cannot specify an empty string as a tag key. It can be up to 64 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * <p>You can specify at most 20 tag keys in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-vpd-region</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the VPN connection.</p>
         * <p>The tag value can be empty or a string of up to 128 characters. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * <p>Each key-value pair must be unique. You can specify values for at most 20 tag keys in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>wulanchabu</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListVpdsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListVpdsRequestTag self = new ListVpdsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListVpdsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListVpdsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
