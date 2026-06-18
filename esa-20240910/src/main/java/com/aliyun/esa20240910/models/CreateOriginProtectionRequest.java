// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateOriginProtectionRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically enable the latest back-to-origin IP addresses list. Valid values:</p>
     * <ul>
     * <li>off: Do not automatically enable.</li>
     * <li>on: Automatically enable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("AutoConfirmIPList")
    public String autoConfirmIPList;

    /**
     * <p>The site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation. The plan associated with the site must support the origin protection feature.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static CreateOriginProtectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOriginProtectionRequest self = new CreateOriginProtectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateOriginProtectionRequest setAutoConfirmIPList(String autoConfirmIPList) {
        this.autoConfirmIPList = autoConfirmIPList;
        return this;
    }
    public String getAutoConfirmIPList() {
        return this.autoConfirmIPList;
    }

    public CreateOriginProtectionRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
