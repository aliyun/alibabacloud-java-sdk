// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CreateSignResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSignResponseBody self = new CreateSignResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
