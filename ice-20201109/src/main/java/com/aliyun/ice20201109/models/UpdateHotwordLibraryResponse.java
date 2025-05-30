// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateHotwordLibraryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHotwordLibraryResponseBody body;

    public static UpdateHotwordLibraryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHotwordLibraryResponse self = new UpdateHotwordLibraryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHotwordLibraryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHotwordLibraryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHotwordLibraryResponse setBody(UpdateHotwordLibraryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHotwordLibraryResponseBody getBody() {
        return this.body;
    }

}
