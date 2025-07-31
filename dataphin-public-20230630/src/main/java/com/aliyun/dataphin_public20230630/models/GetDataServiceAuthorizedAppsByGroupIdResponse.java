// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceAuthorizedAppsByGroupIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataServiceAuthorizedAppsByGroupIdResponseBody body;

    public static GetDataServiceAuthorizedAppsByGroupIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceAuthorizedAppsByGroupIdResponse self = new GetDataServiceAuthorizedAppsByGroupIdResponse();
        return TeaModel.build(map, self);
    }

    public GetDataServiceAuthorizedAppsByGroupIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataServiceAuthorizedAppsByGroupIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataServiceAuthorizedAppsByGroupIdResponse setBody(GetDataServiceAuthorizedAppsByGroupIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataServiceAuthorizedAppsByGroupIdResponseBody getBody() {
        return this.body;
    }

}
