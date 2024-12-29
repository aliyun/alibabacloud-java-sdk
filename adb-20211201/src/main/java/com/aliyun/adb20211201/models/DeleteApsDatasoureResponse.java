// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteApsDatasoureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteApsDatasoureResponseBody body;

    public static DeleteApsDatasoureResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApsDatasoureResponse self = new DeleteApsDatasoureResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApsDatasoureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApsDatasoureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApsDatasoureResponse setBody(DeleteApsDatasoureResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApsDatasoureResponseBody getBody() {
        return this.body;
    }

}
