// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMembersResponseBody body;

    public static DescribeMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMembersResponse self = new DescribeMembersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMembersResponse setBody(DescribeMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMembersResponseBody getBody() {
        return this.body;
    }

}
