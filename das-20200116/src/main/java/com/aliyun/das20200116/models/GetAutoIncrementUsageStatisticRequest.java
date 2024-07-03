// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutoIncrementUsageStatisticRequest extends TeaModel {
    /**
     * <p>The database name. If you specify a database, the operation queries the usage of auto-increment table IDs in the specified database. Otherwise, the operation queries the usage of auto-increment table IDs in all databases on the instance.</p>
     * <blockquote>
     * <p> Specify the parameter value as a JSON array, such as [\&quot;db1\&quot;,\&quot;db2\&quot;]. Separate multiple database names with commas (,).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;db1\&quot;,\&quot;db2\&quot;]</p>
     */
    @NameInMap("DbNames")
    public String dbNames;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze8g2am97624****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The usage threshold of auto-increment IDs. Only usage that exceeds the threshold can be returned. Valid values are decimals that range from 0 to 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.9</p>
     */
    @NameInMap("RatioFilter")
    public Double ratioFilter;

    /**
     * <p>Specifies whether to query real-time data. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: queries data in real time except for data generated in the last 10 minutes.****</li>
     * <li><strong>false</strong>: queries data generated in the last 2 hours. If no such data exists, queries the latest data.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RealTime")
    public Boolean realTime;

    public static GetAutoIncrementUsageStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAutoIncrementUsageStatisticRequest self = new GetAutoIncrementUsageStatisticRequest();
        return TeaModel.build(map, self);
    }

    public GetAutoIncrementUsageStatisticRequest setDbNames(String dbNames) {
        this.dbNames = dbNames;
        return this;
    }
    public String getDbNames() {
        return this.dbNames;
    }

    public GetAutoIncrementUsageStatisticRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAutoIncrementUsageStatisticRequest setRatioFilter(Double ratioFilter) {
        this.ratioFilter = ratioFilter;
        return this;
    }
    public Double getRatioFilter() {
        return this.ratioFilter;
    }

    public GetAutoIncrementUsageStatisticRequest setRealTime(Boolean realTime) {
        this.realTime = realTime;
        return this;
    }
    public Boolean getRealTime() {
        return this.realTime;
    }

}
