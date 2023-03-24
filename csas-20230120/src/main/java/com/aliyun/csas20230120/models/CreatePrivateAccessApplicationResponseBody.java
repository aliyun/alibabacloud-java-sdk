// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreatePrivateAccessApplicationResponseBody extends TeaModel {
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreatePrivateAccessApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivateAccessApplicationResponseBody self = new CreatePrivateAccessApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePrivateAccessApplicationResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreatePrivateAccessApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
