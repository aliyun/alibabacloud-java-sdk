// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetKnowledgePropertiesPledgeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetKnowledgePropertiesPledgeResponseBody body;

    public static GetKnowledgePropertiesPledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgePropertiesPledgeResponse self = new GetKnowledgePropertiesPledgeResponse();
        return TeaModel.build(map, self);
    }

    public GetKnowledgePropertiesPledgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKnowledgePropertiesPledgeResponse setBody(GetKnowledgePropertiesPledgeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKnowledgePropertiesPledgeResponseBody getBody() {
        return this.body;
    }

}
