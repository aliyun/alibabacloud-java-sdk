// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteCollectionDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCollectionDataResponseBody body;

    public static DeleteCollectionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCollectionDataResponse self = new DeleteCollectionDataResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCollectionDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCollectionDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCollectionDataResponse setBody(DeleteCollectionDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCollectionDataResponseBody getBody() {
        return this.body;
    }

}
