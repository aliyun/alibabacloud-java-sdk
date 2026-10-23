// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateIndexTemplateRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must ensure that it is unique among different requests. The token can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name, index patterns, and configuration of the index template to be updated.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;indexTemplate&quot;:&quot;my-template&quot;,&quot;indexPatterns&quot;:[&quot;schema1*&quot;,&quot;schema2*&quot;],&quot;dataStream&quot;:true}</p>
     */
    @NameInMap("body")
    public String body;

    public static UpdateIndexTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIndexTemplateRequest self = new UpdateIndexTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIndexTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateIndexTemplateRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
