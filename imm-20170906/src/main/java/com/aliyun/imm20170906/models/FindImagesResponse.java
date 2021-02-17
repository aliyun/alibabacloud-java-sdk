// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class FindImagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindImagesResponseBody body;

    public static FindImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        FindImagesResponse self = new FindImagesResponse();
        return TeaModel.build(map, self);
    }

    public FindImagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindImagesResponse setBody(FindImagesResponseBody body) {
        this.body = body;
        return this;
    }
    public FindImagesResponseBody getBody() {
        return this.body;
    }

}
