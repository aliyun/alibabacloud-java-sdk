// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DescribeSaslUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeSaslUsersResponse setBody(DescribeSaslUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSaslUsersResponseBody getBody() {
        return this.body;
    }

}
