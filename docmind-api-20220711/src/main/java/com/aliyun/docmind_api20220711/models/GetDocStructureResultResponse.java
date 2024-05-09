// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class GetDocStructureResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDocStructureResultResponseBody body;

    public static GetDocStructureResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocStructureResultResponse self = new GetDocStructureResultResponse();
        return TeaModel.build(map, self);
    }

    public GetDocStructureResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocStructureResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDocStructureResultResponse setBody(GetDocStructureResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocStructureResultResponseBody getBody() {
        return this.body;
    }

}
