// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetAppAdaptorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAppAdaptorResponseBody body;

    public static GetAppAdaptorResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppAdaptorResponse self = new GetAppAdaptorResponse();
        return TeaModel.build(map, self);
    }

    public GetAppAdaptorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppAdaptorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppAdaptorResponse setBody(GetAppAdaptorResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppAdaptorResponseBody getBody() {
        return this.body;
    }

}
