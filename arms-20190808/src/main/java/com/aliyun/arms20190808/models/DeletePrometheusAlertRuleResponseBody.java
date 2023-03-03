// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeletePrometheusAlertRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the alert rule was deleted. Valid values:</p>
     * <br>
     * <p>*   `true`: The alert rule was deleted.</p>
     * <p>*   `false`: The alert rule failed to be deleted.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeletePrometheusAlertRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePrometheusAlertRuleResponseBody self = new DeletePrometheusAlertRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePrometheusAlertRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeletePrometheusAlertRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
