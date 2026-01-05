// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateFunctionRequest extends TeaModel {
    /**
     * <p>The unique identifier of the UDF.</p>
     * <blockquote>
     * <p> This field is of the Long type in SDK versions prior to 8.0.0, and of the String type in SDK versions 8.0.0 and later. This change does not affect normal SDK usage; the parameter will still be returned according to the type defined in the SDK.. However, compilation failures may occur due to the type change only when upgrading the SDK across version 8.0.0. In this case, you must manually update the data type.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>463497880880954XXXX</p>
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
     * <p>The FlowSpec field information about the UDF. For more information, see <a href="https://github.com/aliyun/dataworks-spec/blob/master/README_zh_CN.md">FlowSpec</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;version&quot;: &quot;1.1.0&quot;,
     *     &quot;kind&quot;: &quot;Function&quot;,
     *     &quot;spec&quot;: {
     *         &quot;functions&quot;: [
     *             {
     *                 &quot;name&quot;: &quot;FunctionName&quot;,
     *                 &quot;script&quot;: {
     *                     &quot;content&quot;: &quot;{\&quot;name\&quot;: \&quot;FunctionName\&quot;, \&quot;datasource\&quot;: {\&quot;type\&quot;: \&quot;odps\&quot;, \&quot;name\&quot;: \&quot;odps_first\&quot;}, \&quot;runtimeResource\&quot;: {\&quot;resourceGroup\&quot;: \&quot;S_res_group_XXXX_XXXX\&quot;}}&quot;,
     *                     &quot;path&quot;: &quot;XXX/OpenAPI/Function/FunctionName&quot;,
     *                     &quot;runtime&quot;: {
     *                         &quot;command&quot;: &quot;ODPS_FUNCTION&quot;
     *                     }
     *                 },
     *                 &quot;datasource&quot;: {
     *                     &quot;name&quot;: &quot;odps_first&quot;,
     *                     &quot;type&quot;: &quot;odps&quot;
     *                 },
     *                 &quot;runtimeResource&quot;: {
     *                     &quot;resourceGroup&quot;: &quot;S_res_group_XXXX_XXXX&quot;
     *                 }
     *             }
     *         ]
     *     }
     * }</p>
     */
    @NameInMap("Spec")
    public String spec;

    public static UpdateFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFunctionRequest self = new UpdateFunctionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFunctionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateFunctionRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateFunctionRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
