// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmdb20190515.models;

import com.aliyun.tea.*;

public class CmdbCommonPostAPIResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CmdbCommonPostAPIResponseBody body;

    public static CmdbCommonPostAPIResponse build(java.util.Map<String, ?> map) throws Exception {
        CmdbCommonPostAPIResponse self = new CmdbCommonPostAPIResponse();
        return TeaModel.build(map, self);
    }

    public CmdbCommonPostAPIResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CmdbCommonPostAPIResponse setBody(CmdbCommonPostAPIResponseBody body) {
        this.body = body;
        return this;
    }
    public CmdbCommonPostAPIResponseBody getBody() {
        return this.body;
    }

}
