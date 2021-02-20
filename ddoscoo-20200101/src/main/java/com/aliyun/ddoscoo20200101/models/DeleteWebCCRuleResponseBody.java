// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteWebCCRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteWebCCRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebCCRuleResponseBody self = new DeleteWebCCRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWebCCRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
