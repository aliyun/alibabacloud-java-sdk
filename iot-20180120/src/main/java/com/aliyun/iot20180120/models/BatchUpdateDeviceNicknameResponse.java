// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchUpdateDeviceNicknameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchUpdateDeviceNicknameResponseBody body;

    public static BatchUpdateDeviceNicknameResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateDeviceNicknameResponse self = new BatchUpdateDeviceNicknameResponse();
        return TeaModel.build(map, self);
    }

    public BatchUpdateDeviceNicknameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUpdateDeviceNicknameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchUpdateDeviceNicknameResponse setBody(BatchUpdateDeviceNicknameResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUpdateDeviceNicknameResponseBody getBody() {
        return this.body;
    }

}
