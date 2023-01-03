// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAlertRulesResponseBody extends TeaModel {
    // Indicates whether the alert rule was deleted.
    // 
    // *   `true`: The alert rule was deleted.
    // *   `false`: The alert rule failed to be deleted.
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAlertRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertRulesResponseBody self = new DeleteAlertRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAlertRulesResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public DeleteAlertRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
