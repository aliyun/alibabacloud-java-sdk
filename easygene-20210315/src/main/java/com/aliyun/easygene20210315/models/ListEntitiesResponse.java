// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListEntitiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEntitiesResponseBody body;

    public static ListEntitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEntitiesResponse self = new ListEntitiesResponse();
        return TeaModel.build(map, self);
    }

    public ListEntitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEntitiesResponse setBody(ListEntitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEntitiesResponseBody getBody() {
        return this.body;
    }

}
