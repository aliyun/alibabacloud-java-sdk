// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class AddApListToApgroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddApListToApgroupResponseBody body;

    public static AddApListToApgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddApListToApgroupResponse self = new AddApListToApgroupResponse();
        return TeaModel.build(map, self);
    }

    public AddApListToApgroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddApListToApgroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddApListToApgroupResponse setBody(AddApListToApgroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddApListToApgroupResponseBody getBody() {
        return this.body;
    }

}
