// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class RevokeDataServiceApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeDataServiceApiResponseBody body;

    public static RevokeDataServiceApiResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeDataServiceApiResponse self = new RevokeDataServiceApiResponse();
        return TeaModel.build(map, self);
    }

    public RevokeDataServiceApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeDataServiceApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeDataServiceApiResponse setBody(RevokeDataServiceApiResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeDataServiceApiResponseBody getBody() {
        return this.body;
    }

}
