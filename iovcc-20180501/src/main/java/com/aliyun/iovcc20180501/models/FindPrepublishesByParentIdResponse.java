// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindPrepublishesByParentIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindPrepublishesByParentIdResponseBody body;

    public static FindPrepublishesByParentIdResponse build(java.util.Map<String, ?> map) throws Exception {
        FindPrepublishesByParentIdResponse self = new FindPrepublishesByParentIdResponse();
        return TeaModel.build(map, self);
    }

    public FindPrepublishesByParentIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindPrepublishesByParentIdResponse setBody(FindPrepublishesByParentIdResponseBody body) {
        this.body = body;
        return this;
    }
    public FindPrepublishesByParentIdResponseBody getBody() {
        return this.body;
    }

}
