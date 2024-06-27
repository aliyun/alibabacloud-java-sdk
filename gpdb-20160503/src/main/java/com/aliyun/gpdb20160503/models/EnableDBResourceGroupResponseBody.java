// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class EnableDBResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5850BF81-1A2B-5ACE-AF41-57**********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableDBResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableDBResourceGroupResponseBody self = new EnableDBResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableDBResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
