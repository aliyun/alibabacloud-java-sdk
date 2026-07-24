// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class CreatePreCheckRequest extends TeaModel {
    /**
     * <p>The filter configuration for each bucket. The value can be parsed as a JSON map. The key is the bucket name, and the value is the filter configuration, which includes prefix/suffix filters and a list of filter strings.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{\&quot;test-bucket1\&quot;:{\&quot;prefixFilterType\&quot;:\&quot;include\&quot;,\&quot;prefixFilters\&quot;:[\&quot;test1\&quot;]},\&quot;test-bucket2\&quot;:{\&quot;prefixFilterType\&quot;:\&quot;exclude\&quot;,\&quot;prefixFilters\&quot;:[\&quot;test2\&quot;]}}&quot;</p>
     */
    @NameInMap("BucketPrefixFilterConfig")
    public String bucketPrefixFilterConfig;

    /**
     * <p>The OSS buckets.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;Bucket\&quot;:\&quot;bucket01-test\&quot;,\&quot;Region\&quot;:\&quot;cn-beijing\&quot;}]</p>
     */
    @NameInMap("Buckets")
    public String buckets;

    /**
     * <p>Specifies whether to deduplicate against historically scanned tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DistinctHistoryTasks")
    public Boolean distinctHistoryTasks;

    /**
     * <p>The task end time. Format: YYYY-MM-DD HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-12-18 10:08:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether the task is a scheduled scan task.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsInc")
    public Boolean isInc;

    /**
     * <p>The media asset type.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MediaType")
    public Integer mediaType;

    /**
     * <p>The prefix filter type.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("PrefixFilterType")
    public String prefixFilterType;

    /**
     * <p>The prefixes.</p>
     * 
     * <strong>example:</strong>
     * <p>dir1,dir2</p>
     */
    @NameInMap("PrefixFilters")
    public String prefixFilters;

    /**
     * <p>The priority.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The maximum number of items to scan.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ScanLimit")
    public Long scanLimit;

    /**
     * <p>Specifies whether to scan images without file extensions.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ScanNoFileType")
    public Boolean scanNoFileType;

    /**
     * <p>The scan service code.</p>
     * 
     * <strong>example:</strong>
     * <p>baselineCheck</p>
     */
    @NameInMap("ScanService")
    public String scanService;

    /**
     * <p>The task start time. Format: YYYY-MM-DD HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-12-17 10:08:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>图片任务 20240709101602004</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static CreatePreCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePreCheckRequest self = new CreatePreCheckRequest();
        return TeaModel.build(map, self);
    }

    public CreatePreCheckRequest setBucketPrefixFilterConfig(String bucketPrefixFilterConfig) {
        this.bucketPrefixFilterConfig = bucketPrefixFilterConfig;
        return this;
    }
    public String getBucketPrefixFilterConfig() {
        return this.bucketPrefixFilterConfig;
    }

    public CreatePreCheckRequest setBuckets(String buckets) {
        this.buckets = buckets;
        return this;
    }
    public String getBuckets() {
        return this.buckets;
    }

    public CreatePreCheckRequest setDistinctHistoryTasks(Boolean distinctHistoryTasks) {
        this.distinctHistoryTasks = distinctHistoryTasks;
        return this;
    }
    public Boolean getDistinctHistoryTasks() {
        return this.distinctHistoryTasks;
    }

    public CreatePreCheckRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreatePreCheckRequest setIsInc(Boolean isInc) {
        this.isInc = isInc;
        return this;
    }
    public Boolean getIsInc() {
        return this.isInc;
    }

    public CreatePreCheckRequest setMediaType(Integer mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public Integer getMediaType() {
        return this.mediaType;
    }

    public CreatePreCheckRequest setPrefixFilterType(String prefixFilterType) {
        this.prefixFilterType = prefixFilterType;
        return this;
    }
    public String getPrefixFilterType() {
        return this.prefixFilterType;
    }

    public CreatePreCheckRequest setPrefixFilters(String prefixFilters) {
        this.prefixFilters = prefixFilters;
        return this;
    }
    public String getPrefixFilters() {
        return this.prefixFilters;
    }

    public CreatePreCheckRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreatePreCheckRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePreCheckRequest setScanLimit(Long scanLimit) {
        this.scanLimit = scanLimit;
        return this;
    }
    public Long getScanLimit() {
        return this.scanLimit;
    }

    public CreatePreCheckRequest setScanNoFileType(Boolean scanNoFileType) {
        this.scanNoFileType = scanNoFileType;
        return this;
    }
    public Boolean getScanNoFileType() {
        return this.scanNoFileType;
    }

    public CreatePreCheckRequest setScanService(String scanService) {
        this.scanService = scanService;
        return this;
    }
    public String getScanService() {
        return this.scanService;
    }

    public CreatePreCheckRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreatePreCheckRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
