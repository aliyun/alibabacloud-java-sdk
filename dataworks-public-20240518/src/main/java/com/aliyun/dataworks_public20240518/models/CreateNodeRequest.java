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
     * <p>The FlowSpec field information about the node. For more information, see <a href="https://github.com/aliyun/dataworks-spec/blob/master/README_zh_CN.md">FlowSpec</a>.</p>
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
