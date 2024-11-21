// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteAlertRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8754EE08-4AA2-5F77-ADD7-754DBBDA9F75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteAlertRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertRuleResponseBody self = new DeleteAlertRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAlertRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAlertRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
