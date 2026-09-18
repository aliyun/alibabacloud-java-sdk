// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class QueryTunnelMetricDetailRequest extends TeaModel {
    /**
     * <p>Specifies whether to sort the results in ascending order. If you set this parameter to <code>true</code>, the results are sorted in ascending order. If you set this to <code>false</code> or leave it unspecified, the results are sorted in descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ascOrder")
    public Boolean ascOrder;

    /**
     * <p>A list of error codes to filter the results.</p>
     */
    @NameInMap("codeList")
    public java.util.List<Long> codeList;

    /**
     * <p>The list of grouping dimensions.</p>
     */
    @NameInMap("groupList")
    public java.util.List<String> groupList;

    /**
     * <p>The maximum number of entries to return. Default: 10. Maximum: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("limit")
    public Long limit;

    /**
     * <p>A list of operation types.</p>
     */
    @NameInMap("operationList")
    public java.util.List<String> operationList;

    /**
     * <p>The sort column.</p>
     * 
     * <strong>example:</strong>
     * <p>maxValue</p>
     */
    @NameInMap("orderColumn")
    public String orderColumn;

    /**
     * <p>The name of the project.</p>
     * 
     * <strong>example:</strong>
     * <p>project_a</p>
     */
    @NameInMap("project")
    public String project;

    /**
     * <p>The nickname of the level-2 tunnel quota.</p>
     * <p>The nickname for a shared quota is <code>default</code>.</p>
     * <p>For an exclusive quota, the nickname is in the <code>quotaNickname#subQuotaNickname</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>quota_A</p>
     */
    @NameInMap("quotaNickname")
    public String quotaNickname;

    /**
     * <p>A list of table names.</p>
     * <p>The <code>project</code> parameter is required if you specify a list of tables. All tables must belong to the specified project.</p>
     */
    @NameInMap("tableList")
    public java.util.List<String> tableList;

    /**
     * <p>The end of the query time range. This is a Unix timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1735536322</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The start of the query time range. This is a Unix timestamp in seconds.</p>
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

    public QueryTunnelMetricDetailRequest setCodeList(java.util.List<Long> codeList) {
        this.codeList = codeList;
        return this;
    }
    public java.util.List<Long> getCodeList() {
        return this.codeList;
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
