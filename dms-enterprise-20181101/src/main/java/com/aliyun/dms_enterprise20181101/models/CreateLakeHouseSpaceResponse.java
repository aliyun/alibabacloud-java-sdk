// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateLakeHouseSpaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLakeHouseSpaceResponseBody body;

    public static CreateLakeHouseSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLakeHouseSpaceResponse self = new CreateLakeHouseSpaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateLakeHouseSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLakeHouseSpaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLakeHouseSpaceResponse setBody(CreateLakeHouseSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLakeHouseSpaceResponseBody getBody() {
        return this.body;
    }

}
