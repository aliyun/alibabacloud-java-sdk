// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetDpChGeneralStanfordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDpChGeneralStanfordResponseBody body;

    public static GetDpChGeneralStanfordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDpChGeneralStanfordResponse self = new GetDpChGeneralStanfordResponse();
        return TeaModel.build(map, self);
    }

    public GetDpChGeneralStanfordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDpChGeneralStanfordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDpChGeneralStanfordResponse setBody(GetDpChGeneralStanfordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDpChGeneralStanfordResponseBody getBody() {
        return this.body;
    }

}
