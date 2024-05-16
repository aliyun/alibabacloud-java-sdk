// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDIAlarmRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DIAlarmRuleId")
    public Long DIAlarmRuleId;

    public static GetDIAlarmRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDIAlarmRuleRequest self = new GetDIAlarmRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetDIAlarmRuleRequest setDIAlarmRuleId(Long DIAlarmRuleId) {
        this.DIAlarmRuleId = DIAlarmRuleId;
        return this;
    }
    public Long getDIAlarmRuleId() {
        return this.DIAlarmRuleId;
    }

}
