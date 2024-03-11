// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class BatchSendMessageToGlobeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchSendMessageToGlobeResponseBody body;

    public static BatchSendMessageToGlobeResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchSendMessageToGlobeResponse self = new BatchSendMessageToGlobeResponse();
        return TeaModel.build(map, self);
    }

    public BatchSendMessageToGlobeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchSendMessageToGlobeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchSendMessageToGlobeResponse setBody(BatchSendMessageToGlobeResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSendMessageToGlobeResponseBody getBody() {
        return this.body;
    }

}
