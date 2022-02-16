// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteGroupDNSServiceRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteGroupDNSServiceRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupDNSServiceRuleResponseBody self = new DeleteGroupDNSServiceRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGroupDNSServiceRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
