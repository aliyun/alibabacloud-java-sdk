// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteDIAlarmRuleRequest extends TeaModel {
    /**
     * <p>The ID of the alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DIAlarmRuleId")
    public Long DIAlarmRuleId;

    /**
     * <p>The ID of the synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DIJobId")
    public Long DIJobId;

    public static DeleteDIAlarmRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDIAlarmRuleRequest self = new DeleteDIAlarmRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDIAlarmRuleRequest setDIAlarmRuleId(Long DIAlarmRuleId) {
        this.DIAlarmRuleId = DIAlarmRuleId;
        return this;
    }
    public Long getDIAlarmRuleId() {
        return this.DIAlarmRuleId;
    }

    public DeleteDIAlarmRuleRequest setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

}
