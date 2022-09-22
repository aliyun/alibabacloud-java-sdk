// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateUserQuotaApplicationResponseBody extends TeaModel {
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateUserQuotaApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserQuotaApplicationResponseBody self = new CreateUserQuotaApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserQuotaApplicationResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateUserQuotaApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
