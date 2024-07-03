// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetFullRequestOriginStatByInstanceIdRequest extends TeaModel {
    /**
     * <p>Specifies whether to sort the results in ascending order. By default, the results are not sorted in ascending order.</p>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("Asc")
    public Boolean asc;

    /**
     * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <blockquote>
     * <p> The end time must be later than the start time. The interval between the start time and the end time cannot exceed 24 hours.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1644803409000</p>
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
     * <p> This parameter must be specified if the database instance is a PolarDB for MySQL cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-bp12v7243x012****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The field by which the results to be returned are sorted. Default value: <strong>count</strong>. Valid values:</p>
     * <ul>
     * <li><strong>count</strong>: the number of executions.</li>
     * <li><strong>avgRt</strong>: the average execution duration.</li>
     * <li><strong>rtRate</strong>: the execution duration percentage.</li>
     * <li><strong>rowsExamined</strong>: the total number of scanned rows.</li>
     * <li><strong>avgRowsExamined</strong>: the average number of scanned rows.</li>
     * <li><strong>avgRowsReturned</strong>: the average number of returned rows.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>count</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The role of the PolarDB-X 2.0 node. Valid values:</p>
     * <ul>
     * <li><strong>polarx_cn</strong>: compute node.</li>
     * <li><strong>polarx_en</strong>: data node.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>polarx_cn</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The type of the SQL statement. Valid values: <strong>SELECT</strong>, <strong>INSERT</strong>, <strong>UPDATE</strong>, <strong>DELETE</strong>, <strong>LOGIN</strong>, <strong>LOGOUT</strong>, <strong>MERGE</strong>, <strong>ALTER</strong>, <strong>CREATEINDEX</strong>, <strong>DROPINDEX</strong>, <strong>CREATE</strong>, <strong>DROP</strong>, <strong>SET</strong>, <strong>DESC</strong>, <strong>REPLACE</strong>, <strong>CALL</strong>, <strong>BEGIN</strong>, <strong>DESCRIBE</strong>, <strong>ROLLBACK</strong>, <strong>FLUSH</strong>, <strong>USE</strong>, <strong>SHOW</strong>, <strong>START</strong>, <strong>COMMIT</strong>, and <strong>RENAME</strong>.</p>
     * <blockquote>
     * <p> If the database instance is an ApsaraDB RDS for MySQL instance, a PolarDB for MySQL cluster, or a PolarDB-X 2.0 instance, the statistics can be collected based on the SQL statement type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SELECT</p>
     */
    @NameInMap("SqlType")
    public String sqlType;

    /**
     * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <blockquote>
     * <p> The start time must be within the storage duration of the SQL Explorer of the database instance, and can be up to 90 days earlier than the current time.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1644716649000</p>
     */
    @NameInMap("Start")
    public Long start;

    /**
     * <p>The ID of the Alibaba Cloud account that is used to create the database instance.</p>
     * <blockquote>
     * <p> This parameter is optional. The system can automatically obtain the account ID based on the value of InstanceId when you call this operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>196278346919****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GetFullRequestOriginStatByInstanceIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFullRequestOriginStatByInstanceIdRequest self = new GetFullRequestOriginStatByInstanceIdRequest();
        return TeaModel.build(map, self);
    }

    public GetFullRequestOriginStatByInstanceIdRequest setAsc(Boolean asc) {
        this.asc = asc;
        return this;
    }
    public Boolean getAsc() {
        return this.asc;
    }

    public GetFullRequestOriginStatByInstanceIdRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetFullRequestOriginStatByInstanceIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetFullRequestOriginStatByInstanceIdRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetFullRequestOriginStatByInstanceIdRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetFullRequestOriginStatByInstanceIdRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetFullRequestOriginStatByInstanceIdRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetFullRequestOriginStatByInstanceIdRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public GetFullRequestOriginStatByInstanceIdRequest setSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }
    public String getSqlType() {
        return this.sqlType;
    }

    public GetFullRequestOriginStatByInstanceIdRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public GetFullRequestOriginStatByInstanceIdRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
