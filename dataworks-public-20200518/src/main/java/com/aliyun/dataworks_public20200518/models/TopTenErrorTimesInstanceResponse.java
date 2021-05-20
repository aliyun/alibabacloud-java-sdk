// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TopTenErrorTimesInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TopTenErrorTimesInstanceResponseBody body;

    public static TopTenErrorTimesInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        TopTenErrorTimesInstanceResponse self = new TopTenErrorTimesInstanceResponse();
        return TeaModel.build(map, self);
    }

    public TopTenErrorTimesInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TopTenErrorTimesInstanceResponse setBody(TopTenErrorTimesInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public TopTenErrorTimesInstanceResponseBody getBody() {
        return this.body;
    }

}
