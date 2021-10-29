// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDrdsInstanceMonitorResponseBody body;

    public static DescribeDrdsInstanceMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceMonitorResponse self = new DescribeDrdsInstanceMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrdsInstanceMonitorResponse setBody(DescribeDrdsInstanceMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsInstanceMonitorResponseBody getBody() {
        return this.body;
    }

}
