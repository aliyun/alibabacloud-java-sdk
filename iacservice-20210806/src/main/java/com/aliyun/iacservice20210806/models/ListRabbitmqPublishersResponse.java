// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListRabbitmqPublishersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListRabbitmqPublishersResponseBody body;

    public static ListRabbitmqPublishersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRabbitmqPublishersResponse self = new ListRabbitmqPublishersResponse();
        return TeaModel.build(map, self);
    }

    public ListRabbitmqPublishersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRabbitmqPublishersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRabbitmqPublishersResponse setBody(ListRabbitmqPublishersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRabbitmqPublishersResponseBody getBody() {
        return this.body;
    }

}
