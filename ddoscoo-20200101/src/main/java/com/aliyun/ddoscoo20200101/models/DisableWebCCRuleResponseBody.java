// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DisableWebCCRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableWebCCRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableWebCCRuleResponseBody self = new DisableWebCCRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableWebCCRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
