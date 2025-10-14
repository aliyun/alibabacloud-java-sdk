// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteDetectionRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDetectionRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDetectionRuleResponseBody self = new DeleteDetectionRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDetectionRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
