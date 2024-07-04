// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AddDeviceInternetPortResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0F9185F6-B6FA-514C-9E05-FFD5F0D7D156</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of rules.</p>
     */
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
