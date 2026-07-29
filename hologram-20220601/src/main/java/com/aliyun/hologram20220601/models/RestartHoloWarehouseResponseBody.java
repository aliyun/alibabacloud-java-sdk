// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class RestartHoloWarehouseResponseBody extends TeaModel {
    /**
     * <p>The result of the request. A value of true indicates that the request was successful. A value of false indicates that the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2A8DEF6E-067E-5DB0-BAE1-2894266E6C6A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RestartHoloWarehouseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartHoloWarehouseResponseBody self = new RestartHoloWarehouseResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartHoloWarehouseResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public RestartHoloWarehouseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
