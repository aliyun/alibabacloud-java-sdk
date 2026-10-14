// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateNetworkRulesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ADCA45A5-D15C-4B7D-9F81-138B0B36D0BD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNetworkRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkRulesResponseBody self = new CreateNetworkRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNetworkRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
