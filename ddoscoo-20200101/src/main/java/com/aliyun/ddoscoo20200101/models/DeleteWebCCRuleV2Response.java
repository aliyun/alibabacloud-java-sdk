// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteWebCCRuleV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWebCCRuleV2ResponseBody body;

    public static DeleteWebCCRuleV2Response build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebCCRuleV2Response self = new DeleteWebCCRuleV2Response();
        return TeaModel.build(map, self);
    }

    public DeleteWebCCRuleV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWebCCRuleV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWebCCRuleV2Response setBody(DeleteWebCCRuleV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWebCCRuleV2ResponseBody getBody() {
        return this.body;
    }

}
