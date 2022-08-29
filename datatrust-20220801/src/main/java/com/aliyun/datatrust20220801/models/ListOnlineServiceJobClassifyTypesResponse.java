// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListOnlineServiceJobClassifyTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListOnlineServiceJobClassifyTypesResponseBody body;

    public static ListOnlineServiceJobClassifyTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOnlineServiceJobClassifyTypesResponse self = new ListOnlineServiceJobClassifyTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListOnlineServiceJobClassifyTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOnlineServiceJobClassifyTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOnlineServiceJobClassifyTypesResponse setBody(ListOnlineServiceJobClassifyTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOnlineServiceJobClassifyTypesResponseBody getBody() {
        return this.body;
    }

}
