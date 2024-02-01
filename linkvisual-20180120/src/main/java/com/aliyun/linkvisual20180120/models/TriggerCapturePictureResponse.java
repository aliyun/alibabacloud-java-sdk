// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class TriggerCapturePictureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public TriggerCapturePictureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TriggerCapturePictureResponse setBody(TriggerCapturePictureResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerCapturePictureResponseBody getBody() {
        return this.body;
    }

}
