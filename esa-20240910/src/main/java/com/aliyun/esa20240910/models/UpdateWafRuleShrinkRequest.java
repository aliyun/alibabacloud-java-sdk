// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateWafRuleShrinkRequest extends TeaModel {
    /**
     * <p>Rule configuration.</p>
     */
    @NameInMap("Config")
    public String configShrink;

    /**
     * <p>WAF rule ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2878257.html">ListWafRules</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20000001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The position of the rule in the rule set.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Position")
    public Long position;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Site version.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SiteVersion")
    public Integer siteVersion;

    /**
     * <p>Rule status.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateWafRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWafRuleShrinkRequest self = new UpdateWafRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWafRuleShrinkRequest setConfigShrink(String configShrink) {
        this.configShrink = configShrink;
        return this;
    }
    public String getConfigShrink() {
        return this.configShrink;
    }

    public UpdateWafRuleShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateWafRuleShrinkRequest setPosition(Long position) {
        this.position = position;
        return this;
    }
    public Long getPosition() {
        return this.position;
    }

    public UpdateWafRuleShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateWafRuleShrinkRequest setSiteVersion(Integer siteVersion) {
        this.siteVersion = siteVersion;
        return this;
    }
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public UpdateWafRuleShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
