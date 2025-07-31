// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GrantDataServiceApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantDataServiceApiResponseBody body;

    public static GrantDataServiceApiResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantDataServiceApiResponse self = new GrantDataServiceApiResponse();
        return TeaModel.build(map, self);
    }

    public GrantDataServiceApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantDataServiceApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantDataServiceApiResponse setBody(GrantDataServiceApiResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantDataServiceApiResponseBody getBody() {
        return this.body;
    }

}
