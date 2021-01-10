// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyBasicAndBizItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyBasicAndBizItemsResponseBody body;

    public static ModifyBasicAndBizItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBasicAndBizItemsResponse self = new ModifyBasicAndBizItemsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBasicAndBizItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBasicAndBizItemsResponse setBody(ModifyBasicAndBizItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBasicAndBizItemsResponseBody getBody() {
        return this.body;
    }

}
