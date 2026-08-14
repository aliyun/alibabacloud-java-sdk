// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class EnableWebCCRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableWebCCRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableWebCCRuleResponseBody self = new EnableWebCCRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableWebCCRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
