// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeCcZoneBlockConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCcZoneBlockConfigResponseBody body;

    public static DescribeCcZoneBlockConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcZoneBlockConfigResponse self = new DescribeCcZoneBlockConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCcZoneBlockConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCcZoneBlockConfigResponse setBody(DescribeCcZoneBlockConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCcZoneBlockConfigResponseBody getBody() {
        return this.body;
    }

}
