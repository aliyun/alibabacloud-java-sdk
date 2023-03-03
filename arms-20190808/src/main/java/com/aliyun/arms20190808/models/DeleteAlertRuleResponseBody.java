// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAlertRuleResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the alert rule was successfully deleted.</p>
     * <br>
     * <p>*   `true`: The specified data is deleted.</p>
     * <p>*   `false`: The specified data fails to be deleted.</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The ID of the request.</p>
     */
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
