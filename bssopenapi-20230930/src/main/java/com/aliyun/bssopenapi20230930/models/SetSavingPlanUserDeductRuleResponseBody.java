// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class SetSavingPlanUserDeductRuleResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static SetSavingPlanUserDeductRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetSavingPlanUserDeductRuleResponseBody self = new SetSavingPlanUserDeductRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public SetSavingPlanUserDeductRuleResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public SetSavingPlanUserDeductRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
