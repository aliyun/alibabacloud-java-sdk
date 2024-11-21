// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSiteCoverageResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>65C66B7B-671A-8297-9187-2R5477247B76</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSiteCoverageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSiteCoverageResponseBody self = new UpdateSiteCoverageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSiteCoverageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
