// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class PutAppConfigAndSaveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutAppConfigAndSaveResponseBody body;

    public static PutAppConfigAndSaveResponse build(java.util.Map<String, ?> map) throws Exception {
        PutAppConfigAndSaveResponse self = new PutAppConfigAndSaveResponse();
        return TeaModel.build(map, self);
    }

    public PutAppConfigAndSaveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutAppConfigAndSaveResponse setBody(PutAppConfigAndSaveResponseBody body) {
        this.body = body;
        return this;
    }
    public PutAppConfigAndSaveResponseBody getBody() {
        return this.body;
    }

}
