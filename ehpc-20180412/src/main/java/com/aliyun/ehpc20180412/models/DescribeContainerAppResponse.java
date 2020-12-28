// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeContainerAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeContainerAppResponseBody body;

    public static DescribeContainerAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerAppResponse self = new DescribeContainerAppResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContainerAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContainerAppResponse setBody(DescribeContainerAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContainerAppResponseBody getBody() {
        return this.body;
    }

}
