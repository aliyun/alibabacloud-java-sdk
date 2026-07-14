// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetWhatsappUserNameSuggestionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWhatsappUserNameSuggestionsResponseBody body;

    public static GetWhatsappUserNameSuggestionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWhatsappUserNameSuggestionsResponse self = new GetWhatsappUserNameSuggestionsResponse();
        return TeaModel.build(map, self);
    }

    public GetWhatsappUserNameSuggestionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWhatsappUserNameSuggestionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWhatsappUserNameSuggestionsResponse setBody(GetWhatsappUserNameSuggestionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWhatsappUserNameSuggestionsResponseBody getBody() {
        return this.body;
    }

}
