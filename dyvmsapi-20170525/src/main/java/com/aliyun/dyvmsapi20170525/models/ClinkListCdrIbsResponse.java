// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkListCdrIbsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClinkListCdrIbsResponseBody body;

    public static ClinkListCdrIbsResponse build(java.util.Map<String, ?> map) throws Exception {
        ClinkListCdrIbsResponse self = new ClinkListCdrIbsResponse();
        return TeaModel.build(map, self);
    }

    public ClinkListCdrIbsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClinkListCdrIbsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClinkListCdrIbsResponse setBody(ClinkListCdrIbsResponseBody body) {
        this.body = body;
        return this;
    }
    public ClinkListCdrIbsResponseBody getBody() {
        return this.body;
    }

}
