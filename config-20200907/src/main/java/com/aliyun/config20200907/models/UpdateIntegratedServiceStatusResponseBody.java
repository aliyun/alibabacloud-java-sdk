// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateIntegratedServiceStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>02EB7638-B029-5ABB-93F5-A2ABEEAC282D</p>
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
