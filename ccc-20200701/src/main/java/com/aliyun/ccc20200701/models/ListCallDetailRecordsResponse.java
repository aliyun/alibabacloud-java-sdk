// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCallDetailRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCallDetailRecordsResponseBody body;

    public static ListCallDetailRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCallDetailRecordsResponse self = new ListCallDetailRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListCallDetailRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCallDetailRecordsResponse setBody(ListCallDetailRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCallDetailRecordsResponseBody getBody() {
        return this.body;
    }

}
