// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListErsRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable paged query. Valid values:</p>
     * <ul>
     * <li>true: enables paged query.</li>
     * <li>false: Paged query is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnablePage")
    public Boolean enablePage;

    /**
     * <p>The ID of the Lingjun HUB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>er-kkopgtne</p>
     */
    @NameInMap("ErId")
    public String erId;

    /**
     * <p>Lingjun HUB name.</p>
     * 
     * <strong>example:</strong>
     * <p>er-heyuan-main</p>
     */
    @NameInMap("ErName")
    public String erName;

    /**
     * <p>The ID of the network instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vcc-cn-209300qha01</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the attached network instance. Valid values:</p>
     * <ul>
     * <li><strong>VPD</strong></li>
     * <li><strong>VCC</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VCC</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The primary zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu-b</p>
     */
    @NameInMap("MasterZoneId")
    public String masterZoneId;

    /**
     * <p>The page number to return. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10.</p>
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
     * <p>rg-acfmwfm33rlt6zi</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tag")
    public java.util.List<ListErsRequestTag> tag;

    public static ListErsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListErsRequest self = new ListErsRequest();
        return TeaModel.build(map, self);
    }

    public ListErsRequest setEnablePage(Boolean enablePage) {
        this.enablePage = enablePage;
        return this;
    }
    public Boolean getEnablePage() {
        return this.enablePage;
    }

    public ListErsRequest setErId(String erId) {
        this.erId = erId;
        return this;
    }
    public String getErId() {
        return this.erId;
    }

    public ListErsRequest setErName(String erName) {
        this.erName = erName;
        return this;
    }
    public String getErName() {
        return this.erName;
    }

    public ListErsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListErsRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ListErsRequest setMasterZoneId(String masterZoneId) {
        this.masterZoneId = masterZoneId;
        return this;
    }
    public String getMasterZoneId() {
        return this.masterZoneId;
    }

    public ListErsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListErsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListErsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListErsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListErsRequest setTag(java.util.List<ListErsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListErsRequestTag> getTag() {
        return this.tag;
    }

    public static class ListErsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListErsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListErsRequestTag self = new ListErsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListErsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListErsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
