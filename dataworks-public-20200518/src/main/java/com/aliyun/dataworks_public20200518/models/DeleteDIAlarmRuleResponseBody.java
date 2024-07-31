// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteDIAlarmRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C99E2BE6-9DEA-5C2E-8F51-1DDCFEADE490</p>
     */
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
