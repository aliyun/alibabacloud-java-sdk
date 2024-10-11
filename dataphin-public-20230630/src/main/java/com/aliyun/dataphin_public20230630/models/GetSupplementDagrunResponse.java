// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetSupplementDagrunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSupplementDagrunResponseBody body;

    public static GetSupplementDagrunResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSupplementDagrunResponse self = new GetSupplementDagrunResponse();
        return TeaModel.build(map, self);
    }

    public GetSupplementDagrunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSupplementDagrunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSupplementDagrunResponse setBody(GetSupplementDagrunResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSupplementDagrunResponseBody getBody() {
        return this.body;
    }

}
