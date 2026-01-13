// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeZonesPrivateRAGServiceResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of zones.</p>
     */
    @NameInMap("ZoneIds")
    public java.util.List<String> zoneIds;

    public static DescribeZonesPrivateRAGServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesPrivateRAGServiceResponseBody self = new DescribeZonesPrivateRAGServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeZonesPrivateRAGServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeZonesPrivateRAGServiceResponseBody setZoneIds(java.util.List<String> zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }
    public java.util.List<String> getZoneIds() {
        return this.zoneIds;
    }

}
