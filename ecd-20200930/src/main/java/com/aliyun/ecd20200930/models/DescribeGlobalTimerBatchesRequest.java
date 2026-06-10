// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeGlobalTimerBatchesRequest extends TeaModel {
    /**
     * <p>The ID of the scheduled task group.</p>
     * 
     * <strong>example:</strong>
     * <p>ccg-i1ruuudp92qpj****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The maximum number of entries to return.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The token used to retrieve the next page of results. Set this parameter to the <code>NextToken</code> value from a previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     * <ul>
     * <li><p>China (Shanghai)</p>
     * </li>
     * <li><p>Singapore (Singapore)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceTypes")
    public java.util.List<String> resourceTypes;

    /**
     * <p>The ID of the region where the cloud computers are located. This parameter filters the results to include only cloud computers in the specified region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SearchRegionId")
    public String searchRegionId;

    /**
     * <p>The type of the scheduled task. This operation returns batch information for timer-based scheduled tasks only.</p>
     * <ul>
     * <li><p><code>TimerBoot</code>: scheduled startup</p>
     * </li>
     * <li><p><code>TimerShutdown</code>: scheduled shutdown</p>
     * </li>
     * <li><p><code>TimerReboot</code>: scheduled reboot</p>
     * </li>
     * <li><p><code>TimerReset</code>: scheduled reset</p>
     * </li>
     * <li><p><code>TimerMaintenance</code>: scheduled maintenance</p>
     * </li>
     * <li><p><code>TimerHibernate</code>: scheduled hibernation</p>
     * </li>
     * </ul>
     * 
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

    public DescribeGlobalTimerBatchesRequest setResourceTypes(java.util.List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public java.util.List<String> getResourceTypes() {
        return this.resourceTypes;
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
