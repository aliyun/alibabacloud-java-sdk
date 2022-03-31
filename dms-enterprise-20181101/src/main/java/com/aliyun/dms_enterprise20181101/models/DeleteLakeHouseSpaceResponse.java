// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteLakeHouseSpaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteLakeHouseSpaceResponse setBody(DeleteLakeHouseSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLakeHouseSpaceResponseBody getBody() {
        return this.body;
    }

}
