// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DescribeSaslUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSaslUsersResponseBody body;

    public static DescribeSaslUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSaslUsersResponse self = new DescribeSaslUsersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSaslUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSaslUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSaslUsersResponse setBody(DescribeSaslUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSaslUsersResponseBody getBody() {
        return this.body;
    }

}
