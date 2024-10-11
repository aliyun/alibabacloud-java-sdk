// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetPhysicalInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPhysicalInstanceResponseBody body;

    public static GetPhysicalInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalInstanceResponse self = new GetPhysicalInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetPhysicalInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPhysicalInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPhysicalInstanceResponse setBody(GetPhysicalInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPhysicalInstanceResponseBody getBody() {
        return this.body;
    }

}
