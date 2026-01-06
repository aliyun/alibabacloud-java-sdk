// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateNodeRequest extends TeaModel {
    /**
     * <p>Specify this parameter if you want to create the node inside a container. This parameter represents the unique identifier of the container, which can be a workflow or a container node.</p>
     * <blockquote>
     * <p> If this parameter is specified, the path field defined in FlowSpec is ignored.</p>
     * </blockquote>
     * <blockquote>
     * <p> Prior to SDK version 8.0.0, this field is of type Long. In SDK version 8.0.0 and later, it is of type String. This change does not affect the normal use of the SDK. The parameter is returned based on the type defined in the SDK. Compilation failures caused by the type change may occur only when you upgrade the SDK across version 8.0.0. In this case, you must manually update the data type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a7ef0634-20ec-4a7c-a214-54020f91XXXX</p>
     */
    @NameInMap("ContainerId")
    public String containerId;

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
     * <p>Specify this parameter if you want to create the node inside a container. This parameter represents the unique identifier of the container, which can be a workflow or a container node.</p>
     * <blockquote>
     * <p> If this parameter is specified, the path field defined in FlowSpec is ignored.</p>
     * </blockquote>
     * <blockquote>
     * <p> Prior to SDK version 8.0.0, this field is of type Long. In SDK version 8.0.0 and later, it is of type String. This change does not affect the normal use of the SDK. The parameter is returned based on the type defined in the SDK. Compilation failures caused by the type change may occur only when you upgrade the SDK across version 8.0.0. In this case, you must manually update the data type.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DATAWORKS_PROJECT</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <p>The FlowSpec information that describes the node. For more information, see <a href="https://github.com/aliyun/alibabacloud-dataworks-tool-dflow">FlowSpec</a>.</p>
     * <blockquote>
     * <p> How do I quickly obtain a FlowSpec template?</p>
     * </blockquote>
     * <ul>
     * <li>Go to Data Studio, open a node, click Version on the right side, find the latest version, and then click Scheduling Settings to obtain the FlowSpec description of the current node. You can use the FlowSpec description in the version to quickly build a template that meets your requirements.</li>
     * </ul>
     * <blockquote>
     * <p> How do I configure the node content?</p>
     * </blockquote>
     * <ul>
     * <li>Enter the code for the node in the $.spec.nodes[].script.content field.</li>
     * </ul>
     * <blockquote>
     * <p> How do I configure a batch synchronization node?</p>
     * </blockquote>
     * <ul>
     * <li>Write the script by referring to Step 4 in <a href="https://help.aliyun.com/zh/dataworks/user-guide/configure-a-batch-synchronization-node-by-using-the-code-editor">Configure an offline sync task in the code editor</a>, and then enter the script content in the $.spec.nodes[\*].script.content field. Alternatively, you can create a batch synchronization node in the console and view its version information to obtain the script content.</li>
     * </ul>
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

    public CreateNodeRequest setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
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
