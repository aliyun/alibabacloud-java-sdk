// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class PreLaunchServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4DB0F536-B3BE-4F0D-BD29-E83FB56D550C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PreLaunchServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreLaunchServiceResponseBody self = new PreLaunchServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public PreLaunchServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
