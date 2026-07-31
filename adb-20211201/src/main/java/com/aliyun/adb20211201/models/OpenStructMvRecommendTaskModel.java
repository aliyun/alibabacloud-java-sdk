// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class OpenStructMvRecommendTaskModel extends TeaModel {
    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-12 23:59</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>Description.</p>
     * 
     * <strong>example:</strong>
     * <p>task desc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Last execution time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-13 00:10</p>
     */
    @NameInMap("LastRunAt")
    public String lastRunAt;

    /**
     * <p>The minimum number of slow queries that match the pattern.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("MinRewriteQueryCount")
    public Integer minRewriteQueryCount;

    /**
     * <p>The number of minimum acceleration patterns.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MinRewriteQueryPattern")
    public Integer minRewriteQueryPattern;

    /**
     * <p>The time range for scanning data. Unit: days. Default value: 3.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ScanQueriesRange")
    public Integer scanQueriesRange;

    /**
     * <p>The execution schedule of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>The 12:30 every day</p>
     */
    @NameInMap("SchedulingSettings")
    public String schedulingSettings;

    /**
     * <p>The wait threshold for slow queries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SlowQueryThreshold")
    public Integer slowQueryThreshold;

    /**
     * <p>The name of the recommendation task.</p>
     * 
     * <strong>example:</strong>
     * <p>mv_task1</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static OpenStructMvRecommendTaskModel build(java.util.Map<String, ?> map) throws Exception {
        OpenStructMvRecommendTaskModel self = new OpenStructMvRecommendTaskModel();
        return TeaModel.build(map, self);
    }

    public OpenStructMvRecommendTaskModel setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public OpenStructMvRecommendTaskModel setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OpenStructMvRecommendTaskModel setLastRunAt(String lastRunAt) {
        this.lastRunAt = lastRunAt;
        return this;
    }
    public String getLastRunAt() {
        return this.lastRunAt;
    }

    public OpenStructMvRecommendTaskModel setMinRewriteQueryCount(Integer minRewriteQueryCount) {
        this.minRewriteQueryCount = minRewriteQueryCount;
        return this;
    }
    public Integer getMinRewriteQueryCount() {
        return this.minRewriteQueryCount;
    }

    public OpenStructMvRecommendTaskModel setMinRewriteQueryPattern(Integer minRewriteQueryPattern) {
        this.minRewriteQueryPattern = minRewriteQueryPattern;
        return this;
    }
    public Integer getMinRewriteQueryPattern() {
        return this.minRewriteQueryPattern;
    }

    public OpenStructMvRecommendTaskModel setScanQueriesRange(Integer scanQueriesRange) {
        this.scanQueriesRange = scanQueriesRange;
        return this;
    }
    public Integer getScanQueriesRange() {
        return this.scanQueriesRange;
    }

    public OpenStructMvRecommendTaskModel setSchedulingSettings(String schedulingSettings) {
        this.schedulingSettings = schedulingSettings;
        return this;
    }
    public String getSchedulingSettings() {
        return this.schedulingSettings;
    }

    public OpenStructMvRecommendTaskModel setSlowQueryThreshold(Integer slowQueryThreshold) {
        this.slowQueryThreshold = slowQueryThreshold;
        return this;
    }
    public Integer getSlowQueryThreshold() {
        return this.slowQueryThreshold;
    }

    public OpenStructMvRecommendTaskModel setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
