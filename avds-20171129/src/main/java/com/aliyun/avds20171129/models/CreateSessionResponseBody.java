// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class CreateSessionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSessionResponseBody self = new CreateSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
