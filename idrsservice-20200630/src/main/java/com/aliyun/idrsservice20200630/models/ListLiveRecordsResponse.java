// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListLiveRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLiveRecordsResponseBody body;

    public static ListLiveRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRecordsResponse self = new ListLiveRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLiveRecordsResponse setBody(ListLiveRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveRecordsResponseBody getBody() {
        return this.body;
    }

}
