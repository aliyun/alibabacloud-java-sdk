// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class DrivingDirectionNovaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DrivingDirectionNovaResponseBody body;

    public static DrivingDirectionNovaResponse build(java.util.Map<String, ?> map) throws Exception {
        DrivingDirectionNovaResponse self = new DrivingDirectionNovaResponse();
        return TeaModel.build(map, self);
    }

    public DrivingDirectionNovaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DrivingDirectionNovaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DrivingDirectionNovaResponse setBody(DrivingDirectionNovaResponseBody body) {
        this.body = body;
        return this;
    }
    public DrivingDirectionNovaResponseBody getBody() {
        return this.body;
    }

}
