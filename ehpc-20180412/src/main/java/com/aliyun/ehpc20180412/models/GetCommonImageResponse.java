// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetCommonImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCommonImageResponseBody body;

    public static GetCommonImageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCommonImageResponse self = new GetCommonImageResponse();
        return TeaModel.build(map, self);
    }

    public GetCommonImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCommonImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCommonImageResponse setBody(GetCommonImageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCommonImageResponseBody getBody() {
        return this.body;
    }

}
