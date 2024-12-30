// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetAdHocTaskLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAdHocTaskLogResponseBody body;

    public static GetAdHocTaskLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAdHocTaskLogResponse self = new GetAdHocTaskLogResponse();
        return TeaModel.build(map, self);
    }

    public GetAdHocTaskLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAdHocTaskLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAdHocTaskLogResponse setBody(GetAdHocTaskLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAdHocTaskLogResponseBody getBody() {
        return this.body;
    }

}
