// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServicesRequest extends TeaModel {
    @NameInMap("AllVersions")
    public Boolean allVersions;

    @NameInMap("Filter")
    public java.util.List<ListServicesRequestFilter> filter;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tag")
    public java.util.List<ListServicesRequestTag> tag;

    public static ListServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServicesRequest self = new ListServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListServicesRequest setAllVersions(Boolean allVersions) {
        this.allVersions = allVersions;
        return this;
    }
    public Boolean getAllVersions() {
        return this.allVersions;
    }

    public ListServicesRequest setFilter(java.util.List<ListServicesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListServicesRequestFilter> getFilter() {
        return this.filter;
    }

    public ListServicesRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListServicesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServicesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListServicesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListServicesRequest setTag(java.util.List<ListServicesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListServicesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListServicesRequestFilter extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListServicesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListServicesRequestFilter self = new ListServicesRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListServicesRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServicesRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class ListServicesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListServicesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListServicesRequestTag self = new ListServicesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListServicesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListServicesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
