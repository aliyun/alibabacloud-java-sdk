// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateOriginProtectionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("AutoConfirmIPList")
    public String autoConfirmIPList;

    /**
     * <p>The origin fetch convergence switch.</p>
     * <ul>
     * <li><p>on: Enable origin fetch convergence.</p>
     * </li>
     * <li><p>off: Disable origin fetch convergence.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("OriginConverge")
    public String originConverge;

    /**
     * <p>The site ID. Call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> API to get it.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateOriginProtectionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOriginProtectionRequest self = new UpdateOriginProtectionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOriginProtectionRequest setAutoConfirmIPList(String autoConfirmIPList) {
        this.autoConfirmIPList = autoConfirmIPList;
        return this;
    }
    public String getAutoConfirmIPList() {
        return this.autoConfirmIPList;
    }

    public UpdateOriginProtectionRequest setOriginConverge(String originConverge) {
        this.originConverge = originConverge;
        return this;
    }
    public String getOriginConverge() {
        return this.originConverge;
    }

    public UpdateOriginProtectionRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
