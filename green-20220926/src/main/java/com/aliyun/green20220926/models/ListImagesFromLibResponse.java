// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListImagesFromLibResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListImagesFromLibResponseBody body;

    public static ListImagesFromLibResponse build(java.util.Map<String, ?> map) throws Exception {
        ListImagesFromLibResponse self = new ListImagesFromLibResponse();
        return TeaModel.build(map, self);
    }

    public ListImagesFromLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListImagesFromLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListImagesFromLibResponse setBody(ListImagesFromLibResponseBody body) {
        this.body = body;
        return this;
    }
    public ListImagesFromLibResponseBody getBody() {
        return this.body;
    }

}
