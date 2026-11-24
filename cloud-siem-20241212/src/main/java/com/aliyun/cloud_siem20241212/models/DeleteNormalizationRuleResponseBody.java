// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteNormalizationRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNormalizationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNormalizationRuleResponseBody self = new DeleteNormalizationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNormalizationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
