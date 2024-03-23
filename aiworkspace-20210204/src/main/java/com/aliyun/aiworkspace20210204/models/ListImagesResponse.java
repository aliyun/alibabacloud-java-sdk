// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListImagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListImagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListImagesResponse setBody(ListImagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListImagesResponseBody getBody() {
        return this.body;
    }

}
