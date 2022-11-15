// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBasicAcceleratorsRequest extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("State")
    public String state;

    @NameInMap("Tag")
    public java.util.List<ListBasicAcceleratorsRequestTag> tag;

    public static ListBasicAcceleratorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBasicAcceleratorsRequest self = new ListBasicAcceleratorsRequest();
        return TeaModel.build(map, self);
    }

    public ListBasicAcceleratorsRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public ListBasicAcceleratorsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBasicAcceleratorsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBasicAcceleratorsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListBasicAcceleratorsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListBasicAcceleratorsRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ListBasicAcceleratorsRequest setTag(java.util.List<ListBasicAcceleratorsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListBasicAcceleratorsRequestTag> getTag() {
        return this.tag;
    }

    public static class ListBasicAcceleratorsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListBasicAcceleratorsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListBasicAcceleratorsRequestTag self = new ListBasicAcceleratorsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListBasicAcceleratorsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListBasicAcceleratorsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
