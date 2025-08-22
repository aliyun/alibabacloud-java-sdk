// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteAccessKeyInRecycleBinResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAccessKeyInRecycleBinResponseBody body;

    public static DeleteAccessKeyInRecycleBinResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessKeyInRecycleBinResponse self = new DeleteAccessKeyInRecycleBinResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAccessKeyInRecycleBinResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAccessKeyInRecycleBinResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAccessKeyInRecycleBinResponse setBody(DeleteAccessKeyInRecycleBinResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAccessKeyInRecycleBinResponseBody getBody() {
        return this.body;
    }

}
