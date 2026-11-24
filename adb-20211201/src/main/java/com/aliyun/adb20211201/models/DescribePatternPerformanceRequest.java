// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribePatternPerformanceRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the details of all clusters in the specified region, including the cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-uf6li1r3do8m****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time of the query. The time is in UTC and follows the <i>yyyy-MM-ddTHH:mmZ</i> format.</p>
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
     * <p>The ID of the SQL pattern.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/321868.html">DescribeSQLPatterns</a> operation to query the list of all SQL patterns in the specified cluster within a specified time period, including the SQL pattern IDs.</p>
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
     * <p>The start time of the query. The time is in UTC and follows the <i>yyyy-MM-ddTHH:mm:ssZ</i> format.</p>
     * <blockquote>
     * <ul>
     * <li>If the current date is August 22, 2022 (UTC+8), the earliest data you can query is from August 9, 2022 (UTC+8), which corresponds to 2022-08-08T16:00:00Z in UTC. If the specified start time is earlier than August 9, 2022 (UTC+8) or 2022-08-08T16:00:00Z in UTC, an empty response is returned.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The interval between the start time and the end time of the query cannot exceed 24 hours.</li>
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
