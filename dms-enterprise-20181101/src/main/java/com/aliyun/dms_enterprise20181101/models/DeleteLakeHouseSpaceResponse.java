// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteLakeHouseSpaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLakeHouseSpaceResponseBody body;

    public static DeleteLakeHouseSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLakeHouseSpaceResponse self = new DeleteLakeHouseSpaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLakeHouseSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLakeHouseSpaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLakeHouseSpaceResponse setBody(DeleteLakeHouseSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLakeHouseSpaceResponseBody getBody() {
        return this.body;
    }

}
