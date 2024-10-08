// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class FilterUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FilterUsersResponseBody body;

    public static FilterUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        FilterUsersResponse self = new FilterUsersResponse();
        return TeaModel.build(map, self);
    }

    public FilterUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FilterUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FilterUsersResponse setBody(FilterUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public FilterUsersResponseBody getBody() {
        return this.body;
    }

}
