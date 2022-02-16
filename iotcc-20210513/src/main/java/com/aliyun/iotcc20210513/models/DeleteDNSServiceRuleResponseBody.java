// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteDNSServiceRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDNSServiceRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDNSServiceRuleResponseBody self = new DeleteDNSServiceRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDNSServiceRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
