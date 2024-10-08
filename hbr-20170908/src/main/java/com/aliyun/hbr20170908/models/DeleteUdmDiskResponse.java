// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteUdmDiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUdmDiskResponseBody body;

    public static DeleteUdmDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUdmDiskResponse self = new DeleteUdmDiskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUdmDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUdmDiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUdmDiskResponse setBody(DeleteUdmDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUdmDiskResponseBody getBody() {
        return this.body;
    }

}
