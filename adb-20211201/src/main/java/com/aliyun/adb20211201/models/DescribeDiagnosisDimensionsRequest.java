// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisDimensionsRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (3.0) clusters in the specified region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bt6u59zcmd945****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time of the query. Specify the time as a UNIX timestamp in milliseconds.</p>
     * <blockquote>
     * <ul>
     * <li>The end time must be later than the start time.</li>
     * <li>The interval between the start time and the end time cannot exceed 24 hours.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1625220213000</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language configuration. Valid values:</p>
     * <ul>
     * <li><strong>zh-CN</strong>: Simplified Chinese (default).</li>
     * <li><strong>en-US</strong>: English.</li>
     * <li><strong>ja</strong>: Japanese.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The search conditions for SQL queries. The value is a JSON string that contains fields such as <code>Type</code>, <code>Value</code>, <code>Min</code>, and <code>Max</code>. The <code>Type</code> field specifies the query dimension. Valid values: <code>maxCost</code>, <code>status</code>, and <code>cost</code>. The <code>Value</code>, <code>Min</code>, or <code>Max</code> field specifies the query range for the dimension. Valid values:</p>
     * <ul>
     * <li><code>{&quot;Type&quot;:&quot;maxCost&quot;,&quot;Value&quot;:&quot;100&quot;}</code>: queries the details of the top 100 SQL statements with the longest execution duration. Currently, you can only set <code>Value</code> to 100.</li>
     * <li><code>{&quot;Type&quot;:&quot;status&quot;,&quot;Value&quot;:&quot;finished&quot;}</code>: queries the details of completed SQL statements. You can also set <code>Value</code> to <code>running</code> or <code>failed</code> to query the details of running or failed SQL statements.</li>
     * <li><code>{&quot;Type&quot;:&quot;cost&quot;,&quot;Min&quot;:&quot;10&quot;,&quot;Max&quot;:&quot;200&quot;}</code>: queries the details of SQL statements whose execution duration is between 10 milliseconds and 200 milliseconds. You can also customize the minimum and maximum execution duration in milliseconds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Type&quot;:&quot;maxCost&quot;,&quot;Value&quot;:&quot;100&quot;}</p>
     */
    @NameInMap("QueryCondition")
    public String queryCondition;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/454314.html">DescribeRegions</a> operation to query the region ID of the specified AnalyticDB for MySQL Data Lakehouse Edition (3.0) cluster.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time of the query. Specify the time as a UNIX timestamp in milliseconds.</p>
     * <blockquote>
     * <p>You can only query data from the last 14 days. If you query data from more than 14 days ago, an empty result is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1625220210000</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDiagnosisDimensionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisDimensionsRequest self = new DescribeDiagnosisDimensionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisDimensionsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDiagnosisDimensionsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDiagnosisDimensionsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDiagnosisDimensionsRequest setQueryCondition(String queryCondition) {
        this.queryCondition = queryCondition;
        return this;
    }
    public String getQueryCondition() {
        return this.queryCondition;
    }

    public DescribeDiagnosisDimensionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDiagnosisDimensionsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
