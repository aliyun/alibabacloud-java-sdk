// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetCustomResponseCodeRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>424022244554752</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>775724064754208</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static GetCustomResponseCodeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomResponseCodeRuleRequest self = new GetCustomResponseCodeRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomResponseCodeRuleRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public GetCustomResponseCodeRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
