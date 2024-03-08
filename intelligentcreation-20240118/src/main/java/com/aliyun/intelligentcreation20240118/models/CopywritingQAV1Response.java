// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class CopywritingQAV1Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DigitalHumanLiveBroadcastQAResult body;

    public static CopywritingQAV1Response build(java.util.Map<String, ?> map) throws Exception {
        CopywritingQAV1Response self = new CopywritingQAV1Response();
        return TeaModel.build(map, self);
    }

    public CopywritingQAV1Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopywritingQAV1Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopywritingQAV1Response setBody(DigitalHumanLiveBroadcastQAResult body) {
        this.body = body;
        return this;
    }
    public DigitalHumanLiveBroadcastQAResult getBody() {
        return this.body;
    }

}
