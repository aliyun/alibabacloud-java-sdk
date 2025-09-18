// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteTransportLayerApplicationRequest extends TeaModel {
    /**
     * <p>Application ID, which can be obtained by calling the <a href="~~ListTransportLayerApplications~~">ListTransportLayerApplications</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>170996390868****</p>
     */
    @NameInMap("ApplicationId")
    public Long applicationId;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static DeleteTransportLayerApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransportLayerApplicationRequest self = new DeleteTransportLayerApplicationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTransportLayerApplicationRequest setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public Long getApplicationId() {
        return this.applicationId;
    }

    public DeleteTransportLayerApplicationRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
