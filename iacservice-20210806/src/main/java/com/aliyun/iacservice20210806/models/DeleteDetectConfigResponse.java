// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteDetectConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDetectConfigResponseBody body;

    public static DeleteDetectConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDetectConfigResponse self = new DeleteDetectConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDetectConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDetectConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDetectConfigResponse setBody(DeleteDetectConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDetectConfigResponseBody getBody() {
        return this.body;
    }

}
