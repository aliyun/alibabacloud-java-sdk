// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceNetInfoForInnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDrdsInstanceNetInfoForInnerResponseBody body;

    public static DescribeDrdsInstanceNetInfoForInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceNetInfoForInnerResponse self = new DescribeDrdsInstanceNetInfoForInnerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceNetInfoForInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrdsInstanceNetInfoForInnerResponse setBody(DescribeDrdsInstanceNetInfoForInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsInstanceNetInfoForInnerResponseBody getBody() {
        return this.body;
    }

}
