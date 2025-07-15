// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateCasterResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0D776BD1-****-59D0-9A1B-272832D999F6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCasterResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCasterResourceGroupResponseBody self = new UpdateCasterResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCasterResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
