// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListAvailableImagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAvailableImagesResponseBody body;

    public static ListAvailableImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableImagesResponse self = new ListAvailableImagesResponse();
        return TeaModel.build(map, self);
    }

    public ListAvailableImagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAvailableImagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAvailableImagesResponse setBody(ListAvailableImagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAvailableImagesResponseBody getBody() {
        return this.body;
    }

}
