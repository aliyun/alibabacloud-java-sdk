// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListGatewayIntranetSupportedZoneResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The zones that are supported by the region.</p>
     */
    @NameInMap("Zones")
    public java.util.List<String> zones;

    public static ListGatewayIntranetSupportedZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayIntranetSupportedZoneResponseBody self = new ListGatewayIntranetSupportedZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayIntranetSupportedZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGatewayIntranetSupportedZoneResponseBody setZones(java.util.List<String> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<String> getZones() {
        return this.zones;
    }

}
