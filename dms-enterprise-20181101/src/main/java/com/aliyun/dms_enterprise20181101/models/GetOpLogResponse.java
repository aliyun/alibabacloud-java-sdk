// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetOpLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOpLogResponseBody body;

    public static GetOpLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpLogResponse self = new GetOpLogResponse();
        return TeaModel.build(map, self);
    }

    public GetOpLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOpLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOpLogResponse setBody(GetOpLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOpLogResponseBody getBody() {
        return this.body;
    }

}
