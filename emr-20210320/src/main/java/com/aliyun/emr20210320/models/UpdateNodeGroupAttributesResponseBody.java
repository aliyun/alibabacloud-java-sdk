// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateNodeGroupAttributesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateNodeGroupAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeGroupAttributesResponseBody self = new UpdateNodeGroupAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNodeGroupAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
