// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class AddProductVersionConfigResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static AddProductVersionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddProductVersionConfigResponseBody self = new AddProductVersionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public AddProductVersionConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
