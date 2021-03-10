// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteOTAFirmwareResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteOTAFirmwareResponseBody body;

    public static DeleteOTAFirmwareResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOTAFirmwareResponse self = new DeleteOTAFirmwareResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOTAFirmwareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOTAFirmwareResponse setBody(DeleteOTAFirmwareResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOTAFirmwareResponseBody getBody() {
        return this.body;
    }

}
