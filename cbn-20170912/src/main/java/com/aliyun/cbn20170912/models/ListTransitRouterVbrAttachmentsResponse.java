// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterVbrAttachmentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTransitRouterVbrAttachmentsResponseBody body;

    public static ListTransitRouterVbrAttachmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterVbrAttachmentsResponse self = new ListTransitRouterVbrAttachmentsResponse();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterVbrAttachmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTransitRouterVbrAttachmentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTransitRouterVbrAttachmentsResponse setBody(ListTransitRouterVbrAttachmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransitRouterVbrAttachmentsResponseBody getBody() {
        return this.body;
    }

}
