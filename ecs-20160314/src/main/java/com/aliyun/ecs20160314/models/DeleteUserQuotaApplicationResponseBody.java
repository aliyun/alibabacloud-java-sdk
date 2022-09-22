// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DeleteUserQuotaApplicationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUserQuotaApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserQuotaApplicationResponseBody self = new DeleteUserQuotaApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserQuotaApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
