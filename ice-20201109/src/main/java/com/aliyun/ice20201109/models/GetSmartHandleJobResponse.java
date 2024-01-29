// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetSmartHandleJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSmartHandleJobResponseBody body;

    public static GetSmartHandleJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSmartHandleJobResponse self = new GetSmartHandleJobResponse();
        return TeaModel.build(map, self);
    }

    public GetSmartHandleJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSmartHandleJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSmartHandleJobResponse setBody(GetSmartHandleJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSmartHandleJobResponseBody getBody() {
        return this.body;
    }

}
