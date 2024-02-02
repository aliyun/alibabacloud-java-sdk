// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RecognizePictureGeneralResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizePictureGeneralResponseBody body;

    public static RecognizePictureGeneralResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizePictureGeneralResponse self = new RecognizePictureGeneralResponse();
        return TeaModel.build(map, self);
    }

    public RecognizePictureGeneralResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizePictureGeneralResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizePictureGeneralResponse setBody(RecognizePictureGeneralResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizePictureGeneralResponseBody getBody() {
        return this.body;
    }

}
