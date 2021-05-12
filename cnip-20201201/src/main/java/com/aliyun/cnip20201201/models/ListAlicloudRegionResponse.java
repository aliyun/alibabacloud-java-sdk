// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListAlicloudRegionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAlicloudRegionResponseBody body;

    public static ListAlicloudRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlicloudRegionResponse self = new ListAlicloudRegionResponse();
        return TeaModel.build(map, self);
    }

    public ListAlicloudRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlicloudRegionResponse setBody(ListAlicloudRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlicloudRegionResponseBody getBody() {
        return this.body;
    }

}
