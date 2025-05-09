// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateNodeRequest extends TeaModel {
    /**
     * <p>The container ID. If you want to create a node in a container, you must configure this parameter to specify the container. The container can be a workflow or a node in a container.</p>
     * <blockquote>
     * <p> If you configure this parameter, the path field defined in FlowSpec becomes invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a7ef0634-20ec-4a7c-a214-54020f91XXXX</p>
     */
    @NameInMap("ContainerId")
    public Long containerId;

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
     * <p>The scene of the node. This parameter determines the location (the DataStudio pane or the Manual pane) of the node. You can set this parameter to DataworksManualWorkflow only if the ContainerId parameter is configured and the container specified by ContainerId is a manually triggered workflow.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>DataworksProject</li>
     * <li>DataworksManualWorkflow</li>
     * <li>DataworksManualTask</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DATAWORKS_PROJECT</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <p>{ &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;CycleWorkflow the structure of the workflow configurations&quot;, &quot;properties&quot;: { &quot;version&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the version ID of the workflow configuration files&quot; }, &quot;kind&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the category ID of the workflow&quot;, &quot;enum&quot;: [ &quot;CycleWorkflow&quot;, &quot;ManualWorkflow&quot;, &quot;ManualNode&quot;, &quot;TemporaryWorkflow&quot;, &quot;PaiFlow&quot;, &quot;BatchDeployment&quot;, &quot;DataSource&quot;, &quot;DataQuality&quot;, &quot;DataService&quot;, &quot;DataCatalog&quot;, &quot;Table&quot;, &quot;Node&quot;, &quot;Component&quot;, &quot;Resource&quot;, &quot;Function&quot;, &quot;Workflow&quot; ] }, &quot;spec&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;the key configurations of the workflow&quot;, &quot;properties&quot;: { &quot;name&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the readable name identifier of the workflow&quot; }, &quot;id&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the UUID of the workflow&quot; }, &quot;type&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the type of the workflow instance&quot;, &quot;enum&quot;: [ &quot;CycleWorkflow&quot;, &quot;ManualWorkflow&quot; ] }, &quot;owner&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the system user ID of the workflow owner&quot; }, &quot;description&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the detailed description of the features and usage of the workflow&quot; }, &quot;workflows&quot;: { &quot;type&quot;: &quot;array&quot;, &quot;description&quot;: an array of node configurations in the workflow. The workflows can be run at the same time&quot;, &quot;items&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;properties&quot;: { &quot;script&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;the script parameters&quot;, &quot;properties&quot;: { &quot;path&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the storage path of the script file. Example: HDFS/S3&quot; }, &quot;runtime&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;the parameter settings for the runtime environment, such as the specifications of computing resources&quot; }, &quot;id&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the unique identifiers of the script parameters&quot; } } }, &quot;id&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the ID of the node in the workflow&quot; }, &quot;trigger&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;the rule configurations to trigger the node“, &quot;properties&quot;: { &quot;type&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;enum&quot;: [ &quot;Scheduler&quot;, &quot;Manual&quot;, &quot;Streaming&quot;, &quot;None&quot; ], &quot;description&quot;: &quot;the trigger type. Valid values: Scheduler, Manual, Streaming, and None&quot; }, &quot;id&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the trigger ID&quot; }, &quot;cron&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the scheduling rule of the node. The rule is in the cron expression format&quot; }, &quot;startTime&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the start time for scheduling. The value is in the ISO 8601 format&quot; }, &quot;endTime&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the end time for scheduling. The value is in the ISO 8601 format&quot; }, &quot;timezone&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the time zone. Example: UTC+8&quot; }, &quot;delaySeconds&quot;: { &quot;type&quot;: &quot;number&quot;, &quot;description&quot;: &quot;the delayed execution time. Unit: seconds&quot; } } }, &quot;strategy&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;the execution policy parameters&quot;, &quot;properties&quot;: { &quot;timeout&quot;: { &quot;type&quot;: &quot;number&quot;, &quot;description&quot;: &quot;the timeout period. Unit: seconds&quot; }, &quot;instanceMode&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;enum&quot;: [ &quot;T+1&quot;, &quot;Immediately&quot; ], &quot;description&quot;: &quot;the instance scheduling mode. Valid values: T+1 and Immediately&quot; }, &quot;rerunMode&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;enum&quot;: [ &quot;Allowed&quot;, &quot;Denied&quot;, &quot;FailureAllowed&quot; ], &quot;description&quot;: &quot;the rerun mode. Valid values: Allowed, Denied, and FailureAllowed&quot; }, &quot;rerunTimes&quot;: { &quot;type&quot;: &quot;number&quot;, &quot;description&quot;: &quot;the maximum number of reruns allowed after a failure&quot; }, &quot;rerunInterval&quot;: { &quot;type&quot;: &quot;number&quot;, &quot;description&quot;: &quot;the rerun interval. Unit: seconds&quot; }, &quot;failureStrategy&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;enum&quot;: [ &quot;Continue&quot;, &quot;Break&quot; ], &quot;description&quot;: &quot;the failure handling policy. Valid values: Continue and Break&quot; }, &quot;recurrenceType&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;enum&quot;: [ &quot;Normal&quot;, &quot;Pause&quot;, &quot;Skip&quot;, &quot;NoneAuto&quot; ], &quot;description&quot;: &quot;the running mode of the auto triggered node. Valid values: Normal, Pause, Skip, and NoneAuto&quot; } } }, &quot;name&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the readable name of the node&quot; }, &quot;owner&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the system ID of the node owner&quot; }, &quot;description&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the feature description of the node&quot; }, &quot;citable&quot;: { &quot;type&quot;: &quot;boolean&quot;, &quot;description&quot;: &quot;specifies whether the node can be referenced by other workflows. Valid values: true and false&quot; }, &quot;metadata&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;the container that stores the metadata information&quot;, &quot;properties&quot;: { &quot;owner&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the metadata owner ID&quot; }, &quot;project&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;properties&quot;: { &quot;projectIdentifier&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the unique code of the project&quot; }, &quot;projectName&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the project name&quot; }, &quot;projectId&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;Description&quot;: &quot;the project ID&quot; } } }, &quot;ownerName&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the name of the project owner&quot; }, &quot;projectId&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the ID of the associated project&quot; } } }, &quot;inputs&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;the structure of the node input&quot;, &quot;properties&quot;: { &quot;nodeOutputs&quot;: { &quot;type&quot;: &quot;array&quot;, &quot;description&quot;: &quot;the configuration items for node input&quot;, &quot;items&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;properties&quot;: { &quot;data&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the content of the node input&quot; }, &quot;artifactType&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;enum&quot;: [ &quot;Table&quot;, &quot;File&quot;, &quot;NodeOutput&quot;, &quot;Variable&quot; ], &quot;description&quot;: &quot;the type of the node input. Valid values: Table, File, NodeOutput, and Variable&quot; }, &quot;refTableName&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the name of the referenced table&quot; }, &quot;isDefault&quot;: { &quot;type&quot;: &quot;boolean&quot;, &quot;description&quot;: &quot;specifies whether the table is the default output“ } } } }, &quot;tables&quot;: { &quot;type&quot;: &quot;array&quot;, &quot;description&quot;: &quot;the metadata collection in the input table&quot;, &quot;items&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;properties&quot;: { &quot;artifactType&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;enum&quot;: [ &quot;Table&quot;, &quot;File&quot;, &quot;NodeOutput&quot;, &quot;Variable&quot; ], &quot;description&quot;: &quot;the type of the table&quot; }, &quot;guid&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the GUID of the table&quot; } } } } } }, &quot;outputs&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;the structure of the node output&quot;, &quot;properties&quot;: { &quot;nodeOutputs&quot;: { &quot;type&quot;: &quot;array&quot;, &quot;description&quot;: &quot;the configuration items for node output&quot;, &quot;items&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;properties&quot;: { &quot;data&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the content of the node output&quot; }, &quot;artifactType&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;enum&quot;: [ &quot;Table&quot;, &quot;File&quot;, &quot;NodeOutput&quot;, &quot;Variable&quot; ], &quot;description&quot;: &quot;the type of the node output. Valid values: Table, File, NodeOutput, and Variable&quot; }, &quot;refTableName&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the name of the referenced table&quot; }, &quot;isDefault&quot;: { &quot;type&quot;: &quot;boolean&quot;, &quot;description&quot;: &quot;specifies whether the table is the default output“ } } } }, &quot;tables&quot;: { &quot;type&quot;: &quot;array&quot;, &quot;description&quot;: &quot;the metadata collection in the output table&quot;, &quot;items&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;properties&quot;: { &quot;artifactType&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;enum&quot;: [ &quot;Table&quot;, &quot;File&quot;, &quot;NodeOutput&quot;, &quot;Variable&quot; ], &quot;description&quot;: &quot;the type of the table&quot; }, &quot;guid&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the GUID of the table&quot; } } } } } }, &quot;nodes&quot;: { &quot;type&quot;: &quot;array&quot;, &quot;description&quot;: &quot;the configuration items for descendant nodes that are used for workflow nesting&quot;, &quot;items&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;properties&quot;: { &quot;recurrence&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;enum&quot;: [ &quot;Normal&quot;, &quot;Pause&quot;, &quot;Skip&quot;, &quot;NoneAuto&quot; ], &quot;description&quot;: &quot;the running mode of the descendant node&quot; }, &quot;id&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the descendant node ID&quot; }, &quot;timeout&quot;: { &quot;type&quot;: &quot;number&quot;, &quot;description&quot;: &quot;the timeout period of the descendant node. Unit: seconds&quot; }, &quot;instanceMode&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;enum&quot;: [ &quot;T+1&quot;, &quot;Immediately&quot; ], &quot;description&quot;: &quot;the instance scheduling mode of the descendant node. Valid values: T+1 and Immediately&quot; }, &quot;rerunMode&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;enum&quot;: [ &quot;Allowed&quot;, &quot;Denied&quot;, &quot;FailureAllowed&quot; ], &quot;description&quot;: &quot;the rerun mode of the descendant node&quot; }, &quot;rerunTimes&quot;: { &quot;type&quot;: &quot;number&quot;, &quot;description&quot;: &quot;the maximum number of reruns allowed after a failure for the descendant node&quot; }, &quot;rerunInterval&quot;: { &quot;type&quot;: &quot;number&quot;, &quot;description&quot;: &quot;the rerun interval&quot; }, &quot;datasource&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;the parameters of the associated data source&quot;, &quot;properties&quot;: { &quot;name&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the name of the data source&quot; }, &quot;type&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the type of the data source. Examples: MySQL and Oracle&quot; } } }, &quot;script&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;the script configurations of the node&quot;, &quot;properties&quot;: { &quot;language&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;enum&quot;: [ &quot;python2&quot;, &quot;python3&quot;, &quot;java8&quot;, &quot;java11&quot;, &quot;java17&quot; ], &quot;description&quot;: &quot;the programming language of the script&quot; }, &quot;path&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the storage path of the code&quot; }, &quot;runtime&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;the configurations of the runtime environment&quot; }, &quot;content&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the content of the inline script&quot; }, &quot;id&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the identifier of the script content&quot; }, &quot;parameters&quot;: { &quot;type&quot;: &quot;array&quot;, &quot;description&quot;: &quot;the parameters for initialization&quot;, &quot;items&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;properties&quot;: { &quot;name&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the identifier of the parameter name&quot; }, &quot;artifactType&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;enum&quot;: [ &quot;Table&quot;, &quot;File&quot;, &quot;NodeOutput&quot;, &quot;Variable&quot; ], &quot;description&quot;: &quot;the identifier of the data type&quot; }, &quot;scope&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;enum&quot;: [ &quot;Tenant&quot;, &quot;Workspace&quot;, &quot;Workflow&quot;, &quot;NodeParameter&quot;, &quot;NodeContext&quot; ], &quot;description&quot;: &quot;the application scope of the parameter&quot; }, &quot;type&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;enum&quot;: [ &quot;NoKvVariableExpression&quot;, &quot;System&quot;, &quot;Constant&quot;, &quot;NodeOutput&quot;, &quot;PaiOutput&quot;, &quot;PassThrough&quot; ], &quot;description&quot;: &quot;the type of the parameter&quot; }, &quot;value&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the default value of the parameter&quot; }, &quot;id&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the parameter ID&quot; } } } } } }, &quot;trigger&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;the configurations of the trigger at the node level. You can overwrite or inherit the configurations&quot; }, &quot;runtimeResource&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;the configurations of computing resources, such as CPU and memory&quot; }, &quot;name&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the readable name of the descendant node&quot; }, &quot;owner&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the ID of the descendant node owner&quot; }, &quot;metadata&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;the extended metadata of the descendant node&quot; }, &quot;inputs&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;the parameter definitions of the node input&quot; }, &quot;outputs&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;the parameter definitions of the node output&quot; } } } }, &quot;dependencies&quot;: { &quot;type&quot;: &quot;array&quot;, &quot;description&quot;: &quot;the node dependencies&quot;, &quot;items&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;properties&quot;: { &quot;nodeId&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the ID of the current node&quot; }, &quot;depends&quot;: { &quot;type&quot;: &quot;array&quot;, &quot;description&quot;: &quot;the ancestor node output&quot;, &quot;items&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;properties&quot;: { &quot;type&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;enum&quot;: [ &quot;Normal&quot;, &quot;CrossCycleDependsOnSelf&quot;, &quot;CrossCycleDependsOnChildren&quot;, &quot;CrossCycleDependsOnOtherNode&quot; ], &quot;description&quot;: &quot;the dependency type. Valid values: Normal, CrossCycleDependsOnSelf, CrossCycleDependsOnChildren, and CrossCycleDependsOnOtherNode&quot; }, &quot;output&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the unique identifier of the ancestor node output&quot; }, &quot;refTableName&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the identifier of the referenced table name&quot; } } } } } } } } } }, &quot;metadata&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;the high-level metadata of the workflow&quot;, &quot;properties&quot;: { &quot;innerVersion&quot;: { &quot;type&quot;: &quot;object&quot;, &quot;description&quot;: &quot;the mappings between the versions of components&quot;, &quot;additionalProperties&quot;: { &quot;type&quot;: &quot;number&quot; } }, &quot;gmtModified&quot;: { &quot;type&quot;: &quot;number&quot;, &quot;description&quot;: &quot;the last modification time. The value is a UNIX timestamp&quot; }, &quot;projectId&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the ID of the associated project&quot; }, &quot;uuid&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;the GUID of the instance&quot; } } } } } }, &quot;required&quot;: [ &quot;version&quot;, &quot;kind&quot;, &quot;spec&quot; ] }</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;version&quot;: &quot;1.1.0&quot;,
     *   &quot;kind&quot;: &quot;Node&quot;,
     *   &quot;spec&quot;: {
     *     &quot;nodes&quot;: [
     *       {
     *         &quot;id&quot;: &quot;860438872620113XXXX&quot;,
     *         &quot;recurrence&quot;: &quot;Normal&quot;,
     *         &quot;timeout&quot;: 0,
     *         &quot;instanceMode&quot;: &quot;T+1&quot;,
     *         &quot;rerunMode&quot;: &quot;Allowed&quot;,
     *         &quot;rerunTimes&quot;: 3,
     *         &quot;rerunInterval&quot;: 180000,
     *         &quot;datasource&quot;: {
     *           &quot;name&quot;: &quot;ODPS_test&quot;,
     *           &quot;type&quot;: &quot;ODPS&quot;
     *         },
     *         &quot;script&quot;: {
     *           &quot;path&quot;: &quot;XX/OpenAPI test/odpsSQL test&quot;,
     *           &quot;runtime&quot;: {
     *             &quot;command&quot;: &quot;ODPS_SQL&quot;
     *           },
     *           &quot;content&quot;: &quot;select now();&quot;
     *         },
     *         &quot;trigger&quot;: {
     *           &quot;type&quot;: &quot;Scheduler&quot;,
     *           &quot;cron&quot;: &quot;00 00 00 * * ?&quot;,
     *           &quot;startTime&quot;: &quot;1970-01-01 00:00:00&quot;,
     *           &quot;endTime&quot;: &quot;9999-01-01 00:00:00&quot;,
     *           &quot;timezone&quot;: &quot;Asia/Shanghai&quot;,
     *           &quot;delaySeconds&quot;: 0
     *         },
     *         &quot;runtimeResource&quot;: {
     *           &quot;resourceGroup&quot;: &quot;S_res_group_XXXX_XXXX&quot;
     *         },
     *         &quot;name&quot;: &quot;odpsSQL test&quot;,
     *         &quot;inputs&quot;: {
     *           &quot;nodeOutputs&quot;: [
     *             {
     *               &quot;data&quot;: &quot;lwttest_standard_root&quot;,
     *               &quot;artifactType&quot;: &quot;NodeOutput&quot;
     *             }
     *           ]
     *         },
     *         &quot;outputs&quot;: {
     *           &quot;nodeOutputs&quot;: [
     *             {
     *               &quot;data&quot;: &quot;output_data&quot;,
     *               &quot;artifactType&quot;: &quot;NodeOutput&quot;,
     *               &quot;refTableName&quot;: &quot;odpsSQL test&quot;
     *             }
     *           ]
     *         }
     *       }
     *     ],
     *     &quot;flow&quot;: [
     *       {
     *         &quot;nodeId&quot;: &quot;860438872620113XXXX&quot;,
     *         &quot;depends&quot;: [
     *           {
     *             &quot;type&quot;: &quot;Normal&quot;,
     *             &quot;output&quot;: &quot;project_root&quot;
     *           }
     *         ]
     *       }
     *     ]
     *   }
     * }</p>
     */
    @NameInMap("Spec")
    public String spec;

    public static CreateNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNodeRequest self = new CreateNodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateNodeRequest setContainerId(Long containerId) {
        this.containerId = containerId;
        return this;
    }
    public Long getContainerId() {
        return this.containerId;
    }

    public CreateNodeRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateNodeRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreateNodeRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
