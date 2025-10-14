// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateNormalizationRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>nr-z0b2ssjteut85uoh9nzp。</p>
     */
    @NameInMap("NormalizationRuleId")
    public String normalizationRuleId;

    /**
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNormalizationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNormalizationRuleResponseBody self = new CreateNormalizationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNormalizationRuleResponseBody setNormalizationRuleId(String normalizationRuleId) {
        this.normalizationRuleId = normalizationRuleId;
        return this;
    }
    public String getNormalizationRuleId() {
        return this.normalizationRuleId;
    }

    public CreateNormalizationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
