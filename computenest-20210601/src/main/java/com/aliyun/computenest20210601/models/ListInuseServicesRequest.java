// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListInuseServicesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Filter")
    public java.util.List<ListInuseServicesRequestFilter> filter;

    public static ListInuseServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInuseServicesRequest self = new ListInuseServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListInuseServicesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListInuseServicesRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListInuseServicesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInuseServicesRequest setFilter(java.util.List<ListInuseServicesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListInuseServicesRequestFilter> getFilter() {
        return this.filter;
    }

    public static class ListInuseServicesRequestFilter extends TeaModel {
        @NameInMap("Value")
        public java.util.List<String> value;

        @NameInMap("Name")
        public String name;

        public static ListInuseServicesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListInuseServicesRequestFilter self = new ListInuseServicesRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListInuseServicesRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

        public ListInuseServicesRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
