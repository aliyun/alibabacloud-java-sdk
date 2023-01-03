// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAlertRuleResponseBody extends TeaModel {
    // Indicates whether the alert rule was successfully deleted.
    // 
    // *   `true`: The specified data is deleted.
    // *   `false`: The specified data fails to be deleted.
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAlertRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertRuleResponseBody self = new DeleteAlertRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAlertRuleResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public DeleteAlertRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
