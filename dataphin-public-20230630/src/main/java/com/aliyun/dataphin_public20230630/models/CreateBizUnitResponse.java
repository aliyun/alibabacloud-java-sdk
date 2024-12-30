// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateBizUnitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBizUnitResponseBody body;

    public static CreateBizUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBizUnitResponse self = new CreateBizUnitResponse();
        return TeaModel.build(map, self);
    }

    public CreateBizUnitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBizUnitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBizUnitResponse setBody(CreateBizUnitResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBizUnitResponseBody getBody() {
        return this.body;
    }

}
