// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetDpChGeneralCTBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDpChGeneralCTBResponseBody body;

    public static GetDpChGeneralCTBResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDpChGeneralCTBResponse self = new GetDpChGeneralCTBResponse();
        return TeaModel.build(map, self);
    }

    public GetDpChGeneralCTBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDpChGeneralCTBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDpChGeneralCTBResponse setBody(GetDpChGeneralCTBResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDpChGeneralCTBResponseBody getBody() {
        return this.body;
    }

}
