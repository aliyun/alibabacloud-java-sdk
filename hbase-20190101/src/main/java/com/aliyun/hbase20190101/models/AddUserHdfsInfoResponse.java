// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class AddUserHdfsInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddUserHdfsInfoResponse setBody(AddUserHdfsInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserHdfsInfoResponseBody getBody() {
        return this.body;
    }

}
