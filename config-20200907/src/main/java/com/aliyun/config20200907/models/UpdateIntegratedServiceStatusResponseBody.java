// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateIntegratedServiceStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateIntegratedServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIntegratedServiceStatusResponseBody self = new UpdateIntegratedServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIntegratedServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
