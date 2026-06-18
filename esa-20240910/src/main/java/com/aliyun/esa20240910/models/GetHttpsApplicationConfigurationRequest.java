// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetHttpsApplicationConfigurationRequest extends TeaModel {
    /**
     * <p>The configuration ID. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/2869087.html">listHttpsApplicationConfigurations</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>352816096987136</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The site ID. You can obtain this ID by calling the <a href="~~ListSites~~">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetHttpsApplicationConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHttpsApplicationConfigurationRequest self = new GetHttpsApplicationConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public GetHttpsApplicationConfigurationRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public GetHttpsApplicationConfigurationRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
