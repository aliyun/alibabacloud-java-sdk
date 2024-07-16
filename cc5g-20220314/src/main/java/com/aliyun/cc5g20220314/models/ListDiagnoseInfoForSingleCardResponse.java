// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListDiagnoseInfoForSingleCardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDiagnoseInfoForSingleCardResponseBody body;

    public static ListDiagnoseInfoForSingleCardResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnoseInfoForSingleCardResponse self = new ListDiagnoseInfoForSingleCardResponse();
        return TeaModel.build(map, self);
    }

    public ListDiagnoseInfoForSingleCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDiagnoseInfoForSingleCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDiagnoseInfoForSingleCardResponse setBody(ListDiagnoseInfoForSingleCardResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDiagnoseInfoForSingleCardResponseBody getBody() {
        return this.body;
    }

}
