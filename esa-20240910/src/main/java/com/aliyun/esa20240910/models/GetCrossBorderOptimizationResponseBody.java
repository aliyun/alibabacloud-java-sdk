// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetCrossBorderOptimizationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <strong>example:</strong>
     * <p>CF521A24-633F-5350-A6A5-42AD503D0D20</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCrossBorderOptimizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCrossBorderOptimizationResponseBody self = new GetCrossBorderOptimizationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCrossBorderOptimizationResponseBody setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public GetCrossBorderOptimizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
