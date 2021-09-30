// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateClassResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateClassResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateClassResponseBody self = new UpdateClassResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateClassResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
