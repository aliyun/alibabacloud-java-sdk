// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAsyncErrorRequestListByCodeRequest extends TeaModel {
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
     * <p>The error code. You can call the <a href="https://help.aliyun.com/document_detail/409804.html">GetAsyncErrorRequestStatByCode</a> operation to query the MySQL error codes that may be generated in the SQL Explorer results of an instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1064</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

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
     * <p> This parameter must be specified if the database instance is a PolarDB for MySQL cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-wz9s658475e58****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <blockquote>
     * <p> The start time must be within the storage duration of the SQL Explorer feature of the database instance, and can be up to 90 days earlier than the current time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1642556990714</p>
     */
    @NameInMap("Start")
    public Long start;

    public static GetAsyncErrorRequestListByCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncErrorRequestListByCodeRequest self = new GetAsyncErrorRequestListByCodeRequest();
        return TeaModel.build(map, self);
    }

    public GetAsyncErrorRequestListByCodeRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetAsyncErrorRequestListByCodeRequest setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetAsyncErrorRequestListByCodeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAsyncErrorRequestListByCodeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetAsyncErrorRequestListByCodeRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
