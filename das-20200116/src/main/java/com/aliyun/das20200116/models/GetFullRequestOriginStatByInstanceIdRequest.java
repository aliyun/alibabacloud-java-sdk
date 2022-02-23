// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetFullRequestOriginStatByInstanceIdRequest extends TeaModel {
    @NameInMap("Asc")
    public Boolean asc;

    @NameInMap("End")
    public Long end;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Role")
    public String role;

    @NameInMap("SqlType")
    public String sqlType;

    @NameInMap("Start")
    public Long start;

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
