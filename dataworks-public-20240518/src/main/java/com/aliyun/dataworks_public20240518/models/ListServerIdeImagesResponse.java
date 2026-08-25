// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListServerIdeImagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServerIdeImagesResponseBody body;

    public static ListServerIdeImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServerIdeImagesResponse self = new ListServerIdeImagesResponse();
        return TeaModel.build(map, self);
    }

    public ListServerIdeImagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServerIdeImagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServerIdeImagesResponse setBody(ListServerIdeImagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServerIdeImagesResponseBody getBody() {
        return this.body;
    }

}
