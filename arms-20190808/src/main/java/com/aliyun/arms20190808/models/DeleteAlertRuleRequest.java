// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAlertRuleRequest extends TeaModel {
    /**
     * <p>The alert rule ID.</p>
     * <p>For more information about how to obtain the ID of an alert rule, see <a href="https://help.aliyun.com/document_detail/2612348.html">GetAlertRules</a>.</p>
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
