// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListMaterialDocumentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListMaterialDocumentsResponseBody body;

    public static ListMaterialDocumentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMaterialDocumentsResponse self = new ListMaterialDocumentsResponse();
        return TeaModel.build(map, self);
    }

    public ListMaterialDocumentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMaterialDocumentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMaterialDocumentsResponse setBody(ListMaterialDocumentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMaterialDocumentsResponseBody getBody() {
        return this.body;
    }

}
