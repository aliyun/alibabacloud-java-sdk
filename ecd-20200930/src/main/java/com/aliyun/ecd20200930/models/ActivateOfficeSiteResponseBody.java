// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ActivateOfficeSiteResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>269BDB16-2CD8-4865-84BD-11C40BC21DB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ActivateOfficeSiteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActivateOfficeSiteResponseBody self = new ActivateOfficeSiteResponseBody();
        return TeaModel.build(map, self);
    }

    public ActivateOfficeSiteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
