// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListCmsInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCmsInstancesResponseBody body;

    public static ListCmsInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCmsInstancesResponse self = new ListCmsInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListCmsInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCmsInstancesResponse setBody(ListCmsInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCmsInstancesResponseBody getBody() {
        return this.body;
    }

}
