// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DisableWarehouseAutoScaleResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the operation was successful. <code>true</code> indicates success; <code>false</code> indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>819A7F0F-2951-540F-BD94-6A41ECF0281F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DisableWarehouseAutoScaleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableWarehouseAutoScaleResponseBody self = new DisableWarehouseAutoScaleResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableWarehouseAutoScaleResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DisableWarehouseAutoScaleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
