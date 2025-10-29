// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateComponentRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1AFAE64E-D1BE-432B-A9****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The DataWorks workspace ID. You can call the <a href="https://help.aliyun.com/document_detail/2852607.html">ListProjects</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The FlowSpec information for this UDF function. For more information, see <a href="https://github.com/aliyun/dataworks-spec/blob/master/README_zh_CN.md">FlowSpec</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;kind&quot;: &quot;Component&quot;,
     *     &quot;name&quot;: &quot;com1&quot;,
     *     &quot;spec&quot;: {
     *         &quot;components&quot;: [
     *             {
     *                 &quot;name&quot;: &quot;test11&quot;,
     *                 &quot;id&quot;: &quot;1234&quot;,
     *                 &quot;owner&quot;: &quot;1234456&quot;,
     *                 &quot;description&quot;: &quot;&quot;,
     *                 &quot;script&quot;: {
     *                     &quot;language&quot;: &quot;odps-sql&quot;,
     *                     &quot;path&quot;: &quot;test11&quot;,
     *                     &quot;content&quot;: &quot;select \&quot;@@{bizdate}\&quot;, \&quot;@@{my_input_table}\&quot;&quot;,
     *                     &quot;runtime&quot;: {
     *                         &quot;command&quot;: &quot;SQL_COMPONENT&quot;
     *                     }
     *                 },
     *                 &quot;inputs&quot;: [
     *                     {
     *                         &quot;name&quot;: &quot;bizdate&quot;,
     *                         &quot;type&quot;: &quot;string&quot;
     *                     },
     *                     {
     *                         &quot;name&quot;: &quot;my_input_table&quot;,
     *                         &quot;type&quot;: &quot;string&quot;
     *                     }
     *                 ],
     *                 &quot;outputs&quot;: [
     *                     {
     *                         &quot;name&quot;: &quot;my_output_table1&quot;,
     *                         &quot;type&quot;: &quot;string&quot;
     *                     }
     *                 ]
     *             }
     *         ]
     *     }
     * }</p>
     */
    @NameInMap("Spec")
    public String spec;

    public static CreateComponentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComponentRequest self = new CreateComponentRequest();
        return TeaModel.build(map, self);
    }

    public CreateComponentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateComponentRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateComponentRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
