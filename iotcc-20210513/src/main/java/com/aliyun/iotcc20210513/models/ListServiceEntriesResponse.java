// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListServiceEntriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListServiceEntriesResponseBody body;

    public static ListServiceEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceEntriesResponse self = new ListServiceEntriesResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceEntriesResponse setBody(ListServiceEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServiceEntriesResponseBody getBody() {
        return this.body;
    }

}
