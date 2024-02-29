// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TopTenErrorTimesInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public TopTenErrorTimesInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TopTenErrorTimesInstanceResponse setBody(TopTenErrorTimesInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public TopTenErrorTimesInstanceResponseBody getBody() {
        return this.body;
    }

}
