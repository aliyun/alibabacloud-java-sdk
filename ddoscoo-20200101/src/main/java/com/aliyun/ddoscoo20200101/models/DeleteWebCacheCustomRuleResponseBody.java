// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteWebCacheCustomRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteWebCacheCustomRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebCacheCustomRuleResponseBody self = new DeleteWebCacheCustomRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWebCacheCustomRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
