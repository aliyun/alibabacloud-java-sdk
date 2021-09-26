// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListMetaDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMetaDBResponseBody body;

    public static ListMetaDBResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMetaDBResponse self = new ListMetaDBResponse();
        return TeaModel.build(map, self);
    }

    public ListMetaDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMetaDBResponse setBody(ListMetaDBResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMetaDBResponseBody getBody() {
        return this.body;
    }

}
