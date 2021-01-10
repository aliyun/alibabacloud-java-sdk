// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class TriggerCapturePictureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TriggerCapturePictureResponseBody body;

    public static TriggerCapturePictureResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerCapturePictureResponse self = new TriggerCapturePictureResponse();
        return TeaModel.build(map, self);
    }

    public TriggerCapturePictureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerCapturePictureResponse setBody(TriggerCapturePictureResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerCapturePictureResponseBody getBody() {
        return this.body;
    }

}
