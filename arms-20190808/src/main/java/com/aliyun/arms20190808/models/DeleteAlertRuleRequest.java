// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAlertRuleRequest extends TeaModel {
    /**
     * <p>Indicates whether the alert rule was successfully deleted.</p>
     * <br>
     * <p>*   `true`: The specified data is deleted.</p>
     * <p>*   `false`: The specified data fails to be deleted.</p>
     */
    @NameInMap("AlertId")
    public Long alertId;

    public static DeleteAlertRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertRuleRequest self = new DeleteAlertRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertRuleRequest setAlertId(Long alertId) {
        this.alertId = alertId;
        return this;
    }
    public Long getAlertId() {
        return this.alertId;
    }

}
