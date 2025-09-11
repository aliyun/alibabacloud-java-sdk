// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCrossBorderOptimizationRequest extends TeaModel {
    /**
     * <p>Whether to enable Chinese mainland network access optimization. By default, it is disabled. Valid values:</p>
     * <ul>
     * <li>on</li>
     * <li>off</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateCrossBorderOptimizationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCrossBorderOptimizationRequest self = new UpdateCrossBorderOptimizationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCrossBorderOptimizationRequest setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public UpdateCrossBorderOptimizationRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
