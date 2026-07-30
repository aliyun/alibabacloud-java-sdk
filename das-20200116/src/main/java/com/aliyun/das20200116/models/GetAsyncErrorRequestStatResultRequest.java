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
     * <p>The end time of the query, specified as a Unix timestamp in milliseconds.</p>
     * <blockquote>
     * <p>The end time must be later than the start time. The interval between the start time and the end time cannot exceed 1 day.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1642566830000</p>
     */
    @NameInMap("End")
    public Long end;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze8g2am97624****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the node.</p>
     * <blockquote>
     * <p>This parameter is required for PolarDB for MySQL instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-bp179lg03445l****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>One or more SQL IDs. Separate multiple SQL IDs with commas. You can call the <a href="https://help.aliyun.com/document_detail/410746.html">GetAsyncErrorRequestListByCode</a> operation to query the SQL IDs that generated MySQL error codes on the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ad78a4e7d3ce81590c9dc2d5f4bc****,0f92feacd92c048b06a16617a633****</p>
     */
    @NameInMap("SqlIdList")
    public String sqlIdList;

    /**
     * <p>The start time of the query, specified as a Unix timestamp in milliseconds.</p>
     * <blockquote>
     * <p>The start time must be within the data retention period of SQL Explorer for the database instance. The start time cannot be earlier than 90 days before the current time.</p>
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
