// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAsyncErrorRequestStatResultRequest extends TeaModel {
    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb01</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <blockquote>
     * <p> The end time must be later than the start time. The interval between the start time and the end time cannot exceed 24 hours.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1642566830000</p>
     */
    @NameInMap("End")
    public Long end;

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
     * <p>The node ID.</p>
     * <blockquote>
     * <p> This parameter must be specified for PolarDB for MySQL instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-bp179lg03445l****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The ID of the SQL template. Separate multiple SQL IDs with commas (,). You can call the <a href="https://help.aliyun.com/document_detail/410746.html">GetAsyncErrorRequestListByCode</a> operation to query the ID of the SQL query for which MySQL error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>ad78a4e7d3ce81590c9dc2d5f4bc****,0f92feacd92c048b06a16617a633****</p>
     */
    @NameInMap("SqlIdList")
    public String sqlIdList;

    /**
     * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <blockquote>
     * <p> The beginning of the time range to query must be within the storage duration of the database instance and can be up to 90 days earlier than the current time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1642556990714</p>
     */
    @NameInMap("Start")
    public Long start;

    public static GetAsyncErrorRequestStatResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncErrorRequestStatResultRequest self = new GetAsyncErrorRequestStatResultRequest();
        return TeaModel.build(map, self);
    }

    public GetAsyncErrorRequestStatResultRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public GetAsyncErrorRequestStatResultRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetAsyncErrorRequestStatResultRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAsyncErrorRequestStatResultRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetAsyncErrorRequestStatResultRequest setSqlIdList(String sqlIdList) {
        this.sqlIdList = sqlIdList;
        return this;
    }
    public String getSqlIdList() {
        return this.sqlIdList;
    }

    public GetAsyncErrorRequestStatResultRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
