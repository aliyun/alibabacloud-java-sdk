// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateBizUnitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBizUnitResponseBody body;

    public static UpdateBizUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBizUnitResponse self = new UpdateBizUnitResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBizUnitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBizUnitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBizUnitResponse setBody(UpdateBizUnitResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBizUnitResponseBody getBody() {
        return this.body;
    }

}
