// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetHttpDDoSAttackIntelligentProtectionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>defense</p>
     */
    @NameInMap("AiMode")
    public String aiMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>level60</p>
     */
    @NameInMap("AiTemplate")
    public String aiTemplate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static SetHttpDDoSAttackIntelligentProtectionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetHttpDDoSAttackIntelligentProtectionRequest self = new SetHttpDDoSAttackIntelligentProtectionRequest();
        return TeaModel.build(map, self);
    }

    public SetHttpDDoSAttackIntelligentProtectionRequest setAiMode(String aiMode) {
        this.aiMode = aiMode;
        return this;
    }
    public String getAiMode() {
        return this.aiMode;
    }

    public SetHttpDDoSAttackIntelligentProtectionRequest setAiTemplate(String aiTemplate) {
        this.aiTemplate = aiTemplate;
        return this;
    }
    public String getAiTemplate() {
        return this.aiTemplate;
    }

    public SetHttpDDoSAttackIntelligentProtectionRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
