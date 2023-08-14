// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListVoicemailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListVoicemailsResponseBody body;

    public static ListVoicemailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVoicemailsResponse self = new ListVoicemailsResponse();
        return TeaModel.build(map, self);
    }

    public ListVoicemailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVoicemailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVoicemailsResponse setBody(ListVoicemailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVoicemailsResponseBody getBody() {
        return this.body;
    }

}
