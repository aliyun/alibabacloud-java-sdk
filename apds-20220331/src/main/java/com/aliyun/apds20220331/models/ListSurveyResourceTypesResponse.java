// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class ListSurveyResourceTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSurveyResourceTypesResponseBody body;

    public static ListSurveyResourceTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSurveyResourceTypesResponse self = new ListSurveyResourceTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListSurveyResourceTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSurveyResourceTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSurveyResourceTypesResponse setBody(ListSurveyResourceTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSurveyResourceTypesResponseBody getBody() {
        return this.body;
    }

}
