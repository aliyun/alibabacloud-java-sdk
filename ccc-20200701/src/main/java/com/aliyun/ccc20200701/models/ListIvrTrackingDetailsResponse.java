// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListIvrTrackingDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListIvrTrackingDetailsResponseBody body;

    public static ListIvrTrackingDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIvrTrackingDetailsResponse self = new ListIvrTrackingDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListIvrTrackingDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIvrTrackingDetailsResponse setBody(ListIvrTrackingDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIvrTrackingDetailsResponseBody getBody() {
        return this.body;
    }

}
