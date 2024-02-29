// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceAuthorizedApisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataServiceAuthorizedApisResponseBody body;

    public static ListDataServiceAuthorizedApisResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceAuthorizedApisResponse self = new ListDataServiceAuthorizedApisResponse();
        return TeaModel.build(map, self);
    }

    public ListDataServiceAuthorizedApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataServiceAuthorizedApisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataServiceAuthorizedApisResponse setBody(ListDataServiceAuthorizedApisResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataServiceAuthorizedApisResponseBody getBody() {
        return this.body;
    }

}
