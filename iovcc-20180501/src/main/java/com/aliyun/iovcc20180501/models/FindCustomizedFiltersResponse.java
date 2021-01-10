// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindCustomizedFiltersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindCustomizedFiltersResponseBody body;

    public static FindCustomizedFiltersResponse build(java.util.Map<String, ?> map) throws Exception {
        FindCustomizedFiltersResponse self = new FindCustomizedFiltersResponse();
        return TeaModel.build(map, self);
    }

    public FindCustomizedFiltersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindCustomizedFiltersResponse setBody(FindCustomizedFiltersResponseBody body) {
        this.body = body;
        return this;
    }
    public FindCustomizedFiltersResponseBody getBody() {
        return this.body;
    }

}
