// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AddDeviceInternetPortResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // RuleId
    @NameInMap("RuleId")
    public String ruleId;

    public static AddDeviceInternetPortResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceInternetPortResponseBody self = new AddDeviceInternetPortResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDeviceInternetPortResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDeviceInternetPortResponseBody setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
