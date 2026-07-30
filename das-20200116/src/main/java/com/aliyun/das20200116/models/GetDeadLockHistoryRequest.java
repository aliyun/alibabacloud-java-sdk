// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDeadLockHistoryRequest extends TeaModel {
    /**
     * <p>The end time of the query. This value is a UNIX timestamp. Unit: milliseconds.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is a Long value. To prevent precision loss during serialization and deserialization, make sure that the value does not exceed 9007199254740991.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1732069466000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp1u5mas9exx7****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The node ID.</p>
     * <blockquote>
     * <p>Specify the node ID for a PolarDB for MySQL instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-bp16v3824rt73****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. The maximum value is <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The source of the task:</p>
     * <ul>
     * <li><p><strong>MANUAL</strong> or unspecified: queries tasks for recent deadlock analysis.</p>
     * </li>
     * <li><p><strong>AUTO</strong>: queries tasks for full deadlock analysis.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>If you set this parameter to AUTO to query tasks for full deadlock analysis, the start time can be a maximum of seven days earlier than the end time.</p>
     * 
     * <strong>example:</strong>
     * <p>AUTO</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The start time of the query. This value is a UNIX timestamp. Unit: milliseconds.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is a Long value. To prevent precision loss during serialization and deserialization, make sure that the value does not exceed 9007199254740991.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1731983066000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static GetDeadLockHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeadLockHistoryRequest self = new GetDeadLockHistoryRequest();
        return TeaModel.build(map, self);
    }

    public GetDeadLockHistoryRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetDeadLockHistoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDeadLockHistoryRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetDeadLockHistoryRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetDeadLockHistoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetDeadLockHistoryRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetDeadLockHistoryRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
