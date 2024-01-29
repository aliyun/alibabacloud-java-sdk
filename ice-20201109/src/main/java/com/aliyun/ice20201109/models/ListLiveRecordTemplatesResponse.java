// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveRecordTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListLiveRecordTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLiveRecordTemplatesResponse setBody(ListLiveRecordTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveRecordTemplatesResponseBody getBody() {
        return this.body;
    }

}
