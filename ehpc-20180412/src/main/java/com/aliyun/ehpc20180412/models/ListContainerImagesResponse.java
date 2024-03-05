// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListContainerImagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListContainerImagesResponseBody body;

    public static ListContainerImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContainerImagesResponse self = new ListContainerImagesResponse();
        return TeaModel.build(map, self);
    }

    public ListContainerImagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContainerImagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListContainerImagesResponse setBody(ListContainerImagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContainerImagesResponseBody getBody() {
        return this.body;
    }

}
