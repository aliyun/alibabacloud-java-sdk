// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListRecentCallDetailRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRecentCallDetailRecordsResponseBody body;

    public static ListRecentCallDetailRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecentCallDetailRecordsResponse self = new ListRecentCallDetailRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListRecentCallDetailRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecentCallDetailRecordsResponse setBody(ListRecentCallDetailRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecentCallDetailRecordsResponseBody getBody() {
        return this.body;
    }

}
