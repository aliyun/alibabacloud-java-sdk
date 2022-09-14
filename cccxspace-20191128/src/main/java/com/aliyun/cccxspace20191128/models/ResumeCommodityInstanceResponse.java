// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class ResumeCommodityInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ResumeCommodityInstanceResponseBody body;

    public static ResumeCommodityInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeCommodityInstanceResponse self = new ResumeCommodityInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ResumeCommodityInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeCommodityInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeCommodityInstanceResponse setBody(ResumeCommodityInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeCommodityInstanceResponseBody getBody() {
        return this.body;
    }

}
