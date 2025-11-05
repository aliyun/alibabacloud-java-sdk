// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ListReplicaEdgeSupportedRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("Azone")
    public String azone;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>e71d8a535bd9c****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
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
