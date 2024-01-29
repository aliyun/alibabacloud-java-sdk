// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetZookeeperDataImportUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetZookeeperDataImportUrlResponseBody body;

    public static GetZookeeperDataImportUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetZookeeperDataImportUrlResponse self = new GetZookeeperDataImportUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetZookeeperDataImportUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetZookeeperDataImportUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetZookeeperDataImportUrlResponse setBody(GetZookeeperDataImportUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetZookeeperDataImportUrlResponseBody getBody() {
        return this.body;
    }

}
