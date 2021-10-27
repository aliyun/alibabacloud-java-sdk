// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstancesRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Expired")
    public Boolean expired;

    @NameInMap("Mix")
    public Boolean mix;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductVersion")
    public String productVersion;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tag")
    public java.util.List<DescribeDrdsInstancesRequestTag> tag;

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
        @NameInMap("Key")
        public String key;

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
