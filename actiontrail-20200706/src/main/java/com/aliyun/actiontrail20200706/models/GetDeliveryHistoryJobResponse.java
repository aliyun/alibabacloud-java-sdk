// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetDeliveryHistoryJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeliveryHistoryJobResponseBody body;

    public static GetDeliveryHistoryJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeliveryHistoryJobResponse self = new GetDeliveryHistoryJobResponse();
        return TeaModel.build(map, self);
    }

    public GetDeliveryHistoryJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeliveryHistoryJobResponse setBody(GetDeliveryHistoryJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeliveryHistoryJobResponseBody getBody() {
        return this.body;
    }

}
