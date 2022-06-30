// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class ListSurveyResourcesDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSurveyResourcesDetailResponseBody body;

    public static ListSurveyResourcesDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSurveyResourcesDetailResponse self = new ListSurveyResourcesDetailResponse();
        return TeaModel.build(map, self);
    }

    public ListSurveyResourcesDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSurveyResourcesDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSurveyResourcesDetailResponse setBody(ListSurveyResourcesDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSurveyResourcesDetailResponseBody getBody() {
        return this.body;
    }

}
