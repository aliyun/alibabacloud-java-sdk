// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ListReplicaEdgeSupportedRequest extends TeaModel {
    /**
     * <p>The zone ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("Azone")
    public String azone;

    /**
     * <p>The maximum number of entries to return on each page. Valid values: 1 to 500. This parameter is not enabled.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to start the next query. Set this parameter to the value of NextToken that was returned by the last call. Do not set this parameter for the first call. If you set NextToken, PageSize and PageNumber are ignored. TotalCount is also invalid in the response. This parameter is not enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>e71d8a535bd9c****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListReplicaEdgeSupportedRequest build(java.util.Map<String, ?> map) throws Exception {
        ListReplicaEdgeSupportedRequest self = new ListReplicaEdgeSupportedRequest();
        return TeaModel.build(map, self);
    }

    public ListReplicaEdgeSupportedRequest setAzone(String azone) {
        this.azone = azone;
        return this;
    }
    public String getAzone() {
        return this.azone;
    }

    public ListReplicaEdgeSupportedRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListReplicaEdgeSupportedRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListReplicaEdgeSupportedRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
