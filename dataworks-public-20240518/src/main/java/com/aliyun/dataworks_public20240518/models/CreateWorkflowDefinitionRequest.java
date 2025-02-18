// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateWorkflowDefinitionRequest extends TeaModel {
    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The FlowSpec field information about the workflow. For more information, see <a href="https://github.com/aliyun/alibabacloud-dataworks-tool-dflow/">FlowSpec</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;kind&quot;: &quot;CycleWorkflow&quot;,
     *     &quot;version&quot;: &quot;1.1.0&quot;,
     *     &quot;spec&quot;: {
     *         &quot;name&quot;: &quot;OpenAPITestWorkflowDemo&quot;,
     *         &quot;type&quot;: &quot;CycleWorkflow&quot;,
     *         &quot;workflows&quot;: [
     *             {
     *                 &quot;script&quot;: {
     *                     &quot;path&quot;: &quot;XX/OpenAPITest/WorkflowTest/OpenAPITestWorkflowDemo&quot;,
     *                     &quot;runtime&quot;: {
     *                         &quot;command&quot;: &quot;WORKFLOW&quot;
     *                     }
     *                 },
     *                 &quot;trigger&quot;: {
     *                     &quot;type&quot;: &quot;Scheduler&quot;,
     *                     &quot;cron&quot;: &quot;00 02 00 * * ?&quot;,
     *                     &quot;startTime&quot;: &quot;1970-01-01 00:00:00&quot;,
     *                     &quot;endTime&quot;: &quot;9999-01-01 00:00:00&quot;,
     *                     &quot;timezone&quot;: &quot;Asia/Shanghai&quot;,
     *                     &quot;delaySeconds&quot;: 0
     *                 },
     *                 &quot;strategy&quot;: {
     *                     &quot;timeout&quot;: 0,
     *                     &quot;instanceMode&quot;: &quot;T+1&quot;,
     *                     &quot;rerunMode&quot;: &quot;Allowed&quot;,
     *                     &quot;rerunTimes&quot;: 3,
     *                     &quot;rerunInterval&quot;: 180000,
     *                     &quot;failureStrategy&quot;: &quot;Break&quot;
     *                 },
     *                 &quot;name&quot;: &quot;OpenAPITestWorkflowDemo&quot;,
     *                 &quot;inputs&quot;: {},
     *                 &quot;outputs&quot;: {
     *                     &quot;nodeOutputs&quot;: [
     *                         {
     *                             &quot;data&quot;: &quot;workflow_output&quot;,
     *                             &quot;artifactType&quot;: &quot;NodeOutput&quot;,
     *                             &quot;refTableName&quot;: &quot;OpenAPITestWorkflowDemo&quot;
     *                         }
     *                     ]
     *                 },
     *                 &quot;nodes&quot;: [],
     *                 &quot;dependencies&quot;: []
     *             }
     *         ]
     *     }
     * }</p>
     */
    @NameInMap("Spec")
    public String spec;

    public static CreateWorkflowDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkflowDefinitionRequest self = new CreateWorkflowDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkflowDefinitionRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateWorkflowDefinitionRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
