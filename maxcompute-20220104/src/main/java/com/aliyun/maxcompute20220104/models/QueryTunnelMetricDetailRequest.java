// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class QueryTunnelMetricDetailRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ascOrder")
    public Boolean ascOrder;

    @NameInMap("groupList")
    public java.util.List<String> groupList;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("limit")
    public Long limit;

    @NameInMap("operationList")
    public java.util.List<String> operationList;

    /**
     * <strong>example:</strong>
     * <p>maxValue</p>
     */
    @NameInMap("orderColumn")
    public String orderColumn;

    /**
     * <strong>example:</strong>
     * <p>project_a</p>
     */
    @NameInMap("project")
    public String project;

    /**
     * <strong>example:</strong>
     * <p>quota_A</p>
     */
    @NameInMap("quotaNickname")
    public String quotaNickname;

    @NameInMap("tableList")
    public java.util.List<String> tableList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1735536322</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1735534322</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    public static QueryTunnelMetricDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTunnelMetricDetailRequest self = new QueryTunnelMetricDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryTunnelMetricDetailRequest setAscOrder(Boolean ascOrder) {
        this.ascOrder = ascOrder;
        return this;
    }
    public Boolean getAscOrder() {
        return this.ascOrder;
    }

    public QueryTunnelMetricDetailRequest setGroupList(java.util.List<String> groupList) {
        this.groupList = groupList;
        return this;
    }
    public java.util.List<String> getGroupList() {
        return this.groupList;
    }

    public QueryTunnelMetricDetailRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public QueryTunnelMetricDetailRequest setOperationList(java.util.List<String> operationList) {
        this.operationList = operationList;
        return this;
    }
    public java.util.List<String> getOperationList() {
        return this.operationList;
    }

    public QueryTunnelMetricDetailRequest setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }
    public String getOrderColumn() {
        return this.orderColumn;
    }

    public QueryTunnelMetricDetailRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public QueryTunnelMetricDetailRequest setQuotaNickname(String quotaNickname) {
        this.quotaNickname = quotaNickname;
        return this;
    }
    public String getQuotaNickname() {
        return this.quotaNickname;
    }

    public QueryTunnelMetricDetailRequest setTableList(java.util.List<String> tableList) {
        this.tableList = tableList;
        return this;
    }
    public java.util.List<String> getTableList() {
        return this.tableList;
    }

    public QueryTunnelMetricDetailRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryTunnelMetricDetailRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
