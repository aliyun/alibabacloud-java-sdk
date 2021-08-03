// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteDeviceInternetPortResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // RuleId
    @NameInMap("RuleId")
    public String ruleId;

    public static DeleteDeviceInternetPortResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceInternetPortResponseBody self = new DeleteDeviceInternetPortResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceInternetPortResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDeviceInternetPortResponseBody setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
