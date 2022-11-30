// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class DeleteSipTrunkApplyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSipTrunkApplyResponseBody body;

    public static DeleteSipTrunkApplyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSipTrunkApplyResponse self = new DeleteSipTrunkApplyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSipTrunkApplyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSipTrunkApplyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSipTrunkApplyResponse setBody(DeleteSipTrunkApplyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSipTrunkApplyResponseBody getBody() {
        return this.body;
    }

}
