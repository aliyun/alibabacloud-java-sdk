// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeHttpDDoSAttackIntelligentProtectionResponseBody extends TeaModel {
    /**
     * <p>The protection mode for HTTP DDoS intelligent protection. Valid values:</p>
     * <ul>
     * <li><p><strong>observe</strong>: Observe</p>
     * </li>
     * <li><p><strong>defense</strong>: Defense</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>defense</p>
     */
    @NameInMap("AiMode")
    public String aiMode;

    /**
     * <p>The protection level for HTTP DDoS intelligent protection. Valid values:</p>
     * <ul>
     * <li><p><strong>level0</strong>: Very Loose</p>
     * </li>
     * <li><p><strong>level30</strong>: Loose</p>
     * </li>
     * <li><p><strong>level60</strong>: Normal</p>
     * </li>
     * <li><p><strong>level90</strong>: Strict</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>level60</p>
     */
    @NameInMap("AiTemplate")
    public String aiTemplate;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-3C82-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The site ID.</p>
     * 
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
