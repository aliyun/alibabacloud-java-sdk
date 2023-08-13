// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetErrorRequestSampleRequest extends TeaModel {
    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <br>
     * <p>>  The end time must be later than the start time. The interval cannot exceed 24 hours.</p>
     */
    @NameInMap("End")
    public Long end;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The node ID.</p>
     * <br>
     * <p>>  You must specify the node ID if your database instance is a PolarDB for MySQL cluster.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The SQL query ID. You can call the [GetAsyncErrorRequestListByCode](~~410746~~) operation to query the ID of the SQL query for which MySQL error code is returned.</p>
     */
    @NameInMap("SqlId")
    public String sqlId;

    /**
     * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <br>
     * <p>>  The start time must be within the storage duration of the SQL Explorer feature of the database instance, and can be up to 90 days earlier than the current time.</p>
     */
    @NameInMap("Start")
    public Long start;

    public static GetErrorRequestSampleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetErrorRequestSampleRequest self = new GetErrorRequestSampleRequest();
        return TeaModel.build(map, self);
    }

    public GetErrorRequestSampleRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public GetErrorRequestSampleRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetErrorRequestSampleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetErrorRequestSampleRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetErrorRequestSampleRequest setSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public String getSqlId() {
        return this.sqlId;
    }

    public GetErrorRequestSampleRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
