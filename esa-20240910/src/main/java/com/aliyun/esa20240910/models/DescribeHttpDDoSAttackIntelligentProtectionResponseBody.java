// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeHttpDDoSAttackIntelligentProtectionResponseBody extends TeaModel {
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
     * <p>CB1A380B-09F0-41BB-3C82-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static DescribeHttpDDoSAttackIntelligentProtectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHttpDDoSAttackIntelligentProtectionResponseBody self = new DescribeHttpDDoSAttackIntelligentProtectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHttpDDoSAttackIntelligentProtectionResponseBody setAiMode(String aiMode) {
        this.aiMode = aiMode;
        return this;
    }
    public String getAiMode() {
        return this.aiMode;
    }

    public DescribeHttpDDoSAttackIntelligentProtectionResponseBody setAiTemplate(String aiTemplate) {
        this.aiTemplate = aiTemplate;
        return this;
    }
    public String getAiTemplate() {
        return this.aiTemplate;
    }

    public DescribeHttpDDoSAttackIntelligentProtectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHttpDDoSAttackIntelligentProtectionResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
