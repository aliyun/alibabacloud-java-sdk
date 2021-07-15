// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210715_103740905.models;

import com.aliyun.tea.*;

public class YxTestDynamicSpiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Integer body;

    public static YxTestDynamicSpiResponse build(java.util.Map<String, ?> map) throws Exception {
        YxTestDynamicSpiResponse self = new YxTestDynamicSpiResponse();
        return TeaModel.build(map, self);
    }

    public YxTestDynamicSpiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public YxTestDynamicSpiResponse setBody(Integer body) {
        this.body = body;
        return this;
    }
    public Integer getBody() {
        return this.body;
    }

}
