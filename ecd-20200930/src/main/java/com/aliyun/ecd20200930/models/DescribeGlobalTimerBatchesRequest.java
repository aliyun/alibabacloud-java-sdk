// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeGlobalTimerBatchesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ccg-i1ruuudp92qpj****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SearchRegionId")
    public String searchRegionId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TimerType")
    public String timerType;

    public static DescribeGlobalTimerBatchesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalTimerBatchesRequest self = new DescribeGlobalTimerBatchesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalTimerBatchesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeGlobalTimerBatchesRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public DescribeGlobalTimerBatchesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeGlobalTimerBatchesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeGlobalTimerBatchesRequest setSearchRegionId(String searchRegionId) {
        this.searchRegionId = searchRegionId;
        return this;
    }
    public String getSearchRegionId() {
        return this.searchRegionId;
    }

    public DescribeGlobalTimerBatchesRequest setTimerType(String timerType) {
        this.timerType = timerType;
        return this;
    }
    public String getTimerType() {
        return this.timerType;
    }

}
