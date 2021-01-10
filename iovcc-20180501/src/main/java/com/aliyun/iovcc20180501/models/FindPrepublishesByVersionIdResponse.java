// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindPrepublishesByVersionIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindPrepublishesByVersionIdResponseBody body;

    public static FindPrepublishesByVersionIdResponse build(java.util.Map<String, ?> map) throws Exception {
        FindPrepublishesByVersionIdResponse self = new FindPrepublishesByVersionIdResponse();
        return TeaModel.build(map, self);
    }

    public FindPrepublishesByVersionIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindPrepublishesByVersionIdResponse setBody(FindPrepublishesByVersionIdResponseBody body) {
        this.body = body;
        return this;
    }
    public FindPrepublishesByVersionIdResponseBody getBody() {
        return this.body;
    }

}
