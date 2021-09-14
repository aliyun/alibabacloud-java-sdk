// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class ListImagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListImagesResponseBody body;

    public static ListImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListImagesResponse self = new ListImagesResponse();
        return TeaModel.build(map, self);
    }

    public ListImagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListImagesResponse setBody(ListImagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListImagesResponseBody getBody() {
        return this.body;
    }

}
