// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveRealtimeLogDeliveryDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListLiveRealtimeLogDeliveryDomainsResponseBody body;

    public static ListLiveRealtimeLogDeliveryDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRealtimeLogDeliveryDomainsResponse self = new ListLiveRealtimeLogDeliveryDomainsResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveRealtimeLogDeliveryDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLiveRealtimeLogDeliveryDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLiveRealtimeLogDeliveryDomainsResponse setBody(ListLiveRealtimeLogDeliveryDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveRealtimeLogDeliveryDomainsResponseBody getBody() {
        return this.body;
    }

}
