// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableDesignProjectFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTableDesignProjectFlowResponseBody body;

    public static GetTableDesignProjectFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableDesignProjectFlowResponse self = new GetTableDesignProjectFlowResponse();
        return TeaModel.build(map, self);
    }

    public GetTableDesignProjectFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableDesignProjectFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTableDesignProjectFlowResponse setBody(GetTableDesignProjectFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableDesignProjectFlowResponseBody getBody() {
        return this.body;
    }

}
