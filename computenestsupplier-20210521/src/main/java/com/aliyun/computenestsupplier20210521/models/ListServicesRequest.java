// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServicesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("AllVersions")
    public Boolean allVersions;

    @NameInMap("Filter")
    public java.util.List<ListServicesRequestFilter> filter;

    @NameInMap("RequestTag")
    public java.util.List<ListServicesRequestRequestTag> requestTag;

    public static ListServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServicesRequest self = new ListServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListServicesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public ListServicesRequest setRequestTag(java.util.List<ListServicesRequestRequestTag> requestTag) {
        this.requestTag = requestTag;
        return this;
    }
    public java.util.List<ListServicesRequestRequestTag> getRequestTag() {
        return this.requestTag;
    }

    public static class ListServicesRequestFilter extends TeaModel {
        @NameInMap("Value")
        public java.util.List<String> value;

        @NameInMap("Name")
        public String name;

        public static ListServicesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListServicesRequestFilter self = new ListServicesRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListServicesRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

        public ListServicesRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListServicesRequestRequestTag extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Key")
        public String key;

        public static ListServicesRequestRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListServicesRequestRequestTag self = new ListServicesRequestRequestTag();
            return TeaModel.build(map, self);
        }

        public ListServicesRequestRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListServicesRequestRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

}
