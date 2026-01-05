// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ImportWorkflowDefinitionRequest extends TeaModel {
    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
     * <p>You must configure this parameter to specify the DataWorks workspace to which the API operation is applied.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The FlowSpec information for this workflow. For more information, see <a href="https://github.com/aliyun/alibabacloud-dataworks-tool-dflow/">FlowSpec</a>.</p>
     * <blockquote>
     * <p>How to quickly obtain a FlowSpec template?</p>
     * </blockquote>
     * <ul>
     * <li>Open a workflow in Data Studio, then click &quot;Show Spec&quot; in the top-right corner to retrieve the FlowSpec description for the current workflow. You can use this FlowSpec description to quickly build a template that meets your requirements.</li>
     * </ul>
     * <blockquote>
     * <p>This interface supports creating both the workflow and its internal nodes simultaneously. Therefore, please pay close attention to the ID specified in the FlowSpec. If the provided ID already exists, the operation will be treated as an update. A create operation is performed only if the ID is omitted or does not exist.</p>
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
