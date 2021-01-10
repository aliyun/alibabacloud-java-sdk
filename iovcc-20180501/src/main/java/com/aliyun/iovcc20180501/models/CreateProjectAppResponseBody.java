// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateProjectAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateProjectAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectAppResponseBody self = new CreateProjectAppResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProjectAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
