// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AddDeviceInternetPortResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // RuleIds
    @NameInMap("RuleIds")
    public java.util.List<String> ruleIds;

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

    public AddDeviceInternetPortResponseBody setRuleIds(java.util.List<String> ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }
    public java.util.List<String> getRuleIds() {
        return this.ruleIds;
    }

}
