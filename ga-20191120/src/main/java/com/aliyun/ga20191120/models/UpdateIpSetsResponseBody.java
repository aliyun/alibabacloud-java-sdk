// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateIpSetsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>685662FF-B1CE-4D5C-A4C8-2FF3C2146BFC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateIpSetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpSetsResponseBody self = new UpdateIpSetsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIpSetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
