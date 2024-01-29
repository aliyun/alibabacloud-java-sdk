// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ExportZookeeperDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportZookeeperDataResponseBody body;

    public static ExportZookeeperDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportZookeeperDataResponse self = new ExportZookeeperDataResponse();
        return TeaModel.build(map, self);
    }

    public ExportZookeeperDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportZookeeperDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportZookeeperDataResponse setBody(ExportZookeeperDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportZookeeperDataResponseBody getBody() {
        return this.body;
    }

}
