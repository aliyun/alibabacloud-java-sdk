// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteStandardLookupTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStandardLookupTableResponseBody body;

    public static DeleteStandardLookupTableResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStandardLookupTableResponse self = new DeleteStandardLookupTableResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStandardLookupTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStandardLookupTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStandardLookupTableResponse setBody(DeleteStandardLookupTableResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStandardLookupTableResponseBody getBody() {
        return this.body;
    }

}
