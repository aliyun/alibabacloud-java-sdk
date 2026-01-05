// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateNodeRequest extends TeaModel {
    /**
     * <p>The unique identifier of the Data Studio node.</p>
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
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>{ &quot;title&quot;: &quot;CycleWorkflow Schema&quot;, &quot;description&quot;: &quot;the JSON schema that is used to configure the auto triggered workflow and nodes in the workflow&quot;, &quot;type&quot;: &quot;object&quot;, &quot;required&quot;: [ &quot;version&quot;, &quot;kind&quot;, &quot;spec&quot; ], &quot;properties&quot;: { &quot;version&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;const&quot;: &quot;1.1.0&quot;, &quot;description&quot;: &quot;the schema version. The value is fixed to 1.1.0&quot; }, &quot;kind&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;enum&quot;: [ &quot;Workflow&quot;, &quot;Node&quot; ], &quot;description&quot;: &quot;the resource type&quot; }, &quot;spec&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;the key configurations of the workflow&quot;, &quot;required&quot;: [ &quot;nodes&quot; ], &quot;properties&quot;: { &quot;nodes&quot;: { &quot;type&quot;: &quot;array&quot;, &quot;description&quot;: &quot;the nodes in the workflow&quot;, &quot;items&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;required&quot;: [ &quot;name&quot;, &quot;script&quot; ], &quot;properties&quot;: { &quot;recurrence&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;enum&quot;: [ &quot;Normal&quot;, &quot;Pause&quot;, &quot;Skip&quot;, &quot;NoneAuto&quot; ], &quot;description&quot;: &quot;the running mode of the node. Valid values: Normal, Pause, Skip, and NoneAuto&quot; }, &quot;id&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the node ID&quot; }, &quot;timeout&quot;: { &quot;type&quot;: &quot;integer&quot;, &quot;minimum&quot;: 0, &quot;description&quot;: &quot;the timeout period. Unit: seconds&quot; }, &quot;instanceMode&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;enum&quot;: [ &quot;T+1&quot;, &quot;Immediately&quot; ], &quot;description&quot;: &quot;the instance generation mode. Valid values: T+1 and Immediately&quot; }, &quot;rerunMode&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;enum&quot;: [ &quot;Allowed&quot;, &quot;Denied&quot;, &quot;FailureAllowed&quot; ], &quot;description&quot;: &quot;the rerun mode. Valid values: AllAllowed, Denied, and FailureAllowed&quot; }, &quot;rerunTimes&quot;: { &quot;type&quot;: &quot;integer&quot;, &quot;minimum&quot;: 0, &quot;description&quot;: &quot;the maximum number of reruns allowed after a failure&quot; }, &quot;rerunInterval&quot;: { &quot;type&quot;: &quot;integer&quot;, &quot;minimum&quot;: 0, &quot;description&quot;: &quot;the rerun interval. Unit: seconds&quot; }, &quot;datasource&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;the configurations of the data source&quot;, &quot;required&quot;: [ &quot;name&quot;, &quot;type&quot; ], &quot;properties&quot;: { &quot;name&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the name of the data source&quot; }, &quot;type&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;enum&quot;: [ &quot;odps&quot; ], &quot;description&quot;: &quot;the type of the data source. Only MaxCompute data sources are supported&quot; } } }, &quot;script&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;the script configurations of the node&quot;, &quot;required&quot;: [ &quot;path&quot;, &quot;runtime&quot; ], &quot;properties&quot;: { &quot;language&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the programming language of the script&quot; }, &quot;path&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the storage path of the script file. The storage path ends with the node name and does not require a file extension&quot; }, &quot;runtime&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;the configurations of the runtime environment&quot;, &quot;required&quot;: [ &quot;command&quot; ], &quot;properties&quot;: { &quot;command&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;enum&quot;: [ &quot;ODPS_SQL&quot; ], &quot;Description&quot;: &quot;the command&quot; }, &quot;cu&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the unit of the computing resource&quot; } } } } }, &quot;trigger&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;the configurations of the node trigger&quot;, &quot;required&quot;: [ &quot;type&quot; ], &quot;properties&quot;: { &quot;type&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;enum&quot;: [ &quot;Scheduler&quot;, &quot;Manual&quot;, &quot;Streaming&quot;, &quot;None&quot; ], &quot;description&quot;: &quot;the trigger type. Valid values: Scheduler, Manual, Streaming, and None&quot; }, &quot;cron&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the cron expression, which is suitable for only auto triggered nodes&quot; }, &quot;startTime&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;format&quot;: &quot;yyyy-MM-dd hh:mm:ss&quot;, &quot;description&quot;: &quot;the start time for scheduling&quot; }, &quot;endTime&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;format&quot;: &quot;yyyy-MM-dd hh:mm:ss&quot;, &quot;description&quot;: &quot;the end time for scheduling&quot; } } }, &quot;runtimeResource&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;the resource configurations for running&quot;, &quot;required&quot;: [ &quot;resourceGroup&quot; ], &quot;properties&quot;: { &quot;resourceGroup&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the name of the resource group&quot; } } }, &quot;name&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the name of the node&quot; }, &quot;owner&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the node owner&quot; }, &quot;inputs&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;the node input parameters&quot;, &quot;properties&quot;: { &quot;nodeOutputs&quot;: { &quot;type&quot;: &quot;array&quot;, &quot;description&quot;: &quot;the node dependencies&quot;, &quot;items&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;required&quot;: [ &quot;data&quot; ], &quot;properties&quot;: { &quot;data&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the identifier of the node dependency&quot; }, &quot;refTableName&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the name of the table that is associated with the node. You must configure this parameter if the artifactType parameter is set to Table&quot; }, &quot;isDefault&quot;: { &quot;type&quot;: &quot;boolean&quot;, &quot;description&quot;: &quot;specifies whether the table is the default input table“ } } } } } }, &quot;outputs&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;the node output parameters&quot;, &quot;properties&quot;: { &quot;nodeOutputs&quot;: { &quot;type&quot;: &quot;array&quot;, &quot;description&quot;: &quot;the node dependencies&quot;, &quot;items&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;required&quot;: [ &quot;data&quot; ], &quot;properties&quot;: { &quot;data&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the identifier of the node dependency&quot; }, &quot;refTableName&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the name of the table that is associated with the node. You must configure this parameter if the artifactType parameter is set to Table&quot; }, &quot;isDefault&quot;: { &quot;type&quot;: &quot;boolean&quot;, &quot;description&quot;: &quot;specifies whether the table is the default output table“ } } } } } } } } } } } } }</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;version&quot;: &quot;1.1.0&quot;,
     *     &quot;kind&quot;: &quot;Node&quot;,
     *     &quot;spec&quot;: {
     *         &quot;nodes&quot;: [
     *             {
     *                 &quot;id&quot;: &quot;860438872620113XXXX&quot;,
     *                 &quot;recurrence&quot;: &quot;Normal&quot;,
     *                 &quot;timeout&quot;: 0,
     *                 &quot;instanceMode&quot;: &quot;T+1&quot;,
     *                 &quot;rerunMode&quot;: &quot;Allowed&quot;,
     *                 &quot;rerunTimes&quot;: 3,
     *                 &quot;rerunInterval&quot;: 180000,
     *                 &quot;datasource&quot;: {
     *                     &quot;name&quot;: &quot;odps_test&quot;,
     *                     &quot;type&quot;: &quot;odps&quot;
     *                 },
     *                 &quot;script&quot;: {
     *                     &quot;path&quot;: &quot;XX/OpenAPI_Test/odpsSQL_Test&quot;,
     *                     &quot;runtime&quot;: {
     *                         &quot;command&quot;: &quot;ODPS_SQL&quot;
     *                     },
     *                     &quot;content&quot;: &quot;select now();&quot;
     *                 },
     *                 &quot;trigger&quot;: {
     *                     &quot;type&quot;: &quot;Scheduler&quot;,
     *                     &quot;cron&quot;: &quot;00 00 00 * * ?&quot;,
     *                     &quot;startTime&quot;: &quot;1970-01-01 00:00:00&quot;,
     *                     &quot;endTime&quot;: &quot;9999-01-01 00:00:00&quot;,
     *                     &quot;timezone&quot;: &quot;Asia/Shanghai&quot;,
     *                     &quot;delaySeconds&quot;: 0
     *                 },
     *                 &quot;runtimeResource&quot;: {
     *                     &quot;resourceGroup&quot;: &quot;S_res_group_XXXX_XXXX&quot;
     *                 },
     *                 &quot;name&quot;: &quot;odpsSQL_Test&quot;,
     *                 &quot;inputs&quot;: {
     *                     &quot;nodeOutputs&quot;: [
     *                         {
     *                             &quot;data&quot;: &quot;lwttest_standard_root&quot;,
     *                             &quot;artifactType&quot;: &quot;NodeOutput&quot;
     *                         }
     *                     ]
     *                 },
     *                 &quot;outputs&quot;: {
     *                     &quot;nodeOutputs&quot;: [
     *                         {
     *                             &quot;data&quot;: &quot;output_data&quot;,
     *                             &quot;artifactType&quot;: &quot;NodeOutput&quot;,
     *                             &quot;refTableName&quot;: &quot;odpsSQL_Test&quot;
     *                         }
     *                     ]
     *                 }
     *             }
     *         ],
     *         &quot;flow&quot;: [
     *             {
     *                 &quot;nodeId&quot;: &quot;860438872620113XXXX&quot;,
     *                 &quot;depends&quot;: [
     *                     {
     *                         &quot;type&quot;: &quot;Normal&quot;,
     *                         &quot;output&quot;: &quot;project_root&quot;
     *                     }
     *                 ]
     *             }
     *         ]
     *     }
     * }</p>
     */
    @NameInMap("Spec")
    public String spec;

    public static UpdateNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeRequest self = new UpdateNodeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNodeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateNodeRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateNodeRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
