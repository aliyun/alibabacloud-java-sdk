// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class ListResourceTypesRequest extends TeaModel {
    @NameInMap("resourceTypeCodes")
    public java.util.List<String> resourceTypeCodes;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("maxResults")
    public Long maxResults;

    public static ListResourceTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTypesRequest self = new ListResourceTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceTypesRequest setResourceTypeCodes(java.util.List<String> resourceTypeCodes) {
        this.resourceTypeCodes = resourceTypeCodes;
        return this;
    }
    public java.util.List<String> getResourceTypeCodes() {
        return this.resourceTypeCodes;
    }

    public ListResourceTypesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceTypesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

}
