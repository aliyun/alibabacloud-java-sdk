// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetHttpRequestHeaderModificationRuleRequest extends TeaModel {
    /**
     * <p>Configuration ID. It can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2867483.html">ListHttpRequestHeaderModificationRules</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3528160969****</p>
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

    public static GetHttpRequestHeaderModificationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHttpRequestHeaderModificationRuleRequest self = new GetHttpRequestHeaderModificationRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetHttpRequestHeaderModificationRuleRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public GetHttpRequestHeaderModificationRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
