// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RunManualDagNodesRequest extends TeaModel {
    /**
     * <p>The business date. The value must be less than or equal to the current date minus 1 day. For example, if today is November 11, 2020, the business date must be 00:00:00 on November 10, 2020 or an earlier date. The hour, minute, and second values of the business date must all be set to 00.</p>
     * <p>This parameter is used together with the StartBizDate and EndBizDate parameters. You can configure only one of BizDate or the StartBizDate and EndBizDate pair.</p>
     * <p>Format: <code>yyyy-MM-dd HH:mm:ss</code>. Example: <code>2020-11-11 00:00:00</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-11 00:00:00</p>
     */
    @NameInMap("BizDate")
    public String bizDate;

    /**
     * <p>This parameter is synchronized to all instances of the current dagrun. If the scheduling parameters of internal nodes (<a href="https://help.aliyun.com/document_detail/147245.html">supported node types</a>) reference workflow parameters in DagParameters, the corresponding parameter values of the nodes are replaced with the workflow parameters in DagParameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;kaaaa&quot;: &quot;vaaaaa&quot;, &quot;kbbbb&quot;: &quot;vbbbbb&quot;}</p>
     */
    @NameInMap("DagParameters")
    public String dagParameters;

    /**
     * <p>The business end date. Format: yyyy-MM-dd HH:mm:ss.</p>
     * <p>This parameter is used together with the StartBizDate parameter. You can configure only one of the StartBizDate and EndBizDate pair or the BizDate parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-02-03 00:00:00</p>
     */
    @NameInMap("EndBizDate")
    public String endBizDate;

    /**
     * <p>The IDs of nodes that you do not want to run within the workflow. The specified nodes generate dry-run instances during execution. After a dry-run instance is scheduled, it immediately succeeds without executing the script content. Separate multiple node IDs with commas (,).</p>
     * <p>The ExcludeNodeIds parameter takes effect only when used together with the IncludeNodeIds parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>123,456</p>
     */
    @NameInMap("ExcludeNodeIds")
    public String excludeNodeIds;

    /**
     * <p>The name of the manual workflow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_workflow</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>The IDs of specific nodes to run within the manual workflow. Separate multiple node IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>74324,74325</p>
     */
    @NameInMap("IncludeNodeIds")
    public String includeNodeIds;

    /**
     * <p>The node parameter information passed when the manual workflow is executed. This corresponds to the <strong>scheduling parameters</strong> configured in the <strong>Properties</strong> of nodes within the manual workflow.</p>
     * <p>A JSON format: { &quot;<Node ID within the manual workflow>&quot;: &quot;Scheduling parameter information of the node, in the same format as the parameters in the data development scheduling configuration&quot;, &quot;<Node ID within the manual workflow>&quot;: &quot;Scheduling parameter information of the node, in the same format as the parameters in the data development scheduling configuration&quot; }</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;20000123121&quot;: &quot;key1=val2 key2=val2&quot;, &quot;20000123124&quot;: &quot;kkkk=vvvvv aaaa=bbbb&quot;}</p>
     */
    @NameInMap("NodeParameters")
    public String nodeParameters;

    /**
     * <p>The environment identifier of the Operation Center. PROD indicates the production environment. DEV indicates the development environment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROD or DEV</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the workspace to which the manual workflow belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_workspace</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The business start date. Format: yyyy-MM-dd HH:mm:ss.</p>
     * <p>This parameter is used together with the EndBizDate parameter. You can configure only one of the StartBizDate and EndBizDate pair or the BizDate parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-02-02 00:00:00</p>
     */
    @NameInMap("StartBizDate")
    public String startBizDate;

    public static RunManualDagNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        RunManualDagNodesRequest self = new RunManualDagNodesRequest();
        return TeaModel.build(map, self);
    }

    public RunManualDagNodesRequest setBizDate(String bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public String getBizDate() {
        return this.bizDate;
    }

    public RunManualDagNodesRequest setDagParameters(String dagParameters) {
        this.dagParameters = dagParameters;
        return this;
    }
    public String getDagParameters() {
        return this.dagParameters;
    }

    public RunManualDagNodesRequest setEndBizDate(String endBizDate) {
        this.endBizDate = endBizDate;
        return this;
    }
    public String getEndBizDate() {
        return this.endBizDate;
    }

    public RunManualDagNodesRequest setExcludeNodeIds(String excludeNodeIds) {
        this.excludeNodeIds = excludeNodeIds;
        return this;
    }
    public String getExcludeNodeIds() {
        return this.excludeNodeIds;
    }

    public RunManualDagNodesRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public RunManualDagNodesRequest setIncludeNodeIds(String includeNodeIds) {
        this.includeNodeIds = includeNodeIds;
        return this;
    }
    public String getIncludeNodeIds() {
        return this.includeNodeIds;
    }

    public RunManualDagNodesRequest setNodeParameters(String nodeParameters) {
        this.nodeParameters = nodeParameters;
        return this;
    }
    public String getNodeParameters() {
        return this.nodeParameters;
    }

    public RunManualDagNodesRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public RunManualDagNodesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public RunManualDagNodesRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public RunManualDagNodesRequest setStartBizDate(String startBizDate) {
        this.startBizDate = startBizDate;
        return this;
    }
    public String getStartBizDate() {
        return this.startBizDate;
    }

}
