// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebCacheCustomRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWebCacheCustomRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebCacheCustomRuleResponseBody self = new ModifyWebCacheCustomRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWebCacheCustomRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
