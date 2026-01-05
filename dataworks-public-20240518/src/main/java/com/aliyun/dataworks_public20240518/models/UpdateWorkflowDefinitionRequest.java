// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateWorkflowDefinitionRequest extends TeaModel {
    /**
     * <p>The unique identifier of the Data Studio workflow.</p>
     * <blockquote>
     * <p> This field is of the Long type in SDK versions prior to 8.0.0, and of the String type in SDK versions 8.0.0 and later. This change does not affect normal SDK usage; the parameter will still be returned according to the type defined in the SDK. However, compilation failures may occur due to the type change only when upgrading the SDK across version 8.0.0. In this case, you must manually update the data type.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>652567824470354XXXX</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The FlowSpec field information about the workflow. For more information, see <a href="https://github.com/aliyun/dataworks-spec/blob/master/README_zh_CN.md">FlowSpec</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;kind&quot;: &quot;CycleWorkflow&quot;,
     *     &quot;version&quot;: &quot;1.1.0&quot;,
     *     &quot;spec&quot;: {
     *         &quot;name&quot;: &quot;OpenAPI Test Workflow Demo&quot;,
     *         &quot;type&quot;: &quot;CycleWorkflow&quot;,
     *         &quot;id&quot;: &quot;652567824470354XXXX&quot;,
     *         &quot;workflows&quot;: [
     *             {
     *                 &quot;id&quot;: &quot;652567824470354XXXX&quot;,
     *                 &quot;script&quot;: {
     *                     &quot;path&quot;: &quot;XX/OpenAPI_Test/Workflow_Test/OpenAPI_Test_Workflow_Demo&quot;,
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
     *                 &quot;name&quot;: &quot;OpenAPI Test Workflow Demo&quot;,
     *                 &quot;inputs&quot;: {},
     *                 &quot;outputs&quot;: {
     *                     &quot;nodeOutputs&quot;: [
     *                         {
     *                             &quot;data&quot;: &quot;workflow_output&quot;,
     *                             &quot;artifactType&quot;: &quot;NodeOutput&quot;,
     *                             &quot;refTableName&quot;: &quot;OpenAPI_Test_Workflow_Demo&quot;
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

    public static UpdateWorkflowDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowDefinitionRequest self = new UpdateWorkflowDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowDefinitionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateWorkflowDefinitionRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateWorkflowDefinitionRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
