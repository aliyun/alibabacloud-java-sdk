// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20181219.models;

import com.aliyun.tea.*;

public class ARMSQueryDataSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ARMSQueryDataSetResponseBody body;

    public static ARMSQueryDataSetResponse build(java.util.Map<String, ?> map) throws Exception {
        ARMSQueryDataSetResponse self = new ARMSQueryDataSetResponse();
        return TeaModel.build(map, self);
    }

    public ARMSQueryDataSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ARMSQueryDataSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ARMSQueryDataSetResponse setBody(ARMSQueryDataSetResponseBody body) {
        this.body = body;
        return this;
    }
    public ARMSQueryDataSetResponseBody getBody() {
        return this.body;
    }

}
