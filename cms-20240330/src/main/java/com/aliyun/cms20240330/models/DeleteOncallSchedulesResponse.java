// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteOncallSchedulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOncallSchedulesResponseBody body;

    public static DeleteOncallSchedulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOncallSchedulesResponse self = new DeleteOncallSchedulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOncallSchedulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOncallSchedulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOncallSchedulesResponse setBody(DeleteOncallSchedulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOncallSchedulesResponseBody getBody() {
        return this.body;
    }

}
