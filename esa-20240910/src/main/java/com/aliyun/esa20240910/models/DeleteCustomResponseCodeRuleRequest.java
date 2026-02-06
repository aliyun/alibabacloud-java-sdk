// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteCustomResponseCodeRuleRequest extends TeaModel {
    /**
     * <p>The configuration ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>434497172875264</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>478016908379824</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static DeleteCustomResponseCodeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomResponseCodeRuleRequest self = new DeleteCustomResponseCodeRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomResponseCodeRuleRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public DeleteCustomResponseCodeRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
