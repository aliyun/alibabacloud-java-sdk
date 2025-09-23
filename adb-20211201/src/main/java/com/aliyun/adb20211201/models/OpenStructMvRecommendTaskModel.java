// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class OpenStructMvRecommendTaskModel extends TeaModel {
    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("LastRunAt")
    public String lastRunAt;

    @NameInMap("MinRewriteQueryCount")
    public Integer minRewriteQueryCount;

    @NameInMap("MinRewriteQueryPattern")
    public Integer minRewriteQueryPattern;

    @NameInMap("ScanQueriesRange")
    public Integer scanQueriesRange;

    @NameInMap("SchedulingSettings")
    public String schedulingSettings;

    @NameInMap("SlowQueryThreshold")
    public Integer slowQueryThreshold;

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
