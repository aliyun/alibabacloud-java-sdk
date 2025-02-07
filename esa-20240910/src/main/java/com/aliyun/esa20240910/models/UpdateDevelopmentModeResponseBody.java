// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateDevelopmentModeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>65C66B7B-671A-8297-9187-2R5477247B76</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDevelopmentModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDevelopmentModeResponseBody self = new UpdateDevelopmentModeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDevelopmentModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
