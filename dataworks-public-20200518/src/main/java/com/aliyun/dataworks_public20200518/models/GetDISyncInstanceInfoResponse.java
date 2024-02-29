// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDISyncInstanceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDISyncInstanceInfoResponseBody body;

    public static GetDISyncInstanceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDISyncInstanceInfoResponse self = new GetDISyncInstanceInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDISyncInstanceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDISyncInstanceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDISyncInstanceInfoResponse setBody(GetDISyncInstanceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDISyncInstanceInfoResponseBody getBody() {
        return this.body;
    }

}
