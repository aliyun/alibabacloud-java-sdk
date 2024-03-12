// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListAccountFactoryBaselinesRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 1 to 100. Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>RegionId</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListAccountFactoryBaselinesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccountFactoryBaselinesRequest self = new ListAccountFactoryBaselinesRequest();
        return TeaModel.build(map, self);
    }

    public ListAccountFactoryBaselinesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAccountFactoryBaselinesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAccountFactoryBaselinesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
