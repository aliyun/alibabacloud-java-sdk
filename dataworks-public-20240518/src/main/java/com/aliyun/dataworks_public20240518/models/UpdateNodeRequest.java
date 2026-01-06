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
     * <p>The unique identifier of the Data Studio node.</p>
     * <blockquote>
     * <p> This field is of the Long type in SDK versions prior to 8.0.0, and of the String type in SDK versions 8.0.0 and later. This change does not affect the normal use of the SDK. The parameter is returned based on the type defined in the SDK. Compilation failures caused by the type change may occur only when you upgrade the SDK across version 8.0.0. In this case, you must manually update the data type.</p>
     * </blockquote>
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
