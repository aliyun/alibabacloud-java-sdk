// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220606.models;

import com.aliyun.tea.*;

public class ListResourcesRequest extends TeaModel {
    @NameInMap("filter")
    public java.util.Map<String, ?> filter;

    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("regionIds")
    public java.util.List<String> regionIds;

    @NameInMap("resourceTypeVersion")
    public String resourceTypeVersion;

    public static ListResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesRequest self = new ListResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListResourcesRequest setFilter(java.util.Map<String, ?> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.Map<String, ?> getFilter() {
        return this.filter;
    }

    public ListResourcesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourcesRequest setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    public ListResourcesRequest setResourceTypeVersion(String resourceTypeVersion) {
        this.resourceTypeVersion = resourceTypeVersion;
        return this;
    }
    public String getResourceTypeVersion() {
        return this.resourceTypeVersion;
    }

}
