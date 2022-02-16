// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateGroupDNSServiceRuleAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateGroupDNSServiceRuleAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupDNSServiceRuleAttributeResponseBody self = new UpdateGroupDNSServiceRuleAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGroupDNSServiceRuleAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
