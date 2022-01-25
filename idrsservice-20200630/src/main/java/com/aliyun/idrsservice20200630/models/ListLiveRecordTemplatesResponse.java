// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListLiveRecordTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLiveRecordTemplatesResponseBody body;

    public static ListLiveRecordTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRecordTemplatesResponse self = new ListLiveRecordTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveRecordTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLiveRecordTemplatesResponse setBody(ListLiveRecordTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveRecordTemplatesResponseBody getBody() {
        return this.body;
    }

}
