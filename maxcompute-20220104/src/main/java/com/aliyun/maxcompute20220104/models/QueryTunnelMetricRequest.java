// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class QueryTunnelMetricRequest extends TeaModel {
    /**
     * <p>A list of HTTP status codes for requests.</p>
     */
    @NameInMap("codeList")
    public java.util.List<Integer> codeList;

    /**
     * <p>A list of grouping criteria.</p>
     */
    @NameInMap("groupList")
    public java.util.List<String> groupList;

    /**
     * <p>A list of operation types.</p>
     */
    @NameInMap("operationList")
    public java.util.List<String> operationList;

    /**
     * <p>The name of the project.</p>
     * 
     * <strong>example:</strong>
     * <p>project_a</p>
     */
    @NameInMap("project")
    public String project;

    /**
     * <p>The nickname of the level-2 Tunnel quota.</p>
     * <p>The nickname of a shared quota is <code>default</code>.</p>
     * <p>The format of a dedicated quota nickname is <code>quotaNickname#subQuotaNickname</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("quotaNickname")
    public String quotaNickname;

    /**
     * <p>A list of table names.</p>
     * <p>The tables belong to a project. Therefore, if <code>tableList</code> is not empty, <code>project</code> cannot be empty.</p>
     */
    @NameInMap("tableList")
    public java.util.List<String> tableList;

    /**
     * <p>The maximum number of data entries to return.</p>
     * <p>This parameter takes effect when the grouping criterion includes <code>table</code> or <code>ip</code>.</p>
     * <p>The default value is 10. The maximum value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("topN")
    public Integer topN;

    /**
     * <p>The end of the time range for the query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1735536322</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The start of the time range for the query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1735534322</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>The data aggregation policy. The default value is <code>max</code>.</p>
     * <p>Data is collected at a frequency of 1 minute. If you query data over a long time range, the automatic step size for data display may exceed 1 minute. In this case, metrics are aggregated. This parameter specifies the aggregation logic.</p>
     * 
     * <strong>example:</strong>
     * <p>max</p>
     */
    @NameInMap("strategy")
    public String strategy;

    public static QueryTunnelMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTunnelMetricRequest self = new QueryTunnelMetricRequest();
        return TeaModel.build(map, self);
    }

    public QueryTunnelMetricRequest setCodeList(java.util.List<Integer> codeList) {
        this.codeList = codeList;
        return this;
    }
    public java.util.List<Integer> getCodeList() {
        return this.codeList;
    }

    public QueryTunnelMetricRequest setGroupList(java.util.List<String> groupList) {
        this.groupList = groupList;
        return this;
    }
    public java.util.List<String> getGroupList() {
        return this.groupList;
    }

    public QueryTunnelMetricRequest setOperationList(java.util.List<String> operationList) {
        this.operationList = operationList;
        return this;
    }
    public java.util.List<String> getOperationList() {
        return this.operationList;
    }

    public QueryTunnelMetricRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public QueryTunnelMetricRequest setQuotaNickname(String quotaNickname) {
        this.quotaNickname = quotaNickname;
        return this;
    }
    public String getQuotaNickname() {
        return this.quotaNickname;
    }

    public QueryTunnelMetricRequest setTableList(java.util.List<String> tableList) {
        this.tableList = tableList;
        return this;
    }
    public java.util.List<String> getTableList() {
        return this.tableList;
    }

    public QueryTunnelMetricRequest setTopN(Integer topN) {
        this.topN = topN;
        return this;
    }
    public Integer getTopN() {
        return this.topN;
    }

    public QueryTunnelMetricRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryTunnelMetricRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryTunnelMetricRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

}
