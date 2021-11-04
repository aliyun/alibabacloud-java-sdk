// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ListUserPointRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserPointRecordsResponseBody body;

    public static ListUserPointRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserPointRecordsResponse self = new ListUserPointRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserPointRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserPointRecordsResponse setBody(ListUserPointRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserPointRecordsResponseBody getBody() {
        return this.body;
    }

}
