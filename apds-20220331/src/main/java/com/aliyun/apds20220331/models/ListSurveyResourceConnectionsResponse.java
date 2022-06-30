// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class ListSurveyResourceConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSurveyResourceConnectionsResponseBody body;

    public static ListSurveyResourceConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSurveyResourceConnectionsResponse self = new ListSurveyResourceConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public ListSurveyResourceConnectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSurveyResourceConnectionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSurveyResourceConnectionsResponse setBody(ListSurveyResourceConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSurveyResourceConnectionsResponseBody getBody() {
        return this.body;
    }

}
