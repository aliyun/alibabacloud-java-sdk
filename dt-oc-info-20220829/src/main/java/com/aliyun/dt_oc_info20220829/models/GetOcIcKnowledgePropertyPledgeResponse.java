// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcKnowledgePropertyPledgeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcIcKnowledgePropertyPledgeResponseBody body;

    public static GetOcIcKnowledgePropertyPledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcKnowledgePropertyPledgeResponse self = new GetOcIcKnowledgePropertyPledgeResponse();
        return TeaModel.build(map, self);
    }

    public GetOcIcKnowledgePropertyPledgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcIcKnowledgePropertyPledgeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcIcKnowledgePropertyPledgeResponse setBody(GetOcIcKnowledgePropertyPledgeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcIcKnowledgePropertyPledgeResponseBody getBody() {
        return this.body;
    }

}
