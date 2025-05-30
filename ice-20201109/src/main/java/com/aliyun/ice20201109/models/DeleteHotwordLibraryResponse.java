// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteHotwordLibraryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHotwordLibraryResponseBody body;

    public static DeleteHotwordLibraryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHotwordLibraryResponse self = new DeleteHotwordLibraryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHotwordLibraryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHotwordLibraryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHotwordLibraryResponse setBody(DeleteHotwordLibraryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHotwordLibraryResponseBody getBody() {
        return this.body;
    }

}
