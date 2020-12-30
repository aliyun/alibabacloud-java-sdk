// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDataSourceResponseBody body;

    public static ListDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceResponse self = new ListDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public ListDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataSourceResponse setBody(ListDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataSourceResponseBody getBody() {
        return this.body;
    }

}
