// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitVideoGifJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitVideoGifJobResponseBody body;

    public static SubmitVideoGifJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoGifJobResponse self = new SubmitVideoGifJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitVideoGifJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitVideoGifJobResponse setBody(SubmitVideoGifJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitVideoGifJobResponseBody getBody() {
        return this.body;
    }

}
