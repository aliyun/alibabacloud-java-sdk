// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDIAlarmRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDIAlarmRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDIAlarmRuleResponseBody self = new UpdateDIAlarmRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDIAlarmRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
