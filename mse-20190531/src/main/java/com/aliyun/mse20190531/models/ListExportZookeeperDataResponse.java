// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListExportZookeeperDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExportZookeeperDataResponseBody body;

    public static ListExportZookeeperDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExportZookeeperDataResponse self = new ListExportZookeeperDataResponse();
        return TeaModel.build(map, self);
    }

    public ListExportZookeeperDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExportZookeeperDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExportZookeeperDataResponse setBody(ListExportZookeeperDataResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExportZookeeperDataResponseBody getBody() {
        return this.body;
    }

}
