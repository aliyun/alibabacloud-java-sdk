// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class RebalanceHoloWarehouseResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the request was successful. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C0EA5844-AB00-5653-8711-CD9FD1798412</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RebalanceHoloWarehouseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebalanceHoloWarehouseResponseBody self = new RebalanceHoloWarehouseResponseBody();
        return TeaModel.build(map, self);
    }

    public RebalanceHoloWarehouseResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RebalanceHoloWarehouseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
