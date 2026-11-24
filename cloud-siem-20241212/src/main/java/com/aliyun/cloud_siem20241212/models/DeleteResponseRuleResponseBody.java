// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteResponseRuleResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9BCE0BF1-4F0C-5860-87D2-C391799AF4F2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteResponseRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteResponseRuleResponseBody self = new DeleteResponseRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteResponseRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
