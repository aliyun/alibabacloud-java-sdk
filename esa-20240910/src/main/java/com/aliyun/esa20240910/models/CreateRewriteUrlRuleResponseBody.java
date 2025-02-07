// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRewriteUrlRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>39237781679****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-280B-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRewriteUrlRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRewriteUrlRuleResponseBody self = new CreateRewriteUrlRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRewriteUrlRuleResponseBody setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public CreateRewriteUrlRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
