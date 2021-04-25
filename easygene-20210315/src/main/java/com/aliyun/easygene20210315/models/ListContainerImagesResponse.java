// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListContainerImagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListContainerImagesResponse setBody(ListContainerImagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContainerImagesResponseBody getBody() {
        return this.body;
    }

}
