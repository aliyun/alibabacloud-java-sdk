// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateManualDagRequest extends TeaModel {
    /**
     * <p>The data timestamp. The value of the data timestamp must be one or more days before the current date. For example, if the current date is November 11, 2020, set the value to 2020-11-10 00:00:00 or earlier. Configure this parameter in the YYYY-MM-DD 00:00:00 format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-11 00:00:00</p>
     */
    @NameInMap("BizDate")
    public String bizDate;

    /**
     * <p>The parameters of the manually triggered workflow, which are synchronized to all the instances in the directed acyclic graph (DAG) of the workflow. If a workflow parameter specified in DagParameters is referenced as a scheduling parameter of a node, the value of the scheduling parameter is replaced with the value of the workflow parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;kaaaa&quot;: &quot;vaaaaa&quot;, &quot;kbbbb&quot;: &quot;vbbbbb&quot;}</p>
     */
    @NameInMap("DagParameters")
    public String dagParameters;

    /**
     * <p>The IDs of the nodes that do not need to be run.</p>
     * 
     * <strong>example:</strong>
     * <p>123,456</p>
     */
    @NameInMap("ExcludeNodeIds")
    public String excludeNodeIds;

    /**
     * <p>The name of the manually triggered workflow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_workflow</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>The IDs of the nodes that you want to run.</p>
     * 
     * <strong>example:</strong>
     * <p>74324,74325</p>
     */
    @NameInMap("IncludeNodeIds")
    public String includeNodeIds;

    /**
     * <p>The parameters transmitted between nodes in the manually triggered workflow. The parameters are in the following JSON format: <code>{ &quot;&lt;ID of a node in the manually triggered workflow&gt;&quot;: &quot;Scheduling parameter settings of the node, which are in the same format as the parameters in the Scheduling Parameter section on the Properties tab of the DataStudio page&quot;, &quot;&lt;ID of a node in the manually triggered workflow&gt;&quot;: &quot;Scheduling parameter settings of the node, which are in the same format as the parameters in the Scheduling Parameter section on the Properties tab of the DataStudio page&quot; }</code></p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;20000123121&quot;: &quot;key1=val2 key2=val2&quot;, &quot;20000123124&quot;: &quot;kkkk=vvvvv aaaa=bbbb&quot;}</p>
     */
    @NameInMap("NodeParameters")
    public String nodeParameters;

    /**
     * <p>The environment type of Operation Center. Valid values: PROD and DEV.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>The name of the workspace to which the manually triggered workflow belongs.</p>
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
