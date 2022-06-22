// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SearchApplicationHostsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchApplicationHostsResponseBody body;

    public static SearchApplicationHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchApplicationHostsResponse self = new SearchApplicationHostsResponse();
        return TeaModel.build(map, self);
    }

    public SearchApplicationHostsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchApplicationHostsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchApplicationHostsResponse setBody(SearchApplicationHostsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchApplicationHostsResponseBody getBody() {
        return this.body;
    }

}
