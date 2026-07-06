// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ImportWorkflowDefinitionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the DataWorks workspace. You can logon to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the workspace management page to obtain the ID.</p>
     * <p>This parameter specifies the DataWorks workspace for this API invoke.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The FlowSpec information that describes the workflow. For the specification details, see <a href="https://github.com/aliyun/alibabacloud-dataworks-tool-dflow/">FlowSpec</a>.</p>
     * <blockquote>
     * <p>How do I quickly obtain a FlowSpec template?</p>
     * <ul>
     * <li>Open a workflow in DataStudio, and then click <strong>Show Spec</strong> in the upper-right corner to obtain the FlowSpec description of the current workflow. You can use this FlowSpec description to quickly build a template that meets your requirements.</li>
     * </ul>
     * </blockquote>
     * <blockquote>
     * <p>Notice: This operation supports creating a workflow and its internal nodes at the same time. Pay attention to the IDs specified in the FlowSpec. If an ID already exists, the operation becomes an update. The operation becomes a create only when no ID is specified or the ID does not exist.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;version&quot;: &quot;1.1.0&quot;,
     *     &quot;kind&quot;: &quot;CycleWorkflow&quot;,
     *     &quot;spec&quot;: {
     *         &quot;name&quot;: &quot;Asynchronous_Workflow_Creation_Test&quot;,
     *         &quot;id&quot;: &quot;632647691239009XXXX&quot;,
     *         &quot;type&quot;: &quot;CycleWorkflow&quot;,
     *         &quot;workflows&quot;: [
     *             {
     *                 &quot;script&quot;: {
     *                     &quot;path&quot;: &quot;XX/OpenAPI_Test/Workflow_Test/Asynchronous_Workflow_Creation_Test&quot;,
     *                     &quot;runtime&quot;: {
     *                         &quot;command&quot;: &quot;WORKFLOW&quot;
     *                     }
     *                 },
     *                 &quot;id&quot;: &quot;632647691239009XXXX&quot;,
     *                 &quot;trigger&quot;: {
     *                     &quot;type&quot;: &quot;Scheduler&quot;,
     *                     &quot;cron&quot;: &quot;00 03 00 * * ?&quot;,
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
     *                 &quot;name&quot;: &quot;Asynchronous_Workflow_Creation_Test&quot;,
     *                 &quot;inputs&quot;: {},
     *                 &quot;outputs&quot;: {
     *                     &quot;nodeOutputs&quot;: [
     *                         {
     *                             &quot;data&quot;: &quot;632647691239009XXXX&quot;,
     *                             &quot;artifactType&quot;: &quot;NodeOutput&quot;,
     *                             &quot;refTableName&quot;: &quot;Asynchronous_Workflow_Creation_Test&quot;
     *                         }
     *                     ]
     *                 },
     *                 &quot;nodes&quot;: [
     *                     {
     *                         &quot;recurrence&quot;: &quot;Normal&quot;,
     *                         &quot;id&quot;: &quot;742981001612325XXXX&quot;,
     *                         &quot;timeout&quot;: 0,
     *                         &quot;instanceMode&quot;: &quot;T+1&quot;,
     *                         &quot;rerunMode&quot;: &quot;Allowed&quot;,
     *                         &quot;rerunTimes&quot;: 3,
     *                         &quot;rerunInterval&quot;: 180000,
     *                         &quot;script&quot;: {
     *                             &quot;path&quot;: &quot;XX/OpenAPI_Test/Workflow_Test/Asynchronous_Workflow_Creation_Test/111&quot;,
     *                             &quot;runtime&quot;: {
     *                                 &quot;command&quot;: &quot;ODPS_SQL&quot;
     *                             },
     *                             &quot;content&quot;: &quot;select now();\n&quot;
     *                         },
     *                         &quot;trigger&quot;: {
     *                             &quot;type&quot;: &quot;Scheduler&quot;,
     *                             &quot;cron&quot;: &quot;00 24 00 * * ?&quot;,
     *                             &quot;startTime&quot;: &quot;1970-01-01 00:00:00&quot;,
     *                             &quot;endTime&quot;: &quot;9999-01-01 00:00:00&quot;,
     *                             &quot;timezone&quot;: &quot;Asia/Shanghai&quot;,
     *                             &quot;delaySeconds&quot;: 0
     *                         },
     *                         &quot;name&quot;: &quot;111&quot;,
     *                         &quot;inputs&quot;: {},
     *                         &quot;outputs&quot;: {
     *                             &quot;nodeOutputs&quot;: [
     *                                 {
     *                                     &quot;data&quot;: &quot;742981001612325XXXX&quot;,
     *                                     &quot;artifactType&quot;: &quot;NodeOutput&quot;,
     *                                     &quot;refTableName&quot;: &quot;111&quot;
     *                                 }
     *                             ]
     *                         }
     *                     },
     *                     {
     *                         &quot;recurrence&quot;: &quot;Normal&quot;,
     *                         &quot;id&quot;: &quot;595182137303408XXXX&quot;,
     *                         &quot;timeout&quot;: 0,
     *                         &quot;instanceMode&quot;: &quot;T+1&quot;,
     *                         &quot;rerunMode&quot;: &quot;Allowed&quot;,
     *                         &quot;rerunTimes&quot;: 3,
     *                         &quot;rerunInterval&quot;: 180000,
     *                         &quot;script&quot;: {
     *                             &quot;path&quot;: &quot;XX/OpenAPI_Test/Workflow_Test/Asynchronous_Workflow_Creation_Test/222&quot;,
     *                             &quot;runtime&quot;: {
     *                                 &quot;command&quot;: &quot;ODPS_SQL&quot;
     *                             },
     *                             &quot;content&quot;: &quot;select now();\n select 1;&quot;
     *                         },
     *                         &quot;trigger&quot;: {
     *                             &quot;type&quot;: &quot;Scheduler&quot;,
     *                             &quot;cron&quot;: &quot;00 00 00 * * ?&quot;,
     *                             &quot;startTime&quot;: &quot;1970-01-01 00:00:00&quot;,
     *                             &quot;endTime&quot;: &quot;9999-01-01 00:00:00&quot;,
     *                             &quot;timezone&quot;: &quot;Asia/Shanghai&quot;,
     *                             &quot;delaySeconds&quot;: 0
     *                         },
     *                         &quot;name&quot;: &quot;222&quot;,
     *                         &quot;inputs&quot;: {},
     *                         &quot;outputs&quot;: {
     *                             &quot;nodeOutputs&quot;: [
     *                                 {
     *                                     &quot;data&quot;: &quot;595182137303408XXXX&quot;,
     *                                     &quot;artifactType&quot;: &quot;NodeOutput&quot;,
     *                                     &quot;refTableName&quot;: &quot;222&quot;<br>                                }
     *                             ]
     *                         }
     *                     }
     *                 ],
     *                 &quot;dependencies&quot;: [
     *                     {
     *                         &quot;nodeId&quot;: &quot;595182137303408XXXX&quot;,
     *                         &quot;depends&quot;: [
     *                             {
     *                                 &quot;type&quot;: &quot;Normal&quot;,
     *                                 &quot;output&quot;: &quot;742981001612325XXXX&quot;,
     *                                 &quot;refTableName&quot;: &quot;111&quot;
     *                             }
     *                         ]
     *                     }
     *                 ]
     *             }
     *         ]
     *     }
     * }</p>
     */
    @NameInMap("Spec")
    public String spec;

    public static ImportWorkflowDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportWorkflowDefinitionRequest self = new ImportWorkflowDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public ImportWorkflowDefinitionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ImportWorkflowDefinitionRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ImportWorkflowDefinitionRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
