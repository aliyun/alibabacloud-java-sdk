// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ListRealtimeLogDeliveryDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRealtimeLogDeliveryDomainsResponseBody body;

    public static ListRealtimeLogDeliveryDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRealtimeLogDeliveryDomainsResponse self = new ListRealtimeLogDeliveryDomainsResponse();
        return TeaModel.build(map, self);
    }

    public ListRealtimeLogDeliveryDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRealtimeLogDeliveryDomainsResponse setBody(ListRealtimeLogDeliveryDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRealtimeLogDeliveryDomainsResponseBody getBody() {
        return this.body;
    }

}
