// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CopyThingModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CopyThingModelResponseBody body;

    public static CopyThingModelResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyThingModelResponse self = new CopyThingModelResponse();
        return TeaModel.build(map, self);
    }

    public CopyThingModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyThingModelResponse setBody(CopyThingModelResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyThingModelResponseBody getBody() {
        return this.body;
    }

}
