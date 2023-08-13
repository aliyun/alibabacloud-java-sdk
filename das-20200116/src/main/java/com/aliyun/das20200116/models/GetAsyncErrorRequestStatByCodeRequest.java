// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAsyncErrorRequestStatByCodeRequest extends TeaModel {
    /**
     * <p>The name of a database.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <br>
     * <p>>  The end time must be later than the start time. The interval between the start time and the end time cannot exceed 24 hours.</p>
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
     * <p>>  This parameter must be specified for PolarDB for MySQL clusters.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <br>
     * <p>>  The start time must be within the storage duration of the SQL Explorer feature of the database instance and can be up to 90 days earlier than the current time.</p>
     */
    @NameInMap("Start")
    public Long start;

    public static GetAsyncErrorRequestStatByCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncErrorRequestStatByCodeRequest self = new GetAsyncErrorRequestStatByCodeRequest();
        return TeaModel.build(map, self);
    }

    public GetAsyncErrorRequestStatByCodeRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public GetAsyncErrorRequestStatByCodeRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetAsyncErrorRequestStatByCodeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAsyncErrorRequestStatByCodeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetAsyncErrorRequestStatByCodeRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
