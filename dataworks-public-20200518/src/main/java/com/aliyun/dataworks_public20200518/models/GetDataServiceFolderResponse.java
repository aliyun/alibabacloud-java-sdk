// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServiceFolderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataServiceFolderResponseBody body;

    public static GetDataServiceFolderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceFolderResponse self = new GetDataServiceFolderResponse();
        return TeaModel.build(map, self);
    }

    public GetDataServiceFolderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataServiceFolderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataServiceFolderResponse setBody(GetDataServiceFolderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataServiceFolderResponseBody getBody() {
        return this.body;
    }

}
