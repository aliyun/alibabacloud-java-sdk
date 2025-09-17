// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class GetResourcesShrinkRequest extends TeaModel {
    /**
     * <p>The filter condition. The JSON format. You can use some resource properties as filter conditions.</p>
     */
    @NameInMap("filter")
    public String filterShrink;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If you leave this parameter empty, the query starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The ID of the region. This parameter is required if the cloud product is deployed in a region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static GetResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourcesShrinkRequest self = new GetResourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetResourcesShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public GetResourcesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetResourcesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetResourcesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
