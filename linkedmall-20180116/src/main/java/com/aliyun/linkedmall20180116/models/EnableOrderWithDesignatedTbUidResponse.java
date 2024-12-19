// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class EnableOrderWithDesignatedTbUidResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableOrderWithDesignatedTbUidResponseBody body;

    public static EnableOrderWithDesignatedTbUidResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableOrderWithDesignatedTbUidResponse self = new EnableOrderWithDesignatedTbUidResponse();
        return TeaModel.build(map, self);
    }

    public EnableOrderWithDesignatedTbUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableOrderWithDesignatedTbUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableOrderWithDesignatedTbUidResponse setBody(EnableOrderWithDesignatedTbUidResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableOrderWithDesignatedTbUidResponseBody getBody() {
        return this.body;
    }

}
