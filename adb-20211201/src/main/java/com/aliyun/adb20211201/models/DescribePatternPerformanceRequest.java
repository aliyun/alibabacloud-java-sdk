// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribePatternPerformanceRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the information about all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region, including cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-uf6li1r3do8m****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end of the time range to query. Specify the time in the <em>yyyy-MM-ddTHH:mmZ</em> format. The time must be in UTC.</p>
     * <blockquote>
     * <p>The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-08-22T01:06:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The SQL pattern ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/321868.html">DescribeSQLPatterns</a> operation to query the information about all SQL patterns in an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster within a period of time, including SQL pattern IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3847585356974******</p>
     */
    @NameInMap("PatternId")
    public String patternId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time must be in UTC.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If the current date is August 22, 2022 (UTC+8), you can query the data of August 9, 2022 (2022-08-08T16:00:00Z) to the earliest extent. If you want to query the data that is earlier than August 9, 2022 (2022-08-08T16:00:00Z), null is returned.</p>
     * </li>
     * <li><p>The maximum time range that can be specified is 24 hours.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2022-08-21T02:15:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribePatternPerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePatternPerformanceRequest self = new DescribePatternPerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribePatternPerformanceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribePatternPerformanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribePatternPerformanceRequest setPatternId(String patternId) {
        this.patternId = patternId;
        return this;
    }
    public String getPatternId() {
        return this.patternId;
    }

    public DescribePatternPerformanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePatternPerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
