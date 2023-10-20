// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetBatchTranslateByVPCResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBatchTranslateByVPCResponseBody body;

    public static GetBatchTranslateByVPCResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBatchTranslateByVPCResponse self = new GetBatchTranslateByVPCResponse();
        return TeaModel.build(map, self);
    }

    public GetBatchTranslateByVPCResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBatchTranslateByVPCResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBatchTranslateByVPCResponse setBody(GetBatchTranslateByVPCResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBatchTranslateByVPCResponseBody getBody() {
        return this.body;
    }

}
