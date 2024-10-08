// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteUdmEcsInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUdmEcsInstanceResponseBody body;

    public static DeleteUdmEcsInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUdmEcsInstanceResponse self = new DeleteUdmEcsInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUdmEcsInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUdmEcsInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUdmEcsInstanceResponse setBody(DeleteUdmEcsInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUdmEcsInstanceResponseBody getBody() {
        return this.body;
    }

}
