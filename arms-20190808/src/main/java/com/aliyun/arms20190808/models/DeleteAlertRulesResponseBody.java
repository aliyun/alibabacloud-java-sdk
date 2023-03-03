// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAlertRulesResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the alert rule was deleted.</p>
     * <br>
     * <p>*   `true`: The alert rule was deleted.</p>
     * <p>*   `false`: The alert rule failed to be deleted.</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The ID of the request.</p>
     */
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
