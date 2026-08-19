// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetDeviceOnlineHeatmapResponseBody extends TeaModel {
    /**
     * <p>The online time distribution.</p>
     */
    @NameInMap("DeviceOnlineHeatmap")
    public java.util.List<java.util.List<Long>> deviceOnlineHeatmap;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D6707286-A50E-57B1-B2CF-EFAC59E850D8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDeviceOnlineHeatmapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceOnlineHeatmapResponseBody self = new GetDeviceOnlineHeatmapResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceOnlineHeatmapResponseBody setDeviceOnlineHeatmap(java.util.List<java.util.List<Long>> deviceOnlineHeatmap) {
        this.deviceOnlineHeatmap = deviceOnlineHeatmap;
        return this;
    }
    public java.util.List<java.util.List<Long>> getDeviceOnlineHeatmap() {
        return this.deviceOnlineHeatmap;
    }

    public GetDeviceOnlineHeatmapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
