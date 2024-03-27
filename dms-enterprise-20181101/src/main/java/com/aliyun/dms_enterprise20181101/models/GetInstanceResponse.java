// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceResponseBody body;

    public static GetInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponse self = new GetInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceResponse setBody(GetInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceResponseBody getBody() {
        return this.body;
    }

}
