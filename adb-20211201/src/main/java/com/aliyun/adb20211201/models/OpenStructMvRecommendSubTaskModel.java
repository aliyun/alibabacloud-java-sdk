// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class OpenStructMvRecommendSubTaskModel extends TeaModel {
    /**
     * <p>The end time of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-10-16 16:56</p>
     */
    @NameInMap("EndTime")
    public String endTime;

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
     * <p>The number of queries scanned.</p>
     * 
     * <strong>example:</strong>
     * <p>55</p>
     */
    @NameInMap("ScanQueriesCount")
    public Long scanQueriesCount;

    /**
     * <p>The wait threshold for slow queries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SlowQueryThreshold")
    public Integer slowQueryThreshold;

    /**
     * <p>The start time of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-10-16 16:55</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Current execution status.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The number of newly generated MV recommendations.</p>
     * 
     * <strong>example:</strong>
     * <p>70</p>
     */
    @NameInMap("SubQueriesCount")
    public Long subQueriesCount;

    /**
     * <p>The record ID of the task execution.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("SubtaskId")
    public Long subtaskId;

    public static OpenStructMvRecommendSubTaskModel build(java.util.Map<String, ?> map) throws Exception {
        OpenStructMvRecommendSubTaskModel self = new OpenStructMvRecommendSubTaskModel();
        return TeaModel.build(map, self);
    }

    public OpenStructMvRecommendSubTaskModel setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public OpenStructMvRecommendSubTaskModel setMinRewriteQueryCount(Integer minRewriteQueryCount) {
        this.minRewriteQueryCount = minRewriteQueryCount;
        return this;
    }
    public Integer getMinRewriteQueryCount() {
        return this.minRewriteQueryCount;
    }

    public OpenStructMvRecommendSubTaskModel setMinRewriteQueryPattern(Integer minRewriteQueryPattern) {
        this.minRewriteQueryPattern = minRewriteQueryPattern;
        return this;
    }
    public Integer getMinRewriteQueryPattern() {
        return this.minRewriteQueryPattern;
    }

    public OpenStructMvRecommendSubTaskModel setScanQueriesCount(Long scanQueriesCount) {
        this.scanQueriesCount = scanQueriesCount;
        return this;
    }
    public Long getScanQueriesCount() {
        return this.scanQueriesCount;
    }

    public OpenStructMvRecommendSubTaskModel setSlowQueryThreshold(Integer slowQueryThreshold) {
        this.slowQueryThreshold = slowQueryThreshold;
        return this;
    }
    public Integer getSlowQueryThreshold() {
        return this.slowQueryThreshold;
    }

    public OpenStructMvRecommendSubTaskModel setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public OpenStructMvRecommendSubTaskModel setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public OpenStructMvRecommendSubTaskModel setSubQueriesCount(Long subQueriesCount) {
        this.subQueriesCount = subQueriesCount;
        return this;
    }
    public Long getSubQueriesCount() {
        return this.subQueriesCount;
    }

    public OpenStructMvRecommendSubTaskModel setSubtaskId(Long subtaskId) {
        this.subtaskId = subtaskId;
        return this;
    }
    public Long getSubtaskId() {
        return this.subtaskId;
    }

}
