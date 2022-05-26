// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetAliyunIdByPkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAliyunIdByPkResponseBody body;

    public static GetAliyunIdByPkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAliyunIdByPkResponse self = new GetAliyunIdByPkResponse();
        return TeaModel.build(map, self);
    }

    public GetAliyunIdByPkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAliyunIdByPkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAliyunIdByPkResponse setBody(GetAliyunIdByPkResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAliyunIdByPkResponseBody getBody() {
        return this.body;
    }

}
