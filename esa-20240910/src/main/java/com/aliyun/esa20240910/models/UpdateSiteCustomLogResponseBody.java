// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateSiteCustomLogResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ET5BF670-09D5-4D0B-BEBY-D96A2A528000</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSiteCustomLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSiteCustomLogResponseBody self = new UpdateSiteCustomLogResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSiteCustomLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
