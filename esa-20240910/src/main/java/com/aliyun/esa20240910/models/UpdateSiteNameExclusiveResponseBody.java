// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSiteNameExclusiveResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSiteNameExclusiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSiteNameExclusiveResponseBody self = new UpdateSiteNameExclusiveResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSiteNameExclusiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
