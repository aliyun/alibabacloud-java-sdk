// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableDesignProjectInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTableDesignProjectInfoResponseBody body;

    public static GetTableDesignProjectInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableDesignProjectInfoResponse self = new GetTableDesignProjectInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetTableDesignProjectInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableDesignProjectInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTableDesignProjectInfoResponse setBody(GetTableDesignProjectInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableDesignProjectInfoResponseBody getBody() {
        return this.body;
    }

}
