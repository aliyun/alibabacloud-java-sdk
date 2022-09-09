// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DissociateParameterSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DissociateParameterSetResponseBody body;

    public static DissociateParameterSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DissociateParameterSetResponse self = new DissociateParameterSetResponse();
        return TeaModel.build(map, self);
    }

    public DissociateParameterSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DissociateParameterSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DissociateParameterSetResponse setBody(DissociateParameterSetResponseBody body) {
        this.body = body;
        return this;
    }
    public DissociateParameterSetResponseBody getBody() {
        return this.body;
    }

}
