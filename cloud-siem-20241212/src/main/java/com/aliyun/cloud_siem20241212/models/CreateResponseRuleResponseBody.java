// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateResponseRuleResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>399827</p>
     */
    @NameInMap("ResponseRuleId")
    public String responseRuleId;

    public static CreateResponseRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResponseRuleResponseBody self = new CreateResponseRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResponseRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateResponseRuleResponseBody setResponseRuleId(String responseRuleId) {
        this.responseRuleId = responseRuleId;
        return this;
    }
    public String getResponseRuleId() {
        return this.responseRuleId;
    }

}
