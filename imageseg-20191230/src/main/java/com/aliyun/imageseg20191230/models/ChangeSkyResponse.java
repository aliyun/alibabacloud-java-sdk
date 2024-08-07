// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class ChangeSkyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeSkyResponseBody body;

    public static ChangeSkyResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeSkyResponse self = new ChangeSkyResponse();
        return TeaModel.build(map, self);
    }

    public ChangeSkyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeSkyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeSkyResponse setBody(ChangeSkyResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeSkyResponseBody getBody() {
        return this.body;
    }

}
