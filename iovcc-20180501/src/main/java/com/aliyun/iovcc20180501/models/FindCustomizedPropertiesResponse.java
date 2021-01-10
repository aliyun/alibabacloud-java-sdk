// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindCustomizedPropertiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindCustomizedPropertiesResponseBody body;

    public static FindCustomizedPropertiesResponse build(java.util.Map<String, ?> map) throws Exception {
        FindCustomizedPropertiesResponse self = new FindCustomizedPropertiesResponse();
        return TeaModel.build(map, self);
    }

    public FindCustomizedPropertiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindCustomizedPropertiesResponse setBody(FindCustomizedPropertiesResponseBody body) {
        this.body = body;
        return this;
    }
    public FindCustomizedPropertiesResponseBody getBody() {
        return this.body;
    }

}
