// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVpdsRequest extends TeaModel {
    @NameInMap("EnablePage")
    public Boolean enablePage;

    @NameInMap("FilterErId")
    public String filterErId;

    @NameInMap("ForSelect")
    public Boolean forSelect;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Tag")
    public java.util.List<ListVpdsRequestTag> tag;

    @NameInMap("VpdId")
    public String vpdId;

    @NameInMap("VpdName")
    public String vpdName;

    @NameInMap("WithDependence")
    public Boolean withDependence;

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
        @NameInMap("Key")
        public String key;

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
