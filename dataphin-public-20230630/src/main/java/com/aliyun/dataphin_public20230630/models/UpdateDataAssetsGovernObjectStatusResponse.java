// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateDataAssetsGovernObjectStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataAssetsGovernObjectStatusResponseBody body;

    public static UpdateDataAssetsGovernObjectStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataAssetsGovernObjectStatusResponse self = new UpdateDataAssetsGovernObjectStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataAssetsGovernObjectStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataAssetsGovernObjectStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataAssetsGovernObjectStatusResponse setBody(UpdateDataAssetsGovernObjectStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataAssetsGovernObjectStatusResponseBody getBody() {
        return this.body;
    }

}
