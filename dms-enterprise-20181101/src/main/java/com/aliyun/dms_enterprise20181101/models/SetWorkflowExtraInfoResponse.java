// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SetWorkflowExtraInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetWorkflowExtraInfoResponseBody body;

    public static SetWorkflowExtraInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SetWorkflowExtraInfoResponse self = new SetWorkflowExtraInfoResponse();
        return TeaModel.build(map, self);
    }

    public SetWorkflowExtraInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetWorkflowExtraInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetWorkflowExtraInfoResponse setBody(SetWorkflowExtraInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SetWorkflowExtraInfoResponseBody getBody() {
        return this.body;
    }

}
