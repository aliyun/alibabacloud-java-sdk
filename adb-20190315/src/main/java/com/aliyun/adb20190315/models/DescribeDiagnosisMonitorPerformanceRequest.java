// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisMonitorPerformanceRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the cluster IDs of all AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters within a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp108q1py5r78****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1671687948000</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language of file titles and error messages. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): simplified Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * <li><strong>ja</strong>: Japanese.</li>
     * <li><strong>zh-tw</strong>: traditional Chinese.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The query conditions for SQL statements, which can be a combination of the <code>Type</code> and <code>Value</code> fields or a combination of the Type, <code>Min</code>, and <code>Max</code> fields. Specify the conditions in the JSON format. <code>Type</code> specifies the query dimension. Valid values for Type: <code>maxCost</code>, <code>status</code>, and <code>cost</code>. <code>Value</code>, <code>Min</code>, or <code>Max</code> specifies the query range for the dimension. Valid values:</p>
     * <ul>
     * <li><code>{&quot;Type&quot;:&quot;maxCost&quot;,&quot;Value&quot;:&quot;100&quot;}</code>: queries the top 100 most time-consuming SQL statements. Set <code>Value</code> to 100.</li>
     * <li><code>{&quot;Type&quot;:&quot;status&quot;,&quot;Value&quot;:&quot;finished&quot;}</code>: queries the executed SQL statements. You can set <code>Value</code> to <code>running</code> to query the SQL statements that are being executed. You can also set Value to <code>failed</code> to query the SQL statements that failed to be executed.</li>
     * <li><code>{&quot;Type&quot;:&quot;cost&quot;,&quot;Min&quot;:&quot;10&quot;,&quot;Max&quot;:&quot;200&quot;}</code>: queries the SQL statements whose execution duration is in the range of 10 to 200 milliseconds. You can also specify custom values for the Min and Max fields.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Type\&quot;:\&quot;maxCost\&quot;,\&quot;Value\&quot;:\&quot;100\&quot;}</p>
     */
    @NameInMap("QueryCondition")
    public String queryCondition;

    /**
     * <p>The region ID of the cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1671684348000</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDiagnosisMonitorPerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisMonitorPerformanceRequest self = new DescribeDiagnosisMonitorPerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisMonitorPerformanceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDiagnosisMonitorPerformanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDiagnosisMonitorPerformanceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDiagnosisMonitorPerformanceRequest setQueryCondition(String queryCondition) {
        this.queryCondition = queryCondition;
        return this;
    }
    public String getQueryCondition() {
        return this.queryCondition;
    }

    public DescribeDiagnosisMonitorPerformanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDiagnosisMonitorPerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
