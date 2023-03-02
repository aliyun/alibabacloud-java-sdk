// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ListMPCoSPhaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListMPCoSPhaseResponseBody body;

    public static ListMPCoSPhaseResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMPCoSPhaseResponse self = new ListMPCoSPhaseResponse();
        return TeaModel.build(map, self);
    }

    public ListMPCoSPhaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMPCoSPhaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMPCoSPhaseResponse setBody(ListMPCoSPhaseResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMPCoSPhaseResponseBody getBody() {
        return this.body;
    }

}
