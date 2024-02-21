// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetDeliveryHistoryJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetDeliveryHistoryJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeliveryHistoryJobResponse setBody(GetDeliveryHistoryJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeliveryHistoryJobResponseBody getBody() {
        return this.body;
    }

}
