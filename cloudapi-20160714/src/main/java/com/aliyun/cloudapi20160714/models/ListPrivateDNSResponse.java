// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ListPrivateDNSResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPrivateDNSResponseBody body;

    public static ListPrivateDNSResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateDNSResponse self = new ListPrivateDNSResponse();
        return TeaModel.build(map, self);
    }

    public ListPrivateDNSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrivateDNSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrivateDNSResponse setBody(ListPrivateDNSResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrivateDNSResponseBody getBody() {
        return this.body;
    }

}
