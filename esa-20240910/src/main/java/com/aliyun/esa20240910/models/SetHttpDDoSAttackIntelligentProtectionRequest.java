// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetHttpDDoSAttackIntelligentProtectionRequest extends TeaModel {
    /**
     * <p>The mode for the intelligent HTTP DDoS protection feature. Valid values:</p>
     * <ul>
     * <li><p><strong>observe</strong>: The system generates warnings for attack traffic but does not block it.</p>
     * </li>
     * <li><p><strong>defense</strong>: The system blocks detected attack traffic.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>defense</p>
     */
    @NameInMap("AiMode")
    public String aiMode;

    /**
     * <p>The sensitivity level for the intelligent HTTP DDoS protection feature. Valid values:</p>
     * <ul>
     * <li><p><strong>level0</strong>: very loose</p>
     * </li>
     * <li><p><strong>level30</strong>: loose</p>
     * </li>
     * <li><p><strong>level60</strong>: normal</p>
     * </li>
     * <li><p><strong>level90</strong>: strict</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>level60</p>
     */
    @NameInMap("AiTemplate")
    public String aiTemplate;

    /**
     * <p>The ID of the site. You can obtain the site ID by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
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
