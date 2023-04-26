// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListErAttachmentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListErAttachmentsResponseBody body;

    public static ListErAttachmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListErAttachmentsResponse self = new ListErAttachmentsResponse();
        return TeaModel.build(map, self);
    }

    public ListErAttachmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListErAttachmentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListErAttachmentsResponse setBody(ListErAttachmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListErAttachmentsResponseBody getBody() {
        return this.body;
    }

}
