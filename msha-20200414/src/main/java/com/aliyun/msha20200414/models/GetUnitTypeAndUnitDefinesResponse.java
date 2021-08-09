// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class GetUnitTypeAndUnitDefinesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUnitTypeAndUnitDefinesResponseBody body;

    public static GetUnitTypeAndUnitDefinesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUnitTypeAndUnitDefinesResponse self = new GetUnitTypeAndUnitDefinesResponse();
        return TeaModel.build(map, self);
    }

    public GetUnitTypeAndUnitDefinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUnitTypeAndUnitDefinesResponse setBody(GetUnitTypeAndUnitDefinesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUnitTypeAndUnitDefinesResponseBody getBody() {
        return this.body;
    }

}
