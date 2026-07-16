// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateConfigSequenceRequest extends TeaModel {
    /**
     * <p>The configuration ID. You can call the <a href="~~ListSiteFunctions~~">ListSiteFunctions</a> operation to obtain the configuration ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>27490172680****</p>
     */
    @NameInMap("ConfigId")
    public Long configId;

    /**
     * <p>The target priority of the configuration. The value must be greater than 0. If the value is greater than the highest priority among all rule configurations under this feature, the priority of the configuration to be modified is set to the current highest priority. For example, if the CacheRules feature has three rule configurations with priorities 1, 2, and 3, and you change the priority of the rule with priority 1 to 5, the priority of that rule is set to 3, and the rules that originally had priorities 2 and 3 are changed to 1 and 2.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Sequence")
    public Integer sequence;

    /**
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>611133661****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static UpdateConfigSequenceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigSequenceRequest self = new UpdateConfigSequenceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConfigSequenceRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public UpdateConfigSequenceRequest setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }
    public Integer getSequence() {
        return this.sequence;
    }

    public UpdateConfigSequenceRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
