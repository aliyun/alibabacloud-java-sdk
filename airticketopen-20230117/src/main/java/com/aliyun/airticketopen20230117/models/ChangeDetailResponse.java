// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeDetailResponseBody body;

    public static ChangeDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeDetailResponse self = new ChangeDetailResponse();
        return TeaModel.build(map, self);
    }

    public ChangeDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeDetailResponse setBody(ChangeDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeDetailResponseBody getBody() {
        return this.body;
    }

}
