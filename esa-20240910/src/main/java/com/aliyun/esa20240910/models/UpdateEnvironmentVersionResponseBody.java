// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateEnvironmentVersionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateEnvironmentVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvironmentVersionResponseBody self = new UpdateEnvironmentVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEnvironmentVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
