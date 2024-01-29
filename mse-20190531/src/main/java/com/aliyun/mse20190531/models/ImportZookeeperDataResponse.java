// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ImportZookeeperDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportZookeeperDataResponseBody body;

    public static ImportZookeeperDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportZookeeperDataResponse self = new ImportZookeeperDataResponse();
        return TeaModel.build(map, self);
    }

    public ImportZookeeperDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportZookeeperDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportZookeeperDataResponse setBody(ImportZookeeperDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportZookeeperDataResponseBody getBody() {
        return this.body;
    }

}
