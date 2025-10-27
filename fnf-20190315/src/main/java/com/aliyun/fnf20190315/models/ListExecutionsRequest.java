// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ListExecutionsRequest extends TeaModel {
    /**
     * <p>The name prefix of the execution.</p>
     * 
     * <strong>example:</strong>
     * <p>run</p>
     */
    @NameInMap("ExecutionNamePrefix")
    public String executionNamePrefix;

    /**
     * <p>The name of the flow. The name must be unique within the region and cannot be modified after the flow is created. The name must meet the following conventions:</p>
     * <ul>
     * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
     * <li>The name must start with a letter or an underscore (_).</li>
     * <li>The name is case-sensitive.</li>
     * <li>The name must be 1 to 128 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flow</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>The number of executions that you want to query. Valid values: 1-99. Default value: 60.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("MapRunName")
    public String mapRunName;

    @NameInMap("MetadataOnly")
    public Boolean metadataOnly;

    /**
     * <p>The name of the execution to start the query. You can obtain the value from the response data. You do not need to specify this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>flow_xxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Qualifier")
    public String qualifier;

    /**
     * <p>The beginning of the time range to query executions. Specify the value in the UTC RFC3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-12-02T02:39:20.402Z</p>
     */
    @NameInMap("StartedTimeBegin")
    public String startedTimeBegin;

    /**
     * <p>The end of the time range to query executions. Specify the value in the UTC RFC3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-12-02T02:23:54.817Z</p>
     */
    @NameInMap("StartedTimeEnd")
    public String startedTimeEnd;

    /**
     * <p>The status of the execution that you want to filter. Valid values:</p>
     * <ul>
     * <li><strong>Starting</strong></li>
     * <li><strong>Running</strong></li>
     * <li><strong>Stopped</strong></li>
     * <li><strong>Succeeded</strong></li>
     * <li><strong>Failed</strong></li>
     * <li><strong>TimedOut</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListExecutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExecutionsRequest self = new ListExecutionsRequest();
        return TeaModel.build(map, self);
    }

    public ListExecutionsRequest setExecutionNamePrefix(String executionNamePrefix) {
        this.executionNamePrefix = executionNamePrefix;
        return this;
    }
    public String getExecutionNamePrefix() {
        return this.executionNamePrefix;
    }

    public ListExecutionsRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public ListExecutionsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListExecutionsRequest setMapRunName(String mapRunName) {
        this.mapRunName = mapRunName;
        return this;
    }
    public String getMapRunName() {
        return this.mapRunName;
    }

    public ListExecutionsRequest setMetadataOnly(Boolean metadataOnly) {
        this.metadataOnly = metadataOnly;
        return this;
    }
    public Boolean getMetadataOnly() {
        return this.metadataOnly;
    }

    public ListExecutionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListExecutionsRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public ListExecutionsRequest setStartedTimeBegin(String startedTimeBegin) {
        this.startedTimeBegin = startedTimeBegin;
        return this;
    }
    public String getStartedTimeBegin() {
        return this.startedTimeBegin;
    }

    public ListExecutionsRequest setStartedTimeEnd(String startedTimeEnd) {
        this.startedTimeEnd = startedTimeEnd;
        return this;
    }
    public String getStartedTimeEnd() {
        return this.startedTimeEnd;
    }

    public ListExecutionsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
