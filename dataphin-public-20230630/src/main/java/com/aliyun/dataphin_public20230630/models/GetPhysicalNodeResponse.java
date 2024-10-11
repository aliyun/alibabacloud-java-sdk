// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetPhysicalNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPhysicalNodeResponseBody body;

    public static GetPhysicalNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalNodeResponse self = new GetPhysicalNodeResponse();
        return TeaModel.build(map, self);
    }

    public GetPhysicalNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPhysicalNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPhysicalNodeResponse setBody(GetPhysicalNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPhysicalNodeResponseBody getBody() {
        return this.body;
    }

}
