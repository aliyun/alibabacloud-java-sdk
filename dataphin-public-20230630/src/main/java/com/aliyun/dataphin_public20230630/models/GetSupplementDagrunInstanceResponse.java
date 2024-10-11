// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetSupplementDagrunInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSupplementDagrunInstanceResponseBody body;

    public static GetSupplementDagrunInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSupplementDagrunInstanceResponse self = new GetSupplementDagrunInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetSupplementDagrunInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSupplementDagrunInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSupplementDagrunInstanceResponse setBody(GetSupplementDagrunInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSupplementDagrunInstanceResponseBody getBody() {
        return this.body;
    }

}
