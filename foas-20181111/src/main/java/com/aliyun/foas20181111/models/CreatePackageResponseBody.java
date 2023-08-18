// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class CreatePackageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePackageResponseBody self = new CreatePackageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
