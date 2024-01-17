// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class CopyConsumerOpenForInnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CopyConsumerOpenForInnerResponseBody body;

    public static CopyConsumerOpenForInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyConsumerOpenForInnerResponse self = new CopyConsumerOpenForInnerResponse();
        return TeaModel.build(map, self);
    }

    public CopyConsumerOpenForInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyConsumerOpenForInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopyConsumerOpenForInnerResponse setBody(CopyConsumerOpenForInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyConsumerOpenForInnerResponseBody getBody() {
        return this.body;
    }

}
