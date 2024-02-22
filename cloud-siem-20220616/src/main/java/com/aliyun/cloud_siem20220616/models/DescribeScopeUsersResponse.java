// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeScopeUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScopeUsersResponseBody body;

    public static DescribeScopeUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScopeUsersResponse self = new DescribeScopeUsersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScopeUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScopeUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScopeUsersResponse setBody(DescribeScopeUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScopeUsersResponseBody getBody() {
        return this.body;
    }

}
