// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetApprovalTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApprovalTaskDetailResponseBody body;

    public static GetApprovalTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApprovalTaskDetailResponse self = new GetApprovalTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetApprovalTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApprovalTaskDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApprovalTaskDetailResponse setBody(GetApprovalTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApprovalTaskDetailResponseBody getBody() {
        return this.body;
    }

}
