// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchRegisterDeviceWithApplyIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchRegisterDeviceWithApplyIdResponseBody body;

    public static BatchRegisterDeviceWithApplyIdResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchRegisterDeviceWithApplyIdResponse self = new BatchRegisterDeviceWithApplyIdResponse();
        return TeaModel.build(map, self);
    }

    public BatchRegisterDeviceWithApplyIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchRegisterDeviceWithApplyIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchRegisterDeviceWithApplyIdResponse setBody(BatchRegisterDeviceWithApplyIdResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchRegisterDeviceWithApplyIdResponseBody getBody() {
        return this.body;
    }

}
