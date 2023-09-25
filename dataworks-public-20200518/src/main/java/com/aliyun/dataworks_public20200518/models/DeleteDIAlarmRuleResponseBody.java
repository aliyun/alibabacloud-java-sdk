// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteDIAlarmRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDIAlarmRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDIAlarmRuleResponseBody self = new DeleteDIAlarmRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDIAlarmRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
