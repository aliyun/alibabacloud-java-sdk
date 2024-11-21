// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateSiteCustomLogResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>073bd613-6e72-4461-b6bc-19326dfc6a9c</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSiteCustomLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSiteCustomLogResponseBody self = new CreateSiteCustomLogResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSiteCustomLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
