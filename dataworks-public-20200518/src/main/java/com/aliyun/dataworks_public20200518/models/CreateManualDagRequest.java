// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateManualDagRequest extends TeaModel {
    /**
     * <p>The value of the business date must be less than or equal to the current date minus one day. For example, if today is November 11, 2020, the business date must be 2020-11-10 00:00:00 or an earlier date. The hour, minute, and second fields of the business date must all be set to 00.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-11 00:00:00</p>
     */
    @NameInMap("BizDate")
    public String bizDate;

    /**
     * <p>The workflow parameters. These parameters are synchronized to all instances of the current DAG. If the scheduling parameters of an internal node reference the workflow parameters in DagParameters, the corresponding parameter values of the node are replaced with the workflow parameters in DagParameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;kaaaa&quot;: &quot;vaaaaa&quot;, &quot;kbbbb&quot;: &quot;vbbbbb&quot;}</p>
     */
    @NameInMap("DagParameters")
    public String dagParameters;

    /**
     * <p>The list of IDs of the nodes that do not need to be run.</p>
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
     * <p>The list of IDs of the nodes to be run.</p>
     * 
     * <strong>example:</strong>
     * <p>74324,74325</p>
     */
    @NameInMap("IncludeNodeIds")
    public String includeNodeIds;

    /**
     * <p>The node parameter information passed when the manual workflow is executed, in JSON format:
     * <code>{      &quot;&lt;A node ID inside the manual workflow&gt;&quot;: &quot;The scheduling parameter information of the node, consistent with the parameter format in the data development scheduling configuration&quot;,       &quot;&lt;A node ID inside the manual workflow&gt;&quot;: &quot;The scheduling parameter information of the node, consistent with the parameter format in the data development scheduling configuration&quot; }</code></p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;20000123121&quot;: &quot;key1=val2 key2=val2&quot;, &quot;20000123124&quot;: &quot;kkkk=vvvvv aaaa=bbbb&quot;}</p>
     */
    @NameInMap("NodeParameters")
    public String nodeParameters;

    /**
     * <p>The environment identifier of the Scheduling Operation Center. PROD indicates the production environment, and DEV indicates the development environment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROD or DEV</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>The English name of the workspace to which the manual workflow belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_workspace</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    public static CreateManualDagRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateManualDagRequest self = new CreateManualDagRequest();
        return TeaModel.build(map, self);
    }

    public CreateManualDagRequest setBizDate(String bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public String getBizDate() {
        return this.bizDate;
    }

    public CreateManualDagRequest setDagParameters(String dagParameters) {
        this.dagParameters = dagParameters;
        return this;
    }
    public String getDagParameters() {
        return this.dagParameters;
    }

    public CreateManualDagRequest setExcludeNodeIds(String excludeNodeIds) {
        this.excludeNodeIds = excludeNodeIds;
        return this;
    }
    public String getExcludeNodeIds() {
        return this.excludeNodeIds;
    }

    public CreateManualDagRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public CreateManualDagRequest setIncludeNodeIds(String includeNodeIds) {
        this.includeNodeIds = includeNodeIds;
        return this;
    }
    public String getIncludeNodeIds() {
        return this.includeNodeIds;
    }

    public CreateManualDagRequest setNodeParameters(String nodeParameters) {
        this.nodeParameters = nodeParameters;
        return this;
    }
    public String getNodeParameters() {
        return this.nodeParameters;
    }

    public CreateManualDagRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public CreateManualDagRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
