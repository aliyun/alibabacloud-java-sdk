// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class PredictPictureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PredictPictureResponseBody body;

    public static PredictPictureResponse build(java.util.Map<String, ?> map) throws Exception {
        PredictPictureResponse self = new PredictPictureResponse();
        return TeaModel.build(map, self);
    }

    public PredictPictureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PredictPictureResponse setBody(PredictPictureResponseBody body) {
        this.body = body;
        return this;
    }
    public PredictPictureResponseBody getBody() {
        return this.body;
    }

}
