// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccClassificationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCsccClassificationsResponseBody body;

    public static ListCsccClassificationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCsccClassificationsResponse self = new ListCsccClassificationsResponse();
        return TeaModel.build(map, self);
    }

    public ListCsccClassificationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCsccClassificationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCsccClassificationsResponse setBody(ListCsccClassificationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCsccClassificationsResponseBody getBody() {
        return this.body;
    }

}
