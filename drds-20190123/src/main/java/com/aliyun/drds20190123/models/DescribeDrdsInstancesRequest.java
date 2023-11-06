// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstancesRequest extends TeaModel {
    /**
     * <p>The description of the instances.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether the instances that you want to query expire.</p>
     */
    @NameInMap("Expired")
    public Boolean expired;

    /**
     * <p>Specifies whether hybrid queries are supported.</p>
     */
    @NameInMap("Mix")
    public Boolean mix;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of instances returned on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The version of the service.</p>
     */
    @NameInMap("ProductVersion")
    public String productVersion;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instances you want to query belong. The value of this parameter can be NULL.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tag")
    public java.util.List<DescribeDrdsInstancesRequestTag> tag;

    /**
     * <p>The type of the instances that you want to query. Valid values:</p>
     * <br>
     * <p>*   **0**: shared instances</p>
     * <p>*   **1**: dedicated instances</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeDrdsInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstancesRequest self = new DescribeDrdsInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstancesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeDrdsInstancesRequest setExpired(Boolean expired) {
        this.expired = expired;
        return this;
    }
    public Boolean getExpired() {
        return this.expired;
    }

    public DescribeDrdsInstancesRequest setMix(Boolean mix) {
        this.mix = mix;
        return this;
    }
    public Boolean getMix() {
        return this.mix;
    }

    public DescribeDrdsInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDrdsInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDrdsInstancesRequest setProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }
    public String getProductVersion() {
        return this.productVersion;
    }

    public DescribeDrdsInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDrdsInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDrdsInstancesRequest setTag(java.util.List<DescribeDrdsInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDrdsInstancesRequestTag> getTag() {
        return this.tag;
    }

    public DescribeDrdsInstancesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class DescribeDrdsInstancesRequestTag extends TeaModel {
        /**
         * <p>The key of the tag configured for the instances you want to query.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag configured for the instances you want to query.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDrdsInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstancesRequestTag self = new DescribeDrdsInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDrdsInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
