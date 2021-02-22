// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class ChangeSkyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ChangeSkyResponse setBody(ChangeSkyResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeSkyResponseBody getBody() {
        return this.body;
    }

}
