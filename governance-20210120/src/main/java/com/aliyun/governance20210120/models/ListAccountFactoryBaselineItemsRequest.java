// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListAccountFactoryBaselineItemsRequest extends TeaModel {
    /**
     * <p>The number of entries per page.</p>
     * <p>Valid values: 1 to 100. Default value: 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The names of the baseline items.</p>
     */
    @NameInMap("Names")
    public java.util.List<String> names;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAACDGQdAEX3m42z3sQ+f3VTK2Xr2DzYbz/SAfc/zJRqod</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the baseline items.</p>
     * 
     * <strong>example:</strong>
     * <p>AccountFactory</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The versions of the baseline items.</p>
     */
    @NameInMap("Versions")
    public java.util.List<String> versions;

    public static ListAccountFactoryBaselineItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccountFactoryBaselineItemsRequest self = new ListAccountFactoryBaselineItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListAccountFactoryBaselineItemsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAccountFactoryBaselineItemsRequest setNames(java.util.List<String> names) {
        this.names = names;
        return this;
    }
    public java.util.List<String> getNames() {
        return this.names;
    }

    public ListAccountFactoryBaselineItemsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAccountFactoryBaselineItemsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAccountFactoryBaselineItemsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListAccountFactoryBaselineItemsRequest setVersions(java.util.List<String> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<String> getVersions() {
        return this.versions;
    }

}
