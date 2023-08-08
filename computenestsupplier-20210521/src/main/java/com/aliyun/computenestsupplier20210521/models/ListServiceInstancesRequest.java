// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceInstancesRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<ListServiceInstancesRequestFilter> filter;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ShowDeleted")
    public Boolean showDeleted;

    @NameInMap("Tag")
    public java.util.List<ListServiceInstancesRequestTag> tag;

    public static ListServiceInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstancesRequest self = new ListServiceInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceInstancesRequest setFilter(java.util.List<ListServiceInstancesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListServiceInstancesRequestFilter> getFilter() {
        return this.filter;
    }

    public ListServiceInstancesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceInstancesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListServiceInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListServiceInstancesRequest setShowDeleted(Boolean showDeleted) {
        this.showDeleted = showDeleted;
        return this;
    }
    public Boolean getShowDeleted() {
        return this.showDeleted;
    }

    public ListServiceInstancesRequest setTag(java.util.List<ListServiceInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListServiceInstancesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListServiceInstancesRequestFilter extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListServiceInstancesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstancesRequestFilter self = new ListServiceInstancesRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListServiceInstancesRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceInstancesRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class ListServiceInstancesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListServiceInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstancesRequestTag self = new ListServiceInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListServiceInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListServiceInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
