// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class UpdateAlertRuleResponseBody extends TeaModel {
    @NameInMap("AlertId")
    public Long alertId;

    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAlertRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertRuleResponseBody self = new UpdateAlertRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAlertRuleResponseBody setAlertId(Long alertId) {
        this.alertId = alertId;
        return this;
    }
    public Long getAlertId() {
        return this.alertId;
    }

    public UpdateAlertRuleResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateAlertRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
