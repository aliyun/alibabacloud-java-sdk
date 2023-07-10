// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListNetworkAccessEndpointAvailableZonesRequest extends TeaModel {
    /**
     * <p>专属网络端点支持的地域</p>
     */
    @NameInMap("NaeRegionId")
    public String naeRegionId;

    public static ListNetworkAccessEndpointAvailableZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkAccessEndpointAvailableZonesRequest self = new ListNetworkAccessEndpointAvailableZonesRequest();
        return TeaModel.build(map, self);
    }

    public ListNetworkAccessEndpointAvailableZonesRequest setNaeRegionId(String naeRegionId) {
        this.naeRegionId = naeRegionId;
        return this;
    }
    public String getNaeRegionId() {
        return this.naeRegionId;
    }

}
