// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class JoinResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9E3A7161-EB7B-172B-8D18-FFB06BA3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static JoinResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        JoinResourceGroupResponseBody self = new JoinResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public JoinResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
