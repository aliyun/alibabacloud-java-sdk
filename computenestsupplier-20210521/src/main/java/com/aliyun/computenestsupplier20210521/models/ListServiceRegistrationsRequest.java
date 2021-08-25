// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceRegistrationsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Filter")
    public java.util.List<ListServiceRegistrationsRequestFilter> filter;

    public static ListServiceRegistrationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceRegistrationsRequest self = new ListServiceRegistrationsRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceRegistrationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListServiceRegistrationsRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListServiceRegistrationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceRegistrationsRequest setFilter(java.util.List<ListServiceRegistrationsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListServiceRegistrationsRequestFilter> getFilter() {
        return this.filter;
    }

    public static class ListServiceRegistrationsRequestFilter extends TeaModel {
        @NameInMap("Value")
        public java.util.List<String> value;

        @NameInMap("Name")
        public String name;

        public static ListServiceRegistrationsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListServiceRegistrationsRequestFilter self = new ListServiceRegistrationsRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListServiceRegistrationsRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

        public ListServiceRegistrationsRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
