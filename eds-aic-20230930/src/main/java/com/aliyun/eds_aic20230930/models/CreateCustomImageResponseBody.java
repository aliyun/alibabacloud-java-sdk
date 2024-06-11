// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateCustomImageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCustomImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomImageResponseBody self = new CreateCustomImageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
