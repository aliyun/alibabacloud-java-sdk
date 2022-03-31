// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ModifyDcdnWafRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDcdnWafRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDcdnWafRuleResponseBody self = new ModifyDcdnWafRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDcdnWafRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
