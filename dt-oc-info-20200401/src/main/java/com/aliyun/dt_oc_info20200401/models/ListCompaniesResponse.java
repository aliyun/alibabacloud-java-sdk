// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class ListCompaniesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCompaniesResponseBody body;

    public static ListCompaniesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCompaniesResponse self = new ListCompaniesResponse();
        return TeaModel.build(map, self);
    }

    public ListCompaniesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCompaniesResponse setBody(ListCompaniesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCompaniesResponseBody getBody() {
        return this.body;
    }

}
