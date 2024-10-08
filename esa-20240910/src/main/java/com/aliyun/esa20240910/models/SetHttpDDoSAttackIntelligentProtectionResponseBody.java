// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetHttpDDoSAttackIntelligentProtectionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>defense</p>
     */
    @NameInMap("AiMode")
    public String aiMode;

    /**
     * <strong>example:</strong>
     * <p>level60</p>
     */
    @NameInMap("AiTemplate")
    public String aiTemplate;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>156A6B-677B1A-4297B7-9187B7-2B44792</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static SetHttpDDoSAttackIntelligentProtectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetHttpDDoSAttackIntelligentProtectionResponseBody self = new SetHttpDDoSAttackIntelligentProtectionResponseBody();
        return TeaModel.build(map, self);
    }

    public SetHttpDDoSAttackIntelligentProtectionResponseBody setAiMode(String aiMode) {
        this.aiMode = aiMode;
        return this;
    }
    public String getAiMode() {
        return this.aiMode;
    }

    public SetHttpDDoSAttackIntelligentProtectionResponseBody setAiTemplate(String aiTemplate) {
        this.aiTemplate = aiTemplate;
        return this;
    }
    public String getAiTemplate() {
        return this.aiTemplate;
    }

    public SetHttpDDoSAttackIntelligentProtectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetHttpDDoSAttackIntelligentProtectionResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
