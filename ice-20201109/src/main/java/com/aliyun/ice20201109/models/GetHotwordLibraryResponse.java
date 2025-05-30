// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetHotwordLibraryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHotwordLibraryResponseBody body;

    public static GetHotwordLibraryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotwordLibraryResponse self = new GetHotwordLibraryResponse();
        return TeaModel.build(map, self);
    }

    public GetHotwordLibraryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotwordLibraryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotwordLibraryResponse setBody(GetHotwordLibraryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotwordLibraryResponseBody getBody() {
        return this.body;
    }

}
