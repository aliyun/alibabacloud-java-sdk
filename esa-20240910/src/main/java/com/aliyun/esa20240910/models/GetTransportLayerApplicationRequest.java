// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetTransportLayerApplicationRequest extends TeaModel {
    /**
     * <p>Number of forwarding rules contained in the transport layer acceleration application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>170997271816****</p>
     */
    @NameInMap("ApplicationId")
    public Long applicationId;

    /**
     * <p>Transport layer application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetTransportLayerApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTransportLayerApplicationRequest self = new GetTransportLayerApplicationRequest();
        return TeaModel.build(map, self);
    }

    public GetTransportLayerApplicationRequest setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public Long getApplicationId() {
        return this.applicationId;
    }

    public GetTransportLayerApplicationRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
