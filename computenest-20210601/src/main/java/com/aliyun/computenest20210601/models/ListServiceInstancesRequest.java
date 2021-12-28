// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServiceInstancesRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<ListServiceInstancesRequestFilter> filter;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestTag")
    public java.util.List<ListServiceInstancesRequestRequestTag> requestTag;

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

    public ListServiceInstancesRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
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

    public ListServiceInstancesRequest setRequestTag(java.util.List<ListServiceInstancesRequestRequestTag> requestTag) {
        this.requestTag = requestTag;
        return this;
    }
    public java.util.List<ListServiceInstancesRequestRequestTag> getRequestTag() {
        return this.requestTag;
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

    public static class ListServiceInstancesRequestRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListServiceInstancesRequestRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstancesRequestRequestTag self = new ListServiceInstancesRequestRequestTag();
            return TeaModel.build(map, self);
        }

        public ListServiceInstancesRequestRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListServiceInstancesRequestRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
