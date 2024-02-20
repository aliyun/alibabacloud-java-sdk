// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImitatePhotoStyleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImitatePhotoStyleResponseBody body;

    public static ImitatePhotoStyleResponse build(java.util.Map<String, ?> map) throws Exception {
        ImitatePhotoStyleResponse self = new ImitatePhotoStyleResponse();
        return TeaModel.build(map, self);
    }

    public ImitatePhotoStyleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImitatePhotoStyleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImitatePhotoStyleResponse setBody(ImitatePhotoStyleResponseBody body) {
        this.body = body;
        return this;
    }
    public ImitatePhotoStyleResponseBody getBody() {
        return this.body;
    }

}
