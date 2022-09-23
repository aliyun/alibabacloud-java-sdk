// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class UpdateGroupDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGroupDetailResponseBody body;

    public static UpdateGroupDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupDetailResponse self = new UpdateGroupDetailResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGroupDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGroupDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGroupDetailResponse setBody(UpdateGroupDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGroupDetailResponseBody getBody() {
        return this.body;
    }

}
