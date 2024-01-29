// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetDynamicImageJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDynamicImageJobResponseBody body;

    public static GetDynamicImageJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDynamicImageJobResponse self = new GetDynamicImageJobResponse();
        return TeaModel.build(map, self);
    }

    public GetDynamicImageJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDynamicImageJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDynamicImageJobResponse setBody(GetDynamicImageJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDynamicImageJobResponseBody getBody() {
        return this.body;
    }

}
