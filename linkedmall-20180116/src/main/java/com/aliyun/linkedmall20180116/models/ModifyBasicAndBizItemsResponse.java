// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyBasicAndBizItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyBasicAndBizItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBasicAndBizItemsResponse setBody(ModifyBasicAndBizItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBasicAndBizItemsResponseBody getBody() {
        return this.body;
    }

}
