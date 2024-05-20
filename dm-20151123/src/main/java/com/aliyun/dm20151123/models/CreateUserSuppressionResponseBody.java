// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CreateUserSuppressionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuppressionId")
    public String suppressionId;

    public static CreateUserSuppressionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserSuppressionResponseBody self = new CreateUserSuppressionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserSuppressionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUserSuppressionResponseBody setSuppressionId(String suppressionId) {
        this.suppressionId = suppressionId;
        return this;
    }
    public String getSuppressionId() {
        return this.suppressionId;
    }

}
