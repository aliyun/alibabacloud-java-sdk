// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteBizUnitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBizUnitResponseBody body;

    public static DeleteBizUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBizUnitResponse self = new DeleteBizUnitResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBizUnitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBizUnitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBizUnitResponse setBody(DeleteBizUnitResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBizUnitResponseBody getBody() {
        return this.body;
    }

}
