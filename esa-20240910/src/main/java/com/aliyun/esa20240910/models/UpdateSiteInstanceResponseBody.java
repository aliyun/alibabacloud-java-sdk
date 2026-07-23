// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSiteInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0E50DBC5-0F50-583C-AC2D-87B2764776CF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSiteInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSiteInstanceResponseBody self = new UpdateSiteInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSiteInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
