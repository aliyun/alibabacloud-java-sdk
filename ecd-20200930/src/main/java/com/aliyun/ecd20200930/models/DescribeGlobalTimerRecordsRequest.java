// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeGlobalTimerRecordsRequest extends TeaModel {
    /**
     * <p>The batch ID of the scheduled task execution.</p>
     * 
     * <strong>example:</strong>
     * <p>ccg-****</p>
     */
    @NameInMap("BatchId")
    public String batchId;

    /**
     * <p>The list of cloud computer IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCEED</p>
     */
    @NameInMap("DesktopIds")
    public java.util.List<String> desktopIds;

    /**
     * <p>The display result name.</p>
     * 
     * <strong>example:</strong>
     * <p>FAILED</p>
     */
    @NameInMap("DisplayResultName")
    public String displayResultName;

    /**
     * <p>The ID of the scheduled task group.</p>
     * 
     * <strong>example:</strong>
     * <p>ccg-0cvfvf6u1enx1****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The number of entries per page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The pagination token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by Wuying Workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of resource types. If empty, all resource types are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ResourceTypes")
    public java.util.List<String> resourceTypes;

    /**
     * <p>Filters results by execution result.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCEED</p>
     */
    @NameInMap("ResultCategory")
    public String resultCategory;

    /**
     * <p>Specifies whether the task can be retried.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Retryable")
    public Boolean retryable;

    /**
     * <p>The region ID used to filter cloud computer information for a specified region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("SearchRegionId")
    public String searchRegionId;

    /**
     * <p>The execution result of the scheduled task.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("TimerResult")
    public String timerResult;

    /**
     * <p>The list of scheduled tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("TimerTypes")
    public java.util.List<String> timerTypes;

    /**
     * <p>The list of Wuying server IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>FAILED</p>
     */
    @NameInMap("WuyingServerIds")
    public java.util.List<String> wuyingServerIds;

    public static DescribeGlobalTimerRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalTimerRecordsRequest self = new DescribeGlobalTimerRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalTimerRecordsRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public DescribeGlobalTimerRecordsRequest setDesktopIds(java.util.List<String> desktopIds) {
        this.desktopIds = desktopIds;
        return this;
    }
    public java.util.List<String> getDesktopIds() {
        return this.desktopIds;
    }

    public DescribeGlobalTimerRecordsRequest setDisplayResultName(String displayResultName) {
        this.displayResultName = displayResultName;
        return this;
    }
    public String getDisplayResultName() {
        return this.displayResultName;
    }

    public DescribeGlobalTimerRecordsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeGlobalTimerRecordsRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public DescribeGlobalTimerRecordsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeGlobalTimerRecordsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeGlobalTimerRecordsRequest setResourceTypes(java.util.List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public java.util.List<String> getResourceTypes() {
        return this.resourceTypes;
    }

    public DescribeGlobalTimerRecordsRequest setResultCategory(String resultCategory) {
        this.resultCategory = resultCategory;
        return this;
    }
    public String getResultCategory() {
        return this.resultCategory;
    }

    public DescribeGlobalTimerRecordsRequest setRetryable(Boolean retryable) {
        this.retryable = retryable;
        return this;
    }
    public Boolean getRetryable() {
        return this.retryable;
    }

    public DescribeGlobalTimerRecordsRequest setSearchRegionId(String searchRegionId) {
        this.searchRegionId = searchRegionId;
        return this;
    }
    public String getSearchRegionId() {
        return this.searchRegionId;
    }

    public DescribeGlobalTimerRecordsRequest setTimerResult(String timerResult) {
        this.timerResult = timerResult;
        return this;
    }
    public String getTimerResult() {
        return this.timerResult;
    }

    public DescribeGlobalTimerRecordsRequest setTimerTypes(java.util.List<String> timerTypes) {
        this.timerTypes = timerTypes;
        return this;
    }
    public java.util.List<String> getTimerTypes() {
        return this.timerTypes;
    }

    public DescribeGlobalTimerRecordsRequest setWuyingServerIds(java.util.List<String> wuyingServerIds) {
        this.wuyingServerIds = wuyingServerIds;
        return this;
    }
    public java.util.List<String> getWuyingServerIds() {
        return this.wuyingServerIds;
    }

}
