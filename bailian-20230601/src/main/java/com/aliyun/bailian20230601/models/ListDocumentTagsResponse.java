// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class ListDocumentTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDocumentTagsResponseBody body;

    public static ListDocumentTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDocumentTagsResponse self = new ListDocumentTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListDocumentTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDocumentTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDocumentTagsResponse setBody(ListDocumentTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDocumentTagsResponseBody getBody() {
        return this.body;
    }

}
