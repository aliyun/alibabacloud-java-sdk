// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateNodeRequest extends TeaModel {
    /**
     * <p>The ID of the node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>652567824470354XXXX</p>
     */
    @NameInMap("Id")
    public Long id;

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
     * <p>The FlowSpec field information about the node. For more information, see <a href="https://github.com/aliyun/dataworks-spec/blob/master/README_zh_CN.md">FlowSpec</a>.</p>
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

    public UpdateNodeRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
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
