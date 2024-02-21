// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DeleteTrailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTrailResponseBody body;

    public static DeleteTrailResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrailResponse self = new DeleteTrailResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTrailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTrailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTrailResponse setBody(DeleteTrailResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTrailResponseBody getBody() {
        return this.body;
    }

}
