// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RepayWithDesignatedTbUidResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RepayWithDesignatedTbUidResponseBody body;

    public static RepayWithDesignatedTbUidResponse build(java.util.Map<String, ?> map) throws Exception {
        RepayWithDesignatedTbUidResponse self = new RepayWithDesignatedTbUidResponse();
        return TeaModel.build(map, self);
    }

    public RepayWithDesignatedTbUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RepayWithDesignatedTbUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RepayWithDesignatedTbUidResponse setBody(RepayWithDesignatedTbUidResponseBody body) {
        this.body = body;
        return this;
    }
    public RepayWithDesignatedTbUidResponseBody getBody() {
        return this.body;
    }

}
