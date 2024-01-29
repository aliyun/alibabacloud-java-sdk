// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListWorkitemAttachmentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkitemAttachmentsResponseBody body;

    public static ListWorkitemAttachmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkitemAttachmentsResponse self = new ListWorkitemAttachmentsResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkitemAttachmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkitemAttachmentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkitemAttachmentsResponse setBody(ListWorkitemAttachmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkitemAttachmentsResponseBody getBody() {
        return this.body;
    }

}
