// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class CreateDeliveryHistoryJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDeliveryHistoryJobResponseBody body;

    public static CreateDeliveryHistoryJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliveryHistoryJobResponse self = new CreateDeliveryHistoryJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeliveryHistoryJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeliveryHistoryJobResponse setBody(CreateDeliveryHistoryJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeliveryHistoryJobResponseBody getBody() {
        return this.body;
    }

}
