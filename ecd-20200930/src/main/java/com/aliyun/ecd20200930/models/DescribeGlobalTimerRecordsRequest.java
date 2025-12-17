// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeGlobalTimerRecordsRequest extends TeaModel {
    /**
     * <p>The ID of the batch in which the scheduled task is executed.</p>
     * 
     * <strong>example:</strong>
     * <p>ccg-****</p>
     */
    @NameInMap("BatchId")
    public String batchId;

    /**
     * <p>The cloud computer IDs.</p>
     */
    @NameInMap("DesktopIds")
    public java.util.List<String> desktopIds;

    /**
     * <p>The ID of the scheduled task group.</p>
     * 
     * <strong>example:</strong>
     * <p>ccg-0cvfvf6u1enx1****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The number of entries per page.</p>
     * <p>Maximum value: 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the execution result. You can specify this parameter to filter the execution results.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>FAILED: The execution is successful.</li>
     * <li>FAILED: The execution failed.</li>
     * <li>RUNNING: The execution is in progress.</li>
     * <li>SKIPPED: The execution is skipped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SUCCEED</p>
     */
    @NameInMap("ResultCategory")
    public String resultCategory;

    /**
     * <p>The ID of the searched region. You can specify this parameter to filter cloud computers in specific regions.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("SearchRegionId")
    public String searchRegionId;

    /**
     * <p>The execution result of the scheduled task.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CONNECTED_NOT_RUN: The cloud computer is connected, but the scheduled task is not executed.</li>
     * <li>PAUSED: The scheduled task is suspended.</li>
     * <li>COMPLETED: The scheduled task is executed.</li>
     * <li>FAILED: The scheduled task failed to be executed.</li>
     * <li>RUNNING: The scheduled task is being executed.</li>
     * <li>TERMINATED: The scheduled task is stopped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("TimerResult")
    public String timerResult;

    /**
     * <p>The scheduled tasks.</p>
     */
    @NameInMap("TimerTypes")
    public java.util.List<String> timerTypes;

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

    public DescribeGlobalTimerRecordsRequest setResultCategory(String resultCategory) {
        this.resultCategory = resultCategory;
        return this;
    }
    public String getResultCategory() {
        return this.resultCategory;
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

}
