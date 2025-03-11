// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRDSPerformanceRequest extends TeaModel {
    /**
     * <p>The type of the database engine.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql</p>
     */
    @NameInMap("DbInstType")
    public String dbInstType;

    /**
     * <p>The ID of the Distributed Relational Database Service (DRDS) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>drds*********</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The end time of the query. Specify the time in the UNIX timestamp format. The time must be in UTC. Unit: ms.</p>
     * 
     * <strong>example:</strong>
     * <p>1603209690000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The performance monitoring metrics. You can specify one or more metrics for a query at a time. Separate multiple metric parameters with commas (,).</p>
     * <blockquote>
     * <p> For more information about the details of performance monitoring metrics, see <a href="https://help.aliyun.com/document_detail/186705.html">Storage monitoring</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL_MemCpuUsage</p>
     */
    @NameInMap("Keys")
    public String keys;

    /**
     * <p>The ID of the storage-layer ApsaraDB RDS for MySQL instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-************</p>
     */
    @NameInMap("RdsInstanceId")
    public String rdsInstanceId;

    /**
     * <p>The start time of the query. Specify the time in the UNIX timestamp format. The time must be in UTC. Unit: ms.</p>
     * 
     * <strong>example:</strong>
     * <p>1603123290000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeRDSPerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRDSPerformanceRequest self = new DescribeRDSPerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRDSPerformanceRequest setDbInstType(String dbInstType) {
        this.dbInstType = dbInstType;
        return this;
    }
    public String getDbInstType() {
        return this.dbInstType;
    }

    public DescribeRDSPerformanceRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeRDSPerformanceRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeRDSPerformanceRequest setKeys(String keys) {
        this.keys = keys;
        return this;
    }
    public String getKeys() {
        return this.keys;
    }

    public DescribeRDSPerformanceRequest setRdsInstanceId(String rdsInstanceId) {
        this.rdsInstanceId = rdsInstanceId;
        return this;
    }
    public String getRdsInstanceId() {
        return this.rdsInstanceId;
    }

    public DescribeRDSPerformanceRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
