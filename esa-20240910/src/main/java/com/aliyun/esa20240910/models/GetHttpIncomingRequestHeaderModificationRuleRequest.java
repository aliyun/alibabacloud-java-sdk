// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetHttpIncomingRequestHeaderModificationRuleRequest extends TeaModel {
    /**
     * <p>The ID of the configuration. You can call the ListHttpIncomingRequestHeaderModificationRules operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>433045006266368</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>608665779308176</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetHttpIncomingRequestHeaderModificationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHttpIncomingRequestHeaderModificationRuleRequest self = new GetHttpIncomingRequestHeaderModificationRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetHttpIncomingRequestHeaderModificationRuleRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public GetHttpIncomingRequestHeaderModificationRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
