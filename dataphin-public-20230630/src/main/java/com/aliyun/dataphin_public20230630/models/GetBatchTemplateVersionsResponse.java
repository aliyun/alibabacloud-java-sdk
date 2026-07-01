// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBatchTemplateVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBatchTemplateVersionsResponseBody body;

    public static GetBatchTemplateVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBatchTemplateVersionsResponse self = new GetBatchTemplateVersionsResponse();
        return TeaModel.build(map, self);
    }

    public GetBatchTemplateVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBatchTemplateVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBatchTemplateVersionsResponse setBody(GetBatchTemplateVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBatchTemplateVersionsResponseBody getBody() {
        return this.body;
    }

}
