// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateSqlPatternCompareReportRequest extends TeaModel {
    /**
     * <p>The end time of time window 2. Specify the time in UTC in the yyyy-MM-ddTHH:mmZ or yyyy-MM-ddTHH:mm:ssZ format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-08T01:00Z</p>
     */
    @NameInMap("CompareEndTime")
    public String compareEndTime;

    /**
     * <p>The start time of time window 2. Specify the time in UTC in the yyyy-MM-ddTHH:mmZ or yyyy-MM-ddTHH:mm:ssZ format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-08T00:00Z</p>
     */
    @NameInMap("CompareStartTime")
    public String compareStartTime;

    /**
     * <p>The ID of the AnalyticDB for MySQL cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-2ze1234567890****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time of time window 1. Specify the time in UTC in the yyyy-MM-ddTHH:mmZ or yyyy-MM-ddTHH:mm:ssZ format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-07T01:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The report type. Valid values:</p>
     * <ul>
     * <li><code>NEW</code>: Patterns that are new in time window 2.</li>
     * <li><code>CHANGED</code>: Patterns that exist in both time windows and have an increased average value in at least one metric.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CHANGED</p>
     */
    @NameInMap("PatternType")
    public String patternType;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time of time window 1. Specify the time in UTC in the yyyy-MM-ddTHH:mmZ or yyyy-MM-ddTHH:mm:ssZ format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-09-07T00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static CreateSqlPatternCompareReportRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlPatternCompareReportRequest self = new CreateSqlPatternCompareReportRequest();
        return TeaModel.build(map, self);
    }

    public CreateSqlPatternCompareReportRequest setCompareEndTime(String compareEndTime) {
        this.compareEndTime = compareEndTime;
        return this;
    }
    public String getCompareEndTime() {
        return this.compareEndTime;
    }

    public CreateSqlPatternCompareReportRequest setCompareStartTime(String compareStartTime) {
        this.compareStartTime = compareStartTime;
        return this;
    }
    public String getCompareStartTime() {
        return this.compareStartTime;
    }

    public CreateSqlPatternCompareReportRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateSqlPatternCompareReportRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateSqlPatternCompareReportRequest setPatternType(String patternType) {
        this.patternType = patternType;
        return this;
    }
    public String getPatternType() {
        return this.patternType;
    }

    public CreateSqlPatternCompareReportRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSqlPatternCompareReportRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
