// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class CreatStockOssCheckTaskRequest extends TeaModel {
    @NameInMap("BucketPrefixFilterConfig")
    public String bucketPrefixFilterConfig;

    /**
     * <p>OSS buckets</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;Bucket\&quot;:\&quot;bucket01-test\&quot;,\&quot;Region\&quot;:\&quot;cn-beijing\&quot;}]</p>
     */
    @NameInMap("Buckets")
    public String buckets;

    /**
     * <p>Callback ID</p>
     * 
     * <strong>example:</strong>
     * <p>1751</p>
     */
    @NameInMap("CallbackId")
    public String callbackId;

    /**
     * <p>Flag for deduplicating against previously detected tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DistinctHistoryTasks")
    public Boolean distinctHistoryTasks;

    /**
     * <p>The end time of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-12-18 10:08:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Execute date of scheduled task.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ExecuteDate")
    public Integer executeDate;

    /**
     * <p>Execute time of scheduled task.</p>
     * 
     * <strong>example:</strong>
     * <p>01:09:30-01:19:30</p>
     */
    @NameInMap("ExecuteTime")
    public String executeTime;

    /**
     * <p>Freeze indicator</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Freeze")
    public Boolean freeze;

    /**
     * <p>Freeze High-Risk Images</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FreezeHighRisk1")
    public Boolean freezeHighRisk1;

    /**
     * <p>Freeze High-Risk Audio and Text</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FreezeHighRisk2")
    public Boolean freezeHighRisk2;

    /**
     * <p>Freeze Medium-Risk Images</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FreezeMediumRisk1")
    public Boolean freezeMediumRisk1;

    /**
     * <p>Freeze Medium-Risk Audio and Text</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FreezeMediumRisk2")
    public Boolean freezeMediumRisk2;

    /**
     * <p>Freeze Restore Path</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("FreezeRestorePath")
    public String freezeRestorePath;

    /**
     * <p>Freeze type</p>
     * 
     * <strong>example:</strong>
     * <p>ACL</p>
     */
    @NameInMap("FreezeType")
    public String freezeType;

    /**
     * <p>Indicator for scheduled task.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsInc")
    public Boolean isInc;

    /**
     * <p>Media type.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MediaType")
    public Integer mediaType;

    /**
     * <p>Prefix filter type.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("PrefixFilterType")
    public String prefixFilterType;

    /**
     * <p>Prefix filters</p>
     * 
     * <strong>example:</strong>
     * <p>dir1,dir2</p>
     */
    @NameInMap("PrefixFilters")
    public String prefixFilters;

    /**
     * <p>The priority of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>Referer.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
     */
    @NameInMap("Referer")
    public String referer;

    /**
     * <p>Region ID</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The scan limit of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ScanLimit")
    public Long scanLimit;

    /**
     * <p>Indicator for scanning files without file type.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ScanNoFileType")
    public Boolean scanNoFileType;

    /**
     * <p>Scan resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ScanResourceType")
    public String scanResourceType;

    /**
     * <p>The code of scan service.</p>
     * 
     * <strong>example:</strong>
     * <p>baselineCheck</p>
     */
    @NameInMap("ScanService")
    public String scanService;

    /**
     * <p>The start time of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-12-17 10:08:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Task Cycle</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TaskCycle")
    public Integer taskCycle;

    /**
     * <p>The name of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>image task 20240709101602004</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>Task type.</p>
     * 
     * <strong>example:</strong>
     * <p>batch</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static CreatStockOssCheckTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatStockOssCheckTaskRequest self = new CreatStockOssCheckTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreatStockOssCheckTaskRequest setBucketPrefixFilterConfig(String bucketPrefixFilterConfig) {
        this.bucketPrefixFilterConfig = bucketPrefixFilterConfig;
        return this;
    }
    public String getBucketPrefixFilterConfig() {
        return this.bucketPrefixFilterConfig;
    }

    public CreatStockOssCheckTaskRequest setBuckets(String buckets) {
        this.buckets = buckets;
        return this;
    }
    public String getBuckets() {
        return this.buckets;
    }

    public CreatStockOssCheckTaskRequest setCallbackId(String callbackId) {
        this.callbackId = callbackId;
        return this;
    }
    public String getCallbackId() {
        return this.callbackId;
    }

    public CreatStockOssCheckTaskRequest setDistinctHistoryTasks(Boolean distinctHistoryTasks) {
        this.distinctHistoryTasks = distinctHistoryTasks;
        return this;
    }
    public Boolean getDistinctHistoryTasks() {
        return this.distinctHistoryTasks;
    }

    public CreatStockOssCheckTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreatStockOssCheckTaskRequest setExecuteDate(Integer executeDate) {
        this.executeDate = executeDate;
        return this;
    }
    public Integer getExecuteDate() {
        return this.executeDate;
    }

    public CreatStockOssCheckTaskRequest setExecuteTime(String executeTime) {
        this.executeTime = executeTime;
        return this;
    }
    public String getExecuteTime() {
        return this.executeTime;
    }

    public CreatStockOssCheckTaskRequest setFreeze(Boolean freeze) {
        this.freeze = freeze;
        return this;
    }
    public Boolean getFreeze() {
        return this.freeze;
    }

    public CreatStockOssCheckTaskRequest setFreezeHighRisk1(Boolean freezeHighRisk1) {
        this.freezeHighRisk1 = freezeHighRisk1;
        return this;
    }
    public Boolean getFreezeHighRisk1() {
        return this.freezeHighRisk1;
    }

    public CreatStockOssCheckTaskRequest setFreezeHighRisk2(Boolean freezeHighRisk2) {
        this.freezeHighRisk2 = freezeHighRisk2;
        return this;
    }
    public Boolean getFreezeHighRisk2() {
        return this.freezeHighRisk2;
    }

    public CreatStockOssCheckTaskRequest setFreezeMediumRisk1(Boolean freezeMediumRisk1) {
        this.freezeMediumRisk1 = freezeMediumRisk1;
        return this;
    }
    public Boolean getFreezeMediumRisk1() {
        return this.freezeMediumRisk1;
    }

    public CreatStockOssCheckTaskRequest setFreezeMediumRisk2(Boolean freezeMediumRisk2) {
        this.freezeMediumRisk2 = freezeMediumRisk2;
        return this;
    }
    public Boolean getFreezeMediumRisk2() {
        return this.freezeMediumRisk2;
    }

    public CreatStockOssCheckTaskRequest setFreezeRestorePath(String freezeRestorePath) {
        this.freezeRestorePath = freezeRestorePath;
        return this;
    }
    public String getFreezeRestorePath() {
        return this.freezeRestorePath;
    }

    public CreatStockOssCheckTaskRequest setFreezeType(String freezeType) {
        this.freezeType = freezeType;
        return this;
    }
    public String getFreezeType() {
        return this.freezeType;
    }

    public CreatStockOssCheckTaskRequest setIsInc(Boolean isInc) {
        this.isInc = isInc;
        return this;
    }
    public Boolean getIsInc() {
        return this.isInc;
    }

    public CreatStockOssCheckTaskRequest setMediaType(Integer mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public Integer getMediaType() {
        return this.mediaType;
    }

    public CreatStockOssCheckTaskRequest setPrefixFilterType(String prefixFilterType) {
        this.prefixFilterType = prefixFilterType;
        return this;
    }
    public String getPrefixFilterType() {
        return this.prefixFilterType;
    }

    public CreatStockOssCheckTaskRequest setPrefixFilters(String prefixFilters) {
        this.prefixFilters = prefixFilters;
        return this;
    }
    public String getPrefixFilters() {
        return this.prefixFilters;
    }

    public CreatStockOssCheckTaskRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreatStockOssCheckTaskRequest setReferer(String referer) {
        this.referer = referer;
        return this;
    }
    public String getReferer() {
        return this.referer;
    }

    public CreatStockOssCheckTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatStockOssCheckTaskRequest setScanLimit(Long scanLimit) {
        this.scanLimit = scanLimit;
        return this;
    }
    public Long getScanLimit() {
        return this.scanLimit;
    }

    public CreatStockOssCheckTaskRequest setScanNoFileType(Boolean scanNoFileType) {
        this.scanNoFileType = scanNoFileType;
        return this;
    }
    public Boolean getScanNoFileType() {
        return this.scanNoFileType;
    }

    public CreatStockOssCheckTaskRequest setScanResourceType(String scanResourceType) {
        this.scanResourceType = scanResourceType;
        return this;
    }
    public String getScanResourceType() {
        return this.scanResourceType;
    }

    public CreatStockOssCheckTaskRequest setScanService(String scanService) {
        this.scanService = scanService;
        return this;
    }
    public String getScanService() {
        return this.scanService;
    }

    public CreatStockOssCheckTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreatStockOssCheckTaskRequest setTaskCycle(Integer taskCycle) {
        this.taskCycle = taskCycle;
        return this;
    }
    public Integer getTaskCycle() {
        return this.taskCycle;
    }

    public CreatStockOssCheckTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreatStockOssCheckTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
