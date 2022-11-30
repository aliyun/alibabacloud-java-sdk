// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class OswTest1Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OswTest1ResponseBody body;

    public static OswTest1Response build(java.util.Map<String, ?> map) throws Exception {
        OswTest1Response self = new OswTest1Response();
        return TeaModel.build(map, self);
    }

    public OswTest1Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OswTest1Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OswTest1Response setBody(OswTest1ResponseBody body) {
        this.body = body;
        return this;
    }
    public OswTest1ResponseBody getBody() {
        return this.body;
    }

}
