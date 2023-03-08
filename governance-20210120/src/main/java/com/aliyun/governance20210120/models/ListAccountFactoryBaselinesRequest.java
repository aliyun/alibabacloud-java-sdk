// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListAccountFactoryBaselinesRequest extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

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
