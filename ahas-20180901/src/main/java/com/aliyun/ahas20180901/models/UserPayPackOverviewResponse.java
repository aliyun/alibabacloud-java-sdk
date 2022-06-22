// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UserPayPackOverviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UserPayPackOverviewResponseBody body;

    public static UserPayPackOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        UserPayPackOverviewResponse self = new UserPayPackOverviewResponse();
        return TeaModel.build(map, self);
    }

    public UserPayPackOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UserPayPackOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UserPayPackOverviewResponse setBody(UserPayPackOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public UserPayPackOverviewResponseBody getBody() {
        return this.body;
    }

}
