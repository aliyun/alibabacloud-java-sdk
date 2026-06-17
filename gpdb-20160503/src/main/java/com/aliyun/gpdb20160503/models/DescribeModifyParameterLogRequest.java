// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeModifyParameterLogRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-9dpm71ov2wxxq****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mmZ</em> format. The time must be in UTC. The end time must be later than the start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-03T20:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mmZ</em> format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-03T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeModifyParameterLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeModifyParameterLogRequest self = new DescribeModifyParameterLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeModifyParameterLogRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeModifyParameterLogRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeModifyParameterLogRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
