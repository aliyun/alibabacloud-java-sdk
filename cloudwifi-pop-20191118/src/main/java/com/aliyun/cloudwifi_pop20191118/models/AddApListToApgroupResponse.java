// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class AddApListToApgroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public AddApListToApgroupResponse setBody(AddApListToApgroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddApListToApgroupResponseBody getBody() {
        return this.body;
    }

}
