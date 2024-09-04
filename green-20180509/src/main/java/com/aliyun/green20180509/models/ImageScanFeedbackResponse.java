// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class ImageScanFeedbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImageScanFeedbackResponseBody body;

    public static ImageScanFeedbackResponse build(java.util.Map<String, ?> map) throws Exception {
        ImageScanFeedbackResponse self = new ImageScanFeedbackResponse();
        return TeaModel.build(map, self);
    }

    public ImageScanFeedbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImageScanFeedbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImageScanFeedbackResponse setBody(ImageScanFeedbackResponseBody body) {
        this.body = body;
        return this;
    }
    public ImageScanFeedbackResponseBody getBody() {
        return this.body;
    }

}
