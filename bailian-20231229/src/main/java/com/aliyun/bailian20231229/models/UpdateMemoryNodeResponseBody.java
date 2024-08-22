// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateMemoryNodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8C56C7AF-6573-19CE-B018-E05E1EDCF4C5</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateMemoryNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryNodeResponseBody self = new UpdateMemoryNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
