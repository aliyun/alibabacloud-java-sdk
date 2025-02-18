// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateFunctionRequest extends TeaModel {
    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The FlowSpec field information about the UDF. For more information, see <a href="https://github.com/aliyun/dataworks-spec/blob/master/README_zh_CN.md">FlowSpec</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;version&quot;: &quot;1.1.0&quot;,
     *   &quot;kind&quot;: &quot;Function&quot;,
     *   &quot;spec&quot;: {
     *     &quot;functions&quot;: [
     *       {
     *         &quot;name&quot;: &quot;function name&quot;,
     *         &quot;script&quot;: {
     *           &quot;content&quot;: &quot;{\&quot;name\&quot;: \&quot;function name\&quot;, \&quot;datasource\&quot;: {\&quot;type\&quot;: \&quot;ODPS\&quot;, \&quot;name\&quot;: \&quot;ODPS_first\&quot;}, \&quot;runtimeResource\&quot;: {\&quot;resourceGroup\&quot;: \&quot;s_res_group_xx_xxxx\&quot;}}&quot;,
     *           &quot;path&quot;: &quot;XXX/OpenAPI/function/function name&quot;,
     *           &quot;runtime&quot;: {
     *             &quot;command&quot;: &quot;ODPS_FUNCTION&quot;
     *           }
     *         },
     *         &quot;datasource&quot;: {
     *           &quot;name&quot;: &quot;ODPS_first&quot;,
     *           &quot;type&quot;: &quot;ODPS&quot;
     *         },
     *         &quot;runtimeResource&quot;: {
     *           &quot;resourceGroup&quot;: &quot;S_res_group_XXXX_XXXX&quot;
     *         }
     *       }
     *     ]
     *   }
     * }</p>
     */
    @NameInMap("Spec")
    public String spec;

    public static CreateFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionRequest self = new CreateFunctionRequest();
        return TeaModel.build(map, self);
    }

    public CreateFunctionRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateFunctionRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
