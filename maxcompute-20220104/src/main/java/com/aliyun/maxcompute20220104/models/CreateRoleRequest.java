// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateRoleRequest extends TeaModel {
    /**
     * <p>The request body parameters. For valid values, see <a href="https://help.aliyun.com/document_detail/27935.html">MaxCompute permissions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;: &quot;role_name&quot;,&quot;type&quot;: &quot;resource/admin&quot;,&quot;policy&quot;: &quot;&quot;, //policy content. Not required if the type is acl.&quot;acl&quot;: { // Not required if the type is policy.&quot;table&quot;: [{&quot;name&quot;: &quot;&quot;, &quot;actions&quot;:[&quot;&quot;,&quot;&quot;,]}, {&quot;name&quot;: &quot;&quot;, &quot;actions&quot;:[]}],&quot;resource&quot;:[{&quot;name&quot;: &quot;&quot;, &quot;actions&quot;:[&quot;&quot;,&quot;&quot;,]}, {&quot;name&quot;: &quot;&quot;, &quot;actions&quot;:[]}],&quot;function&quot;:[{&quot;name&quot;: &quot;&quot;, &quot;actions&quot;:[&quot;&quot;,&quot;&quot;,]}, {&quot;name&quot;: &quot;&quot;, &quot;actions&quot;:[]}],&quot;package&quot;:[{&quot;name&quot;: &quot;&quot;, &quot;actions&quot;:[&quot;&quot;,&quot;&quot;,]}, {&quot;name&quot;: &quot;&quot;, &quot;actions&quot;:[]}],&quot;project&quot;:[{&quot;name&quot;: &quot;&quot;, &quot;actions&quot;:[]}], //Only the current project is available on the console.&quot;instance&quot;:[{&quot;name&quot;: &quot;&quot;, &quot;actions&quot;:[]}] //Only * is supported for the name. }}// * is supported for the name.</p>
     */
    @NameInMap("body")
    public String body;

    public static CreateRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRoleRequest self = new CreateRoleRequest();
        return TeaModel.build(map, self);
    }

    public CreateRoleRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
