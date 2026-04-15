// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateResponseRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>440918</p>
     */
    @NameInMap("ResponseRuleId")
    public String responseRuleId;

    public static UpdateResponseRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateResponseRuleResponseBody self = new UpdateResponseRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateResponseRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateResponseRuleResponseBody setResponseRuleId(String responseRuleId) {
        this.responseRuleId = responseRuleId;
        return this;
    }
    public String getResponseRuleId() {
        return this.responseRuleId;
    }

}
