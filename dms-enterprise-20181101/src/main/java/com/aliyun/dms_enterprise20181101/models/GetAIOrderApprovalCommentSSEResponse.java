// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetAIOrderApprovalCommentSSEResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAIOrderApprovalCommentSSEResponseBody body;

    public static GetAIOrderApprovalCommentSSEResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAIOrderApprovalCommentSSEResponse self = new GetAIOrderApprovalCommentSSEResponse();
        return TeaModel.build(map, self);
    }

    public GetAIOrderApprovalCommentSSEResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAIOrderApprovalCommentSSEResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAIOrderApprovalCommentSSEResponse setBody(GetAIOrderApprovalCommentSSEResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAIOrderApprovalCommentSSEResponseBody getBody() {
        return this.body;
    }

}
