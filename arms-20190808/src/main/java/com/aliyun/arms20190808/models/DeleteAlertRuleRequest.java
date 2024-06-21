// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAlertRuleRequest extends TeaModel {
    /**
     * <p>Indicates whether the alert rule was successfully deleted.</p>
     * <ul>
     * <li><code>true</code>: The specified data is deleted.</li>
     * <li><code>false</code>: The specified data fails to be deleted.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
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
