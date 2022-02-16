// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateDNSServiceRuleAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDNSServiceRuleAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDNSServiceRuleAttributeResponseBody self = new UpdateDNSServiceRuleAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDNSServiceRuleAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
