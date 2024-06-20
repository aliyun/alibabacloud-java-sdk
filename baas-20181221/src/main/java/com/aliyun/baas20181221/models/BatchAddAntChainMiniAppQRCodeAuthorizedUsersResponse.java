// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponseBody body;

    public static BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse self = new BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse();
        return TeaModel.build(map, self);
    }

    public BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse setBody(BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponseBody getBody() {
        return this.body;
    }

}
