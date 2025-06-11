// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableKnowledgeInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTableKnowledgeInfoResponseBody body;

    public static GetTableKnowledgeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableKnowledgeInfoResponse self = new GetTableKnowledgeInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetTableKnowledgeInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableKnowledgeInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTableKnowledgeInfoResponse setBody(GetTableKnowledgeInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableKnowledgeInfoResponseBody getBody() {
        return this.body;
    }

}
