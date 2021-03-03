// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListRecentCallRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRecentCallRecordsResponseBody body;

    public static ListRecentCallRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecentCallRecordsResponse self = new ListRecentCallRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListRecentCallRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecentCallRecordsResponse setBody(ListRecentCallRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecentCallRecordsResponseBody getBody() {
        return this.body;
    }

}
