// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteDataQualityAlertRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0bc14115***159376359</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteDataQualityAlertRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataQualityAlertRuleResponseBody self = new DeleteDataQualityAlertRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDataQualityAlertRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDataQualityAlertRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
