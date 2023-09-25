// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteDIAlarmRuleRequest extends TeaModel {
    @NameInMap("DIAlarmRuleId")
    public Long DIAlarmRuleId;

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

}
