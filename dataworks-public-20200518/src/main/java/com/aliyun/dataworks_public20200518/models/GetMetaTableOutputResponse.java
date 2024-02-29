// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableOutputResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMetaTableOutputResponseBody body;

    public static GetMetaTableOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableOutputResponse self = new GetMetaTableOutputResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaTableOutputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetaTableOutputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMetaTableOutputResponse setBody(GetMetaTableOutputResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetaTableOutputResponseBody getBody() {
        return this.body;
    }

}
