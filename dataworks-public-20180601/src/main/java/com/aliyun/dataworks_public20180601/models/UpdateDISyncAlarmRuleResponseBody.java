// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class UpdateDISyncAlarmRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateDISyncAlarmRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDISyncAlarmRuleResponseBody self = new UpdateDISyncAlarmRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDISyncAlarmRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDISyncAlarmRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
