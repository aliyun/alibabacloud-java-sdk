// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class UpdateAclGroupCidrsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAclGroupCidrsResponseBody body;

    public static UpdateAclGroupCidrsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAclGroupCidrsResponse self = new UpdateAclGroupCidrsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAclGroupCidrsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAclGroupCidrsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAclGroupCidrsResponse setBody(UpdateAclGroupCidrsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAclGroupCidrsResponseBody getBody() {
        return this.body;
    }

}
