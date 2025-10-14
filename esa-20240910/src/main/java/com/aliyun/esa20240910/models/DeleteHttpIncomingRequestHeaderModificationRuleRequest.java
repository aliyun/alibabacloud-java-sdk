// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteHttpIncomingRequestHeaderModificationRuleRequest extends TeaModel {
    /**
     * <p>The configuration ID. You can call the ListHttpIncomingRequestHeaderModificationRules operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>427428371703808</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>54362329990032</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static DeleteHttpIncomingRequestHeaderModificationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHttpIncomingRequestHeaderModificationRuleRequest self = new DeleteHttpIncomingRequestHeaderModificationRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHttpIncomingRequestHeaderModificationRuleRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public DeleteHttpIncomingRequestHeaderModificationRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
