// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class NotifyWithholdFundResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public NotifyWithholdFundResponseBody body;

    public static NotifyWithholdFundResponse build(java.util.Map<String, ?> map) throws Exception {
        NotifyWithholdFundResponse self = new NotifyWithholdFundResponse();
        return TeaModel.build(map, self);
    }

    public NotifyWithholdFundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NotifyWithholdFundResponse setBody(NotifyWithholdFundResponseBody body) {
        this.body = body;
        return this;
    }
    public NotifyWithholdFundResponseBody getBody() {
        return this.body;
    }

}
