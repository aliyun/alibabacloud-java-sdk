// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeleteAppsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>310A783E-CC46-5452-A8A3-71AE5DB5****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppsResponseBody self = new DeleteAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
