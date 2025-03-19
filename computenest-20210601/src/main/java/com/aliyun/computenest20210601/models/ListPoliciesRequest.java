// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListPoliciesRequest extends TeaModel {
    /**
     * <p>Page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Token for the next query, an empty nextToken indicates there is no next page.</p>
     * 
     * <strong>example:</strong>
     * <p>BBBAAfu+XtuBE55iRLHEYYuojI4=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesRequest self = new ListPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListPoliciesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPoliciesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPoliciesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
