// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateWebCCRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateWebCCRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWebCCRuleResponseBody self = new CreateWebCCRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWebCCRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
