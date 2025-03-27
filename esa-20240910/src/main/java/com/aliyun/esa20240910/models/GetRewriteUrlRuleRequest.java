// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRewriteUrlRuleRequest extends TeaModel {
    /**
     * <p>Configuration ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2867480.html">ListRewriteUrlRules</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>35281609698****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetRewriteUrlRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRewriteUrlRuleRequest self = new GetRewriteUrlRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetRewriteUrlRuleRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public GetRewriteUrlRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
