// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class AddUserHdfsInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddUserHdfsInfoResponseBody body;

    public static AddUserHdfsInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserHdfsInfoResponse self = new AddUserHdfsInfoResponse();
        return TeaModel.build(map, self);
    }

    public AddUserHdfsInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUserHdfsInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddUserHdfsInfoResponse setBody(AddUserHdfsInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserHdfsInfoResponseBody getBody() {
        return this.body;
    }

}
