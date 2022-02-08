// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class DeleteDISyncAlarmRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteDISyncAlarmRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDISyncAlarmRuleResponseBody self = new DeleteDISyncAlarmRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDISyncAlarmRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDISyncAlarmRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
