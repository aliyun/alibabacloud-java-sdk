// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSQLPatternAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>>  You can call the [DescribeDBClusters](~~129857~~) operation to query the detailed information of all AnalyticDB for MySQL clusters within a specific region, including cluster IDs.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-ddTHH:mmZ* format. The time must be in UTC.</p>
     * <br>
     * <p>>  The end time must be later than the start time.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The languages available for file titles and some error messages. Default value: zh. Valid values:</p>
     * <br>
     * <p>*   **zh**: Simplified Chinese</p>
     * <p>*   **en**: English</p>
     * <p>*   **ja**: Japanese</p>
     * <p>*   **zh-tw**: Traditional Chinese</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the SQL pattern.</p>
     * <br>
     * <p>>  You can call the [DescribeSQLPatterns](~~321868~~) operation to query the list of SQL patterns within an AnalyticDB for MySQL cluster for a specific period of time, including SQL pattern IDs.</p>
     */
    @NameInMap("PatternId")
    public Long patternId;

    /**
     * <p>The region ID of the cluster.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](~~143074~~) operation to query the regions and zones supported by AnalyticDB for MySQL, including region IDs.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-ddTHH:mmZ* format. The time must be in UTC.</p>
     * <br>
     * <p>>  Only data generated within the last 15 days can be viewed.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeSQLPatternAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLPatternAttributeRequest self = new DescribeSQLPatternAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSQLPatternAttributeRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSQLPatternAttributeRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSQLPatternAttributeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSQLPatternAttributeRequest setPatternId(Long patternId) {
        this.patternId = patternId;
        return this;
    }
    public Long getPatternId() {
        return this.patternId;
    }

    public DescribeSQLPatternAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSQLPatternAttributeRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
