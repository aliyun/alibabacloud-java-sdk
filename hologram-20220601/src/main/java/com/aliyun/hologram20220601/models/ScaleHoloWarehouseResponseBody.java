// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ScaleHoloWarehouseResponseBody extends TeaModel {
    /**
     * <p>The result of the operation. A value of true indicates that the operation was successful. A value of false indicates that the operation failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2A8DEF6E-067E-5DB0-BAE1-2894266E6C6A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ScaleHoloWarehouseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScaleHoloWarehouseResponseBody self = new ScaleHoloWarehouseResponseBody();
        return TeaModel.build(map, self);
    }

    public ScaleHoloWarehouseResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ScaleHoloWarehouseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
