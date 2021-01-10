// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveASRConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLiveASRConfigResponseBody body;

    public static AddLiveASRConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveASRConfigResponse self = new AddLiveASRConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveASRConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLiveASRConfigResponse setBody(AddLiveASRConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLiveASRConfigResponseBody getBody() {
        return this.body;
    }

}
