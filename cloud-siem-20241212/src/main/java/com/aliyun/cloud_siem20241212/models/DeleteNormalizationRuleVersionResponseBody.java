// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteNormalizationRuleVersionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNormalizationRuleVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNormalizationRuleVersionResponseBody self = new DeleteNormalizationRuleVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNormalizationRuleVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
