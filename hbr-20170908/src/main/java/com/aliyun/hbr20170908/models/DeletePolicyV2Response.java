// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeletePolicyV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePolicyV2ResponseBody body;

    public static DeletePolicyV2Response build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyV2Response self = new DeletePolicyV2Response();
        return TeaModel.build(map, self);
    }

    public DeletePolicyV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePolicyV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePolicyV2Response setBody(DeletePolicyV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePolicyV2ResponseBody getBody() {
        return this.body;
    }

}
