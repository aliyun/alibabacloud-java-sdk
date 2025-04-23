// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class QueryTunnelMetricRequest extends TeaModel {
    @NameInMap("codeList")
    public java.util.List<Integer> codeList;

    @NameInMap("groupList")
    public java.util.List<String> groupList;

    @NameInMap("operationList")
    public java.util.List<String> operationList;

    /**
     * <strong>example:</strong>
     * <p>project_a</p>
     */
    @NameInMap("project")
    public String project;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("quotaNickname")
    public String quotaNickname;

    @NameInMap("tableList")
    public java.util.List<String> tableList;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("topN")
    public Integer topN;

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

    /**
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
